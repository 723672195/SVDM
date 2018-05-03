package com.jiuqu.cloud.controller.realtime;

import com.jiuqu.cloud.service.realtime.WarningRealTimeAnalysisResultsService;
import com.jiuqu.cloud.util.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/realtime/warningAnalysisResultsController")
public class WarningRealTimeAnalysisResultsController {
    @Autowired
    WarningRealTimeAnalysisResultsService warningRealTimeAnalysisResultsService;
    @Autowired
    JSONUtil jsonUtil;
    /**
     *
     * 18超速预警
     */
    @RequestMapping(value = "/findListOverspeed")
    public String getListOverspeed(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listOverspeed(brand) ;//表格list
            List<Map<String, Object>> List2 = warningRealTimeAnalysisResultsService.getOverspeedAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningRealTimeAnalysisResultsService.getOverspeedChar(brand);//图
            Map map = new HashMap();
            map.put("name","超速预警");
            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","speeding_alarm");
            Map table_name = new HashMap();

            table_name.put("table_name",List1);
            Map table_head_name = new HashMap();
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("speeding_early_warning_analysis",0));
            }
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
    @RequestMapping(value = "/findListFatigue")
    public String getListFatigue(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listFatigue(brand) ;//表格
            List<Map<String, Object>> List2 = warningRealTimeAnalysisResultsService.getFatigueAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningRealTimeAnalysisResultsService.getFatigueChar(brand);//图


//            List list =new ArrayList();
//            list.addAll(List1);
//            list.addAll(List2);
//            list.addAll(List3);
            Map map = new HashMap();
            map.put("name","疲劳驾驶预警");

            Map Modular_name = new HashMap();
            Modular_name.put("Modular_name","fatigue_alarm");//模块名
            Map table_name = new HashMap();
            table_name.put("table_name",List1);//表格
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("fatigue_driving_early_warning_analysis",0));
            }
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
    @RequestMapping(value = "/findListWarning")
    public String getListWarning(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listWarning(brand);//表格
            List<Map<String, Object>> List2 = warningRealTimeAnalysisResultsService.getWarningAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningRealTimeAnalysisResultsService.getWarningChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("early_warning_analysis",0));
            }
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
    @RequestMapping(value = "/findListTerminal")
    public String getListTerminal(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listTerminal(brand);//表格
            List<Map<String, Object>> List2 = warningRealTimeAnalysisResultsService.getTerminalAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningRealTimeAnalysisResultsService.getTerminalChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("terminal_equipment_failure_early_warning_analysis",0));
            }
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

    @RequestMapping(value = "/findListDrivingTime")
    public String getListDrivingTime(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listDrivingTime(brand);//表格
            List<Map<String, Object>> List2 = warningRealTimeAnalysisResultsService.getDrivingTimeAnalysis(brand);//分析值
            List<Map<String, Object>> List3 = warningRealTimeAnalysisResultsService.getDrivingTimeChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("abnormality_of_driving_time_early_warning_analysis",0));
            }
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

    @RequestMapping(value = "/findListTimeoutParking")
    public String getListTimeoutParking(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listTimeoutParking(brand);//表格
            List<Map<String,Object>> List2 = warningRealTimeAnalysisResultsService.getTimeoutParkingAnalysis(brand);//分析值
            List<Map<String,Object>> List3 = warningRealTimeAnalysisResultsService.getTimeoutParkingChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("timeout_parking_early_warning_analysis",0));
            }
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
    @RequestMapping(value = "/findListAbnormalRoute")
    public String getListAbnormalRoute(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listAbnormalRoute(brand);//表格
            List<Map<String,Object>> List2 = warningRealTimeAnalysisResultsService.getAbnormalRouteAnalysis(brand);//分析值
            List<Map<String,Object>> List3 = warningRealTimeAnalysisResultsService.getAbnormalRouteChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("abnormal_route_early_warning_analysis",0));
            }
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
    @RequestMapping(value = "/findListLineDeviation")
    public String getListLineDeviation(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 =warningRealTimeAnalysisResultsService.listLineDeviation(brand);//表格
            List<Map<String,Object>> List2 =warningRealTimeAnalysisResultsService.getLineDeviationAnalysis(brand);//分析值
            List<Map<String,Object>> List3 =warningRealTimeAnalysisResultsService.getLineDeviationChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("route_deviation_early_warning_analysis",0));
            }
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
    @RequestMapping(value = "/findListAbnormalVehicle")
    public String getListAbnormalVehicle(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 =warningRealTimeAnalysisResultsService.listAbnormalVehicle(brand);//表格
            List<Map<String,Object>> List2 =warningRealTimeAnalysisResultsService.getAbnormalVehicleAnalysis(brand);//分析值
            List<Map<String,Object>> List3 =warningRealTimeAnalysisResultsService.getAbnormalVehicleChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("vehicle_anomaly_early_warning_analysis",0));
            }
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
    @RequestMapping(value = "/findListIllegalDriving")
    public String getListIllegalDriving(@RequestParam("car_number")String brand){
        try {
            List<Map<String,Object>> List1 = warningRealTimeAnalysisResultsService.listIllegalDriving(brand);//表格
            List<Map<String,Object>> List2 = warningRealTimeAnalysisResultsService.getIllegalDrivingAnalysis(brand);//分析值
            List<Map<String,Object>> List3 = warningRealTimeAnalysisResultsService.getIllegalDrivingChar(brand);//图
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
            if (List2.size() == 0) {
                List2.add((Map<String, Object>) new HashMap().put("illegal_vehicle_driving_early_warning_analysis",0));
            }
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

    @PostMapping(value = "/getCarList")
    public String getCarList(@RequestParam("car_number")String brand) {
        try {
            List<Map<String, Object>> CarList = warningRealTimeAnalysisResultsService.getUnitCar(brand);
            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getTransport(brand);
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
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getTransport(brand);
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



//    /**
//     * 18超速预警-图
//     */
//    @PostMapping(value = "/getOverspeedChar")
//    public List getOverspeedChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getOverspeedChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }


//    /**
//     * 19疲劳驾驶预警-图
//     */
//    @PostMapping(value = "/getFatigueChar")
//    public List getFatigueChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getFatigueChar(brand);//图
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//    /**
//     * 20预警-图
//     */
//    @PostMapping(value = "/getWarningChar")
//    public List getWarningChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getWarningChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 	21终端设备故障预警-图
//     */
//
//    @PostMapping(value = "/getTerminalChar")
//    public List getTerminalChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getTerminalChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 	22驾驶时长异常预警-图
//     */
//    @PostMapping(value = "/getDrivingTimeChar")
//    public List getDrivingTimeChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getDrivingTimeChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }

//    /**
//     * 	23超时停车预警-图
//     */
//
//    @PostMapping(value = "/getTimeoutParkingChar")
//    public List getTimeoutParkingChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getTimeoutParkingChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 	24行驶路线异常预警-图
//     */
//    @PostMapping(value = "/getAbnormalRouteChar")
//    public List getAbnormalRouteChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getAbnormalRouteChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 	25路线偏离预警-图
//     */
//
//    @PostMapping(value = "/getLineDeviationChar")
//    public List getLineDeviationChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getLineDeviationChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//
//    /**
//     * 	26车辆异常预警-图
//     */
//    @PostMapping(value = "/getAbnormalVehicleChar")
//    public List getAbnormalVehicleChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getAbnormalVehicleChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//
//    /**
//     * 	27车辆非法行驶预警-图
//     */
//    @PostMapping(value = "/getIllegalDrivingChar")
//    public List getIllegalDrivingChar(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getIllegalDrivingChar(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
    //    *******************************************************************************************************
                //以下是分析值

//    /**
//     * 	18超速预警-分析值
//     */
//    @PostMapping(value = "/getOverspeedAnalysis")
//    public List getOverspeedAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getOverspeedAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//    /**
//     * 	19疲劳驾驶预警-分析值
//     */
//    @PostMapping(value = "/getFatigueAnalysis")
//    public List getFatigueAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getFatigueAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }

//    /**
//     * 	20预警-分析值-分析值
//     */
//
//    @PostMapping(value = "/getWarningAnalysis")
//    public List getWarningAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getWarningAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }

//    /**
//     * 	21终端设备故障预警-分析值
//     */
//
//
//    @PostMapping(value = "/getTerminalAnalysis")
//    public List getTerminalAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getTerminalAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 	22驾驶时长异常预警-分析值
//     */
//
//
//    @PostMapping(value = "/getDrivingTimeAnalysis")
//    public List getDrivingTimeAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getDrivingTimeAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 23超时停车预警-分析值
//     */
//
//    @PostMapping(value = "/getTimeoutParkingAnalysis")
//    public List getTimeoutParkingAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getTimeoutParkingAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//    /**
//     * 24行驶路线异常预警-分析值
//     */
//
//    @PostMapping(value = "/getAbnormalRouteAnalysis")
//    public List getAbnormalRouteAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getAbnormalRouteAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 25路线偏离预警-分析值
//     */
//
//    @PostMapping(value = "/getLineDeviationAnalysis")
//    public List getLineDeviationAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getLineDeviationAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//
//    /**
//     * 26车辆异常预警-分析值
//     */
//    @PostMapping(value = "/getAbnormalVehicleAnalysis")
//    public List getAbnormalVehicleAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getAbnormalVehicleAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }
//    /**
//     * 27车辆非法行驶预警-分析值
//     */
//
//    @PostMapping(value = "/getIllegalDrivingAnalysis")
//    public List getIllegalDrivingAnalysis(@RequestParam ("car_number")String brand) {
//        try {
//            List<Map<String, Object>> List = warningRealTimeAnalysisResultsService.getIllegalDrivingAnalysis(brand);
//            return List;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList();
//        }
//    }


}

