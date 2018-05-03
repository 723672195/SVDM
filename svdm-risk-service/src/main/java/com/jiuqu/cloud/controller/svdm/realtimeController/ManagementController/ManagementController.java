package com.jiuqu.cloud.controller.svdm.realtimeController.ManagementController;

import com.jiuqu.cloud.service.svdm.realtime.ManagementService.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ManagementController {
    @Autowired
    private ManagementService managementService;

    /**
     * 根据公司id查询管理情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findManagement")
    public List findManagement(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = managementService.findManagement(unitId);
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
    @RequestMapping("/findVehicleManagement")
    public List findVehicleManagement(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits =managementService.findVehicleManagement(unitId);
            System.out.println(bussinessUnits);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

}
