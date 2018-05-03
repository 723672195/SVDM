package com.jiuqu.cloud.service.realtime;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface WarningRealTimeAnalysisResultsService {

    /**
     * 数据展示
     * 表格List
     */

        //  18超速预警
        List<Map<String,Object>> listOverspeed(String brand);
        //	19疲劳驾驶预警
        List<Map<String,Object>> listFatigue(String brand);
        //	20预警
        List<Map<String,Object>> listWarning(String brand);
        //	21终端设备故障预警
        List<Map<String,Object>> listTerminal(String brand);
        //	22驾驶时长异常预警
        List<Map<String,Object>> listDrivingTime(String brand);
        //	23超时停车预警
        List<Map<String,Object>> listTimeoutParking(String brand);
        //	24行驶路线异常预警
        List<Map<String,Object>> listAbnormalRoute(String brand);
        //	25路线偏离预警
        List<Map<String,Object>> listLineDeviation(String brand);
        //	26车辆异常预警
        List<Map<String,Object>> listAbnormalVehicle(String brand);
        //	27车辆非法行驶预警
        List<Map<String,Object>> listIllegalDriving(String brand);


    /**
     * 车辆数据
     */
    List<Map<String,Object>> getUnitCar(String CarLicensePlate);
    /**
     * 驾驶人数据
     */
//    List<Map<String,Object>> getTransport(String CarLicensePlate);

//    ******************************************************

    /**
     * 运输数据
     */
    List<Map<String,Object>> getTransport(String CarLicensePlate);

    /**
     * 分析值
     */

    //  18超速预警-分析值
    List<Map<String,Object>> getOverspeedAnalysis(String brand);
    //	19疲劳驾驶预警-分析值
    List<Map<String,Object>> getFatigueAnalysis(String brand);
    //	20预警-分析值-分析值
    List<Map<String,Object>> getWarningAnalysis(String brand);
    //	21终端设备故障预警-分析值
    List<Map<String,Object>> getTerminalAnalysis(String brand);
    //	22驾驶时长异常预警-分析值
    List<Map<String,Object>> getDrivingTimeAnalysis(String brand);
    //	23超时停车预警-分析值
    List<Map<String,Object>> getTimeoutParkingAnalysis(String brand);
    //	24行驶路线异常预警-分析值
    List<Map<String,Object>> getAbnormalRouteAnalysis(String brand);
    //	25路线偏离预警-分析值
    List<Map<String,Object>> getLineDeviationAnalysis(String brand);
    //	26车辆异常预警-分析值
    List<Map<String,Object>> getAbnormalVehicleAnalysis(String brand);
    //	27车辆非法行驶预警-分析值
    List<Map<String,Object>> getIllegalDrivingAnalysis(String brand);


    /**
     * 图
     */
    //  18-超速预警
    List<Map<String,Object>> getOverspeedChar(String brand);
    //	19-疲劳驾驶预警
    List<Map<String,Object>> getFatigueChar(String brand);
    //	20-预警-分析值
    List<Map<String,Object>> getWarningChar(String brand);
    //	21-终端设备故障预警
    List<Map<String,Object>> getTerminalChar(String brand);
    //	22-驾驶时长异常预警
    List<Map<String,Object>> getDrivingTimeChar(String brand);
    //	23-超时停车预警
    List<Map<String,Object>> getTimeoutParkingChar(String brand);
    //	24-行驶路线异常预警
    List<Map<String,Object>> getAbnormalRouteChar(String brand);
    //	25-路线偏离预警
    List<Map<String,Object>> getLineDeviationChar(String brand);
    //	26-车辆异常预警
    List<Map<String,Object>> getAbnormalVehicleChar(String brand);
    //	27-车辆非法行驶预警
    List<Map<String,Object>> getIllegalDrivingChar(String brand);

}
