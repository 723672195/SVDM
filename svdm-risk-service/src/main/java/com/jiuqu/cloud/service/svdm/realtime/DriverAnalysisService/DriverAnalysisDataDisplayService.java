package com.jiuqu.cloud.service.svdm.realtime.DriverAnalysisService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface DriverAnalysisDataDisplayService {
    /**
     * 驾驶人员数据展示1
     */
    List<Map<String,Object>> listDriverAnalysisDataDisplay1(int id);
    /**
     * 驾驶人员数据展示1
     * unit_id=？
     */
    List<Map<String,Object>> listDriverAnalysisDataDisplay2(int id);

}
