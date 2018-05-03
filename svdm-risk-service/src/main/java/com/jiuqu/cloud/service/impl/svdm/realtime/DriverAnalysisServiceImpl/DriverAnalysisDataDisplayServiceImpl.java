package com.jiuqu.cloud.service.impl.svdm.realtime.DriverAnalysisServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.DriverAnalysisService.DriverAnalysisDataDisplayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DriverAnalysisDataDisplayServiceImpl implements DriverAnalysisDataDisplayService {


    @Autowired
    BaseService baseService;

    /**
     * 驾驶人员数据展示1
     */

    @Override
    public List<Map<String, Object>> listDriverAnalysisDataDisplay1(int id) {
        String sql ="SELECT\n" +
                "\tsingle_search_illegal_detail.search_illegal_datetime AS WEIFATIME,\n" +
                "\tsingle_search_illegal_detail.search_illegal_address AS WEIFADIDIAN,\n" +
                "\tsingle_search_illegal_detail.search_illegal_behaviour AS WEIFAXINGWEI\n" +
                "FROM\n" +
                "\tsingle_search_illegal_detail\n" +
                "WHERE\n" +
                "\tsingle_search_illegal_detail.search_carno IN (\n" +
                "\t\tSELECT\n" +
                "\t\t\tsingle_unit_car.car_license_plate\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit_car\n" +
                "\t\tWHERE\n" +
                "\t\t\tsingle_unit_car.unit_id = " +id+
                "\t)\n" +
                "ORDER BY\n" +
                "\tWEIFATIME DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);
    }


    /**
     * 驾驶人员数据展示1
     * unit_id=？
     */

    @Override
    public List<Map<String, Object>> listDriverAnalysisDataDisplay2(int id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "single_historical_warning_data.send_time AS TIME,\n" +
                "single_historical_warning_data.velocity AS SUDU,\n" +
                "single_historical_warning_data.location AS DIDIAN,\n" +
                "single_historical_warning_data.type AS LEIXING\n" +
                "FROM\n" +
                "single_historical_warning_data\n" +
                "WHERE\n" +
                "single_historical_warning_data.unit_id = "+id +
                " AND single_historical_warning_data.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "\t ORDER BY\n" +
                "single_historical_warning_data.send_time DESC\n" +
                "LIMIT 0,5";
        return baseService.find(sql);

    }

}
