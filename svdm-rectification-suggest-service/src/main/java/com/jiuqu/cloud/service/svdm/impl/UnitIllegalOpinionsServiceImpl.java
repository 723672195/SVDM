package com.jiuqu.cloud.service.svdm.impl;

import com.jiuqu.cloud.dao.svdm.UnitIllegalOpinionsDao;
import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.UnitIllegalOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UnitIllegalOpinionsServiceImpl implements UnitIllegalOpinionsService{
    @Autowired
    private UnitIllegalOpinionsDao unitIllegalOpinionsDao;
    @Override
    public List<SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity> findIllegalOpinions(Integer analysisId) {
        return unitIllegalOpinionsDao.findIllegalOpinions(analysisId);
    }
}
