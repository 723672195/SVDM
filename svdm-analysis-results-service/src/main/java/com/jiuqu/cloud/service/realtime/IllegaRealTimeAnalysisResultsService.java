package com.jiuqu.cloud.service.realtime;

import java.util.List;
import java.util.Map;

public interface IllegaRealTimeAnalysisResultsService {

    //查询风险提示
    List<Map<String,Object>> findCarRiskHints(String carNumber);

    //查詢車輛5大情況的分析值
    List<Map<String,Object>> findCarAnalysis(String carNumber);

    //查询车辆整改建议
    List<Map<String,Object>> findCarHandlingOpinions(String carNumber);
    //车辆基本信息
    List<Map<String,Object>> findCarBasicMessage(String carNumber);
    //事故违法
    List<Map<String,Object>> findAccidentConstitutesAnalysis(String carNumber);
    List<Map<String,Object>> findAccidentIllegalMessage(String searchCarno);
    List<Map<String,Object>> findAccidentConstitutesNumber(String carNumber);
    //交通拥堵违规行驶
    List<Map<String,Object>> findTrafficCongestionAnalysis(String carNumber);
    List<Map<String,Object>> findTrafficIllegalMessage(String searchCarno);
    List<Map<String,Object>> findTrafficCongestionNumber(String carNumber);
    //使用伪造驾驶证
    List<Map<String,Object>> findUseCounterfeitAnalysis(String carNumber);
    List<Map<String,Object>> findUseCounterfeitIllegalMessage(String searchCarno);
    List<Map<String,Object>> findUseCounterfeitNumber(String carNumber);
    //无证驾驶
    List<Map<String,Object>> findUnlicensedDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findUnlicensedDrivingIllegalMessage(String searchCarno);
    List<Map<String,Object>> findUnlicensedDrivingNumber(String carNumber);
    //疲劳驾驶
    List<Map<String,Object>> findFatigueDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findFatigueDrivingIllegalMessage(String searchCarno);
    List<Map<String,Object>> findFatigueDrivingNumber(String carNumber);
    //肇事逃逸
    List<Map<String,Object>> findHitAndRunAnalysis(String carNumber);
    List<Map<String,Object>> findHitAndRunIllegalMessage(String searchCarno);
    List<Map<String,Object>> findHitAndRunNumber(String carNumber);
    //超员行驶
    List<Map<String,Object>> findOvercrowdingAnalysis(String carNumber);
    List<Map<String,Object>> findOvercrowdingMessage(String searchCarno);
    List<Map<String,Object>> findOvercrowdingNumber(String carNumber);
    //超载行驶
    List<Map<String,Object>> findOverloadingAnalysis(String carNumber);
    List<Map<String,Object>> findOverloadingMessage(String searchCarno);
    List<Map<String,Object>> findOverloadingNumber(String carNumber);
    //超速行驶
    List<Map<String,Object>> findOverspeedDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findOverspeedDrivingMessage(String searchCarno);
    List<Map<String,Object>> findOverspeedDrivingNumber(String carNumber);
    //违规行为
    List<Map<String,Object>> findIrregularitiesAnalysis(String carNumber);
    List<Map<String,Object>> findIrregularitiesMessage(String searchCarno);
    List<Map<String,Object>> findIrregularitiesNumber(String carNumber);
    //违规行驶
    List<Map<String,Object>> findIrregularitiesDriverAnalysis(String carNumber);
    List<Map<String,Object>> findIrregularitiesDriverMessage(String searchCarno);
    List<Map<String,Object>> findIrregularitiesDriverNumber(String carNumber);
    //违规载人载物
    List<Map<String,Object>> findCarryingHumanLoadAnalysis(String carNumber);
    List<Map<String,Object>> findCarryingHumanLoadMessage(String searchCarno);
    List<Map<String,Object>> findCarryingHumanLoadNumber(String carNumber);
    //酒驾醉驾
    List<Map<String,Object>> findDrunkenDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findDrunkenDrivingMessage(String searchCarno);
    List<Map<String,Object>> findDrunkenDrivingNumber(String carNumber);
    //驾驶人违规行为
    List<Map<String,Object>> findDriverIrregularitiesAnalysis(String carNumber);
    List<Map<String,Object>> findDriverIrregularitiesMessage(String searchCarno);
    List<Map<String,Object>> findDriverIrregularitiesNumber(String carNumber);
    //驾驶证异常行驶
    List<Map<String,Object>> findDrivingLicenseAbnormalAnalysis(String carNumber);
    List<Map<String,Object>> findDrivingLicenseAbnormalMessage(String searchCarno);
    List<Map<String,Object>> findDrivingLicenseAbnormalNumber(String carNumber);
    //高速超速行驶
    List<Map<String,Object>> findHighSpeedOverspeedAnalysis(String carNumber);
    List<Map<String,Object>> findHighSpeedOverspeedMessage(String searchCarno);
    List<Map<String,Object>> findHighSpeedOverspeedNumber(String carNumber);
    //高速违规行驶
    List<Map<String,Object>> findHighSpeedViolationAnalysis(String carNumber);
    List<Map<String,Object>> findHighSpeedViolationMessage(String searchCarno);
    List<Map<String,Object>> findHighSpeedViolationNumber(String carNumber);




}
