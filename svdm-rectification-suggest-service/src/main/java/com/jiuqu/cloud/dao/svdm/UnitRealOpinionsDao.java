package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitAnalysisRealTimeHandlingOpinionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRealOpinionsDao extends JpaRepository<SvdmBussinesUnitAnalysisRealTimeHandlingOpinionsEntity,Integer>{
}
