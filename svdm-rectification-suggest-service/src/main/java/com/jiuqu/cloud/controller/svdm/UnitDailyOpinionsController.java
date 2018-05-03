package com.jiuqu.cloud.controller.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.UnitDailyOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RefreshScope
public class UnitDailyOpinionsController {
    @Autowired
    private UnitDailyOpinionsService unitDailyOpinionsService;

    /**
     * 公司日分析处理意见表
     * 根据分析表id查询处理意见
     * @param analysisId
     * @return
     */
    @RequestMapping("/findUnitDailyOpinions")
    public List findUnitDailyOpinions(@RequestParam("analysis_id") Integer analysisId){
        List<SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity> list = unitDailyOpinionsService.findUnitDailyOpinions(analysisId);
        SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity s = list.get(0);
        String a = s.getHandlingOpinions();
        List handlingOpinions = new ArrayList();
        handlingOpinions.add(a);
        return handlingOpinions;
    }
}
