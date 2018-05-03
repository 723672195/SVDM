package com.jiuqu.cloud.service.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity;

import java.util.List;

public interface UnitDailyOpinionsService {
    List<SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity> findUnitDailyOpinions(Integer analysisId);
}
