package com.jiuqu.cloud.service.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity;

import java.util.List;

public interface CarIllegalOpinionsService {
    List<SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity> findCarIllegalOpinions(Integer analysisId);
}
