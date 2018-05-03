package com.jiuqu.cloud.service.svdm.history.DriverService;

import java.util.List;
import java.util.Map;

public interface DriverHistoryService {
    List<Map<String,Object>> findDriverHistoryAnalysis(Long unitId);
    List<Map<String,Object>> findOverSpeedHistoryDriving(Long unitId);




}
