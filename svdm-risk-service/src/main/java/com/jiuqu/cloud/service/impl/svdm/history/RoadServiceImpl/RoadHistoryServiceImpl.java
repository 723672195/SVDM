package com.jiuqu.cloud.service.impl.svdm.history.RoadServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.history.RoadService.RoadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoadHistoryServiceImpl implements RoadHistoryService{
    @Autowired
    BaseService baseService;
    @Override
    public List<Map<String, Object>> findRoadHistoryAnalysis(Long unitId) {
        String sql ="SELECT\n" +
                "s.average_elevation_analysis,\n" +
                "s.road_curvature_analysis,\n" +
                "s.road_slope_analysis,\n" +
                "s.route_efficiency_analysis\n" +
                "FROM\n" +
                "single_unit_daily_analysis AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+"\n" +
                "ORDER BY\n" +
                "s.send_time ASC\n" +
                "LIMIT 0, 1\n";
        return baseService.find(sql);
    }

    @Override
    public List<Map<String, Object>> findAverageElevationHistory(Long unitId) {
        String sql ="SELECT\n" +
                "s.average_elevation_analysis,\n" +
                "s.road_curvature_analysis,\n" +
                "s.road_slope_analysis,\n" +
                "s.route_efficiency_analysis\n" +
                "FROM\n" +
                "single_unit_daily_analysis AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+"\n" +
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6\n";
        return baseService.find(sql);
    }
}
