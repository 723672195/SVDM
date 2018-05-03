package com.jiuqu.cloud.service.impl.svdm.history.WeatherServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.history.WeatherService.WeatherHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WeatherHistoryServiceImpl implements WeatherHistoryService{
    @Autowired
    BaseService baseService;
    @Override
    public List<Map<String, Object>> findWeatherHistoryAnalysis(Long unitId) {
        String sql ="SELECT\n" +
                "s.weather_data_analysis,\n" +
                "s.wicked_travel_time\n" +
                "FROM\n" +
                "single_unit_daily_analysis AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+"\n" +
                "ORDER BY\n" +
                "s.send_time ASC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    @Override
    public List<Map<String, Object>> findWeatherTimeHistory(Long unitId) {
        String sql = "SELECT\n" +
                "s.wicked_travel_time,\n" +
                "s.send_time\n"+
                "FROM\n" +
                "single_unit_daily_analysis AS s\n" +
                "WHERE\n" +
                "s.unit_id = "+unitId+"\n" +
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6\n";
        return baseService.find(sql);
    }
}
