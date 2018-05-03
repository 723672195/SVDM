package com.jiuqu.cloud.service.impl.svdm.history.VehicleServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.history.VehicleService.VehicleHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VehicleHistoryServiceImpl implements VehicleHistoryService{
    @Autowired
    BaseService baseService;
    @Override
    public List<Map<String, Object>> findVehicleHistoryAnalysis(Long unitId) {
        String sql="SELECT\n" +
                "s.dynamic_system_analysis,\n" +
                "s.braking_system_analysis,\n" +
                "s.drive_system_analysis,\n" +
                "s.steering_system_analysis\n" +
                "FROM\n" +
                "single_unit_daily_analysis AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+"\n" +
                "ORDER BY\n" +
                "s.send_time ASC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    @Override
    public List<Map<String, Object>> findDynamicSystemHistory(Long unitId) {
        String sql = "SELECT\n" +
                "s.dynamic_system_analysis,\n" +
                "s.braking_system_analysis,\n" +
                "s.drive_system_analysis,\n" +
                "s.steering_system_analysis\n" +
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
