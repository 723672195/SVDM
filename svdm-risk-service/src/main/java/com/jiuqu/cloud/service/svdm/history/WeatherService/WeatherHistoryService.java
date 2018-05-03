package com.jiuqu.cloud.service.svdm.history.WeatherService;

import java.util.List;
import java.util.Map;

public interface WeatherHistoryService {
    List<Map<String,Object>> findWeatherHistoryAnalysis(Long unitId);
    List<Map<String,Object>> findWeatherTimeHistory(Long unitId);
}
