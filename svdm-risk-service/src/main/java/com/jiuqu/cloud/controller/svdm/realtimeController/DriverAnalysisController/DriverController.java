package com.jiuqu.cloud.controller.svdm.realtimeController.DriverAnalysisController;

import com.jiuqu.cloud.service.svdm.realtime.DriverAnalysisService.DriverAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DriverController {
    @Autowired
    private DriverAnalysisService driverAnalysisService;

    /**
     * 根据公司id查询驾驶人员下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findDriverAnalysis")
    public List findDriverAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = driverAnalysisService.findDriverAnalysis(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 根据公司id查询柱状图的数据
     * @param unitId
     * @return
     */
    @RequestMapping("/findOverSpeedDriving")
    public List findOverSpeedDriving(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = driverAnalysisService.findOverSpeedDriving(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }



}
