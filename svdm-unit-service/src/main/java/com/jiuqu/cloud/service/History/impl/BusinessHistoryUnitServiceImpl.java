package com.jiuqu.cloud.service.History.impl;

import com.jiuqu.cloud.base.service.BaseService;
import com.jiuqu.cloud.service.History.BusinessHistoryUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BusinessHistoryUnitServiceImpl implements BusinessHistoryUnitService{

    @Autowired
    BaseService baseService;

    /**
     * 根据公司ID获得信息
     *
     * @param
     * @throws
     */
    @Override
    public List<Map<String, Object>> getHistoryUnitList(int id) {
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

    @Override
    public Map getHistoryBusinessUnitList(Map parameter, Pageable pageable) {
        String province = parameter.get("province").toString();
        String city = parameter.get("city").toString();
        String district = parameter.get("district").toString();

        String whereSql1 = "WHERE 0=0 ";
        String whereSql2 = "";
        if(!province.equals("请选择")) {
            whereSql1=whereSql1+" AND single_unit.province = '"+province+"' ";
            whereSql2=whereSql2+" AND a.province = '"+province+"' ";
        }
        if(!city.equals("请选择")) {
            whereSql1=whereSql1+" AND single_unit.city = '"+city+"' ";
            whereSql2=whereSql2+" AND a.city = '"+city+"' ";
        }
        if(!district.equals("请选择")) {
            whereSql1=whereSql1+" AND single_unit.district = '"+district+"' ";
            whereSql2=whereSql2+" AND a.district = '"+district+"' ";
        }
        String sql = "SELECT\n" +
                "\tCOUNT(*) AS driver_count,\n" +
                "\tsingle_unit.unit_name,\n" +
                "\tsingle_unit.id,\n" +
                "\tsingle_unit.freight_car_number,\n" +
                "\tsingle_unit.passenger_car_number,\n" +
                "\tsingle_unit.unit_address,\n" +
                "\tsingle_unit.unit_permit_number,\n" +
                "\tsum(single_unit_car.seat) AS seat,\n" +
                "\tFORMAT(sum(single_unit_car.tonnage), 2) AS tonnage,\n" +
                "\tMAX(single_unit_daily_analysis.id),\n" +
                "\tsingle_unit_daily_analysis.risk_grade AS risk_grade,\n" +
                "\tsingle_unit_daily_analysis.rai_count AS rai_count,\n" +
                "\tsingle_unit_daily_analysis.unit_id AS unit_id \n" +
                "FROM\n" +
                "\tsingle_unit_car\n" +
                "LEFT JOIN\n" +
                "\tsingle_unit\n" +
                "ON \n" +
                "\tsingle_unit.id = single_unit_car.unit_id\n" +
                "LEFT JOIN\n" +
                "\tsingle_unit_daily_analysis\n" +
                "ON\n" +
                "\tsingle_unit_daily_analysis.unit_id = single_unit_car.unit_id\n" +
                whereSql1 +
                "GROUP BY\n" +
                "\tsingle_unit_car.unit_id";

        String countSql="SELECT \n" +
                "\tCOUNT(*) AS counts \n" +
                "FROM(\n" +
                "\tSELECT\n" +
                "\t\tsingle_unit.id,\n" +
                "\t\tsingle_unit.province,\n" +
                " \t\t\tsingle_unit.city,\n" +
                "\t\t\tsingle_unit.district\n" +
                "\tFROM\n" +
                "\t\tsingle_unit_car \n" +
                "\tLEFT JOIN \n" +
                "\t\tsingle_unit \n" +
                "\tON \n" +
                "\t\tsingle_unit.id = single_unit_car.unit_id\n" +
                "\tGROUP BY\n" +
                "\t\tsingle_unit_car.unit_id\n" +
                ") AS a WHERE 0=0" + whereSql2;
        Map map = baseService.findByBootstrap(pageable, sql, countSql);
        return map;
    }

    @Override
    public List<Map<String, Object>> getHistoryProvinceList() {
        String sql = "SELECT single_unit.province AS province FROM single_unit WHERE single_unit.province IS NOT NULL AND single_unit.province!=''   GROUP BY single_unit.province";
        return baseService.find(sql);
    }

    @Override
    public List<Map<String, Object>> getHistoryRegionJson() {
        List<Map<String, Object>> provinceList = getHistoryProvinceList();
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
                List<Map<String, Object>> cityList = getHistoryCityList(province.toString());
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
                        districtList = getHistoryDistrictList(city);
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
    public List<Map<String, Object>> getHistoryCityList(String province) {
        String sql = "SELECT single_unit.city FROM single_unit WHERE single_unit.province=\""+province+"\" AND   single_unit.city IS NOT NULL AND single_unit.city!=''  GROUP BY single_unit.city ";
        return baseService.find(sql);
    }


    private List<Map<String, Object>> getHistoryDistrictList(String city) {
        String sql = "SELECT single_unit.district AS dt FROM single_unit  WHERE single_unit.city=\"" + city + "\"  AND   single_unit.district IS NOT NULL AND single_unit.district!=''  GROUP BY single_unit.district";
        return baseService.find(sql);
    }
}
