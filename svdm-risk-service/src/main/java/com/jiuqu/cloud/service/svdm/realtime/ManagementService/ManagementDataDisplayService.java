package com.jiuqu.cloud.service.svdm.realtime.ManagementService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ManagementDataDisplayService {
    /**
     * 管理情况数据展示
     * unit_id = ？
     */
    List<Map<String,Object>> listManagementDataDisplay(int id);
}
