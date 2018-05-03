package com.jiuqu.cloud.controller.history;

import com.jiuqu.cloud.service.history.IllegaHistoryAnalysisResultsService;
import com.jiuqu.cloud.util.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/history/illegalAnalysisResultsController")
public class IllegalHistoryAnalysisResultsController {
    @Autowired
    IllegaHistoryAnalysisResultsService illegaHistoryAnalysisResultsService;
    @Autowired
    private JSONUtil jsonUtil;

    /**
     * 根据车牌号查询车辆的风险提示
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryCarRiskHints")
    public List findHistoryCarRiskHints(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryCarRiskHints(carNumber);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }


    /**
     * 根据车牌照查询车辆5大分類的分析值
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryCarAnalysis")
    public List findHistoryCarAnalysis(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryCarAnalysis(carNumber);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 根据车牌照查询车辆整改建议
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryCarHandlingOpinions")
    public List findHistoryCarHandlingOpinions(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryCarHandlingOpinions(carNumber);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 根据车牌照查询车辆基本信息
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryCarBasicMessage")
    public List findHistoryCarBasicMessage(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryCarBasicMessage(carNumber);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    //事故整合

    /**1
     * 事故整合
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryAccidentConstitutesIllegal")
    public String findHistoryAccidentConstitutesIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryAccidentConstitutesAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryAccidentIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryAccidentConstitutesNumber(carNumber);
            Map map = new HashMap();
            map.put("name","事故构成犯罪");
            Map modular = new HashMap();
            modular.put("Modular_name","accident_constitutes_crime");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }

    //交通拥堵违规行驶

    /**2
     * 整合交通拥堵违规行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryTrafficCongestionIllegal")
    public String findHistoryTrafficCongestionIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryTrafficCongestionAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryTrafficIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryTrafficCongestionNumber(carNumber);
            Map map = new HashMap();
            map.put("name","交通拥堵违规行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Traffic_congestion_irregularities");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //整合使用伪造驾驶证

    /**3
     * 整合使用伪造驾驶证
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryUseCounterfeitIllegal")
    public String findHistoryUseCounterfeitIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryUseCounterfeitAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryUseCounterfeitIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryUseCounterfeitNumber(carNumber);
            Map map = new HashMap();
            map.put("name","使用伪造驾驶证");
            Map modular = new HashMap();
            modular.put("Modular_name","use_counterfeit");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }



    /*--------------------------------------------------------------------------------------------------------*/
    //整合无证驾驶

    /**4
     * 整合无证驾驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryUnlicensedDrivingIllegal")
    public String findHistoryUnlicensedDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryUnlicensedDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryUnlicensedDrivingIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryUnlicensedDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","无证驾驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Unlicensed_driving");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }



    /*--------------------------------------------------------------------------------------------------------*/
    //整合疲劳驾驶

    /**5
     * 整合疲劳驾驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryFatigueDrivingIllegal")
    public String findHistoryFatigueDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryFatigueDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryFatigueDrivingIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryFatigueDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","疲劳驾驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Fatigue_driving");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //整合肇事逃逸

    /**6
     * 整合肇事逃逸
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryHitAndRunIllegal")
    public String findHistoryHitAndRunIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryHitAndRunAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryHitAndRunIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryHitAndRunNumber(carNumber);
            Map map = new HashMap();
            map.put("name","肇事逃逸");
            Map modular = new HashMap();
            modular.put("Modular_name","Hit_and_run");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //整合超员行驶

    /**7
     * 整合超员行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryOvercrowdingIllegal")
    public String findHistoryOvercrowdingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryOvercrowdingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryOvercrowdingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryOvercrowdingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","超员行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Overcrowding_man");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //整合超载行驶

    /**8
     * 整合超载行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryOverloadingIllegal")
    public String findHistoryOverloadingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryOverloadingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryOverloadingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryOverloadingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","超载行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Overcrowding");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //整合超速行驶

    /**9
     * 整合超速行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryOverspeedDrivingIllegal")
    public String findHistoryOverspeedDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryOverspeedDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryOverspeedDrivingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryOverspeedDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","超速行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","speeding_illegal");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //整合违规行为

    /**10
     * 整合违规行为
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryIrregularitiesIllegal")
    public String findHistoryIrregularitiesIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryIrregularitiesAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryIrregularitiesMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryIrregularitiesNumber(carNumber);
            Map map = new HashMap();
            map.put("name","违规行为");
            Map modular = new HashMap();
            modular.put("Modular_name","Irregularities");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //整合违规行驶

    /**11
     * 整合违规行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryIrregularitiesDriverIllegal")
    public String findHistoryIrregularitiesDriverIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryIrregularitiesDriverAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryIrregularitiesDriverMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryIrregularitiesDriverNumber(carNumber);
            Map map = new HashMap();
            map.put("name","违规行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Irregularities_travel");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //整合违规载人载物

    /**12
     * 整合违规载人载物
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryCarryingHumanLoadIllegal")
    public String findHistoryCarryingHumanLoadIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryCarryingHumanLoadAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryCarryingHumanLoadMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryCarryingHumanLoadNumber(carNumber);
            Map map = new HashMap();
            map.put("name","违规载人载物");
            Map modular = new HashMap();
            modular.put("Modular_name","Irregularities_carrying_human_load");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //整合酒驾醉驾

    /**13
     * 整合酒驾醉驾
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryDrunkenDrivingIllegal")
    public String findHistoryDrunkenDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryDrunkenDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryDrunkenDrivingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryDrunkenDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","酒驾醉驾");
            Map modular = new HashMap();
            modular.put("Modular_name","drunk_driving");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //整合驾驶人违规行为

    /**14
     * 整合驾驶人违规行为
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryDriverIrregularitiesIllegal")
    public String findHistoryDriverIrregularitiesIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryDriverIrregularitiesAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryDriverIrregularitiesMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryDriverIrregularitiesNumber(carNumber);
            Map map = new HashMap();
            map.put("name","驾驶人违规行为");
            Map modular = new HashMap();
            modular.put("Modular_name","Driver_irregularities");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //驾驶证异常行驶

    /**15
     * 驾驶证异常行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryDrivingLicenseAbnormalIllegal")
    public String findHistoryDrivingLicenseAbnormalIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryDrivingLicenseAbnormalAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryDrivingLicenseAbnormalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryDrivingLicenseAbnormalNumber(carNumber);
            Map map = new HashMap();
            map.put("name","驾驶证异常行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Driving_license_abnormal");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //整合高速超速行驶

    /**16
     * 整合高速超速行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryHighSpeedOverspeedIllegal")
    public String findHistoryHighSpeedOverspeedIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryHighSpeedOverspeedAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryHighSpeedOverspeedMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryHighSpeedOverspeedNumber(carNumber);
            Map map = new HashMap();
            map.put("name","高速超速行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","High_speed_overspeed");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


    /*--------------------------------------------------------------------------------------------------------*/
    //高速违规行驶

    /**17
     * 高速违规行驶
     * @param carNumber
     * @return
     */
    @RequestMapping("/findHistoryHighSpeedViolationIllegal")
    public String findHistoryHighSpeedViolationIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaHistoryAnalysisResultsService.findHistoryHighSpeedViolationAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaHistoryAnalysisResultsService.findHistoryHighSpeedViolationMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaHistoryAnalysisResultsService.findHistoryHighSpeedViolationNumber(carNumber);
            Map map = new HashMap();
            map.put("name","高速违规行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","High_speed_violation");
            Map head = new HashMap();
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,modular,head,table,chart);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }


}

