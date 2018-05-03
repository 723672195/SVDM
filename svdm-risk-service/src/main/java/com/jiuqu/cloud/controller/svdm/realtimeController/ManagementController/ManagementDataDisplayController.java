package com.jiuqu.cloud.controller.svdm.realtimeController.ManagementController;

import com.jiuqu.cloud.service.svdm.realtime.ManagementService.ManagementDataDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/ManagementController")
public class ManagementDataDisplayController {
    @Autowired
    ManagementDataDisplayService managementDataDisplayService;
    /**
     * 管理情况数据展示
     * unit_id=?
     */
    @PostMapping(value = "/getListManagementDataDisplay")
    public List getListManagementDataDisplay(@RequestParam("unit_id")int id){
        try {
            List<Map<String,Object>> getListManagementDataDisplay = managementDataDisplayService.listManagementDataDisplay(id);
            return getListManagementDataDisplay;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
