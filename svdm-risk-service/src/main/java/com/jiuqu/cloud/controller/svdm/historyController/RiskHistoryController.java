package com.jiuqu.cloud.controller.svdm.historyController;

import com.jiuqu.cloud.service.svdm.history.RiskHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/history/riskController")
public class RiskHistoryController {
    @Autowired
    private RiskHistoryService riskHistoryService;
//    @Autowired
//    CountFeignClient countFeignClient;

    /**
     * 根据公司id查询驾驶人员,车辆,道路,天气,管理信息以及风险信息和RAL
     * @return
     */
    @RequestMapping("/findUnitHistoryMessage")
    public List findUnitHistoryMessage(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = riskHistoryService.findUnitHistoryMessage(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 根据公司id查询5大分类下的小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findUnitHistoryAnalysis")
    public List findUnitHistoryAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = riskHistoryService.findUnitHistoryAnalysis(unitId);
            List list = new ArrayList<>();
            Map allAnalysis = bussinessUnits.get(0);
            Map map0 = new HashMap();
            map0.put("1","驾驶人员分析");
            map0.put("2","恶略天气超速分析");
            map0.put("3",allAnalysis.get("weather_warning_analysis"));
            list.add(map0);
            Map map = new HashMap();
            map.put("1","驾驶人员分析");
            map.put("2","超速预警分析");
            map.put("3",allAnalysis.get("speeding_early_warning_analysis"));
            list.add(map);
            Map map1 = new HashMap();
            map1.put("1","驾驶人员分析");
            map1.put("2","疲劳驾驶预警分析");
            map1.put("3",allAnalysis.get("fatigue_driving_early_warning_analysis"));
            list.add(map1);
            Map map2 = new HashMap();
            map2.put("1","驾驶人员分析");
            map2.put("2","预警分析");
            map2.put("3",allAnalysis.get("early_warning_analysis"));
            list.add(map2);
            Map map3 = new HashMap();
            map3.put("1","驾驶人员分析");
            map3.put("2","终端设备故障预警分析");
            map3.put("3",allAnalysis.get("terminal_equipment_failure_early_warning_analysis"));
            list.add(map3);
            Map map4 = new HashMap();
            map4.put("1","驾驶人员分析");
            map4.put("2","驾驶时长异常预警分析");
            map4.put("3",allAnalysis.get("abnormality_of_driving_time_early_warning_analysis"));
            list.add(map4);
            Map map5 = new HashMap();
            map5.put("1","驾驶人员分析");
            map5.put("2","超时停车预警分析");
            map5.put("3",allAnalysis.get("timeout_parking_early_warning_analysis"));
            list.add(map5);
            Map map6 = new HashMap();
            map6.put("1","驾驶人员分析");
            map6.put("2","行驶路线异常预警分析");
            map6.put("3",allAnalysis.get("abnormal_route_early_warning_analysis"));
            list.add(map6);
            Map map7 = new HashMap();
            map7.put("1","驾驶人员分析");
            map7.put("2","路线偏离预警分析");
            map7.put("3",allAnalysis.get("route_deviation_early_warning_analysis"));
            list.add(map7);
            Map map8 = new HashMap();
            map8.put("1","驾驶人员分析");
            map8.put("2","车辆异常预警分析");
            map8.put("3",allAnalysis.get("vehicle_anomaly_early_warning_analysis"));
            list.add(map8);
            Map map9 = new HashMap();
            map9.put("1","驾驶人员分析");
            map9.put("2","车辆非法行驶预警分析");
            map9.put("3",allAnalysis.get("illegal_vehicle_driving_early_warning_analysis"));
            list.add(map9);
            Map map10 = new HashMap();
            map10.put("1","驾驶人员分析");
            map10.put("2","事故构成犯罪分析");
            map10.put("3",allAnalysis.get("accident_constitutes_crime_analysis"));
            list.add(map10);
            Map map11 = new HashMap();
            map11.put("1","驾驶人员分析");
            map11.put("2","交通拥堵违规行驶分析");
            map11.put("3",allAnalysis.get("traffic_congestion_irregularities_analysis"));
            list.add(map11);
            Map map12 = new HashMap();
            map12.put("1","驾驶人员分析");
            map12.put("2","使用伪造驾驶证分析");
            map12.put("3",allAnalysis.get("use_counterfeit_driver_license_analysis"));
            list.add(map12);
            Map map13 = new HashMap();
            map13.put("1","驾驶人员分析");
            map13.put("2","无证驾驶分析");
            map13.put("3",allAnalysis.get("unlicensed_driving_analysis"));
            list.add(map13);
            Map map14 = new HashMap();
            map14.put("1","驾驶人员分析");
            map14.put("2","疲劳驾驶分析");
            map14.put("3",allAnalysis.get("fatigue_driving_analysis"));
            list.add(map14);
            Map map15 = new HashMap();
            map15.put("1","驾驶人员分析");
            map15.put("2","肇事逃逸分析");
            map15.put("3",allAnalysis.get("hit_and_run_analysis"));
            list.add(map15);
            Map map16 = new HashMap();
            map16.put("1","驾驶人员分析");
            map16.put("2","超员行驶分析");
            map16.put("3",allAnalysis.get("overcrowding_analysis"));
            list.add(map16);
            Map map17 = new HashMap();
            map17.put("1","驾驶人员分析");
            map17.put("2","超载行驶分析");
            map17.put("3",allAnalysis.get("overloading_analysis"));
            list.add(map17);
            Map map18 = new HashMap();
            map18.put("1","驾驶人员分析");
            map18.put("2","超速行驶分析");
            map18.put("3",allAnalysis.get("overspeed_driving_analysis"));
            list.add(map18);
            Map map19 = new HashMap();
            map19.put("1","驾驶人员分析");
            map19.put("2","违规行为分析");
            map19.put("3",allAnalysis.get("irregularities_analysis"));
            list.add(map19);
            Map map20 = new HashMap();
            map20.put("1","驾驶人员分析");
            map20.put("2","违规行驶分析");
            map20.put("3",allAnalysis.get("irregularities_driver_analysis"));
            list.add(map20);
            Map map21 = new HashMap();
            map21.put("1","驾驶人员分析");
            map21.put("2","违规载人载物分析");
            map21.put("3",allAnalysis.get("irregularities_carrying_human_load_analysis"));
            list.add(map21);
            Map map22 = new HashMap();
            map22.put("1","驾驶人员分析");
            map22.put("2","酒驾醉驾分析");
            map22.put("3",allAnalysis.get("drunken_driving_analysis"));
            list.add(map22);
            Map map23 = new HashMap();
            map23.put("1","驾驶人员分析");
            map23.put("2","驾驶人违规行为分析");
            map23.put("3",allAnalysis.get("driver_irregularities_analysis"));
            list.add(map23);
            Map map24 = new HashMap();
            map24.put("1","驾驶人员分析");
            map24.put("2","驾驶证异常行驶分析");
            map24.put("3",allAnalysis.get("driving_license_abnormal_driving_analysis"));
            list.add(map24);
            Map map25 = new HashMap();
            map25.put("1","驾驶人员分析");
            map25.put("2","高速超速行驶分析");
            map25.put("3",allAnalysis.get("high_speed_overspeed_analysis"));
            list.add(map25);
            Map map26 = new HashMap();
            map26.put("1","驾驶人员分析");
            map26.put("2","高速违规行驶分析");
            map26.put("3",allAnalysis.get("high_speed_violation_analysis"));
            list.add(map26);
            Map map27 = new HashMap();
            map27.put("1","车辆情况分析");
            map27.put("2","动力系统分析");
            map27.put("3",allAnalysis.get("dynamic_system_analysis"));
            list.add(map27);
            Map map28 = new HashMap();
            map28.put("1","车辆情况分析");
            map28.put("2","制动系统分析");
            map28.put("3",allAnalysis.get("braking_system_analysis"));
            list.add(map28);
            Map map29 = new HashMap();
            map29.put("1","车辆情况分析");
            map29.put("2","传动系统分析");
            map29.put("3",allAnalysis.get("drive_system_analysis"));
            list.add(map29);
            Map map30 = new HashMap();
            map30.put("1","车辆情况分析");
            map30.put("2","转向系统分析");
            map30.put("3",allAnalysis.get("steering_system_analysis"));
            list.add(map30);
            Map map31 = new HashMap();
            map31.put("1","车辆情况分析");
            map31.put("2","事故构成犯罪分析");
            map31.put("3",allAnalysis.get("accident_constitutes_crime_analysis"));
            list.add(map31);
            Map map32 = new HashMap();
            map32.put("1","车辆情况分析");
            map32.put("2","交通拥堵违规行驶分析");
            map32.put("3",allAnalysis.get("traffic_congestion_irregularities_analysis"));
            list.add(map32);
            Map map33 = new HashMap();
            map33.put("1","车辆情况分析");
            map33.put("2","使用伪造驾驶证分析");
            map33.put("3",allAnalysis.get("use_counterfeit_driver_license_analysis"));
            list.add(map33);
            Map map34 = new HashMap();
            map34.put("1","车辆情况分析");
            map34.put("2","无证驾驶分析");
            map34.put("3",allAnalysis.get("unlicensed_driving_analysis"));
            list.add(map34);
            Map map35 = new HashMap();
            map35.put("1","车辆情况分析");
            map35.put("2","疲劳驾驶分析");
            map35.put("3",allAnalysis.get("fatigue_driving_analysis"));
            list.add(map35);
            Map map36 = new HashMap();
            map36.put("1","车辆情况分析");
            map36.put("2","肇事逃逸分析");
            map36.put("3",allAnalysis.get("hit_and_run_analysis"));
            list.add(map36);
            Map map37 = new HashMap();
            map37.put("1","车辆情况分析");
            map37.put("2","超员行驶分析");
            map37.put("3",allAnalysis.get("overcrowding_analysis"));
            list.add(map37);
            Map map38 = new HashMap();
            map38.put("1","车辆情况分析");
            map38.put("2","超载行驶分析");
            map38.put("3",allAnalysis.get("overloading_analysis"));
            list.add(map38);
            Map map39 = new HashMap();
            map39.put("1","车辆情况分析");
            map39.put("2","超速行驶分析");
            map39.put("3",allAnalysis.get("overspeed_driving_analysis"));
            list.add(map39);
            Map map40 = new HashMap();
            map40.put("1","车辆情况分析");
            map40.put("2","违规行为分析");
            map40.put("3",allAnalysis.get("irregularities_analysis"));
            list.add(map40);
            Map map41 = new HashMap();
            map41.put("1","车辆情况分析");
            map41.put("2","违规行驶分析");
            map41.put("3",allAnalysis.get("irregularities_driver_analysis"));
            list.add(map41);
            Map map42 = new HashMap();
            map42.put("1","车辆情况分析");
            map42.put("2","违规载人载物分析");
            map42.put("3",allAnalysis.get("irregularities_carrying_human_load_analysis"));
            list.add(map42);
            Map map43 = new HashMap();
            map43.put("1","车辆情况分析");
            map43.put("2","酒驾醉驾分析");
            map43.put("3",allAnalysis.get("drunken_driving_analysis"));
            list.add(map43);
            Map map44 = new HashMap();
            map44.put("1","车辆情况分析");
            map44.put("2","驾驶人违规行为分析");
            map44.put("3",allAnalysis.get("driver_irregularities_analysis"));
            list.add(map44);
            Map map45 = new HashMap();
            map45.put("1","车辆情况分析");
            map45.put("2","驾驶证异常行驶分析");
            map45.put("3",allAnalysis.get("driving_license_abnormal_driving_analysis"));
            list.add(map45);
            Map map46 = new HashMap();
            map46.put("1","车辆情况分析");
            map46.put("2","高速超速行驶分析");
            map46.put("3",allAnalysis.get("high_speed_overspeed_analysis"));
            list.add(map46);
            Map map47 = new HashMap();
            map47.put("1","车辆情况分析");
            map47.put("2","高速违规行驶分析");
            map47.put("3",allAnalysis.get("high_speed_violation_analysis"));
            list.add(map47);
            Map map48 = new HashMap();
            map48.put("1","道路情况分析");
            map48.put("2","平均海拔分析");
            map48.put("3",allAnalysis.get("average_elevation_analysis"));
            list.add(map48);
            Map map49 = new HashMap();
            map49.put("1","道路情况分析");
            map49.put("2","道路曲度分析");
            map49.put("3",allAnalysis.get("road_curvature_analysis"));
            list.add(map49);
            Map map50 = new HashMap();
            map50.put("1","道路情况分析");
            map50.put("2","道路坡度分析");
            map50.put("3",allAnalysis.get("road_slope_analysis"));
            list.add(map50);
            Map map51 = new HashMap();
            map51.put("1","道路情况分析");
            map51.put("2","线路效率分析");
            map51.put("3",allAnalysis.get("route_efficiency_analysis"));
            list.add(map51);
            Map map52 = new HashMap();
            map52.put("1","道路情况分析");
            map52.put("2","事故构成犯罪分析");
            map52.put("3",allAnalysis.get("accident_constitutes_crime_analysis"));
            list.add(map52);
            Map map53 = new HashMap();
            map53.put("1","道路情况分析");
            map53.put("2","交通拥堵违规行驶分析");
            map53.put("3",allAnalysis.get("traffic_congestion_irregularities_analysis"));
            list.add(map53);
            Map map54 = new HashMap();
            map54.put("1","道路情况分析");
            map54.put("2","使用伪造驾驶证分析");
            map54.put("3",allAnalysis.get("use_counterfeit_driver_license_analysis"));
            list.add(map54);
            Map map55 = new HashMap();
            map55.put("1","道路情况分析");
            map55.put("2","无证驾驶分析");
            map55.put("3",allAnalysis.get("unlicensed_driving_analysis"));
            list.add(map55);
            Map map56 = new HashMap();
            map56.put("1","道路情况分析");
            map56.put("2","疲劳驾驶分析");
            map56.put("3",allAnalysis.get("fatigue_driving_analysis"));
            list.add(map56);
            Map map57 = new HashMap();
            map57.put("1","道路情况分析");
            map57.put("2","肇事逃逸分析");
            map57.put("3",allAnalysis.get("hit_and_run_analysis"));
            list.add(map57);
            Map map58 = new HashMap();
            map58.put("1","道路情况分析");
            map58.put("2","超员行驶分析");
            map58.put("3",allAnalysis.get("overcrowding_analysis"));
            list.add(map58);
            Map map59 = new HashMap();
            map59.put("1","道路情况分析");
            map59.put("2","超载行驶分析");
            map59.put("3",allAnalysis.get("overloading_analysis"));
            list.add(map59);
            Map map60 = new HashMap();
            map60.put("1","道路情况分析");
            map60.put("2","超速行驶分析");
            map60.put("3",allAnalysis.get("overspeed_driving_analysis"));
            list.add(map60);
            Map map61 = new HashMap();
            map61.put("1","道路情况分析");
            map61.put("2","违规行为分析");
            map61.put("3",allAnalysis.get("irregularities_analysis"));
            list.add(map61);
            Map map62 = new HashMap();
            map62.put("1","道路情况分析");
            map62.put("2","违规行驶分析");
            map62.put("3",allAnalysis.get("irregularities_driver_analysis"));
            list.add(map62);
            Map map63 = new HashMap();
            map63.put("1","道路情况分析");
            map63.put("2","违规载人载物分析");
            map63.put("3",allAnalysis.get("irregularities_carrying_human_load_analysis"));
            list.add(map63);
            Map map64 = new HashMap();
            map64.put("1","道路情况分析");
            map64.put("2","酒驾醉驾分析");
            map64.put("3",allAnalysis.get("drunken_driving_analysis"));
            list.add(map64);
            Map map65 = new HashMap();
            map65.put("1","道路情况分析");
            map65.put("2","驾驶人违规行为分析");
            map65.put("3",allAnalysis.get("driver_irregularities_analysis"));
            list.add(map65);
            Map map66 = new HashMap();
            map66.put("1","道路情况分析");
            map66.put("2","驾驶证异常行驶分析");
            map66.put("3",allAnalysis.get("driving_license_abnormal_driving_analysis"));
            list.add(map66);
            Map map67 = new HashMap();
            map67.put("1","道路情况分析");
            map67.put("2","高速超速行驶分析");
            map67.put("3",allAnalysis.get("high_speed_overspeed_analysis"));
            list.add(map67);
            Map map68 = new HashMap();
            map68.put("1","道路情况分析");
            map68.put("2","高速违规行驶分析");
            map68.put("3",allAnalysis.get("high_speed_violation_analysis"));
            list.add(map68);

            Map map69 = new HashMap();
            map69.put("1","天气情况分析");
            map69.put("2","天气数据分析");
            map69.put("3",allAnalysis.get("weather_data_analysis"));
            list.add(map69);
            Map map70 = new HashMap();
            map70.put("1","天气情况分析");
            map70.put("2","事故构成犯罪分析");
            map70.put("3",allAnalysis.get("accident_constitutes_crime_analysis"));
            list.add(map70);
            Map map71 = new HashMap();
            map71.put("1","天气情况分析");
            map71.put("2","交通拥堵违规行驶分析");
            map71.put("3",allAnalysis.get("traffic_congestion_irregularities_analysis"));
            list.add(map71);
            Map map72 = new HashMap();
            map72.put("1","天气情况分析");
            map72.put("2","使用伪造驾驶证分析");
            map72.put("3",allAnalysis.get("use_counterfeit_driver_license_analysis"));
            list.add(map72);
            Map map73 = new HashMap();
            map73.put("1","天气情况分析");
            map73.put("2","无证驾驶分析");
            map73.put("3",allAnalysis.get("unlicensed_driving_analysis"));
            list.add(map73);
            Map map74 = new HashMap();
            map74.put("1","天气情况分析");
            map74.put("2","疲劳驾驶分析");
            map74.put("3",allAnalysis.get("fatigue_driving_analysis"));
            list.add(map74);
            Map map75 = new HashMap();
            map75.put("1","天气情况分析");
            map75.put("2","肇事逃逸分析");
            map75.put("3",allAnalysis.get("hit_and_run_analysis"));
            list.add(map75);
            Map map76 = new HashMap();
            map76.put("1","天气情况分析");
            map76.put("2","超员行驶分析");
            map76.put("3",allAnalysis.get("overcrowding_analysis"));
            list.add(map76);
            Map map77 = new HashMap();
            map77.put("1","天气情况分析");
            map77.put("2","超载行驶分析");
            map77.put("3",allAnalysis.get("overloading_analysis"));
            list.add(map77);
            Map map78 = new HashMap();
            map78.put("1","天气情况分析");
            map78.put("2","超速行驶分析");
            map78.put("3",allAnalysis.get("overspeed_driving_analysis"));
            list.add(map78);
            Map map79 = new HashMap();
            map79.put("1","天气情况分析");
            map79.put("2","违规行为分析");
            map79.put("3",allAnalysis.get("irregularities_analysis"));
            list.add(map79);
            Map map80 = new HashMap();
            map80.put("1","天气情况分析");
            map80.put("2","违规行驶分析");
            map80.put("3",allAnalysis.get("irregularities_driver_analysis"));
            list.add(map80);
            Map map81 = new HashMap();
            map81.put("1","天气情况分析");
            map81.put("2","违规载人载物分析");
            map81.put("3",allAnalysis.get("irregularities_carrying_human_load_analysis"));
            list.add(map81);
            Map map82 = new HashMap();
            map82.put("1","天气情况分析");
            map82.put("2","酒驾醉驾分析");
            map82.put("3",allAnalysis.get("drunken_driving_analysis"));
            list.add(map82);
            Map map83 = new HashMap();
            map83.put("1","天气情况分析");
            map83.put("2","驾驶人违规行为分析");
            map83.put("3",allAnalysis.get("driver_irregularities_analysis"));
            list.add(map83);
            Map map84 = new HashMap();
            map84.put("1","天气情况分析");
            map84.put("2","驾驶证异常行驶分析");
            map84.put("3",allAnalysis.get("driving_license_abnormal_driving_analysis"));
            list.add(map84);
            Map map85 = new HashMap();
            map85.put("1","天气情况分析");
            map85.put("2","高速超速行驶分析");
            map85.put("3",allAnalysis.get("high_speed_overspeed_analysis"));
            list.add(map85);
            Map map86 = new HashMap();
            map86.put("1","天气情况分析");
            map86.put("2","高速违规行驶分析");
            map86.put("3",allAnalysis.get("high_speed_violation_analysis"));
            list.add(map86);
            Map map87 = new HashMap();
            map87.put("1","管理情况分析");
            map87.put("2","车辆管理分析");
            map87.put("3",allAnalysis.get("vehicle_management_analysis"));
            list.add(map87);
            Map map88 = new HashMap();
            map88.put("1","管理情况分析");
            map88.put("2","人员管理分析");
            map88.put("3",allAnalysis.get("personnel_management_analysis"));
            list.add(map88);
            Map map89 = new HashMap();
            map89.put("1","管理情况分析");
            map89.put("2","运输管理分析");
            map89.put("3",allAnalysis.get("transportation_management_analysis"));
            list.add(map89);
            Map map90 = new HashMap();
            map90.put("1","管理情况分析");
            map90.put("2","安全管理分析");
            map90.put("3",allAnalysis.get("security_management_analysis"));
            list.add(map90);
            Map map91 = new HashMap();
            map91.put("1","管理情况分析");
            map91.put("2","事故构成犯罪分析");
            map91.put("3",allAnalysis.get("accident_constitutes_crime_analysis"));
            list.add(map91);
            Map map92 = new HashMap();
            map92.put("1","管理情况分析");
            map92.put("2","交通拥堵违规行驶分析");
            map92.put("3",allAnalysis.get("traffic_congestion_irregularities_analysis"));
            list.add(map92);
            Map map93 = new HashMap();
            map93.put("1","管理情况分析");
            map93.put("2","使用伪造驾驶证分析");
            map93.put("3",allAnalysis.get("use_counterfeit_driver_license_analysis"));
            list.add(map93);
            Map map94 = new HashMap();
            map94.put("1","管理情况分析");
            map94.put("2","无证驾驶分析");
            map94.put("3",allAnalysis.get("unlicensed_driving_analysis"));
            list.add(map94);
            Map map95 = new HashMap();
            map95.put("1","管理情况分析");
            map95.put("2","疲劳驾驶分析");
            map95.put("3",allAnalysis.get("fatigue_driving_analysis"));
            list.add(map95);
            Map map96 = new HashMap();
            map96.put("1","管理情况分析");
            map96.put("2","肇事逃逸分析");
            map96.put("3",allAnalysis.get("hit_and_run_analysis"));
            list.add(map96);
            Map map97 = new HashMap();
            map97.put("1","管理情况分析");
            map97.put("2","超员行驶分析");
            map97.put("3",allAnalysis.get("overcrowding_analysis"));
            list.add(map97);
            Map map98 = new HashMap();
            map98.put("1","管理情况分析");
            map98.put("2","超载行驶分析");
            map98.put("3",allAnalysis.get("overloading_analysis"));
            list.add(map98);
            Map map99 = new HashMap();
            map99.put("1","管理情况分析");
            map99.put("2","超速行驶分析");
            map99.put("3",allAnalysis.get("overspeed_driving_analysis"));
            list.add(map99);
            Map map100 = new HashMap();
            map100.put("1","管理情况分析");
            map100.put("2","违规行为分析");
            map100.put("3",allAnalysis.get("irregularities_analysis"));
            list.add(map100);
            Map map101 = new HashMap();
            map101.put("1","管理情况分析");
            map101.put("2","违规行驶分析");
            map101.put("3",allAnalysis.get("irregularities_driver_analysis"));
            list.add(map101);
            Map map102 = new HashMap();
            map102.put("1","管理情况分析");
            map102.put("2","违规载人载物分析");
            map102.put("3",allAnalysis.get("irregularities_carrying_human_load_analysis"));
            list.add(map102);
            Map map103 = new HashMap();
            map103.put("1","管理情况分析");
            map103.put("2","酒驾醉驾分析");
            map103.put("3",allAnalysis.get("drunken_driving_analysis"));
            list.add(map103);
            Map map104 = new HashMap();
            map104.put("1","管理情况分析");
            map104.put("2","驾驶人违规行为分析");
            map104.put("3",allAnalysis.get("driver_irregularities_analysis"));
            list.add(map104);
            Map map105 = new HashMap();
            map105.put("1","管理情况分析");
            map105.put("2","驾驶证异常行驶分析");
            map105.put("3",allAnalysis.get("driving_license_abnormal_driving_analysis"));
            list.add(map105);
            Map map106 = new HashMap();
            map106.put("1","管理情况分析");
            map106.put("2","高速超速行驶分析");
            map106.put("3",allAnalysis.get("high_speed_overspeed_analysis"));
            list.add(map106);
            Map map107 = new HashMap();
            map107.put("1","管理情况分析");
            map107.put("2","高速违规行驶分析");
            map107.put("3",allAnalysis.get("high_speed_violation_analysis"));
            list.add(map107);


            return list;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }


    /**
     * 根据公司id查询车牌号及RAL
     * @param unitId
     * @return
     */
    @RequestMapping("/findCarHistoryRAL")
    public List findCarHistoryRAL(@RequestParam("unit_id") Long unitId){
        try {

            List<Map<String,Object>>  bussinessUnits = riskHistoryService.findCarHistoryRAL(unitId);

            return bussinessUnits;

        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     *
     * 根据公司id查询处理意见
     * @param
     * @return
     */
    @RequestMapping("/findUnitHistoryOpinions")
    public List findUnitHistoryOpinions(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = riskHistoryService.findUnitHistoryOpinions(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
