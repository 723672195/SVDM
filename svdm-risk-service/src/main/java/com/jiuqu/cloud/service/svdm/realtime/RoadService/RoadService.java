package com.jiuqu.cloud.service.svdm.realtime.RoadService;

import java.util.List;
import java.util.Map;

public interface RoadService {
    List<Map<String,Object>> findRoadAnalysis(Long unitId);
    List<Map<String,Object>> findAverageElevation(Long unitId);

}
