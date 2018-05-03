package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UnitDailyOpinionsDao extends JpaRepository<SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity,Integer>{
    @Query(value = "SELECT * FROM svdm_bussines_unit_daily_analysis_handling_opinions WHERE analysis_id=?1" ,nativeQuery = true)
    List<SvdmBussinesUnitDailyAnalysisHandlingOpinionsEntity> findUnitDailyOpinions(Integer analysisId);
}
