package com.jiuqu.cloud.service.svdm.history.ManagementService;

import java.util.List;
import java.util.Map;

public interface ManagementHistoryService {
    List<Map<String,Object>> findManagementHistory(Long unitId);
    List<Map<String,Object>> findVehicleManagementHistory(Long unitId);
}
