package com.jiuqu.cloud.service.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitCarDailyAnalysisHandlingOpinionsEntity;

import java.util.List;

public interface CarDailyOpinionsService {
    List<SvdmBussinesUnitCarDailyAnalysisHandlingOpinionsEntity> findCarDailyOpinions(Integer analysisId);
}
