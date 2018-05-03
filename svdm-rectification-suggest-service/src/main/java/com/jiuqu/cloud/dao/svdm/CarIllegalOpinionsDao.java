package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarIllegalOpinionsDao extends JpaRepository<SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity,Integer>{
    @Query(value = "SELECT * FROM svdm_busines_unit_car_diurnal_illegal_analysis_handling_opinions WHERE analysis_id=?1" ,nativeQuery = true)
    List<SvdmBusinesUnitCarDiurnalIllegalAnalysisHandlingOpinionsEntity> findCarIllegalOpinions(Integer analysisId);
}
