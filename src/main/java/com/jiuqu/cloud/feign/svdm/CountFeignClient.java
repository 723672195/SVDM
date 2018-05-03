package com.jiuqu.cloud.feign.svdm;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.HashMap;
import java.util.Map;

@FeignClient(name = "count-service",url = "${service.count-url}",fallbackFactory = CountFeignClientFallbackFactory.class)
@PropertySource("classpath:application.yml")
public interface CountFeignClient {
    @RequestMapping(value = "/search/businessUnitRisk/getBusinessAllInfo", method = RequestMethod.GET)
    public Map getCountUnit();
}

@Component
class CountFeignClientFallbackFactory implements FallbackFactory<CountFeignClient> {
    @Override
    public CountFeignClient create(Throwable throwable) {
        return new CountFeignClient()  {
            @Override
            public Map getCountUnit( ){
                return new HashMap();
            }
        };
    }
}
