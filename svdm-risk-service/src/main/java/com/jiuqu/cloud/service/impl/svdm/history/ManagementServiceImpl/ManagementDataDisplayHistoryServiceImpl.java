package com.jiuqu.cloud.service.impl.svdm.history.ManagementServiceImpl;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.history.ManagementService.ManagementDataDisplayHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ManagementDataDisplayHistoryServiceImpl implements ManagementDataDisplayHistoryService {

    @Autowired
    BaseService baseService;

    /**
     * 管理情况数据展示
     * unit_id = ？
     */
    @Override
    public List<Map<String, Object>> listHistoryManagementDataDisplay(int id) {
        String sql = "SELECT\n" +
                "                single_historical_travel_record.travel_date AS RIQI,\n" +
                "                single_historical_travel_record.plate_no AS CHEPAIZHAOHAO,\n" +
                "                single_historical_travel_record.travel_path AS XINGSHILUXIAN\n" +
                "                \n" +
                "                \n" +
                "                FROM `single_historical_travel_record`\n" +
                "                WHERE\n" +
                "                single_historical_travel_record.type = 2 AND\n" +
                "                single_historical_travel_record.unit_id=" + id +
                "                ORDER BY\n" +
                "                single_historical_travel_record.travel_date DESC";
        return baseService.find(sql);
    }
}