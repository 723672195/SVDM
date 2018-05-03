package com.jiuqu.cloud.controller.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.UnitIllegalOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RefreshScope
public class UnitIllegalOpinionsController {
    @Autowired
    private UnitIllegalOpinionsService unitIllegalOpinionsService;

    /**
     * 公司日违法分析处理意见表
     * 根据分析表id查询处理意见
     * @param analysisId
     * @return
     */
    @RequestMapping("/findIllegalOpinions")
    public List findIllegalOpinions(@RequestParam("analysis_id") Integer analysisId){
        List<SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity> list = unitIllegalOpinionsService.findIllegalOpinions(analysisId);
        SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity s= list.get(0);
        String a = s.getHandlingOpinions();
        List handlingOpinions = new ArrayList();
        handlingOpinions.add(a);
        return handlingOpinions;
    }
}
