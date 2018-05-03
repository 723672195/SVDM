package com.jiuqu.cloud.service.svdm.history.ManagementService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ManagementDataDisplayHistoryService {
    /**
     * 管理情况数据展示
     * unit_id = ？
     */
    List<Map<String,Object>> listHistoryManagementDataDisplay(int id);
}
