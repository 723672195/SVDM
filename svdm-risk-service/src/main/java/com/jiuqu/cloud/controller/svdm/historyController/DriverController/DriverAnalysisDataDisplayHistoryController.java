package com.jiuqu.cloud.controller.svdm.historyController.DriverController;

import com.jiuqu.cloud.service.svdm.history.DriverService.DriverAnalysisDataDisplayHistoryService;
import com.jiuqu.cloud.service.svdm.realtime.DriverAnalysisService.DriverAnalysisDataDisplayService;
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
public class DriverAnalysisDataDisplayHistoryController {

    @Autowired
    DriverAnalysisDataDisplayHistoryService driverAnalysisDataDisplayHistoryService;
    /**
     * 驾驶人员数据展示1
     * unit_id=？
     */

    @PostMapping(value = "/getHistoryDriverAnalysisDataDisplay1")
    public List getHistoryDriverAnalysisDataDisplay1(@RequestParam("unit_id")int id ){
        try {
            List<Map<String,Object>> getList1 = driverAnalysisDataDisplayHistoryService.listHistoryDriverAnalysisDataDisplay1(id);
            return getList1;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 驾驶人员数据展示2
     * unit_id=？
     */
    @PostMapping(value = "/getHistoryDriverAnalysisDataDisplay2")
    public List getHistoryDriverAnalysisDataDisplay2(@RequestParam("unit_id")int id ){
        try {
            List<Map<String,Object>> getList2 = driverAnalysisDataDisplayHistoryService.listHistoryDriverAnalysisDataDisplay2(id);
            return getList2;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

}
