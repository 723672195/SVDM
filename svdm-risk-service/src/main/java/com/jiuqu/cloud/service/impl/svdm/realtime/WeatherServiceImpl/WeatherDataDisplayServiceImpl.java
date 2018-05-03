package com.jiuqu.cloud.service.impl.svdm.realtime.WeatherServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.WeatherService.WeatherDataDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WeatherDataDisplayServiceImpl implements WeatherDataDisplayService{

    @Autowired
    BaseService baseService;

    /**
     * 天气数据展示
     *
     */
    @Override
    public List<Map<String, Object>> listWeatherDataDisplay(int id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
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
                    " AND single_historical_travel_record.travel_date >= "+"'"+sdf.format(new Date())+"'\n"+
                    "\tORDER BY\n" +
                    "\tsingle_historical_travel_record.travel_date DESC\n" +
                    "LIMIT 0,5";
            return baseService.find(sql);
    }
}
