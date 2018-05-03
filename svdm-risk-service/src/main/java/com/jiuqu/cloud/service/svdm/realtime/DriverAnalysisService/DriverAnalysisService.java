package com.jiuqu.cloud.service.svdm.realtime.DriverAnalysisService;

import java.util.List;
import java.util.Map;

public interface DriverAnalysisService {
    List<Map<String,Object>> findDriverAnalysis(Long unitId);
    List<Map<String,Object>> findOverSpeedDriving(Long unitId);




}
