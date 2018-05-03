package com.jiuqu.cloud.controller.svdm.realtimeController;

import com.jiuqu.cloud.service.svdm.realtime.CarRealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CarRealController {
    @Autowired
    private CarRealService carRealService;
//    @Autowired
//    CountFeignClient countFeignClient;



    /**
     * 根据公司id查询车牌号及RAL
     * @param unitId
     * @return
     */
    @RequestMapping("/findUnitRAL")
    public List findUnitRAL(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = carRealService.findCarRealRAL(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
