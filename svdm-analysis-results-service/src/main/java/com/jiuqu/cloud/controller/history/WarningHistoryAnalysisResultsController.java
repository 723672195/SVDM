package com.jiuqu.cloud.controller.history;

import com.jiuqu.cloud.service.history.WarningHistoryAnalysisResultsService;
import com.jiuqu.cloud.service.realtime.WarningRealTimeAnalysisResultsService;
import com.jiuqu.cloud.util.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/history/warningAnalysisResultsController")
public class WarningHistoryAnalysisResultsController {
    @Autowired
    WarningHistoryAnalysisResultsService warningHistoryAnalysisResultsService;
    @Autowired
    JSONUtil jsonUtil;
    /**
     *
     * 18超速预警
     */
    @RequestMapping(value = "/findHistoryOverspeed")
    public String getHistoryOverspeed(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryOverspeed(brand) ;//表格list
            List<Map<String, Object>> List2 = warningHistoryAnalysisResultsService.getHistoryOverspeedAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningHistoryAnalysisResultsService.getHistoryOverspeedChar(brand);//图
            Map map = new HashMap();
            map.put("name","超速预警");
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","speeding_alarm");
            Map table_name = new HashMap();
            table_name.put("table_name",List1);
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);
//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);

            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 19疲劳驾驶预警
     */
    @RequestMapping(value = "/findHistoryFatigue")
    public String getHistoryFatigue(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryFatigue(brand) ;//表格
            List<Map<String, Object>> List2 = warningHistoryAnalysisResultsService.getHistoryFatigueAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningHistoryAnalysisResultsService.getHistoryFatigueChar(brand);//图
            Map map = new HashMap();
            map.put("name","疲劳驾驶预警");

//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);

            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","fatigue_alarm");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 20预警
     */
    @RequestMapping(value = "/findHistoryWarning")
    public String getHistoryWarning(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryWarning(brand);//表格
            List<Map<String, Object>> List2 = warningHistoryAnalysisResultsService.getHistoryWarningAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningHistoryAnalysisResultsService.getHistoryWarningChar(brand);//图
            Map map = new HashMap();
            map.put("name","预警");
//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","early_warning");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 21终端设备故障预警
     */
    @RequestMapping(value = "/findHistoryTerminal")
    public String getHistoryTerminal(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryTerminal(brand);//表格
            List<Map<String, Object>> List2 = warningHistoryAnalysisResultsService.getHistoryTerminalAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningHistoryAnalysisResultsService.getHistoryTerminalChar(brand);//图
            Map map = new HashMap();
            map.put("name","终端设备故障预警");
//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","Terminal_equipment_fault_warning");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 22驾驶时长异常预警
     */

    @RequestMapping(value = "/findHistoryDrivingTime")
    public String getHistoryDrivingTime(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryDrivingTime(brand);//表格
            List<Map<String, Object>> List2 = warningHistoryAnalysisResultsService.getHistoryDrivingTimeAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningHistoryAnalysisResultsService.getHistoryDrivingTimeChar(brand);//图
            Map map = new HashMap();
            map.put("name","驾驶时长异常预警");


//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
//            return list;
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","Abnormal_early_warning");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 23超时停车预警
     */

    @RequestMapping(value = "/findHistoryTimeoutParking")
    public String getHistoryTimeoutParking(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryTimeoutParking(brand);//表格
            List<Map<String,Object>> List2 = warningHistoryAnalysisResultsService.getHistoryTimeoutParkingAnalysis(brand);//分析值
            List<Map<String,Object>> List3 = warningHistoryAnalysisResultsService.getHistoryTimeoutParkingChar(brand);//图
            Map map = new HashMap();
            map.put("name","超时停车预警");
//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
//            return list;
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","timeout_parking");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 24行驶路线异常预警
     */
    @RequestMapping(value = "/findHistoryAbnormalRoute")
    public String getHistoryAbnormalRoute(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryAbnormalRoute(brand);//表格
            List<Map<String,Object>> List2 = warningHistoryAnalysisResultsService.getHistoryAbnormalRouteAnalysis(brand);//分析值
            List<Map<String,Object>> List3 = warningHistoryAnalysisResultsService.getHistoryAbnormalRouteChar(brand);//图

            Map map = new HashMap();
            map.put("name","行驶路线异常预警");
//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
//            return list;
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","driving_route_warnning");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 25路线偏离预警
     */
    @RequestMapping(value = "/findHistoryLineDeviation")
    public String getHistoryLineDeviation(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 =warningHistoryAnalysisResultsService.listHistoryLineDeviation(brand);//表格
            List<Map<String,Object>> List2 =warningHistoryAnalysisResultsService.getHistoryLineDeviationAnalysis(brand);//分析值
            List<Map<String,Object>> List3 =warningHistoryAnalysisResultsService.getHistoryLineDeviationChar(brand);//图
            Map map = new HashMap();
            map.put("name","路线偏离预警");

//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
//            return list;
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","Line_deviation_early");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 26车辆异常预警
     */
    @RequestMapping(value = "/findHistoryAbnormalVehicle")
    public String getHistoryAbnormalVehicle(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 =warningHistoryAnalysisResultsService.listHistoryAbnormalVehicle(brand);//表格
            List<Map<String,Object>> List2 =warningHistoryAnalysisResultsService.getHistoryAbnormalVehicleAnalysis(brand);//分析值
            List<Map<String,Object>> List3 =warningHistoryAnalysisResultsService.getHistoryAbnormalVehicleChar(brand);//图
            Map map = new HashMap();
            map.put("name","车辆异常预警");
//
//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
//            return list;
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","Abnormal_warning_vehicle");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    /**
     *
     * 27车辆非法行驶预警
     */
    @RequestMapping(value = "/findHistoryIllegalDriving")
    public String getHistoryIllegalDriving(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningHistoryAnalysisResultsService.listHistoryIllegalDriving(brand);//表格
            List<Map<String,Object>> List2 = warningHistoryAnalysisResultsService.getHistoryIllegalDrivingAnalysis(brand);//分析值
            List<Map<String,Object>> List3 = warningHistoryAnalysisResultsService.getHistoryIllegalDrivingChar(brand);//图
            Map map = new HashMap();
            map.put("name","车辆非法行驶预警");
//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
//            return list;
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","warning_vehicle_illegal_driving");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List2);//分析值
            Map chart_name = new HashMap();
            chart_name.put("chart_name",List3);//图
            return jsonUtil.mergeToJson(map,Modular_name,table_name,table_head_name,chart_name);
        }catch (Exception e){
            e.printStackTrace();
            return new String();
        }
    }
    //    *******************************************************************************************************


        /**
         *                    表格
         * 根据车牌照号获得车辆数据
         *            表格-暂无数据
         * 根据车牌照号获得驾驶人数据
         *
         *                    表格
         * 根据车牌照号获得运输数据
         */

    @PostMapping(value = "/getHistoryCarList")
    public String getHistoryCarList(@RequestParam("car_number")String brand) {
        try {
            List<Map<String, Object>> CarList = warningHistoryAnalysisResultsService.getHistoryUnitCar(brand);
            List<Map<String, Object>> List = warningHistoryAnalysisResultsService.getHistoryTransport(brand);
//            List list =new ArrayList();
//            list.addAll(CarList);
//            list.addAll(List);
//            return list;

            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","Car_Driving_Transport");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",CarList);//车辆数据
            Map table_head_name = new HashMap();
            table_head_name.put("table_head_name",List);//运输数据
            return jsonUtil.mergeToJson(Modular_name,table_name,table_head_name);
        } catch (Exception e) {
            e.printStackTrace();
            return new String();
        }
    }

    /**
     *                    表格
     * 根据车牌照号获得运输数据
     */
//    @PostMapping(value = "/getTransportList")
//    public List getTransportList(@RequestParam ("car_license_plate")String brand) {
//        try {
//            List<Map<String, Object>> List = warningHistoryAnalysisResultsService.getTransport(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
    /**             表格-暂无数据
     * 根据车牌照号获得驾驶人数据
     */
    //    *******************************************************************************************************


    /**
     * 以下为图的数据
     */



}

