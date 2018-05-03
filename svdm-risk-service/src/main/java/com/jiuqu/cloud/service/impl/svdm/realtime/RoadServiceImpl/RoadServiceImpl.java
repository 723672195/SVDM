package com.jiuqu.cloud.service.impl.svdm.realtime.RoadServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.RoadService.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class RoadServiceImpl implements RoadService{
    @Autowired
    private BaseService baseService;

    @Override
    public List<Map<String, Object>> findRoadAnalysis(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.average_elevation_analysis,\n" +
                "s.road_curvature_analysis,\n" +
                "s.road_slope_analysis,\n" +
                "s.route_efficiency_analysis\n" +
                "FROM\n" +
                "single_unit_analysis_real_time AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time ASC\n" +
                "LIMIT 0, 1\n";
        return baseService.find(sql);
    }

    @Override
    public List<Map<String, Object>> findAverageElevation(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.average_elevation_analysis,\n" +
                "s.road_curvature_analysis,\n" +
                "s.road_slope_analysis,\n" +
                "s.route_efficiency_analysis\n" +
                "FROM\n" +
                "single_unit_analysis_real_time AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6\n";
        return baseService.find(sql);
    }






}
