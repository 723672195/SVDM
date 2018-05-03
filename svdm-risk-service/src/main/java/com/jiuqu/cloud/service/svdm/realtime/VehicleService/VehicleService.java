package com.jiuqu.cloud.service.svdm.realtime.VehicleService;

import java.util.List;
import java.util.Map;

public interface VehicleService {
    List<Map<String,Object>> findVehicleAnalysis(Long unitId);
    List<Map<String,Object>> findDynamicSystem(Long unitId);


}
