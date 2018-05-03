package com.jiuqu.cloud.service.impl.svdm.history;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.history.RiskHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RiskHistoryServiceImpl implements RiskHistoryService{
    @Autowired
    BaseService baseService;
    /**
     * 根据公司id查询驾驶人员,车辆,道路,天气,管理信息以及风险提示和RAL
     * @return
     */
    @Override
    public List<Map<String, Object>> findUnitHistoryMessage(Long unitId) {
        String sql="SELECT driver_analysis,vehicle_conditions_analysis,road_condition_analysis,weather_condition_analysis," +
                "management_situation_analysis,rai_count,risk_hints,risk_grade " +
                "FROM single_unit_daily_analysis WHERE unit_id="+unitId+" ORDER BY " +
                "send_time DESC LIMIT 0,1";
        return baseService.find(sql);
    }
    /**
     * 根据公司id查询5大分类下的小分类的分析值
     * @return
     */
    @Override
    public List<Map<String, Object>> findUnitHistoryAnalysis(Long unitId) {
        String sql ="SELECT\n" +
                "s.weather_warning_analysis,\n"+
                "s.fatigue_driving_early_warning_analysis,\n" +
                "s.early_warning_analysis, \n" +
                "s.terminal_equipment_failure_early_warning_analysis,\n" +
                "s.abnormality_of_driving_time_early_warning_analysis,\n" +
                "s.timeout_parking_early_warning_analysis,\n" +
                "s.abnormal_route_early_warning_analysis,\n" +
                "s.route_deviation_early_warning_analysis,\n" +
                "s.vehicle_anomaly_early_warning_analysis,\n" +
                "s.illegal_vehicle_driving_early_warning_analysis,\n" +
                "s.dynamic_system_analysis,\n" +
                "s.braking_system_analysis,\n" +
                "s.drive_system_analysis,\n" +
                "s.steering_system_analysis,\n" +
                "s.average_elevation_analysis,\n" +
                "s.road_curvature_analysis,\n" +
                "s.road_slope_analysis,\n" +
                "s.route_efficiency_analysis,\n" +
                "s.weather_data_analysis,\n" +
                "s.vehicle_management_analysis,\n" +
                "s.personnel_management_analysis,\n" +
                "s.transportation_management_analysis,\n" +
                "s.security_management_analysis,\n" +
                "s.speeding_early_warning_analysis,\n" +
                "d.accident_constitutes_crime_analysis,\n" +
                "d.traffic_congestion_irregularities_analysis,\n" +
                "d.use_counterfeit_driver_license_analysis,\n" +
                "d.unlicensed_driving_analysis,\n" +
                "d.fatigue_driving_analysis,\n" +
                "d.hit_and_run_analysis,\n" +
                "d.overcrowding_analysis,\n" +
                "d.overloading_analysis,\n" +
                "d.overspeed_driving_analysis,\n" +
                "d.irregularities_analysis,\n" +
                "d.irregularities_driver_analysis,\n" +
                "d.irregularities_carrying_human_load_analysis,\n" +
                "d.drunken_driving_analysis,\n" +
                "d.driver_irregularities_analysis,\n" +
                "d.driving_license_abnormal_driving_analysis,\n" +
                "d.high_speed_overspeed_analysis,\n" +
                "d.high_speed_violation_analysis\n" +
                "FROM\n" +
                "single_unit_daily_analysis AS s ,\n" +
                "single_unit_diurnal_illegal_analysis AS d\n" +
                "WHERE\n" +
                "s.unit_id = d.unit_id AND\n" +
                "s.unit_id = "+unitId+"\n" +
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1\n";
        return baseService.find(sql);
    }

    /**
     * 根据车牌照查询rai指数
     * @param unitId
     * @return
     */
    @Override
    public List<Map<String, Object>> findCarHistoryRAL(Long unitId) {
        String sql ="SELECT \n" +
                "\tsingle_unit_car.car_license_plate AS car_number,\n" +
                "\tMAX(single_unit_car_daily_analysis.id ),\n" +
                "\tsingle_unit_car_daily_analysis.rai_count,\n" +
                "\tsingle_unit_car_daily_analysis.risk_grade\n" +
                "FROM\n" +
                "\tsingle_unit_car\n" +
                "LEFT JOIN\n" +
                "\tsingle_unit_car_daily_analysis\n" +
                "ON\n" +
                "\tsingle_unit_car_daily_analysis.car_code = single_unit_car.car_code\n" +
                "AND\n" +
                "\tsingle_unit_car_daily_analysis.unit_id = "+unitId+"\n" +
                "WHERE\n" +
                "\tsingle_unit_car.unit_id = "+unitId+"\n" +
                "GROUP BY\n" +
                "\tsingle_unit_car.car_license_plate\n"+
                "ORDER BY\n"+
                "\tsingle_unit_car_daily_analysis.rai_count DESC";
        return baseService.find(sql);
    }

    /**
     * 根据公司id查询整改建议
     * @param unitId
     * @return
     */
    @Override
    public List<Map<String, Object>> findUnitHistoryOpinions(Long unitId) {
        String sql="SELECT\n" +
                "\td.handling_opinions\n" +
                "FROM\n" +
                "\tsingle_unit_daily_analysis_handling_opinions AS d\n" +
                "WHERE\n" +
                "\td.analysis_uuid = (\n" +
                "\t\tSELECT\n" +
                "\t\t\ts.analysis_uuid\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit_daily_analysis AS s\n" +
                "\t\tWHERE\n" +
                "\t\t\ts.unit_id = "+unitId+"\n" +
                "\t\tORDER BY\n" +
                "\t\t\ts.send_time DESC\n" +
                "\t\tLIMIT 0,\n" +
                "\t\t1\n" +
                "\t)";
        return baseService.find(sql);
    }
}
