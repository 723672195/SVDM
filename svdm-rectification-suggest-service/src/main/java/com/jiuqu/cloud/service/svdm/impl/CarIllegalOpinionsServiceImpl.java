package com.jiuqu.cloud.service.svdm.impl;

import com.jiuqu.cloud.dao.svdm.CarIllegalOpinionsDao;
import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity;
import com.jiuqu.cloud.service.svdm.CarIllegalOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarIllegalOpinionsServiceImpl implements CarIllegalOpinionsService{
    @Autowired
    private CarIllegalOpinionsDao carIllegalOpinionsDao;
    @Override
    public List<SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity> findCarIllegalOpinions(Integer analysisId) {
        return carIllegalOpinionsDao.findCarIllegalOpinions(analysisId);
    }
}
