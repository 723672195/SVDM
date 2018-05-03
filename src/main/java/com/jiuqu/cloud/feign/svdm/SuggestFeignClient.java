package com.jiuqu.cloud.feign.svdm;


import feign.Headers;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@FeignClient(name = "rectification-suggest-service",url = "${service.suggest-url}",fallbackFactory = SuggestFeignClientFallbackFactory.class)
@PropertySource("classpath:application.yml")
public interface SuggestFeignClient {

    //sheet2界面，整改意见
    @RequestMapping(value = "/findUnitRealOpinions",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findUnitRealOpinions(Map<String,?> map);
}

@Component
class SuggestFeignClientFallbackFactory implements FallbackFactory<SuggestFeignClient> {
    @Override
    public SuggestFeignClient create(Throwable cause) {
        return new SuggestFeignClient() {
            @Override
            public List findUnitRealOpinions(Map param){
                return new ArrayList();
            }
        };
    }
}
