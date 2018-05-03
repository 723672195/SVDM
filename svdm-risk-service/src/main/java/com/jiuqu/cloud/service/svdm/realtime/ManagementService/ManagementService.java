package com.jiuqu.cloud.service.svdm.realtime.ManagementService;

import java.util.List;
import java.util.Map;

public interface ManagementService {
    List<Map<String,Object>> findManagement(Long unitId);
    List<Map<String,Object>> findVehicleManagement(Long unitId);
}
