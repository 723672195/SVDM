package com.jiuqu.cloud.freemarker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class WordAction {
    @Autowired
    WordUtil wordUtil;
    @Autowired
    ExportRealTimeService exportRealTimeService;
    private String filePath; //文件路径
    private String fileOnlyName; //文件唯一名称

    @RequestMapping(value = "/createWord")
    public String createWord(@RequestParam("unit_id") Long unitId, String coding, HttpServletRequest request) {

        try{
            /** 用于组装word页面需要的数据 */
            Map<String, Object> dataMap = new HashMap<String, Object>();


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            dataMap.put("2018", sdf.format(new Date()));

            /**查询公司名称*/
            List<Map<String,Object>> list = exportRealTimeService.findUnitName(unitId);
            Map unit = list.get(0);
            String gongsi =(String) unit.get("unit_name");
            dataMap.put("gongsi",gongsi);

            /**查询雷达图以及rai指数*/
            List<Map<String,Object>> list1 = exportRealTimeService.findUnitMessage(unitId);
            Map unit1 = list1.get(0);
            Double rai = Double.valueOf(unit1.get("rai_count")+"");
            Double jiashirenyuan = Double.valueOf( unit1.get("driver_analysis")+"");
            Double cheliang = Double.valueOf( unit1.get("vehicle_conditions_analysis")+"");
            Double daolu = Double.valueOf( unit1.get("road_condition_analysis")+"");
            Double tianqi = Double.valueOf( unit1.get("weather_condition_analysis")+"");
            Double guanli = Double.valueOf( unit1.get("management_situation_analysis")+"");
            dataMap.put("jiashirenyuan",jiashirenyuan);
            dataMap.put("cheliang",cheliang);
            dataMap.put("daolu",daolu);
            dataMap.put("tianqi",tianqi);
            dataMap.put("guanli",guanli);
            dataMap.put("rai_count",rai);
            String rai_lv = "较小";
            if(rai==0){
                rai_lv = "暂无";
            }
            if(rai>=20){
                rai_lv="一般";
            }
            if(rai>=40){
                rai_lv="较大";
            }
            if(rai>=60){
                rai_lv="重大";
            }
            if(rai>=80){
                rai_lv="特别重大";
            }
            dataMap.put("rai_lv",rai_lv);

            /**查询公司基础数据*/
            List<Map<String,Object>> list2 = exportRealTimeService.findUnitData(unitId);
            List jichuxinxi = new ArrayList();
            for(int i=0;i<list2.size();i++){
                Map index = list2.get(i);
                String chepaihaoma = (String) index.get("car_license_plate");
                chepaihaoma = carMessage(chepaihaoma);
                String yunshuleixing = (String)index.get("car_type");
                yunshuleixing = carMessage(yunshuleixing);
                String ranyouleixing = (String)index.get("fuel_type");
                ranyouleixing = carMessage(ranyouleixing);
                String jishudengji = (String)index.get("vehicle_level");
                jishudengji = carMessage(jishudengji);
                Map map = new HashMap();
                map.put("chepaihaoma",chepaihaoma);
                map.put("yunshunengli","暂无");
                map.put("yunshuleixing",yunshuleixing);
                map.put("jiashirenyuan","暂无");
                map.put("ranyouleixing",ranyouleixing);
                map.put("jishudengji",jishudengji);
                jichuxinxi.add(map);
            }
            dataMap.put("jichuxinxi",jichuxinxi);


            /**查询公司整改建议*/
            List<Map<String,Object>> list3 = exportRealTimeService.findUnitHandling(unitId);
            List handling = new ArrayList();
            for(int i=0;i<list3.size();i++){
                Map index = list3.get(i);
                String opinions =(String) index.get("handling_opinions");
                Map map = new HashMap();
                map.put("zhenggaiyijian",opinions);
                map.put("xuhao",i+1);
                handling.add(map);
            }
            dataMap.put("handling",handling);
            /**查询车载监控设备*/
            dataMap.put("car_nnumber","豫G3102");
            dataMap.put("Onlinetime",7);

            /**道路运输行为数据*/
            List<Map<String,Object>> list4 = exportRealTimeService.findAllAnalysis(unitId);
            Map unit4 = list4.get(0);
            Double weather_warning_analysis = Double.valueOf( unit4.get("weather_warning_analysis")+"");
            Integer weather_warning_number = (Integer) unit4.get("weather_warning_number");
            Double speeding_early_warning_analysis = Double.valueOf( unit4.get("speeding_early_warning_analysis")+"");
            Integer speeding_early_warning_number = (Integer) unit4.get("speeding_early_warning_number");
            Double fatigue_driving_early_warning_analysis = Double.valueOf( unit4.get("fatigue_driving_early_warning_analysis")+"");
            Integer fatigue_driving_early_warning_number = (Integer) unit4.get("fatigue_driving_early_warning_number");
            Double early_warning_analysis = Double.valueOf( unit4.get("early_warning_analysis")+"");
            Integer early_warning_number = (Integer) unit4.get("early_warning_number");
            Double terminal_equipment_failure_early_warning_analysis = Double.valueOf( unit4.get("terminal_equipment_failure_early_warning_analysis")+"");
            Integer terminal_equipment_failure_early_warning_number = (Integer) unit4.get("terminal_equipment_failure_early_warning_number");
            Double abnormality_of_driving_time_early_warning_analysis = Double.valueOf( unit4.get("abnormality_of_driving_time_early_warning_analysis")+"");
            Integer abnormality_of_driving_time_early_warning_number = (Integer) unit4.get("abnormality_of_driving_time_early_warning_number");
            Double timeout_parking_early_warning_analysis = Double.valueOf( unit4.get("timeout_parking_early_warning_analysis")+"");
            Integer timeout_parking_early_warning_number = (Integer) unit4.get("timeout_parking_early_warning_number");
            Double abnormal_route_early_warning_analysis = Double.valueOf( unit4.get("abnormal_route_early_warning_analysis")+"");
            Integer abnormal_route_early_warning_number = (Integer) unit4.get("abnormal_route_early_warning_number");
            Double route_deviation_early_warning_analysis = Double.valueOf( unit4.get("route_deviation_early_warning_analysis")+"");
            Integer route_deviation_early_warning_number = (Integer) unit4.get("route_deviation_early_warning_number");
            Double vehicle_anomaly_early_warning_analysis = Double.valueOf( unit4.get("vehicle_anomaly_early_warning_analysis")+"");
            Integer vehicle_anomaly_early_warning_number = (Integer) unit4.get("vehicle_anomaly_early_warning_number");
            Double illegal_vehicle_driving_early_warning_analysis = Double.valueOf( unit4.get("illegal_vehicle_driving_early_warning_analysis")+"");
            Integer illegal_vehicle_driving_early_warning_number = (Integer) unit4.get("illegal_vehicle_driving_early_warning_number");
            Double accident_constitutes_crime_analysis = Double.valueOf( unit4.get("accident_constitutes_crime_analysis")+"");
            Integer accident_constitutes_crime_number = (Integer) unit4.get("accident_constitutes_crime_number");
            Double traffic_congestion_irregularities_analysis = Double.valueOf( unit4.get("traffic_congestion_irregularities_analysis")+"");
            Integer traffic_congestion_irregularities_number = (Integer) unit4.get("traffic_congestion_irregularities_number");
            Double use_counterfeit_driver_license_analysis = Double.valueOf( unit4.get("use_counterfeit_driver_license_analysis")+"");
            Integer use_counterfeit_driver_license_number = (Integer) unit4.get("use_counterfeit_driver_license_number");
            Double unlicensed_driving_analysis = Double.valueOf( unit4.get("unlicensed_driving_analysis")+"");
            Integer unlicensed_driving_number = (Integer) unit4.get("unlicensed_driving_number");
            Double fatigue_driving_analysis = Double.valueOf( unit4.get("fatigue_driving_analysis")+"");
            Integer fatigue_driving_number = (Integer) unit4.get("fatigue_driving_number");
            Double hit_and_run_analysis = Double.valueOf( unit4.get("hit_and_run_analysis")+"");
            Integer hit_and_run_number = (Integer) unit4.get("hit_and_run_number");
            Double overcrowding_analysis = Double.valueOf( unit4.get("overcrowding_analysis")+"");
            Integer overcrowding_number = (Integer) unit4.get("overcrowding_number");
            Double overloading_analysis = Double.valueOf( unit4.get("overloading_analysis")+"");
            Integer overloading_number = (Integer) unit4.get("overloading_number");
            Double overspeed_driving_analysis = Double.valueOf( unit4.get("overspeed_driving_analysis")+"");
            Integer overspeed_driving_number = (Integer) unit4.get("overspeed_driving_number");
            Double irregularities_analysis = Double.valueOf( unit4.get("irregularities_analysis")+"");
            Integer irregularities_number = (Integer) unit4.get("irregularities_number");
            Double irregularities_driver_analysis = Double.valueOf( unit4.get("irregularities_driver_analysis")+"");
            Integer irregularities_driver_number = (Integer) unit4.get("irregularities_driver_number");
            Double irregularities_carrying_human_load_analysis = Double.valueOf( unit4.get("irregularities_carrying_human_load_analysis")+"");
            Integer irregularities_carrying_human_load_number = (Integer) unit4.get("irregularities_carrying_human_load_number");
            Double drunken_driving_analysis = Double.valueOf( unit4.get("drunken_driving_analysis")+"");
            Integer drunken_driving_number = (Integer) unit4.get("drunken_driving_number");
            Double driver_irregularities_analysis = Double.valueOf( unit4.get("driver_irregularities_analysis")+"");
            Integer driver_irregularities_number = (Integer) unit4.get("driver_irregularities_number");
            Double driving_license_abnormal_driving_analysis = Double.valueOf( unit4.get("driving_license_abnormal_driving_analysis")+"");
            Integer driving_license_abnormal_driving_number = (Integer) unit4.get("driving_license_abnormal_driving_number");
            Double high_speed_overspeed_analysis = Double.valueOf( unit4.get("high_speed_overspeed_analysis")+"");
            Integer high_speed_overspeed_number = (Integer) unit4.get("high_speed_overspeed_number");
            Double high_speed_violation_analysis = Double.valueOf( unit4.get("high_speed_violation_analysis")+"");
            Integer high_speed_violation_number = (Integer) unit4.get("high_speed_violation_number");
            Double dynamic_system_analysis = Double.valueOf( unit4.get("dynamic_system_analysis")+"");
            Double braking_system_analysis = Double.valueOf( unit4.get("braking_system_analysis")+"");
            Double drive_system_analysis = Double.valueOf( unit4.get("drive_system_analysis")+"");
            Double steering_system_analysis = Double.valueOf( unit4.get("steering_system_analysis")+"");
            Double average_elevation_analysis = Double.valueOf( unit4.get("average_elevation_analysis")+"");
            Double road_curvature_analysis = Double.valueOf( unit4.get("road_curvature_analysis")+"");
            Double road_slope_analysis = Double.valueOf( unit4.get("road_slope_analysis")+"");
            Double route_efficiency_analysis = Double.valueOf( unit4.get("route_efficiency_analysis")+"");
            Double weather_data_analysis = Double.valueOf( unit4.get("weather_data_analysis")+"");
            Double vehicle_management_analysis = Double.valueOf( unit4.get("vehicle_management_analysis")+"");
            Double personnel_management_analysis = Double.valueOf( unit4.get("personnel_management_analysis")+"");
            Double transportation_management_analysis = Double.valueOf( unit4.get("transportation_management_analysis")+"");
            Double security_management_analysis = Double.valueOf( unit4.get("security_management_analysis")+"");
            dataMap.put("weather_warning_analysis",weather_warning_analysis);
            String weather_warning_lv = State(weather_warning_analysis);
            dataMap.put("weather_warning_lv",weather_warning_lv);
            dataMap.put("weather_warning_number",weather_warning_number);
            dataMap.put("speeding_early_warning_analysis",speeding_early_warning_analysis);
            String speeding_early_warning_lv = State(speeding_early_warning_analysis);
            dataMap.put("speeding_early_warning_lv",speeding_early_warning_lv);
            dataMap.put("speeding_early_warning_number",speeding_early_warning_number);
            dataMap.put("fatigue_driving_early_warning_analysis",fatigue_driving_early_warning_analysis);
            String fatigue_driving_early_warning_lvr = State(fatigue_driving_early_warning_analysis);
            dataMap.put("fatigue_driving_early_warning_lvr",fatigue_driving_early_warning_lvr);
            dataMap.put("fatigue_driving_early_warning_number",fatigue_driving_early_warning_number);
            dataMap.put("early_warning_analysis",early_warning_analysis);
            String early_warning_lv = State(early_warning_analysis);
            dataMap.put("early_warning_lv",early_warning_lv);
            dataMap.put("early_warning_number",early_warning_number);
            dataMap.put("terminal_equipment_failure_early_warning_analysis",terminal_equipment_failure_early_warning_analysis);
            String terminal_equipment_failure_early_warning_lv = State(terminal_equipment_failure_early_warning_analysis);
            dataMap.put("terminal_equipment_failure_early_warning_lv",terminal_equipment_failure_early_warning_lv);
            dataMap.put("terminal_equipment_failure_early_warning_number",terminal_equipment_failure_early_warning_number);
            dataMap.put("abnormality_of_driving_time_early_warning_analysis",abnormality_of_driving_time_early_warning_analysis);
            String abnormality_of_driving_time_early_warning_lv = State(abnormality_of_driving_time_early_warning_analysis);
            dataMap.put("abnormality_of_driving_time_early_warning_lv",abnormality_of_driving_time_early_warning_lv);
            dataMap.put("timeout_parking_early_warning_analysis",timeout_parking_early_warning_analysis);
            String timeout_parking_early_warning_lv = State(timeout_parking_early_warning_analysis);
            dataMap.put("timeout_parking_early_warning_lv",timeout_parking_early_warning_lv);
            dataMap.put("abnormality_of_driving_time_early_warning_number",abnormality_of_driving_time_early_warning_number);
            dataMap.put("abnormal_route_early_warning_analysis",abnormal_route_early_warning_analysis);
            String abnormal_route_early_warning_lv = State(abnormal_route_early_warning_analysis);
            dataMap.put("abnormal_route_early_warning_lv",abnormal_route_early_warning_lv);
            dataMap.put("timeout_parking_early_warning_number",timeout_parking_early_warning_number);
            dataMap.put("route_deviation_early_warning_analysis",route_deviation_early_warning_analysis);
            String route_deviation_early_warning_lv = State(route_deviation_early_warning_analysis);
            dataMap.put("route_deviation_early_warning_lv",route_deviation_early_warning_lv);
            dataMap.put("abnormal_route_early_warning_number",abnormal_route_early_warning_number);
            dataMap.put("route_deviation_early_warning_number",route_deviation_early_warning_number);
            dataMap.put("vehicle_anomaly_early_warning_analysis",vehicle_anomaly_early_warning_analysis);
            String vehicle_anomaly_early_warning_lv = State(vehicle_anomaly_early_warning_analysis);
            dataMap.put("vehicle_anomaly_early_warning_lv",vehicle_anomaly_early_warning_lv);
            dataMap.put("vehicle_anomaly_early_warning_number",vehicle_anomaly_early_warning_number);
            dataMap.put("illegal_vehicle_driving_early_warning_analysis",illegal_vehicle_driving_early_warning_analysis);
            String illegal_vehicle_driving_early_warning_lv = State(illegal_vehicle_driving_early_warning_analysis);
            dataMap.put("illegal_vehicle_driving_early_warning_lv",illegal_vehicle_driving_early_warning_lv);
            dataMap.put("illegal_vehicle_driving_early_warning_number",illegal_vehicle_driving_early_warning_number);
            dataMap.put("accident_constitutes_crime_analysis",accident_constitutes_crime_analysis);
            String accident_constitutes_crime_lv = State(accident_constitutes_crime_analysis);
            dataMap.put("accident_constitutes_crime_lv",accident_constitutes_crime_lv);
            dataMap.put("accident_constitutes_crime_number",accident_constitutes_crime_number);
            dataMap.put("traffic_congestion_irregularities_analysis",traffic_congestion_irregularities_analysis);
            String traffic_congestion_irregularities_lv = State(traffic_congestion_irregularities_analysis);
            dataMap.put("traffic_congestion_irregularities_lv",traffic_congestion_irregularities_lv);
            dataMap.put("traffic_congestion_irregularities_number",traffic_congestion_irregularities_number);
            dataMap.put("use_counterfeit_driver_license_analysis",use_counterfeit_driver_license_analysis);
            String use_counterfeit_driver_license_lv = State(use_counterfeit_driver_license_analysis);
            dataMap.put("use_counterfeit_driver_license_lv",use_counterfeit_driver_license_lv);
            dataMap.put("use_counterfeit_driver_license_number",use_counterfeit_driver_license_number);
            dataMap.put("unlicensed_driving_analysis",unlicensed_driving_analysis);
            String unlicensed_driving_lv = State(unlicensed_driving_analysis);
            dataMap.put("unlicensed_driving_lv",unlicensed_driving_lv);
            dataMap.put("unlicensed_driving_number",unlicensed_driving_number);
            dataMap.put("fatigue_driving_analysis",fatigue_driving_analysis);
            String fatigue_driving_lv = State(fatigue_driving_analysis);
            dataMap.put("fatigue_driving_lv",fatigue_driving_lv);
            dataMap.put("fatigue_driving_number",fatigue_driving_number);
            dataMap.put("hit_and_run_analysis",hit_and_run_analysis);
            String hit_and_run_lv = State(hit_and_run_analysis);
            dataMap.put("hit_and_run_lv",hit_and_run_lv);
            dataMap.put("hit_and_run_number",hit_and_run_number);
            dataMap.put("overcrowding_analysis",overcrowding_analysis);
            String overcrowding_lv = State(overcrowding_analysis);
            dataMap.put("overcrowding_lv",overcrowding_lv);
            dataMap.put("overcrowding_number",overcrowding_number);
            dataMap.put("overloading_analysis",overloading_analysis);
            String overloading_lv = State(overloading_analysis);
            dataMap.put("overloading_lv",overloading_lv);
            dataMap.put("overloading_number",overloading_number);
            dataMap.put("overspeed_driving_analysis",overspeed_driving_analysis);
            String overspeed_driving_lv = State(overspeed_driving_analysis);
            dataMap.put("overspeed_driving_lv",overspeed_driving_lv);
            dataMap.put("overspeed_driving_number",overspeed_driving_number);
            dataMap.put("irregularities_analysis",irregularities_analysis);
            String irregularities_lv = State(irregularities_analysis);
            dataMap.put("irregularities_lv",irregularities_lv);
            dataMap.put("irregularities_number",irregularities_number);
            dataMap.put("irregularities_driver_analysis",irregularities_driver_analysis);
            String irregularities_driver_lv = State(irregularities_driver_analysis);
            dataMap.put("irregularities_driver_lv",irregularities_driver_lv);
            dataMap.put("irregularities_driver_number",irregularities_driver_number);
            dataMap.put("irregularities_carrying_human_load_analysis",irregularities_carrying_human_load_analysis);
            String irregularities_carrying_human_load_lv = State(irregularities_carrying_human_load_analysis);
            dataMap.put("irregularities_carrying_human_load_lv",irregularities_carrying_human_load_lv);
            dataMap.put("irregularities_carrying_human_load_number",irregularities_carrying_human_load_number);
            dataMap.put("drunken_driving_analysis",drunken_driving_analysis);
            String drunken_driving_lv = State(drunken_driving_analysis);
            dataMap.put("drunken_driving_lv",drunken_driving_lv);
            dataMap.put("drunken_driving_number",drunken_driving_number);
            dataMap.put("driver_irregularities_analysis",driver_irregularities_analysis);
            String driver_irregularities_lv = State(driver_irregularities_analysis);
            dataMap.put("driver_irregularities_lv",driver_irregularities_lv);
            dataMap.put("driver_irregularities_number",driver_irregularities_number);
            dataMap.put("driving_license_abnormal_driving_analysis",driving_license_abnormal_driving_analysis);
            String driving_license_abnormal_driving_lv = State(driving_license_abnormal_driving_analysis);
            dataMap.put("driving_license_abnormal_driving_lv",driving_license_abnormal_driving_lv);
            dataMap.put("driving_license_abnormal_driving_number",driving_license_abnormal_driving_number);
            dataMap.put("high_speed_overspeed_analysis",high_speed_overspeed_analysis);
            String high_speed_overspeed_lv = State(high_speed_overspeed_analysis);
            dataMap.put("high_speed_overspeed_lv",high_speed_overspeed_lv);
            dataMap.put("high_speed_overspeed_number",high_speed_overspeed_number);
            dataMap.put("high_speed_violation_analysis",high_speed_violation_analysis);
            String high_speed_violation_lv = State(high_speed_violation_analysis);
            dataMap.put("high_speed_violation_lv",high_speed_violation_lv);
            dataMap.put("high_speed_violation_number",high_speed_violation_number);
            dataMap.put("dynamic_system_analysis",dynamic_system_analysis);
            String dynamic_system_lv = State(dynamic_system_analysis);
            dataMap.put("dynamic_system_lv",dynamic_system_lv);
            dataMap.put("braking_system_analysis",braking_system_analysis);
            String braking_system_lv = State(braking_system_analysis);
            dataMap.put("braking_system_lv",braking_system_lv);
            dataMap.put("drive_system_analysis",drive_system_analysis);
            String drive_system_lv = State(drive_system_analysis);
            dataMap.put("drive_system_lv",drive_system_lv);
            dataMap.put("steering_system_analysis",steering_system_analysis);
            String steering_system_lv = State(steering_system_analysis);
            dataMap.put("steering_system_lv",steering_system_lv);
            dataMap.put("average_elevation_analysis",average_elevation_analysis);
            String average_elevation_lv = State(average_elevation_analysis);
            dataMap.put("average_elevation_lv",average_elevation_lv);
            dataMap.put("road_curvature_analysis",road_curvature_analysis);
            String road_curvature_lv = State(road_curvature_analysis);
            dataMap.put("road_curvature_lv",road_curvature_lv);
            dataMap.put("road_slope_analysis",road_slope_analysis);
            String road_slope_lv = State(road_slope_analysis);
            dataMap.put("road_slope_lv",road_slope_lv);
            dataMap.put("route_efficiency_analysis",route_efficiency_analysis);
            String route_efficiency_lv = State(route_efficiency_analysis);
            dataMap.put("route_efficiency_lv",route_efficiency_lv);
            dataMap.put("weather_data_analysis",weather_data_analysis);
            String weather_data_lv = State(weather_data_analysis);
            dataMap.put("weather_data_lv",weather_data_lv);
            dataMap.put("vehicle_management_analysis",vehicle_management_analysis);
            String vehicle_management_lv = State(vehicle_management_analysis);
            dataMap.put("vehicle_management_lv",vehicle_management_lv);
            dataMap.put("personnel_management_analysis",personnel_management_analysis);
            String personnel_management_lv = State(personnel_management_analysis);
            dataMap.put("personnel_management_lv",personnel_management_lv);
            dataMap.put("transportation_management_analysis",transportation_management_analysis);
            String transportation_management_lv = State(transportation_management_analysis);
            dataMap.put("transportation_management_lv",transportation_management_lv);
            dataMap.put("security_management_analysis",security_management_analysis);
            String security_management_lv = State(security_management_analysis);
            dataMap.put("security_management_lv",security_management_lv);

            String image = coding.substring(22);
            dataMap.put("image",image);

            





            //文件路径
            filePath = request.getSession().getServletContext().getRealPath("/")+"downLoadLink/";

            //文件唯一名称
            fileOnlyName = "exportReport.doc";

            /** 生成word */
            wordUtil.createWord(dataMap, "index.ftl", filePath, fileOnlyName);

            return request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/downLoadLink/exportReport.doc";
        }catch (Exception e){
            e.printStackTrace();
            return "暂无数据";
        }
    }

    public String State(Double analysis){
        String state = "较小";
        if(analysis==0){
            state = "暂无";
        }
        if(analysis>=20){
            state = "一般";
        }
        if(analysis>=40){
            state = "较大";
        }
        if(analysis>=60){
            state = "重大";
        }
        if(analysis>=80){
            state = "特别重大";
        }
        return state;
    }

    public String carMessage(String message){
        if(message == null || message.isEmpty()){
            message="暂无";
        }
        return message;
    }

}