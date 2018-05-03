package com.jiuqu.cloud.controller.svdm.historyController.WeatherController;

import com.jiuqu.cloud.service.svdm.history.WeatherService.WeatherDataDisplayHistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/history/riskController")
public class WeatherDataDisplayHistoryController {

    @Autowired
    WeatherDataDisplayHistoryService weatherDataDisplayHistoryService;

    /**
     * 天气数据展示
     * unit_id=?
     */
    @PostMapping(value = "/getListWeatherDataDisplay")
    public List getListWeatherDataDisplay(@RequestParam("unit_id")int id){
        try {
            List<Map<String,Object>> getListWeatherDataDisplay = weatherDataDisplayHistoryService.listHistoryWeatherDataDisplay(id);
            return getListWeatherDataDisplay;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
