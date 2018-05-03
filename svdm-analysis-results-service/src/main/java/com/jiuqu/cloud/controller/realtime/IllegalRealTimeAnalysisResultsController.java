package com.jiuqu.cloud.controller.realtime;

import com.jiuqu.cloud.service.realtime.IllegaRealTimeAnalysisResultsService;
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
@RequestMapping("/realtime/illegalAnalysisResultsController")
public class IllegalRealTimeAnalysisResultsController {
    @Autowired
    private IllegaRealTimeAnalysisResultsService illegaRealTimeAnalysisResultsService;
    @Autowired
    private JSONUtil jsonUtil;

    /**
     * 根据车牌号查询车辆风险提示
     * @param carNumber
     * @return
     */
    @RequestMapping("/findCarRiskHints")
    public List findCarRiskHints(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findCarRiskHints(carNumber);
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
    @RequestMapping("/findCarAnalysis")
    public List findCarAnalysis(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findCarAnalysis(carNumber);
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
    @RequestMapping("/findCarHandlingOpinions")
    public List findCarHandlingOpinions(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findCarHandlingOpinions(carNumber);
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
    @RequestMapping("/findCarBasicMessage")
    public List findCarBasicMessage(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findCarBasicMessage(carNumber);
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
    @RequestMapping("/findAccidentConstitutesIllegal")
    public String findAccidentConstitutesIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findAccidentConstitutesAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findAccidentIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findAccidentConstitutesNumber(carNumber);
            Map map = new HashMap();
            map.put("name","事故构成犯罪");
            Map modular = new HashMap();
            modular.put("Modular_name","accident_constitutes_crime");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("accident_constitutes_crime_analysis",0));
            }
            head.put("table_head_name",bussinessUnits);
            Map table = new HashMap();
            table.put("table_name",bussinessUnits1);
            Map chart = new HashMap();
            chart.put("chart_name",bussinessUnits2);
            return jsonUtil.mergeToJson(map,map,modular,head,table,chart);
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
    @RequestMapping("/findTrafficCongestionIllegal")
    public String findTrafficCongestionIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findTrafficCongestionAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findTrafficIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findTrafficCongestionNumber(carNumber);
            Map map = new HashMap();
            map.put("name","交通拥堵违规行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Traffic_congestion_irregularities");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("traffic_congestion_irregularities_analysis",0));
            }
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
    @RequestMapping("/findUseCounterfeitIllegal")
    public String findUseCounterfeitIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findUseCounterfeitAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findUseCounterfeitIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findUseCounterfeitNumber(carNumber);
            Map map = new HashMap();
            map.put("name","使用伪造驾驶证");
            Map modular = new HashMap();
            modular.put("Modular_name","use_counterfeit");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("use_counterfeit_driver_license_analysis",0));
            }
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
    @RequestMapping("/findUnlicensedDrivingIllegal")
    public String findUnlicensedDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findUnlicensedDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findUnlicensedDrivingIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findUnlicensedDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","无证驾驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Unlicensed_driving");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("unlicensed_driving_analysis",0));
            }
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
    @RequestMapping("/findFatigueDrivingIllegal")
    public String findFatigueDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findFatigueDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findFatigueDrivingIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findFatigueDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","疲劳驾驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Fatigue_driving");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("fatigue_driving_analysis",0));
            }
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
    @RequestMapping("/findHitAndRunIllegal")
    public String findHitAndRunIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findHitAndRunAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findHitAndRunIllegalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findHitAndRunNumber(carNumber);
            Map map = new HashMap();
            map.put("name","肇事逃逸");
            Map modular = new HashMap();
            modular.put("Modular_name","Hit_and_run");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("hit_and_run_analysis",0));
            }
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
    @RequestMapping("/findOvercrowdingIllegal")
    public String findOvercrowdingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findOvercrowdingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findOvercrowdingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findOvercrowdingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","超员行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Overcrowding_man");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("overcrowding_analysis",0));
            }
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
    @RequestMapping("/findOverloadingIllegal")
    public String findOverloadingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findOverloadingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findOverloadingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findOverloadingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","超载行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Overcrowding");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("overloading_analysis",0));
            }
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
    @RequestMapping("/findOverspeedDrivingIllegal")
    public String findOverspeedDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findOverspeedDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findOverspeedDrivingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findOverspeedDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","超速行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","speeding_illegal");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("overspeed_driving_analysis",0));
            }
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
    @RequestMapping("/findIrregularitiesIllegal")
    public String findIrregularitiesIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findIrregularitiesAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findIrregularitiesMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findIrregularitiesNumber(carNumber);
            Map map = new HashMap();
            map.put("name","违规行为");
            Map modular = new HashMap();
            modular.put("Modular_name","Irregularities");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("irregularities_analysis",0));
            }
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
    @RequestMapping("/findIrregularitiesDriverIllegal")
    public String findIrregularitiesDriverIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findIrregularitiesDriverAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findIrregularitiesDriverMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findIrregularitiesDriverNumber(carNumber);
            Map map = new HashMap();
            map.put("name","违规行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Irregularities_travel");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("irregularities_driver_analysis",0));
            }
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
    @RequestMapping("/findCarryingHumanLoadIllegal")
    public String findCarryingHumanLoadIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findCarryingHumanLoadAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findCarryingHumanLoadMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findCarryingHumanLoadNumber(carNumber);
            Map map = new HashMap();
            map.put("name","违规载人载物");
            Map modular = new HashMap();
            modular.put("Modular_name","Irregularities_carrying_human_load");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("irregularities_carrying_human_load_analysis",0));
            }
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
    @RequestMapping("/findDrunkenDrivingIllegal")
    public String findDrunkenDrivingIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findDrunkenDrivingAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findDrunkenDrivingMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findDrunkenDrivingNumber(carNumber);
            Map map = new HashMap();
            map.put("name","酒驾醉驾");
            Map modular = new HashMap();
            modular.put("Modular_name","drunk_driving");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("drunken_driving_analysis",0));
            }
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
    @RequestMapping("/findDriverIrregularitiesIllegal")
    public String findDriverIrregularitiesIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findDriverIrregularitiesAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findDriverIrregularitiesMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findDriverIrregularitiesNumber(carNumber);
            Map map = new HashMap();
            map.put("name","驾驶人违规行为");
            Map modular = new HashMap();
            modular.put("Modular_name","Driver_irregularities");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("driver_irregularities_analysis",0));
            }
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
    @RequestMapping("/findDrivingLicenseAbnormalIllegal")
    public String findDrivingLicenseAbnormalIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findDrivingLicenseAbnormalAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findDrivingLicenseAbnormalMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findDrivingLicenseAbnormalNumber(carNumber);
            Map map = new HashMap();
            map.put("name","驾驶证异常行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","Driving_license_abnormal");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("driving_license_abnormal_driving_analysis",0));
            }
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
    @RequestMapping("/findHighSpeedOverspeedIllegal")
    public String findHighSpeedOverspeedIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findHighSpeedOverspeedAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findHighSpeedOverspeedMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findHighSpeedOverspeedNumber(carNumber);
            Map map = new HashMap();
            map.put("name","高速超速行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","High_speed_overspeed");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("high_speed_overspeed_analysis",0));
            }
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
    @RequestMapping("/findHighSpeedViolationIllegal")
    public String findHighSpeedViolationIllegal(@RequestParam("car_number") String carNumber){
        try {
            List<Map<String,Object>>  bussinessUnits = illegaRealTimeAnalysisResultsService.findHighSpeedViolationAnalysis(carNumber);
            List<Map<String,Object>>  bussinessUnits1 = illegaRealTimeAnalysisResultsService.findHighSpeedViolationMessage(carNumber);
            List<Map<String,Object>>  bussinessUnits2 = illegaRealTimeAnalysisResultsService.findHighSpeedViolationNumber(carNumber);
            Map map = new HashMap();
            map.put("name","高速违规行驶");
            Map modular = new HashMap();
            modular.put("Modular_name","High_speed_violation");
            Map head = new HashMap();
            if (bussinessUnits.size() == 0) {
                bussinessUnits.add((Map<String, Object>) new HashMap().put("high_speed_violation_analysis",0));
            }
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
