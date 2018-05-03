package com.jiuqu.cloud.service.svdm.history.VehicleService;

import java.util.List;
import java.util.Map;

public interface VehicleHistoryService {
    List<Map<String,Object>> findVehicleHistoryAnalysis(Long unitId);
    List<Map<String,Object>> findDynamicSystemHistory(Long unitId);
}
