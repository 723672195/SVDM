package com.jiuqu.cloud.service.history;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface IllegaHistoryAnalysisResultsService {

    //查询车辆风险提示
    List<Map<String,Object>> findHistoryCarRiskHints(String carNumber);

    //查詢車輛5大情況的分析值
    List<Map<String,Object>> findHistoryCarAnalysis(String carNumber);

    //查询车辆整改建议
    List<Map<String,Object>> findHistoryCarHandlingOpinions(String carNumber);
    //车辆基本信息
    List<Map<String,Object>> findHistoryCarBasicMessage(String carNumber);
    //事故违法
    List<Map<String,Object>> findHistoryAccidentConstitutesAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryAccidentIllegalMessage(String searchCarno);
    List<Map<String,Object>> findHistoryAccidentConstitutesNumber(String carNumber);
    //交通拥堵违规行驶
    List<Map<String,Object>> findHistoryTrafficCongestionAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryTrafficIllegalMessage(String searchCarno);
    List<Map<String,Object>> findHistoryTrafficCongestionNumber(String carNumber);
    //使用伪造驾驶证
    List<Map<String,Object>> findHistoryUseCounterfeitAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryUseCounterfeitIllegalMessage(String searchCarno);
    List<Map<String,Object>> findHistoryUseCounterfeitNumber(String carNumber);
    //无证驾驶
    List<Map<String,Object>> findHistoryUnlicensedDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryUnlicensedDrivingIllegalMessage(String searchCarno);
    List<Map<String,Object>> findHistoryUnlicensedDrivingNumber(String carNumber);
    //疲劳驾驶
    List<Map<String,Object>> findHistoryFatigueDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryFatigueDrivingIllegalMessage(String searchCarno);
    List<Map<String,Object>> findHistoryFatigueDrivingNumber(String carNumber);
    //肇事逃逸
    List<Map<String,Object>> findHistoryHitAndRunAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryHitAndRunIllegalMessage(String searchCarno);
    List<Map<String,Object>> findHistoryHitAndRunNumber(String carNumber);
    //超员行驶
    List<Map<String,Object>> findHistoryOvercrowdingAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryOvercrowdingMessage(String searchCarno);
    List<Map<String,Object>> findHistoryOvercrowdingNumber(String carNumber);
    //超载行驶
    List<Map<String,Object>> findHistoryOverloadingAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryOverloadingMessage(String searchCarno);
    List<Map<String,Object>> findHistoryOverloadingNumber(String carNumber);
    //超速行驶
    List<Map<String,Object>> findHistoryOverspeedDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryOverspeedDrivingMessage(String searchCarno);
    List<Map<String,Object>> findHistoryOverspeedDrivingNumber(String carNumber);
    //违规行为
    List<Map<String,Object>> findHistoryIrregularitiesAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryIrregularitiesMessage(String searchCarno);
    List<Map<String,Object>> findHistoryIrregularitiesNumber(String carNumber);
    //违规行驶
    List<Map<String,Object>> findHistoryIrregularitiesDriverAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryIrregularitiesDriverMessage(String searchCarno);
    List<Map<String,Object>> findHistoryIrregularitiesDriverNumber(String carNumber);
    //违规载人载物
    List<Map<String,Object>> findHistoryCarryingHumanLoadAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryCarryingHumanLoadMessage(String searchCarno);
    List<Map<String,Object>> findHistoryCarryingHumanLoadNumber(String carNumber);
    //酒驾醉驾
    List<Map<String,Object>> findHistoryDrunkenDrivingAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryDrunkenDrivingMessage(String searchCarno);
    List<Map<String,Object>> findHistoryDrunkenDrivingNumber(String carNumber);
    //驾驶人违规行为
    List<Map<String,Object>> findHistoryDriverIrregularitiesAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryDriverIrregularitiesMessage(String searchCarno);
    List<Map<String,Object>> findHistoryDriverIrregularitiesNumber(String carNumber);
    //驾驶证异常行驶
    List<Map<String,Object>> findHistoryDrivingLicenseAbnormalAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryDrivingLicenseAbnormalMessage(String searchCarno);
    List<Map<String,Object>> findHistoryDrivingLicenseAbnormalNumber(String carNumber);
    //高速超速行驶
    List<Map<String,Object>> findHistoryHighSpeedOverspeedAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryHighSpeedOverspeedMessage(String searchCarno);
    List<Map<String,Object>> findHistoryHighSpeedOverspeedNumber(String carNumber);
    //高速违规行驶
    List<Map<String,Object>> findHistoryHighSpeedViolationAnalysis(String carNumber);
    List<Map<String,Object>> findHistoryHighSpeedViolationMessage(String searchCarno);
    List<Map<String,Object>> findHistoryHighSpeedViolationNumber(String carNumber);


}
