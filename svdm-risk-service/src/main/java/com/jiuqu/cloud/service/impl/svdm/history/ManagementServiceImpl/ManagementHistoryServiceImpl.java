package com.jiuqu.cloud.service.impl.svdm.history.ManagementServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.history.ManagementService.ManagementHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ManagementHistoryServiceImpl implements ManagementHistoryService{
    @Autowired
    BaseService baseService;

    @Override
    public List<Map<String, Object>> findManagementHistory(Long unitId) {
        String sql = "SELECT\n" +
                "s.vehicle_management_analysis,\n" +
                "s.personnel_management_analysis,\n" +
                "s.transportation_management_analysis,\n" +
                "s.security_management_analysis\n" +
                "FROM\n" +
                "single_unit_daily_analysis AS s \n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+"\n" +
                "ORDER BY\n" +
                "s.send_time ASC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    @Override
    public List<Map<String, Object>> findVehicleManagementHistory(Long unitId) {
        String sql = "SELECT\n" +
                "s.vehicle_management_analysis,\n" +
                "s.personnel_management_analysis,\n" +
                "s.transportation_management_analysis,\n" +
                "s.security_management_analysis\n" +
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
