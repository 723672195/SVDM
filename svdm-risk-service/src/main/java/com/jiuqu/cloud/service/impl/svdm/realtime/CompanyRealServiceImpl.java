package com.jiuqu.cloud.service.impl.svdm.realtime;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.CompanyRealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CompanyRealServiceImpl implements CompanyRealService {
    @Autowired
    BaseService baseService;

    @Override
    public List<Map<String, Object>> findUnitAll(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT driver_analysis,vehicle_conditions_analysis,road_condition_analysis,weather_condition_analysis," +
                "management_situation_analysis,rai_count,risk_hints,risk_grade " +
                "FROM single_unit_analysis_real_time WHERE unit_id="+unitId+" AND send_time >= '"+sdf.format(new Date())+"' ORDER BY " +
                "send_time DESC LIMIT 0,1";
        return baseService.find(sql);
    }

    /**
     * 查询所有分类以及小分类的分析值
     * @param unitId
     * @return
     */
    @Override
    public List findUnitAnalysis(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        System.out.println(sdf.format(new Date()));
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
                "single_unit_analysis_real_time AS s ,\n" +
                "single_unit_diurnal_illegal_analysis AS d\n" +
                "WHERE\n" +
                "s.unit_id = d.unit_id AND\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1\n";
        return baseService.find(sql);
    }






}
