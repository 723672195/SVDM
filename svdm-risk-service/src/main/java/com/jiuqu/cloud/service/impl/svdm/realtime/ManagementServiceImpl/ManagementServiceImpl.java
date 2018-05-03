package com.jiuqu.cloud.service.impl.svdm.realtime.ManagementServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.ManagementService.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ManagementServiceImpl implements ManagementService{
    @Autowired
    private BaseService baseService;

    @Override
    public List<Map<String, Object>> findManagement(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.vehicle_management_analysis,\n" +
                "s.personnel_management_analysis,\n" +
                "s.transportation_management_analysis,\n" +
                "s.security_management_analysis\n" +
                "FROM\n" +
                "single_unit_analysis_real_time AS s \n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+" AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    @Override
    public List<Map<String, Object>> findVehicleManagement(Long unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.vehicle_management_analysis,\n" +
                "s.personnel_management_analysis,\n" +
                "s.transportation_management_analysis,\n" +
                "s.security_management_analysis\n" +
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
