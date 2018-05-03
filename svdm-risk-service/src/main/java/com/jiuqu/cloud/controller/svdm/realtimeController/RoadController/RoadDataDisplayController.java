package com.jiuqu.cloud.controller.svdm.realtimeController.RoadController;

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
@RequestMapping(value = "/RoadController")
public class RoadDataDisplayController {

    @Autowired
    RoadDataDisplayService roadDataDisplayService;

    /**
     * 道路情况数据展示
     * unit_id=？
     */

    @PostMapping(value = "/getListRoadDataDisplay")
    public List listRoadDataDisplay(@RequestParam("unit_id")int id){
        try {
            List<Map<String,Object>> getlistRoadDataDisplay = roadDataDisplayService.listRoadDataDisplay(id);
            return getlistRoadDataDisplay;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
