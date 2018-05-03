package com.jiuqu.cloud.controller.svdm;

import com.alibaba.fastjson.JSON;
import com.jiuqu.cloud.feign.svdm.SuggestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/svdm/suggest")
public class SuggestController {
    @Autowired
    SuggestFeignClient suggestFeignClient;

    //sheet2界面，整改意见
    @RequestMapping(value = "/getSuggestOver",method = RequestMethod.POST)
    public String getSuggestOver(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map suggest =new HashMap();
        suggest.put("unit_id",unit_id);
        List unit = this.suggestFeignClient.findUnitRealOpinions(suggest);
        String u = JSON.toJSONString(unit);
        return u;
    }

}
