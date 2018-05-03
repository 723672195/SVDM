package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UnitIllegalOpinionsDao extends JpaRepository<SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity,Integer>{
    @Query(value = "SELECT * FROM svdm_busines_unit_diurnal_illegal_analysis_handling_opinions WHERE analysis_id=?1" ,nativeQuery = true)
    List<SvdmBusinesUnitDiurnalIllegalAnalysisHandlingOpinionsEntity> findIllegalOpinions(Integer analysisId);
}
