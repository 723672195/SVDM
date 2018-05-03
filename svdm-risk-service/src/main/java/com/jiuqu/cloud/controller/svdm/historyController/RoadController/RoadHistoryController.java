package com.jiuqu.cloud.controller.svdm.historyController.RoadController;

import com.jiuqu.cloud.service.svdm.history.RoadService.RoadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/history/riskController")
public class RoadHistoryController {
    @Autowired
    private RoadHistoryService roadHistoryService;

    /**
     * 根据公司id查询道路情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findRoadHistoryAnalysis")
    public List findRoadHistoryAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = roadHistoryService.findRoadHistoryAnalysis(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 根据公司id查询道路折线图数据
     * @param unitId
     * @return
     */
    @RequestMapping("/findAverageElevationHistory")
    public List findAverageElevationHistory(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits =roadHistoryService.findAverageElevationHistory(unitId);
            System.out.println(bussinessUnits);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }





}
