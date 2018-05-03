package com.jiuqu.cloud.controller.svdm.historyController.RoadController;

import com.jiuqu.cloud.service.svdm.history.RoadService.RoadDataDisplayHistoryService;
import com.jiuqu.cloud.service.svdm.realtime.RoadService.RoadDataDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/history/riskController")
public class RoadDataDisplayHistoryController {

    @Autowired
    RoadDataDisplayHistoryService roadDataDisplayHistoryService;

    /**
     * 道路情况数据展示
     * unit_id=？
     */

    @PostMapping(value = "/getHistoryRoadDataDisplay")
    public List getHistoryRoadDataDisplay(@RequestParam("unit_id")int id){
        try {
            List<Map<String,Object>> getlistRoadDataDisplay = roadDataDisplayHistoryService.listHistoryRoadDataDisplay(id);
            return getlistRoadDataDisplay;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
