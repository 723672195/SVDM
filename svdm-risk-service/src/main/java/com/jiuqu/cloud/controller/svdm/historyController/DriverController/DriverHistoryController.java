package com.jiuqu.cloud.controller.svdm.historyController.DriverController;

import com.jiuqu.cloud.service.svdm.history.DriverService.DriverHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/history/riskController")
public class DriverHistoryController {
    @Autowired
    private DriverHistoryService driverHistoryService;
    /**
     * 根据公司id查询驾驶人员下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findDriverHistoryAnalysis")
    public List findDriverHistoryAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = driverHistoryService.findDriverHistoryAnalysis(unitId);
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
    @RequestMapping("/findOverSpeedHistoryDriving")
    public List findOverSpeedHistoryDriving(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = driverHistoryService.findOverSpeedHistoryDriving(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
