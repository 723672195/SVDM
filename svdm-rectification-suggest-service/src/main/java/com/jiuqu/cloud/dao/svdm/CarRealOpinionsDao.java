package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitCarAnalysisRealTimeHandlingOpinionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRealOpinionsDao extends JpaRepository<SvdmBussinesUnitCarAnalysisRealTimeHandlingOpinionsEntity,Integer>{
    @Query(value = "SELECT * FROM svdm_bussines_unit_car_analysis_real_time_handling_opinions WHERE analysis_id=?1",nativeQuery = true)
    List<SvdmBussinesUnitCarAnalysisRealTimeHandlingOpinionsEntity> findCarRealOpinions(Integer analysisId);
}
