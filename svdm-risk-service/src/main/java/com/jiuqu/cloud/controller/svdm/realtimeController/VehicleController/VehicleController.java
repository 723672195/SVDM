package com.jiuqu.cloud.controller.svdm.realtimeController.VehicleController;

import com.jiuqu.cloud.service.svdm.realtime.VehicleService.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    /**
     * 根据公司id查询车辆情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findVehicleAnalysis")
    public List findVehicleAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = vehicleService.findVehicleAnalysis(unitId);
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
    @RequestMapping("/findDynamicSystem")
    public List findDynamicSystem(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = vehicleService.findDynamicSystem(unitId);
            System.out.println(bussinessUnits);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }




}
