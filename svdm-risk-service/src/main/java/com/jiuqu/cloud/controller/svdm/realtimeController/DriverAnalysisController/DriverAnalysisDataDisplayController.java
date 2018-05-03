package com.jiuqu.cloud.controller.svdm.realtimeController.DriverAnalysisController;

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
@RequestMapping(value = "/SvdmAnalyzeDataController")
public class DriverAnalysisDataDisplayController {

    @Autowired
    DriverAnalysisDataDisplayService driverAnalysisDataDisplayService;
    /**
     * 驾驶人员数据展示1
     * unit_id=？
     */

    @PostMapping(value = "/getListDriverAnalysisDataDisplay1")
    public List getListDriverAnalysisDataDisplay1(@RequestParam("unit_id")int id ){
        try {
            List<Map<String,Object>> getList1 = driverAnalysisDataDisplayService.listDriverAnalysisDataDisplay1(id);
            return getList1;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

    /**
     * 驾驶人员数据展示1
     * unit_id=？
     */
    @PostMapping(value = "/getListDriverAnalysisDataDisplay2")
    public List getListDriverAnalysisDataDisplay2(@RequestParam("unit_id")int id ){
        try {
            List<Map<String,Object>> getList2 = driverAnalysisDataDisplayService.listDriverAnalysisDataDisplay2(id);
            return getList2;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }

}
