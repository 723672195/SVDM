package com.jiuqu.cloud.service.svdm.impl;

import com.jiuqu.cloud.dao.svdm.CarDailyOpinionsDao;
import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitCarDailyAnalysisHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.CarDailyOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDailyOpinionsServiceImpl implements CarDailyOpinionsService{
    @Autowired
    private CarDailyOpinionsDao carDailyOpinionsDao;
    @Override
    public List<SvdmBussinesUnitCarDailyAnalysisHandlingOpinionsEntity> findCarDailyOpinions(Integer analysisId) {
        return carDailyOpinionsDao.findCarDailyOpinions(analysisId);
    }
}
