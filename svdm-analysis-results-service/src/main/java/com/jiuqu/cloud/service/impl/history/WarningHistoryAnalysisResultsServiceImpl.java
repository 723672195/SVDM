package com.jiuqu.cloud.service.impl.history;

import com.jiuqu.cloud.base.service.BaseService;
import com.jiuqu.cloud.service.history.WarningHistoryAnalysisResultsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WarningHistoryAnalysisResultsServiceImpl implements WarningHistoryAnalysisResultsService {

    @Autowired
    BaseService baseService;


    /**
     * 表格
     * 18超速预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryOverspeed(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 18\n" +
                "AND single_historical_warning_data.plate_no = '"+ brand+ "'"+
                "\n ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 19疲劳驾驶预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryFatigue(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 19\n" +
                "AND single_historical_warning_data.plate_no = "+ "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 20预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryWarning(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 20\n" +
                "AND single_historical_warning_data.plate_no = " + "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 21终端设备故障预警-表格List
     */

    @Override
    public List<Map<String, Object>> listHistoryTerminal(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 21\n" +
                "AND single_historical_warning_data.plate_no = " + "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 22驾驶时长异常预警-表格List
     */

    @Override
    public List<Map<String, Object>> listHistoryDrivingTime(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 22\n" +
                "AND single_historical_warning_data.plate_no = " + "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 23超时停车预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryTimeoutParking(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 23\n" +
                "AND single_historical_warning_data.plate_no = " + "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 24行驶路线异常预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryAbnormalRoute(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 24\n" +
                "AND single_historical_warning_data.plate_no = " + "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 25路线偏离预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryLineDeviation(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 25\n" +
                "AND single_historical_warning_data.plate_no = "+ "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 26车辆异常预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryAbnormalVehicle(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 26\n" +
                "AND single_historical_warning_data.plate_no = " + "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }
    /**
     * 表格
     * 27车辆非法行驶预警-表格List
     */
    @Override
    public List<Map<String, Object>> listHistoryIllegalDriving(String brand) {
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 27\n" +
                "AND single_historical_warning_data.plate_no = " + "'"+ brand+"'"+
                "ORDER BY\n" +
                "\tsingle_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }


    /**
     *                    表格
     * 根据车牌照号获得车辆数据
     *
     */

    @Override
    public List<Map<String, Object>> getHistoryUnitCar(String brand) {
        String sql = "SELECT\n" +
                "single_unit_car.car_license_plate,\n" +
                "single_unit_car.car_type,\n" +
                "single_unit_car.fuel_type,\n" +
                "single_unit_car.settle_date,\n" +
                "single_unit_car.this_annual_inspection_date,\n" +
                "single_unit_car.vehicle_level\n" +
                "FROM\n" +
                "single_unit_car\n" +
                "WHERE\n" +
                "single_unit_car.car_license_plate = " + "'"+brand+"'";
        return baseService.find(sql);

    }

    /**
     *                    表格
     * 根据车牌照号获得运输数据
     */
    @Override
    public List<Map<String, Object>> getHistoryTransport(String brand) {
        String sql="\n" +
                "SELECT\n" +
                "single_unit_car.tonnage as HEZAI\n" +
                "FROM\n" +
                "single_unit_car\n" +
                "WHERE\n" +
                "single_unit_car.car_license_plate = "+ "'"+brand+"'";
        return baseService.find(sql);

    }
    /**             表格-暂无数据
     * 根据车牌照号获得驾驶人数据
     */
//    *******************************************************


    /**
     * 以下为图的数据
     */



      /**
       * 18超速预警-图
      */
    @Override
    public List<Map<String, Object>> getHistoryOverspeedChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.`speeding_early_warning_number` AS 超速预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6 ";
        return baseService.find(sql);
    }

    /**
     * 19疲劳驾驶预警-图
     */
    @Override
    public List<Map<String, Object>> getHistoryFatigueChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.`fatigue_driving_early_warning_number`as 疲劳驾驶预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }


    /**
     * 20预警-图
     */
    @Override
    public List<Map<String, Object>> getHistoryWarningChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.early_warning_number as 预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	21终端设备故障预警-图
     */

    @Override
    public List<Map<String, Object>> getHistoryTerminalChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.terminal_equipment_failure_early_warning_number AS 终端设备故障预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }


    /**
     * 	22驾驶时长异常预警-图
     */
    @Override
    public List<Map<String, Object>> getHistoryDrivingTimeChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.abnormality_of_driving_time_early_warning_number AS 驾驶时长异常预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	23超时停车预警-图
     */

    @Override
    public List<Map<String, Object>> getHistoryTimeoutParkingChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.timeout_parking_early_warning_number AS 超时停车预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	24行驶路线异常预警-图
     */

    @Override
    public List<Map<String, Object>> getHistoryAbnormalRouteChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.abnormal_route_early_warning_number AS 行驶路线异常预警次数\n" +

                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	25路线偏离预警-图
     */

    @Override
    public List<Map<String, Object>> getHistoryLineDeviationChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.route_deviation_early_warning_number AS 路线偏离预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = "+ "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	26车辆异常预警-图
     */

    @Override
    public List<Map<String, Object>> getHistoryAbnormalVehicleChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.vehicle_anomaly_early_warning_number AS 车辆异常预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	27车辆非法行驶预警
     */
    @Override
    public List<Map<String, Object>> getHistoryIllegalDrivingChar(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.send_time AS TIME,\n" +
                "single_unit_car_daily_analysis.illegal_vehicle_driving_early_warning_number AS 车辆非法行驶预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "WHERE\n" +
                "\tsingle_unit_car_daily_analysis.car_number = " + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }


    /**
     * 18-超速预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryOverspeedAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.speeding_early_warning_analysis as CHAOSUFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1";
        return baseService.find(sql);
    }

    /**
     * 19-疲劳驾驶预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryFatigueAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.fatigue_driving_early_warning_analysis as PILAOJIASHIFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 20-预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryWarningAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.early_warning_analysis as YUJINGFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 21-终端设备故障预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryTerminalAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.terminal_equipment_failure_early_warning_analysis AS ZHONGDUANFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 22-驾驶时长异常预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryDrivingTimeAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.abnormality_of_driving_time_early_warning_analysis as JIASHISHICHANGFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 23-超时停车预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryTimeoutParkingAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.timeout_parking_early_warning_analysis AS CHAOSHITINGCHEFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 24-行驶路线异常预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryAbnormalRouteAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.abnormal_route_early_warning_analysis as XINGSHILUXIANYICHANGFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number=" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 25-路线偏离预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryLineDeviationAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.route_deviation_early_warning_analysis as LUXIANPIANLIYUJINGFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 26-车辆异常预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryAbnormalVehicleAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.vehicle_anomaly_early_warning_analysis as CHELIANGYICHANGFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 27-车辆非法行驶预警-分析值
     */
    @Override
    public List<Map<String, Object>> getHistoryIllegalDrivingAnalysis(String brand) {
        String sql="SELECT\n" +
                "single_unit_car_daily_analysis.illegal_vehicle_driving_early_warning_analysis as CHELIANGFEIFAFENXIZHI\n" +
                "FROM `single_unit_car_daily_analysis`\n" +
                "WHERE\n" +
                "single_unit_car_daily_analysis.car_number =" + "'"+brand+"'"+
                "ORDER BY\n" +
                "single_unit_car_daily_analysis.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }



}
