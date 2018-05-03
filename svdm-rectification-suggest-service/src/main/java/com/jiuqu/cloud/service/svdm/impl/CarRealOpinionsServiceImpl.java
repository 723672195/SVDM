package com.jiuqu.cloud.service.svdm.impl;

import com.jiuqu.cloud.dao.svdm.CarRealOpinionsDao;
import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitCarAnalysisRealTimeHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.CarRealOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRealOpinionsServiceImpl implements CarRealOpinionsService{
    @Autowired
    private CarRealOpinionsDao carRealOpinionsDao;
    @Override
    public List<SvdmBussinesUnitCarAnalysisRealTimeHandlingOpinionsEntity> findCarRealOpinions(Integer analysisId) {
        return carRealOpinionsDao.findCarRealOpinions(analysisId);
    }
}
