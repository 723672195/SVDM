package com.jiuqu.cloud.service.impl.svdm.history.WeatherServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.history.WeatherService.WeatherDataDisplayHistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WeatherDataDisplayHistoryServiceImpl implements WeatherDataDisplayHistoryService {

    @Autowired
    BaseService baseService;

    /**
     * 天气数据展示
     *
     */
    @Override
    public List<Map<String, Object>> listHistoryWeatherDataDisplay(int id) {
            String sql ="SELECT\n" +
                    "\tsingle_historical_travel_record.travel_date AS RIQI,\n" +
                    "\tsingle_historical_travel_record.plate_no AS CHEPAIZHAOHAO,\n" +
                    "\tsingle_historical_travel_record.travel_path AS XINGSHILUXIAN,\n" +
                    "\tsingle_historical_travel_record.actual_duration AS SHIJITIME,\n" +
                    "\tsingle_historical_travel_record.weather AS TIANQI\n" +
                    "FROM\n" +
                    "\t`single_historical_travel_record`\n" +
                    "WHERE\n" +
                    "\tsingle_historical_travel_record.type = 2\n" +
                    "AND single_historical_travel_record.unit_id =" +id+
                    "\tORDER BY\n" +
                    "\tsingle_historical_travel_record.travel_date DESC\n" +
                    "LIMIT 0,5";
            return baseService.find(sql);
    }
}
