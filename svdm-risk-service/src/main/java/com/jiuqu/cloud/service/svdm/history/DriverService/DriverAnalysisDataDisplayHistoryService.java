package com.jiuqu.cloud.service.svdm.history.DriverService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface DriverAnalysisDataDisplayHistoryService {
    /**
     * 驾驶人员数据展示1
     */
    List<Map<String,Object>> listHistoryDriverAnalysisDataDisplay1(int id);
    /**
     * 驾驶人员数据展示1
     * unit_id=？
     */
    List<Map<String,Object>> listHistoryDriverAnalysisDataDisplay2(int id);

}
