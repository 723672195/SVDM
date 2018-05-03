package com.jiuqu.cloud.controller.RealTime;

import com.jiuqu.cloud.service.BusinessUnitRiskEvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/unit/unitController")
public class BusinessUnitRiskEvaController {

    @Autowired
    BusinessUnitRiskEvaService businessUnitRiskEvaService;

    /**
     * 获取公司列表
     */
    @RequestMapping(value = "/getBusinessUnitList")
    public Map getBusinessUnitList(@RequestParam Map<String,?> parameter) {
        try {
            Map param = new HashMap();
            param.put("province", (String)parameter.get("province"));
            param.put("city", (String)parameter.get("city"));
            param.put("district", (String)parameter.get("district"));
            param.put("yunshutype", (String)parameter.get("yunshutype"));
            PageRequest pageRequest = new PageRequest(Integer.valueOf(parameter.get("pageNumber").toString()), Integer.valueOf(parameter.get("size").toString()), null);

            Map businessUnits = businessUnitRiskEvaService.getBusinessUnitList(param,pageRequest);
            return businessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new HashMap();
        }
    }


    /**
     * 根据公司ID获得信息
     */
    @RequestMapping(value = "/getUnitList")
    public List getUnitList(@RequestParam("unit_id") int id) {

        try {
            List<Map<String,Object>>Units = businessUnitRiskEvaService.getUnitList(id);
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
    @RequestMapping(value = "/getRegionJson")
    public List getRegionJson() {
        try {
            List<Map<String,Object>>  regionJson = businessUnitRiskEvaService.getRegionJson();
            return regionJson;
        }catch (Exception e){
            e.printStackTrace();
            List list  = new ArrayList();
            list.add(-1);
            return list;
        }
    }
}


