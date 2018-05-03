package com.jiuqu.cloud.service.svdm.history;

import java.util.List;
import java.util.Map;

public interface RiskHistoryService {
    //根据公司id查询驾驶人员,车辆,道路,天气,管理信息以及风险信息和RAL
    List<Map<String,Object>> findUnitHistoryMessage(Long unitId);
    //根据公司id查询5大分类下的小分类的分析值
    List<Map<String,Object>> findUnitHistoryAnalysis(Long unitId);
    //根据车牌号查询车辆的Rai指数
    List<Map<String,Object>> findCarHistoryRAL(Long unitId);
    //根据公司id查询整改建议
    List<Map<String,Object>> findUnitHistoryOpinions(Long unitId);
}
