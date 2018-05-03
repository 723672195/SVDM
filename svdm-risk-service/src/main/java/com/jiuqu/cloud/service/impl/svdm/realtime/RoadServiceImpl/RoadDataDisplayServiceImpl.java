package com.jiuqu.cloud.service.impl.svdm.realtime.RoadServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.RoadService.RoadDataDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public class RoadDataDisplayServiceImpl implements RoadDataDisplayService {


    @Autowired
    BaseService baseService;
    /**
     * 道路情况数据展示
     * unit_id=？
     */
    @Override
    public List<Map<String, Object>> listRoadDataDisplay(int id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
            String sql ="SELECT\n" +
                    "single_historical_travel_record.travel_date AS RIQI,\n" +
                    "single_historical_travel_record.plate_no AS CHEPAIZHAO,\n" +
                    "single_historical_travel_record.travel_path AS XINGSHILUXIAN,\n" +
                    "single_historical_travel_record.ideal_duration AS YUQITIME,\n" +
                    "single_historical_travel_record.actual_duration AS SHIJITIME,\n" +
                    "single_historical_travel_record.time_difference AS SHIJIANCHA\n" +
                    "FROM\n" +
                    "single_historical_travel_record\n" +
                    "WHERE\n" +
                    "single_historical_travel_record.unit_id=\n" + id+
                    " AND single_historical_travel_record.travel_date >= "+"'"+sdf.format(new Date())+"'\n"+
                    "\tORDER BY\n" +
                    "RIQI DESC\n" +
                    "LIMIT 0,5";
            return baseService.find(sql);
    }
}
