package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitCarDailyAnalysisHandlingOpinionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarDailyOpinionsDao extends JpaRepository<SvdmBussinesUnitCarDailyAnalysisHandlingOpinionsEntity,Integer>{
    @Query(value ="SELECT * FROM svdm_bussines_unit_car_daily_analysis_handling_opinions WHERE analysis_id=?1",nativeQuery = true)
    List<SvdmBussinesUnitCarDailyAnalysisHandlingOpinionsEntity> findCarDailyOpinions(Integer analysisId);
}
