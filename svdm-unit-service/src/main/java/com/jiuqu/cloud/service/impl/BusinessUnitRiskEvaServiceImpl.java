package com.jiuqu.cloud.service.impl;




import com.google.common.annotations.VisibleForTesting;
import com.jiuqu.cloud.base.service.BaseService;
import com.jiuqu.cloud.service.BusinessUnitRiskEvaService;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import javax.print.SimpleDoc;
import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BusinessUnitRiskEvaServiceImpl implements BusinessUnitRiskEvaService {

    @Autowired
    BaseService baseService;

/*    @Override
    public SvdmBusinessUnitEntity findById(int id) {
        return unitDao.findOne(id);
    }

    @Override
    //查询全部数据
    public List<SvdmBusinessUnitEntity> findAll(){
        return unitDao.findAll();
    }
    //根据省名查询
    public List<SvdmBusinessUnitEntity> findByProvince(String province){
        return unitDao.findByProvince(province);
    }
    //多条件查询（省市区）
    public List<SvdmBusinessUnitEntity> findByProvinceAndCityAndDistrict(String province,String city,String district){
        return unitDao.findByProvinceAndCityAndDistrict(province, city, district);
    }
    //多条件查询（省市）
    public List<SvdmBusinessUnitEntity> findByProvinceAndCity(String province,String city){
        return unitDao.findByProvinceAndCity(province, city);
    }*/

    /**
     * 获取营运公司分页
     * @return
     */
    /*@Override
    public Map getBusinessUnitList(Map parameter, Pageable pageable) {
        Map map = new HashMap();
        String province = parameter.get("province").toString();
        String city = parameter.get("city").toString();
        String district = parameter.get("district").toString();

        String whereSql = "";
        if(!province.equals("请选择")) {
            whereSql=whereSql+" AND a.province ='"+province+"' ";
        }
        if(!city.equals("请选择")) {
            whereSql=whereSql+" AND a.city ='"+city+"' ";
        }
        if(!district.equals("请选择")) {
            whereSql=whereSql+" AND a.district ='"+district+"' ";
        }

        String sql1 = "SELECT \n" +
                "\tCOUNT(*) AS driver_count,\n" +
                "\tu.unit_name,\n" +
                "\tu.id,\n" +
                "\tu.freight_car_number,\n" +
                "\tu.passenger_car_number,\n" +
                "\tu.unit_address,\n" +
                "\tu.unit_permit_number,\n" +
                "\tsum(uc.seat) AS seat,\n" +
                "\tFORMAT(sum(uc.tonnage), 2) AS tonnage \n" +
                "FROM\n" +
                "\tsingle_unit_car AS uc\n" +
                "LEFT JOIN \n" +
                "\tsingle_unit AS u\n" +
                "ON \n" +
                whereSql +
                "\tu.id = uc.unit_id\n" +
                "GROUP BY \n" +
                "\tuc.unit_id ";
        Page page = baseService.find(pageable, sql1);
        List<Map<String, Object>> units = page.getContent();

        String sql2 = "SELECT \n" +
                "\tMAX(id),\n" +
                "\tunit_id,\n" +
                "\trisk_grade,\n" +
                "\trai_count \n" +
                "FROM \n" +
                "\tsingle_unit_analysis_real_time \n" +
                "GROUP BY unit_id";
        List<Map<String, Object>> analysis = baseService.find(sql2);
        for (Map<String, Object> analysisMap:analysis){
            int unit_id = Integer.valueOf(analysisMap.get("unit_id").toString());
            for (Map<String, Object> unitMap:units){
                int id = Integer.valueOf(unitMap.get("id").toString());
                if (id == unit_id){
                    unitMap.putAll(analysisMap);
                }
            }
        }
        String countsSql = "SELECT \n" +
                "\tCOUNT(*) as counts\n" +
                "FROM(\n" +
                "\tSELECT \n" +
                "\t\tu.id \n" +
                "\tFROM\n" +
                "\t\tsingle_unit AS u\n" +
                "\tLEFT JOIN \n" +
                "\t\tsingle_unit_car AS uc\n" +
                "\tON \n" +
                "\t\tuc.unit_id = u.id \n" +
                whereSql +
                "\tGROUP BY \n" +
                "\t\tuc.unit_id\n" +
                ") as a";
        List<Map<String, Object>> content = baseService.find(pageable, countsSql).getContent();
        int counts = Integer.valueOf(content.get(0).get("counts").toString());

        map.put("page",units);
        map.put("counts", counts);
        return map;
    }*/

    @Override
    public Map getBusinessUnitList(Map parameter, Pageable pageable) {
        String province = parameter.get("province").toString();
        String city = parameter.get("city").toString();
        String district = parameter.get("district").toString();
        String yunshutype = parameter.get("yunshutype").toString();
        String whereSql1 = "WHERE 0=0 ";
        String whereSql2 = "";
        String whereSql3 = "";
        if (!province.equals("请选择")) {
            whereSql1 = whereSql1 + " AND single_unit.province = '" + province + "' ";
            whereSql2 = whereSql2 + " WHERE single_unit.province = '" + province + "' ";
        }

        if (!city.equals("请选择")) {
            whereSql1 = whereSql1 + " AND single_unit.city = '" + city + "' ";
            whereSql2 = whereSql2 + " AND single_unit.city = '" + city + "' ";
        }

        if (!district.equals("请选择")) {
            whereSql1 = whereSql1 + " AND single_unit.district = '" + district + "' ";
            whereSql2 = whereSql2 + " AND single_unit.district = '" + district + "' ";
        }
        if(yunshutype.equals("请选择")) {
            whereSql3="AND 0=0";
        }else{
            whereSql3=" AND "+yunshutype+"";
        }

        String sql = "SELECT\n" +
                "\tsingle_unit.*, MAX(\n" +
                "\t\tsingle_unit_analysis_real_time.id\n" +
                "\t),\n" +
                "\tsingle_unit_analysis_real_time.risk_grade AS risk_grade,\n" +
                "\tsingle_unit_analysis_real_time.rai_count AS rai_count,\n" +
                "\tsingle_unit_analysis_real_time.unit_id AS unit_id\n" +
                "FROM\n" +
                "\t(\n" +
                "\t\tSELECT\n" +
                "\t\t\tCOUNT(*) AS driver_count,\n" +
                "\t\t\tsingle_unit.unit_name,\n" +
                "\t\t\tsingle_unit.id,\n" +
                "\t\t\tsingle_unit.freight_car_number,\n" +
                "\t\t\tsingle_unit.passenger_car_number,\n" +
                "\t\t\tsingle_unit.unit_address,\n" +
                "\t\t\tsingle_unit.unit_permit_number,\n" +
                "\t\t\tsum(single_unit_car.seat) AS seat,\n" +
                "\t\t\tFORMAT(\n" +
                "\t\t\t\tsum(single_unit_car.tonnage),\n" +
                "\t\t\t\t2\n" +
                "\t\t\t) AS tonnage\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit\n" +
                "\t\tLEFT JOIN single_unit_car ON single_unit.id = single_unit_car.unit_id " + whereSql1+
                whereSql3+
                "\t\tGROUP BY\n" +
                "\t\t\tsingle_unit.id\n" +
                "\t) AS single_unit \n" +
                "LEFT JOIN single_unit_analysis_real_time ON single_unit_analysis_real_time.unit_id = single_unit.id\n" +
                "WHERE\n" +
                "\tsingle_unit_analysis_real_time.send_time >= DATE_FORMAT(NOW(), '%Y-%m-%d 00:00:00') \n" +
                "GROUP BY\n" +
                "\tsingle_unit.id";
        String countSql = "SELECT\n\tCOUNT(*) AS counts\nFROM\n\tsingle_unit" + whereSql2;
        Map map = this.baseService.findByBootstrap(pageable, sql, countSql);
        return map;

    }



    /**
     * 根据公司ID获得信息
     *
     * @param
     * @throws
     */
    @Override
    public List<Map<String, Object>> getUnitList(int id) {

        String sql="SELECT\n" +
                "\t*\n" +
                "FROM\n" +
                "\t(\n" +
                "\t\tSELECT\n" +
                "\t\t\tsingle_unit.unit_name,\n" +
                "\t\t\tsingle_unit.id\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit\n" +
                "\t\tWHERE\n" +
                "\t\t\tid =\n" + id+
                "\t) AS a\n" +
                "LEFT JOIN (\n" +
                "\tSELECT\n" +
                "\t\tsingle_unit_car.unit_id,\n" +
                "\t\tCOUNT(id) AS BAOYOULIANG,\n" +
                "\t\tSUM(\n" +
                "\t\t\tsingle_unit_car.seat\n" +
                "\t\t) AS KEYUN,\n" +
                "\t\t  FORMAT(sum(\n" +
                "\t\t\tsingle_unit_car.tonnage\n" +
                "\t\t),2) AS HUOYUN\n" +
                "\tFROM\n" +
                "\t\tsingle_unit_car\n" +
                "\tWHERE\n" +
                "\t\tsingle_unit_car.unit_id = \n" + id+
                ") AS b ON a.id = b.unit_id";

        return baseService.find(sql);
    }

    //下拉选单
    /**
     * 获取省列表，获取市级列表
     * @return
     */
    @Override
    public List<Map<String, Object>> getRegionJson() {
        List<Map<String, Object>> provinceList = getProvinceList();
        LinkedList<Map<String, Object>> maps = new LinkedList<>();
        LinkedList<Map<String, Object>> provinceMapList = new LinkedList<>();

        if(provinceList!=null&&provinceList.size()!=0){
            HashMap<String, Object> provinceMaps = new HashMap<>();

            /***************初始化请选择 start***********************/
            provinceMaps.put("p","请选择");
            HashMap<String, Object> cityMaps = new HashMap<>();
            cityMaps.put("ct","请选择");
            LinkedList<Object> objects = new LinkedList<>();
            HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("dt","请选择");
            objects.add(objectObjectHashMap);
            cityMaps.put("d",objects);
            objects = new LinkedList<>();
            objects.add(cityMaps);
            provinceMaps.put("c",objects);
            provinceMapList.add(provinceMaps);
            /***************初始化请选择 end***********************/
            for (Map provinceMap:provinceList) {
                LinkedList<Map<String, Object>> cityMapList = new LinkedList<>();
                provinceMaps = new HashMap<>();
                Object province = provinceMap.get("province");
                /***************初始化省请选择 start***********************/
                List<Map<String, Object>> cityList = getCityList(province.toString());
                LinkedList<Map<String, Object>> tempCityLinkedList = new LinkedList<>();
                HashMap<String, Object> tempCityMap = new HashMap<>();
                tempCityMap.put("city","请选择");
                tempCityLinkedList.add(tempCityMap);
                tempCityLinkedList.addAll(cityList);
                /***************初始化省请选择 end***********************/
                if(tempCityLinkedList!=null&&tempCityLinkedList.size()!=0){
                    for (Map cityMap:tempCityLinkedList) {
                        cityMaps = new HashMap<>();
                        String city = cityMap.get("city").toString();
                        List<Map<String, Object>> districtList = new ArrayList<>();
                        /***************初始化省请选择 start***********************/
                        districtList = getDistrictList(city);
                        LinkedList<Map<String, Object>> tempDistrictLinkedList = new LinkedList<>();
                        HashMap<String, Object> tempDistrictMap = new HashMap<>();
                        tempDistrictMap.put("dt","请选择");
                        tempDistrictLinkedList.add(tempDistrictMap);
                        tempDistrictLinkedList.addAll(districtList);
                        /***************初始化省请选择 end***********************/
                        cityMaps.put("ct",city);
                        cityMaps.put("d",tempDistrictLinkedList);
                        cityMapList.add(cityMaps);
                    }
                }
                provinceMaps.put("c",cityMapList);
                provinceMaps.put("p",province);
                provinceMapList.add(provinceMaps);
            }

        }
        return provinceMapList;
    }
    @Override
    public List<Map<String, Object>> getProvinceList() {
        String sql = "SELECT single_unit.province AS province FROM single_unit WHERE single_unit.province IS NOT NULL AND single_unit.province!=''   GROUP BY single_unit.province";
        return baseService.find(sql);
    }
    @Override
    public List<Map<String, Object>> getCityList(String province) {
        String sql = "SELECT single_unit.city FROM single_unit WHERE single_unit.province=\""+province+"\" AND   single_unit.city IS NOT NULL AND single_unit.city!=''  GROUP BY single_unit.city ";
        return baseService.find(sql);
    }
    private List<Map<String, Object>> getDistrictList(String city) {
        String sql = "SELECT single_unit.district AS dt FROM single_unit  WHERE single_unit.city=\"" + city + "\"  AND   single_unit.district IS NOT NULL AND single_unit.district!=''  GROUP BY single_unit.district";
        return baseService.find(sql);
    }
}
