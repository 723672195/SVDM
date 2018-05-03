package com.jiuqu.cloud.controller.svdm.realtimeController.WeatherController;

import com.jiuqu.cloud.service.svdm.realtime.WeatherService.WeatherDataDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/WeatherController")
public class WeatherDataDisplayController {

    @Autowired
    WeatherDataDisplayService weatherDataDisplayService;

    /**
     * 天气数据展示
     * unit_id=?
     */
    @PostMapping(value = "/getListWeatherDataDisplay")
    public List listWeatherDataDisplay(@RequestParam("unit_id")int id){
        try {
            List<Map<String,Object>> getListWeatherDataDisplay = weatherDataDisplayService.listWeatherDataDisplay(id);
            return getListWeatherDataDisplay;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

}
