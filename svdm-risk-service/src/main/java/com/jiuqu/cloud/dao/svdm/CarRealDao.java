package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitCarAnalysisRealTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRealDao extends JpaRepository<SvdmBussinesUnitCarAnalysisRealTimeEntity,Integer>{
}
