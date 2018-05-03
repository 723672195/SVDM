package com.jiuqu.cloud.service.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitAnalysisRealTimeHandlingOpinionsEntity;

import java.util.List;
import java.util.Map;

public interface UnitRealOpinionsService {
    List<Map<String,Object>> findUnitRealOpinions(Long unitId);
}
