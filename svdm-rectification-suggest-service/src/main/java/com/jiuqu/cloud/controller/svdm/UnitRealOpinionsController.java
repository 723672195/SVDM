package com.jiuqu.cloud.controller.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitAnalysisRealTimeHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.UnitRealOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RefreshScope
public class UnitRealOpinionsController {
    @Autowired
    private UnitRealOpinionsService unitRealOpinionsService;

    /**
     * 公司实时分析处理意见表
     * 根据公司id查询处理意见
     * @param
     * @return
     */
    @RequestMapping("/findUnitRealOpinions")
    public List findUnitRealOpinions(@RequestParam("unit_id") Long unitId){
        try {
            List<Map<String,Object>>  bussinessUnits = unitRealOpinionsService.findUnitRealOpinions(unitId);
            return bussinessUnits;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
