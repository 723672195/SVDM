package com.jiuqu.cloud.service.impl.realtime;

import com.jiuqu.cloud.base.service.BaseService;
import com.jiuqu.cloud.service.realtime.WarningRealTimeAnalysisResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WarningRealTimeAnalysisResultsServiceImpl implements WarningRealTimeAnalysisResultsService{

    @Autowired
    BaseService baseService;


    /**
     * 表格
     * 18超速预警-表格List
     */
    @Override
    public List<Map<String, Object>> listOverspeed(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 18\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listFatigue(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 19\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listWarning(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 20\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listTerminal(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 21\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listDrivingTime(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 22\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listTimeoutParking(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 23\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listAbnormalRoute(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 24\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listLineDeviation(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 25\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listAbnormalVehicle(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 26\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> listIllegalDriving(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "\tsingle_historical_warning_data.send_time AS Time,\n" +
                "\tsingle_historical_warning_data.velocity AS SUDU,\n" +
                "\tsingle_historical_warning_data.location AS DIDIAN\n" +

                "FROM\n" +
                "\tsingle_historical_warning_data\n" +
                "WHERE\n" +
                "\tsingle_historical_warning_data.type = 27\n" +
                "AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
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
    public List<Map<String, Object>> getUnitCar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
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
    public List<Map<String, Object>> getTransport(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
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
    public List<Map<String, Object>> getOverspeedChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.`speeding_early_warning_number` AS 超速预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6 ";
        return baseService.find(sql);
    }

    /**
     * 19疲劳驾驶预警-图
     */
    @Override
    public List<Map<String, Object>> getFatigueChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.`fatigue_driving_early_warning_number`as 疲劳驾驶预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }


    /**
     * 20预警-图
     */
    @Override
    public List<Map<String, Object>> getWarningChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.early_warning_number as 预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	21终端设备故障预警-图
     */

    @Override
    public List<Map<String, Object>> getTerminalChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.terminal_equipment_failure_early_warning_number AS 终端设备故障预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "\n AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }


    /**
     * 	22驾驶时长异常预警-图
     */
    @Override
    public List<Map<String, Object>> getDrivingTimeChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.abnormality_of_driving_time_early_warning_number AS 驾驶时长异常预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	23超时停车预警-图
     */

    @Override
    public List<Map<String, Object>> getTimeoutParkingChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.timeout_parking_early_warning_number AS 超时停车预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	24行驶路线异常预警-图
     */

    @Override
    public List<Map<String, Object>> getAbnormalRouteChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.abnormal_route_early_warning_number AS 行驶路线异常预警次数\n" +

                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	25路线偏离预警-图
     */

    @Override
    public List<Map<String, Object>> getLineDeviationChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.route_deviation_early_warning_number AS 路线偏离预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = "+ "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	26车辆异常预警-图
     */

    @Override
    public List<Map<String, Object>> getAbnormalVehicleChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.vehicle_anomaly_early_warning_number AS 车辆异常预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }

    /**
     * 	27车辆非法行驶预警
     */
    @Override
    public List<Map<String, Object>> getIllegalDrivingChar(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.send_time AS TIME,\n" +
                "single_unit_car_analysis_real_time.illegal_vehicle_driving_early_warning_number AS 车辆非法行驶预警次数\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "WHERE\n" +
                "\tsingle_unit_car_analysis_real_time.car_number = " + "'"+brand+"'"+
                "and\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,6";
        return baseService.find(sql);
    }


    /**
     * 18-超速预警-分析值
     */
    @Override
    public List<Map<String, Object>> getOverspeedAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.speeding_early_warning_analysis as CHAOSUFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1";
        return baseService.find(sql);
    }

    /**
     * 19-疲劳驾驶预警-分析值
     */
    @Override
    public List<Map<String, Object>> getFatigueAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.fatigue_driving_early_warning_analysis as PILAOJIASHIFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 20-预警-分析值
     */
    @Override
    public List<Map<String, Object>> getWarningAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.early_warning_analysis as YUJINGFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 21-终端设备故障预警-分析值
     */
    @Override
    public List<Map<String, Object>> getTerminalAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.terminal_equipment_failure_early_warning_analysis AS ZHONGDUANFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 22-驾驶时长异常预警-分析值
     */
    @Override
    public List<Map<String, Object>> getDrivingTimeAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.abnormality_of_driving_time_early_warning_analysis as JIASHISHICHANGFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 23-超时停车预警-分析值
     */
    @Override
    public List<Map<String, Object>> getTimeoutParkingAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.timeout_parking_early_warning_analysis AS CHAOSHITINGCHEFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 24-行驶路线异常预警-分析值
     */
    @Override
    public List<Map<String, Object>> getAbnormalRouteAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.abnormal_route_early_warning_analysis as XINGSHILUXIANYICHANGFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number=" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 25-路线偏离预警-分析值
     */
    @Override
    public List<Map<String, Object>> getLineDeviationAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.route_deviation_early_warning_analysis as LUXIANPIANLIYUJINGFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 26-车辆异常预警-分析值
     */
    @Override
    public List<Map<String, Object>> getAbnormalVehicleAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.vehicle_anomaly_early_warning_analysis as CHELIANGYICHANGFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }
    /**
     * 27-车辆非法行驶预警-分析值
     */
    @Override
    public List<Map<String, Object>> getIllegalDrivingAnalysis(String brand) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "single_unit_car_analysis_real_time.illegal_vehicle_driving_early_warning_analysis as CHELIANGFEIFAFENXIZHI\n" +
                "FROM `single_unit_car_analysis_real_time`\n" +
                "WHERE\n" +
                "single_unit_car_analysis_real_time.car_number =" + "'"+brand+"'"+
                "AND\n" +
                "single_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "single_unit_car_analysis_real_time.send_time DESC\n" +
                "LIMIT 0,1\n";
        return baseService.find(sql);
    }



}
