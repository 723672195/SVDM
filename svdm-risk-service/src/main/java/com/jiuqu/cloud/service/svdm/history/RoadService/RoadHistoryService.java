package com.jiuqu.cloud.service.svdm.history.RoadService;

import java.util.List;
import java.util.Map;

public interface RoadHistoryService {
    List<Map<String,Object>> findRoadHistoryAnalysis(Long unitId);
    List<Map<String,Object>> findAverageElevationHistory(Long unitId);
}
