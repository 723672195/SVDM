package com.jiuqu.cloud.service.svdm.realtime.WeatherService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface WeatherDataDisplayService {
    /**
     * 天气数据展示
     *
     */
    List<Map<String,Object>> listWeatherDataDisplay(int id);

}
