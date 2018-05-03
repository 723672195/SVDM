package com.jiuqu.cloud.freemarker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ExportRealTimeServiceImpl implements ExportRealTimeService{
    @Autowired
    BaseService baseService;
    //查询公司名称
    @Override
    public List<Map<String, Object>> findUnitName(Long unitId) {
        String sql = "SELECT\n" +
                "single_unit.unit_name\n" +
                "FROM\n" +
                "single_unit\n" +
                "WHERE\n" +
                "single_unit.id = "+unitId+"";
        return baseService.find(sql);
    }
    //查询公司的雷达图以及分析值
    @Override
    public List<Map<String, Object>> findUnitMessage(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.driver_analysis,\n" +
                "s.vehicle_conditions_analysis,\n" +
                "s.road_condition_analysis,\n" +
                "s.weather_condition_analysis,\n" +
                "s.management_situation_analysis,\n" +
                "s.rai_count\n" +
                "FROM\n" +
                "single_unit_analysis_real_time AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= '"+sdf.format(new Date())+"'\n" +
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    //查询5大分类下所有小分类的分析值及次数
    @Override
    public List<Map<String, Object>> findAllAnalysis(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.weather_warning_analysis,\n" +
                "s.weather_warning_number,\n" +
                "s.speeding_early_warning_analysis,\n" +
                "s.speeding_early_warning_number,\n" +
                "s.fatigue_driving_early_warning_analysis,\n" +
                "s.fatigue_driving_early_warning_number,\n" +
                "s.early_warning_analysis,\n" +
                "s.early_warning_number,\n" +
                "s.terminal_equipment_failure_early_warning_analysis,\n" +
                "s.terminal_equipment_failure_early_warning_number,\n" +
                "s.abnormality_of_driving_time_early_warning_analysis,\n" +
                "s.abnormality_of_driving_time_early_warning_number,\n" +
                "s.timeout_parking_early_warning_analysis,\n" +
                "s.timeout_parking_early_warning_number,\n" +
                "s.abnormal_route_early_warning_analysis,\n" +
                "s.abnormal_route_early_warning_number,\n" +
                "s.route_deviation_early_warning_analysis,\n" +
                "s.route_deviation_early_warning_number,\n" +
                "s.vehicle_anomaly_early_warning_analysis,\n" +
                "s.vehicle_anomaly_early_warning_number,\n" +
                "s.illegal_vehicle_driving_early_warning_analysis,\n" +
                "s.illegal_vehicle_driving_early_warning_number,\n" +
                "s.dynamic_system_analysis,\n" +
                "s.braking_system_analysis,\n" +
                "s.drive_system_analysis,\n" +
                "s.steering_system_analysis,\n" +
                "s.average_elevation_analysis,\n" +
                "s.road_curvature_analysis,\n" +
                "s.road_slope_analysis,\n" +
                "s.route_efficiency_analysis,\n" +
                "s.weather_data_analysis,\n" +
                "s.wicked_travel_time,\n" +
                "s.vehicle_management_analysis,\n" +
                "s.personnel_management_analysis,\n" +
                "s.transportation_management_analysis,\n" +
                "s.security_management_analysis,\n" +
                "d.accident_constitutes_crime_analysis,\n" +
                "d.accident_constitutes_crime_number,\n" +
                "d.traffic_congestion_irregularities_analysis,\n" +
                "d.traffic_congestion_irregularities_number,\n" +
                "d.use_counterfeit_driver_license_analysis,\n" +
                "d.use_counterfeit_driver_license_number,\n" +
                "d.unlicensed_driving_analysis,\n" +
                "d.unlicensed_driving_number,\n" +
                "d.fatigue_driving_analysis,\n" +
                "d.fatigue_driving_number,\n" +
                "d.hit_and_run_analysis,\n" +
                "d.hit_and_run_number,\n" +
                "d.overcrowding_analysis,\n" +
                "d.overcrowding_number,\n" +
                "d.overloading_analysis,\n" +
                "d.overloading_number,\n" +
                "d.overspeed_driving_analysis,\n" +
                "d.overspeed_driving_number,\n" +
                "d.irregularities_analysis,\n" +
                "d.irregularities_number,\n" +
                "d.irregularities_driver_analysis,\n" +
                "d.irregularities_driver_number,\n" +
                "d.irregularities_carrying_human_load_analysis,\n" +
                "d.irregularities_carrying_human_load_number,\n" +
                "d.drunken_driving_analysis,\n" +
                "d.drunken_driving_number,\n" +
                "d.driver_irregularities_analysis,\n" +
                "d.driver_irregularities_number,\n" +
                "d.driving_license_abnormal_driving_analysis,\n" +
                "d.driving_license_abnormal_driving_number,\n" +
                "d.high_speed_overspeed_analysis,\n" +
                "d.high_speed_overspeed_number,\n" +
                "d.high_speed_violation_analysis,\n" +
                "d.high_speed_violation_number\n" +
                "FROM\n" +
                "single_unit_analysis_real_time AS s ,\n" +
                "single_unit_diurnal_illegal_analysis AS d\n" +
                "WHERE\n" +
                "s.unit_id = d.unit_id AND\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= '"+sdf.format(new Date())+"' \n" +
                "ORDER BY\n" +
                "s.send_time DESC,\n" +
                "d.send_time DESC\n" +
                "LIMIT 0, 1\n";
        return baseService.find(sql);
    }
    //公司基础数据
    @Override
    public List<Map<String, Object>> findUnitData(Long unitId) {
        String sql ="SELECT\n" +
                "s.car_license_plate,\n" +
                "s.car_type,\n" +
                "s.fuel_type,\n" +
                "s.vehicle_level\n" +
                "FROM\n" +
                "single_unit_car AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+"";
        return baseService.find(sql);
    }
    //车载监控设备状态
    @Override
    public List<Map<String, Object>> findUnitCarState(Long unitId) {
        return null;
    }
    //查询公司整改建议
    @Override
    public List<Map<String, Object>> findUnitHandling(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "\td.handling_opinions\n" +
                "FROM\n" +
                "\tsingle_unit_analysis_real_time_handling_opinions AS d\n" +
                "WHERE\n" +
                "\td.car_analysis_uuid = (\n" +
                "\t\tSELECT\n" +
                "\t\t\ts.car_analysis_uuid\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit_analysis_real_time AS s\n" +
                "\t\tWHERE\n" +
                "\t\t\ts.unit_id = "+unitId+"\n" +
                "\t\tAND s.send_time >= '"+sdf.format(new Date())+"'\n" +
                "\t\tORDER BY\n" +
                "\t\t\ts.send_time DESC\n" +
                "\t\tLIMIT 0,\n" +
                "\t\t1\n" +
                "\t)";
        return baseService.find(sql);
    }
}
