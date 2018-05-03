package com.jiuqu.cloud.controller.svdm.historyController.VehicleController;

import com.jiuqu.cloud.service.svdm.history.VehicleService.VehicleHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/history/riskController")
public class VehicleHistoryController {
    @Autowired
    private VehicleHistoryService vehicleHistoryService;

    /**
     * 根据公司id查询车辆情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findVehicleHistoryAnalysis")
    public List findVehicleHistoryAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = vehicleHistoryService.findVehicleHistoryAnalysis(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 根据公司id查询车辆折线图数据
     * @param unitId
     * @return
     */
    @RequestMapping("/findDynamicSystemHistory")
    public List findDynamicSystemHistory(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = vehicleHistoryService.findDynamicSystemHistory(unitId);
            System.out.println(bussinessUnits);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
