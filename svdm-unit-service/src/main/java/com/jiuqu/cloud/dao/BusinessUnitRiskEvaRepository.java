package com.jiuqu.cloud.dao;

import com.jiuqu.cloud.pojo.SvdmBusinessUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessUnitRiskEvaRepository extends JpaRepository<SvdmBusinessUnitEntity,Integer>,JpaSpecificationExecutor<SvdmBusinessUnitEntity> {

}
