package com.jiuqu.cloud.service;


import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Map;

public interface BusinessUnitRiskEvaService {

 /*   SvdmBusinessUnitEntity findById(int id);

    //查询全部数据
    List<SvdmBusinessUnitEntity> findAll();
    //根据省名查询
    List<SvdmBusinessUnitEntity> findByProvince(String province);
    //多条件查询（省市区）
    List<SvdmBusinessUnitEntity> findByProvinceAndCityAndDistrict(String province,String city,String district);
    //多条件查询（省市）
    List<SvdmBusinessUnitEntity> findByProvinceAndCity(String province,String city);*/

    //获得道路运输安全生产考核与评价系统的公司名称：……
    List<Map<String,Object>> getUnitList(int id);

    //最终多条件查询
    Map getBusinessUnitList(Map parameter, Pageable pageable);

    //下拉选单有关的方法
    List<Map<String,Object>> getProvinceList();
    List<Map<String,Object>> getRegionJson();
    List<Map<String,Object>> getCityList(String province);

}
