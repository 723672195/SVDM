package com.jiuqu.cloud.controller.svdm.realtimeController.WeatherController;

import com.jiuqu.cloud.service.svdm.realtime.WeatherService.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    /**
     * 根据公司id查询天气情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findWeatherAnalysis")
    public List findWeatherAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = weatherService.findWeatherAnalysis(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 查询天气时间
     * @param unitId
     * @return
     */
    @RequestMapping("/findWeatherTime")
    public List findWeatherTime(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = weatherService.findWeatherTime(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
