package com.jiuqu.cloud.service.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitCarAnalysisRealTimeHandlingOpinionsEntity;

import java.util.List;

public interface CarRealOpinionsService {
    List<SvdmBussinesUnitCarAnalysisRealTimeHandlingOpinionsEntity> findCarRealOpinions(Integer analysisId);
}
