package com.jiuqu.cloud.service.svdm.impl;

import com.jiuqu.cloud.dao.svdm.UnitDailyOpinionsDao;
import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.UnitDailyOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UnitDailyOpinionsServiceImpl implements UnitDailyOpinionsService{
    @Autowired
    private UnitDailyOpinionsDao unitDailyOpinionsDao;
    @Override
    public List<SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity> findUnitDailyOpinions(Integer analysisId) {
        return unitDailyOpinionsDao.findUnitDailyOpinions(analysisId);
    }
}
