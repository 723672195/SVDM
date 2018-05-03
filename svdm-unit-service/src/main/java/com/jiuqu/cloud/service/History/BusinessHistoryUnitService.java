package com.jiuqu.cloud.service.History;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BusinessHistoryUnitService {
    //获得道路运输安全生产考核与评价系统的公司名称：……
    List<Map<String,Object>> getHistoryUnitList(int id);

    //最终多条件查询
    Map getHistoryBusinessUnitList(Map parameter, Pageable pageable);

    //下拉选单有关的方法
    List<Map<String,Object>> getHistoryProvinceList();
    List<Map<String,Object>> getHistoryRegionJson();
    List<Map<String,Object>> getHistoryCityList(String province);
}
