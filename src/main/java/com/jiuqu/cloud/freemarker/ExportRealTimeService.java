package com.jiuqu.cloud.freemarker;

import java.util.List;
import java.util.Map;

public interface ExportRealTimeService {
    //查询公司名称
    List<Map<String,Object>> findUnitName(Long unitId);
    //查询公司的雷达图以及分析值
    List<Map<String,Object>> findUnitMessage(Long unitId);
    //查询5大分类下所有小分类的分析值及次数
    List<Map<String,Object>> findAllAnalysis(Long unitId);
    //公司基础数据
    List<Map<String,Object>> findUnitData(Long unitId);
    //车载监控设备状态
    List<Map<String,Object>> findUnitCarState(Long unitId);
    //查询公司整改建议
    List<Map<String,Object>> findUnitHandling(Long unitId);
}
