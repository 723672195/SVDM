package com.jiuqu.cloud.service.svdm.realtime.WeatherService;

import java.util.List;
import java.util.Map;

public interface WeatherService {
    List<Map<String,Object>> findWeatherAnalysis(Long unitId);
    List<Map<String,Object>> findWeatherTime(Long unitId);
}
