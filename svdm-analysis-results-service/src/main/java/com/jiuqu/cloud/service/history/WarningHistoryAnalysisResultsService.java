package com.jiuqu.cloud.service.history;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface WarningHistoryAnalysisResultsService {

    /**
     * 数据展示
     * 表格List
     */

        //  18超速预警
        List<Map<String,Object>> listHistoryOverspeed(String brand);
        //	19疲劳驾驶预警
        List<Map<String,Object>> listHistoryFatigue(String brand);
        //	20预警
        List<Map<String,Object>> listHistoryWarning(String brand);
        //	21终端设备故障预警
        List<Map<String,Object>> listHistoryTerminal(String brand);
        //	22驾驶时长异常预警
        List<Map<String,Object>> listHistoryDrivingTime(String brand);
        //	23超时停车预警
        List<Map<String,Object>> listHistoryTimeoutParking(String brand);
        //	24行驶路线异常预警
        List<Map<String,Object>> listHistoryAbnormalRoute(String brand);
        //	25路线偏离预警
        List<Map<String,Object>> listHistoryLineDeviation(String brand);
        //	26车辆异常预警
        List<Map<String,Object>> listHistoryAbnormalVehicle(String brand);
        //	27车辆非法行驶预警
        List<Map<String,Object>> listHistoryIllegalDriving(String brand);


    /**
     * 车辆数据
     */
    List<Map<String,Object>> getHistoryUnitCar(String CarLicensePlate);
    /**
     * 驾驶人数据
     */
//    List<Map<String,Object>> getTransport(String CarLicensePlate);

//    ******************************************************

    /**
     * 运输数据
     */
    List<Map<String,Object>> getHistoryTransport(String CarLicensePlate);

    /**
     * 分析值
     */

    //  18超速预警-分析值
    List<Map<String,Object>> getHistoryOverspeedAnalysis(String brand);
    //	19疲劳驾驶预警-分析值
    List<Map<String,Object>> getHistoryFatigueAnalysis(String brand);
    //	20预警-分析值-分析值
    List<Map<String,Object>> getHistoryWarningAnalysis(String brand);
    //	21终端设备故障预警-分析值
    List<Map<String,Object>> getHistoryTerminalAnalysis(String brand);
    //	22驾驶时长异常预警-分析值
    List<Map<String,Object>> getHistoryDrivingTimeAnalysis(String brand);
    //	23超时停车预警-分析值
    List<Map<String,Object>> getHistoryTimeoutParkingAnalysis(String brand);
    //	24行驶路线异常预警-分析值
    List<Map<String,Object>> getHistoryAbnormalRouteAnalysis(String brand);
    //	25路线偏离预警-分析值
    List<Map<String,Object>> getHistoryLineDeviationAnalysis(String brand);
    //	26车辆异常预警-分析值
    List<Map<String,Object>> getHistoryAbnormalVehicleAnalysis(String brand);
    //	27车辆非法行驶预警-分析值
    List<Map<String,Object>> getHistoryIllegalDrivingAnalysis(String brand);


    /**
     * 图
     */
    //  18-超速预警
    List<Map<String,Object>> getHistoryOverspeedChar(String brand);
    //	19-疲劳驾驶预警
    List<Map<String,Object>> getHistoryFatigueChar(String brand);
    //	20-预警-分析值
    List<Map<String,Object>> getHistoryWarningChar(String brand);
    //	21-终端设备故障预警
    List<Map<String,Object>> getHistoryTerminalChar(String brand);
    //	22-驾驶时长异常预警
    List<Map<String,Object>> getHistoryDrivingTimeChar(String brand);
    //	23-超时停车预警
    List<Map<String,Object>> getHistoryTimeoutParkingChar(String brand);
    //	24-行驶路线异常预警
    List<Map<String,Object>> getHistoryAbnormalRouteChar(String brand);
    //	25-路线偏离预警
    List<Map<String,Object>> getHistoryLineDeviationChar(String brand);
    //	26-车辆异常预警
    List<Map<String,Object>> getHistoryAbnormalVehicleChar(String brand);
    //	27-车辆非法行驶预警
    List<Map<String,Object>> getHistoryIllegalDrivingChar(String brand);

}
