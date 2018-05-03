//package com.jiuqu.cloud.feign.svdm;
//
//
//import com.jiuqu.cloud.config.FeignConfig;
//import feign.Headers;
//import feign.hystrix.FallbackFactory;
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//@FeignClient(name = "count-service", configuration = FeignConfig.class, url = "${service.unit-url}", fallbackFactory = CountFeignClientFallbackFactory.class)
//@PropertySource("classpath:application.yml")
//public interface CountFeignClient {
//
//    @RequestMapping(value = "/search/businessUnitRisk/getCarBrandList",method = RequestMethod.POST/*,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE*/)
//    @Headers("Content-Type = application/json")
//     List  getCarBrandList(@RequestParam("id") Integer unitId);
//}
//
//@Component
//class CountFeignClientFallbackFactory implements FallbackFactory<CountFeignClient> {
//
//    @Override
//    public CountFeignClient create(Throwable cause) {
//        return new CountFeignClient(){
////            @Override
////            public SvdmBusinessUnitEntity findById(int id) {
////                SvdmBusinessUnitEntity unitEntity = new SvdmBusinessUnitEntity();
////                unitEntity.setId(-1);
////                return unitEntity;
////            }
//
//            @Override
//            public List getCarBrandList(Integer unitId){
//                return new ArrayList(unitId);
//            }
//        };
//    }
//}
