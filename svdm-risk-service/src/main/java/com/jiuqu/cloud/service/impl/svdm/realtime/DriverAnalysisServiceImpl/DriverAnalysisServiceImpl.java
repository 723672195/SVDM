package com.jiuqu.cloud.service.impl.svdm.realtime.DriverAnalysisServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.DriverAnalysisService.DriverAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class DriverAnalysisServiceImpl implements DriverAnalysisService{
    @Autowired
    private BaseService baseService;

    @Override
    public List<Map<String, Object>> findDriverAnalysis(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql="SELECT\n" +
                "s.weather_warning_analysis,\n" +
                "s.speeding_early_warning_analysis,\n" +
                "s.fatigue_driving_early_warning_analysis,\n" +
                "d.fatigue_driving_analysis,\n" +
                "d.overloading_analysis,\n" +
                "d.overspeed_driving_analysis,\n" +
                "d.irregularities_carrying_human_load_analysis,\n" +
                "d.high_speed_overspeed_analysis\n" +
                "FROM\n" +
                "single_unit_analysis_real_time AS s ,\n" +
                "single_unit_diurnal_illegal_analysis AS d\n" +
                "WHERE\n" +
                "s.unit_id = d.unit_id AND\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }


    @Override
    public List<Map<String, Object>> findOverSpeedDriving(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql  ="SELECT\n" +
                "s.weather_warning_number,\n" +
                "s.`speeding_early_warning_number`,\n" +
                "s.`fatigue_driving_early_warning_number`,\n" +
                "d.fatigue_driving_number,\n" +
                "d.overloading_number,\n" +
                "d.overspeed_driving_number,\n" +
                "d.irregularities_carrying_human_load_number,\n" +
                "d.high_speed_overspeed_number\n" +
                "FROM\n" +
                "single_unit_analysis_real_time AS s ,\n" +
                "single_unit_diurnal_illegal_analysis AS d\n" +
                "WHERE\n" +
                "s.unit_id = d.unit_id AND\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "d.send_time DESC\n" +
                "LIMIT 0, 1\n";
        return baseService.find(sql);
    }









}
