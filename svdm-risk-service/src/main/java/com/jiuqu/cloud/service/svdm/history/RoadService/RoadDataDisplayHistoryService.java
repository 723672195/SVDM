package com.jiuqu.cloud.service.svdm.history.RoadService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface RoadDataDisplayHistoryService {
    /**
     * 道路情况数据展示
     * unit_id=？
     */
    List<Map<String,Object>> listHistoryRoadDataDisplay(int id);
}
