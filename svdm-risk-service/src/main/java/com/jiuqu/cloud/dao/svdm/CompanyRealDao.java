package com.jiuqu.cloud.dao.svdm;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitAnalysisRealTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRealDao extends JpaRepository<SvdmBussinesUnitAnalysisRealTimeEntity,Integer>,JpaSpecificationExecutor<SvdmBussinesUnitAnalysisRealTimeEntity> {



}
