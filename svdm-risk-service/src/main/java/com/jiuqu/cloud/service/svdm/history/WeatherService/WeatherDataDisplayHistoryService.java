package com.jiuqu.cloud.service.svdm.history.WeatherService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface WeatherDataDisplayHistoryService {
    /**
     * 天气数据展示
     *
     */
    List<Map<String,Object>> listHistoryWeatherDataDisplay(int id);

}
