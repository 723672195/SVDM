package com.jiuqu.cloud.controller.svdm;

import com.jiuqu.cloud.feign.svdm.CountFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;


@RestController
@RequestMapping(value = "/svdm/count")
public class CountController {

    @Autowired
    CountFeignClient countFeignClient;


    @RequestMapping(value = "/CountUnit",method = RequestMethod.POST)
    public Map getCountUnit( ) {
        Map CountUntil = this.countFeignClient.getCountUnit();
        return CountUntil;
    }
}
