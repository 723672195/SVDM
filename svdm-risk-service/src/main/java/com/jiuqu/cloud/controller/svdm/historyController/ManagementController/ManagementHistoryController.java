package com.jiuqu.cloud.controller.svdm.historyController.ManagementController;

import com.jiuqu.cloud.service.svdm.history.ManagementService.ManagementHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/history/riskController")
public class ManagementHistoryController {
    @Autowired
    private ManagementHistoryService managementHistoryService;

    /**
     * 根据公司id查询管理情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findManagementHistory")
    public List findManagementHistory(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = managementHistoryService.findManagementHistory(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 根据公司id查询管理情况折线图的数据
     * @param unitId
     * @return
     */
    @RequestMapping("/findVehicleManagementHistory")
    public List findVehicleManagementHistory(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits =managementHistoryService.findVehicleManagementHistory(unitId);
            System.out.println(bussinessUnits);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
