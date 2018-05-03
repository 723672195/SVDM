package com.jiuqu.cloud.controller.svdm.historyController.WeatherController;

import com.jiuqu.cloud.service.svdm.history.WeatherService.WeatherHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/history/riskController")
public class WeatherHistoryController {
    @Autowired
    private WeatherHistoryService weatherHistoryService;
    /**
     * 根据公司id查询天气情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findWeatherHistoryAnalysis")
    public List findWeatherHistoryAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = weatherHistoryService.findWeatherHistoryAnalysis(unitId);
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
    @RequestMapping("/findWeatherTimeHistory")
    public List findWeatherTimeHistory(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = weatherHistoryService.findWeatherTimeHistory(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
