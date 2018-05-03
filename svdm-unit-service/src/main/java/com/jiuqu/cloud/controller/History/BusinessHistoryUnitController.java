package com.jiuqu.cloud.controller.History;

import com.jiuqu.cloud.service.History.BusinessHistoryUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/history/unitController")
public class BusinessHistoryUnitController {
    @Autowired
    BusinessHistoryUnitService businessHistoryUnitService;

    /**
     * 获取公司列表
     */
    @RequestMapping(value = "/getHistoryBusinessUnitList")
    public Map getHistoryBusinessUnitList(@RequestParam Map<String,?> parameter) {
        try {
            Map param = new HashMap();
            param.put("province", (String)parameter.get("province"));
            param.put("city", (String)parameter.get("city"));
            param.put("district", (String)parameter.get("district"));
            PageRequest pageRequest = new PageRequest(Integer.valueOf(parameter.get("pageNumber").toString()), Integer.valueOf(parameter.get("size").toString()), null);

            Map businessUnits = businessHistoryUnitService.getHistoryBusinessUnitList(param,pageRequest);
            return businessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new HashMap();
        }
    }


    /**
     * 根据公司ID获得信息
     */
    @RequestMapping(value = "/getHistoryUnitList")
    public List getHistoryUnitList(@RequestParam("unit_id") int id) {

        try {
            List<Map<String,Object>>Units = businessHistoryUnitService.getHistoryUnitList(id);
            return Units;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }


    //下拉选单
    /**
     * 获取城市列表
     */
    @RequestMapping(value = "/getHistoryRegionJson")
    public List getHistoryRegionJson() {
        try {
            List<Map<String,Object>>  regionJson = businessHistoryUnitService.getHistoryRegionJson();
            return regionJson;
        }catch (Exception e){
            e.printStackTrace();
            List list  = new ArrayList();
            list.add(-1);
            return list;
        }
    }
}
