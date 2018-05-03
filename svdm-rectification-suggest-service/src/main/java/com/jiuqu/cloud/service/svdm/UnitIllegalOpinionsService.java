package com.jiuqu.cloud.service.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity;
import java.util.List;

public interface UnitIllegalOpinionsService {
    List<SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity> findIllegalOpinions(Integer analysisId);
}
