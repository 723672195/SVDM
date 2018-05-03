package com.jiuqu.cloud.controller.svdm.realtimeController.RoadController;

import com.jiuqu.cloud.service.svdm.realtime.RoadService.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class RoadController {
    @Autowired
    private RoadService roadService;

    /**
     * 根据公司id查询道路情况下小分类的分析值
     * @param unitId
     * @return
     */
    @RequestMapping("/findRoadAnalysis")
    public List findRoadAnalysis(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = roadService.findRoadAnalysis(unitId);
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
    @RequestMapping("/findAverageElevation")
    public List findAverageElevation(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits =roadService.findAverageElevation(unitId);
            System.out.println(bussinessUnits);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }





}
