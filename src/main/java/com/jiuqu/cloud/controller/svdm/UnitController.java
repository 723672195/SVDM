package com.jiuqu.cloud.controller.svdm;

import com.alibaba.fastjson.JSON;
import com.jiuqu.cloud.controller.base.BaseController;
import com.jiuqu.cloud.feign.svdm.UnitFeignClient;
import com.jiuqu.cloud.util.ConvertJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/svdm/unit")
public class UnitController extends BaseController {

    @Autowired
    UnitFeignClient unitFeignClient;

    //通过传省市县地址来获取城市列表
    @RequestMapping(value = "/findUnitAll")
    public String getBusinessUnitCarList(){
        String data = "";
        try {
            Map parameter = getParameterByPage();
            if(parameter != null){

                parameter.put("province",parameter.get("province"));
                parameter.put("city",parameter.get("city"));
                parameter.put("district",parameter.get("district"));
                Map unitList = this.unitFeignClient.getUnitList(parameter);
                Integer counts = Integer.valueOf(unitList.get("counts").toString());
                List content = (List)((Map)unitList.get("page")).get("content");
                data= ConvertJson.DataGrid(content,counts,"yyyy-MM-dd");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    //获取下拉菜单省市县列表
    @RequestMapping(value = "/getRegionJson",method = RequestMethod.POST)
    public String getRegionJson() {
        String getAddress = this.unitFeignClient.getRegionJson();
//        String add = JSON.toJSONString(getAddress);
        return getAddress;
    }

    //获取Sheet2页面一开始的公司信息
    @RequestMapping(value = "/getCompanyInfo",method = RequestMethod.POST)
    public String getCompanyInfo(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map company =new HashMap();
        company.put("unit_id",unit_id);
        List info = this.unitFeignClient.getUnitListt(company);
        String c = JSON.toJSONString(info);
        return c;
    }



    //通过传省市县地址来获取城市列表
    @RequestMapping(value = "/findHistoryUnitAll")
    public String getHistoryBusinessUnitList(){
        String data = "";
        try {
            Map parameter = getParameterByPage();
            if(parameter != null){

                parameter.put("province",parameter.get("province"));
                parameter.put("city",parameter.get("city"));
                parameter.put("district",parameter.get("district"));
                Map unitList = this.unitFeignClient.getHistoryBusinessUnitList(parameter);
                Integer counts = Integer.valueOf(unitList.get("counts").toString());
                List content = (List)((Map)unitList.get("page")).get("content");
                data= ConvertJson.DataGrid(content,counts,"yyyy-MM-dd");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return data;
    }

}

