package com.jiuqu.cloud.controller.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.CarIllegalOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RefreshScope
public class CarIllegalOpinionsController {
    @Autowired
    private CarIllegalOpinionsService carIllegalOpinionsService;
    @RequestMapping("/findCarIllegalOpinions")
    public List findCarIllegalOpinions(@RequestParam("analysis_id") Integer analysisId){
        List<SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity> list = carIllegalOpinionsService.findCarIllegalOpinions(analysisId);
        SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity s= list.get(0);
        String a = s.getHandlingOpinions();
        List handlingOpinions = new ArrayList();
        handlingOpinions.add(a);
        return handlingOpinions;
    }
}
