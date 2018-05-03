package com.jiuqu.cloud.feign.svdm;


import com.jiuqu.cloud.config.FeignConfig;
import com.jiuqu.cloud.pojo.svdm.SvdmBusinessUnitEntity;
import com.jiuqu.cloud.util.PageBean;
import feign.Headers;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@FeignClient(name = "unit-service", configuration = FeignConfig.class, url = "${service.unit-url}", fallbackFactory = UnitFeignClientFallbackFactory.class)
@PropertySource("classpath:application.yml")
public interface UnitFeignClient {

    //获取全部公司信息
    @RequestMapping(value = "/unit/unitController/getBusinessUnitList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public Map getUnitList(Map<String,?> map);
    //获取下拉列表地名
    @RequestMapping(value = "/unit/unitController/getRegionJson",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String  getRegionJson();
    //获取sheet2页面公司信息and sheet2_2页面的公司信息
    @RequestMapping(value = "/unit/unitController/getUnitList" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List getUnitListt(Map<String,?> map);


    //History,获取全部公司信息
    @RequestMapping(value = "/history/unitController/getHistoryBusinessUnitList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public Map getHistoryBusinessUnitList(Map<String,?> map);
}
@Component
class UnitFeignClientFallbackFactory implements FallbackFactory<UnitFeignClient> {

    @Override
    public UnitFeignClient create(Throwable cause) {
        return new UnitFeignClient() {
            @Override
            public String getRegionJson() {
                return "";
            }

            @Override
            public Map getUnitList(Map param){
                return new HashMap();
            }

            @Override
            public List getUnitListt(Map param){return new ArrayList();}

            @Override
            public Map getHistoryBusinessUnitList(Map param){return new HashMap();}


        };
    }
}
