package com.jiuqu.cloud.controller.svdm;

import com.jiuqu.cloud.repository.SvdmBusinessUnitRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeDebug.map;


/**
 * @Author:jzh
 * @Description:
 * @Date:Created in 3:09 2018/1/10/010
 * @Modfied By:
 */


@RestController
@RequestMapping(value = "/search/businessUnitRisk")
public class SvdmBusinessUnitController {

    /*protected static Logger logger= LoggerFactory.getLogger(SvdmBusinessUnitController.class);*/

    @Autowired
    SvdmBusinessUnitRepository svdmBusinessUnitRepository;

    /**
     *
     * 获取 统计数据 ，一共八个
     * @return json;
     */

    @GetMapping("/getBusinessAllInfo")
        public Map getCountUnit( ) {



        Map<String,String> map= new HashMap();
    /* try{*/
        //货运公司
        Integer integer1 = svdmBusinessUnitRepository.CountFreight() ;

        //客运公司
        Integer integer2 = svdmBusinessUnitRepository.CountPassenger();

        //货运车辆
        Integer integer3 = svdmBusinessUnitRepository.CountCarFreight();

        //客运车辆
        Integer integer4 = svdmBusinessUnitRepository.CountCarPassenger();

        //运输能力
        Integer integer5 = svdmBusinessUnitRepository.CountFreightCarAbility();

        //客运能力
        Integer integer6 = svdmBusinessUnitRepository.CountPassengerCarAbility();

        //货运驾驶人
        Integer integer7 = (int) Math.ceil(integer3*1.6);
        //客运驾驶人
        Integer integer8 = (int) Math.ceil(integer4*1.6);

/*
        //货运驾驶人
        Integer integer7 = svdmBusinessUnitRepository.CountCarFreightPersen();

        //客运驾驶人
        Integer integer8 = svdmBusinessUnitRepository.CountCarPassengerPersen();
*/

        //后台输出
        System.out.println("货运公司:"+integer1);
        System.out.println("客运公司:"+integer2);
        System.out.println("货运车辆:"+integer3+"辆");
        System.out.println("客运车辆:"+integer4+"辆");
        System.out.println("运输能力:"+integer5+"吨");
        System.out.println("客运能力:"+integer6);
        System.out.println("货运驾驶人:"+integer7+"人");
        System.out.println("客运驾驶人:"+integer8+"人");

        //map传值

        map.put("huoyungongsi",integer1+"");
        map.put("keyungongsi",integer2+"");
        map.put("huoyuncheliang",integer3+"辆");
        map.put("keyuncheliang",integer4+"辆");
        map.put("yunshunengli",integer5+"吨");
        map.put("keyunnengli",integer6+"");
        map.put("huoyunjiashiren",integer7+"人");
        map.put("keyunjiashiren",integer8+"人");
        map.put("msg","success");

        return map;
  /*   }catch (Exception e){
        logger.error(e.getMessage());
     }
        map.put("msg","err");
        return null;*/
    }

    /**
     * 根据公司id获得所有车牌号
     */

    @RequestMapping(value ="/getCarBrandList",method = RequestMethod.POST)
    public List carBrandList(@RequestParam("id") int id){
        return svdmBusinessUnitRepository.getCarbrandList(id);
    }
}
