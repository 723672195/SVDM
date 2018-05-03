package com.jiuqu.cloud.service.svdm.realtime;

import com.jiuqu.cloud.pojo.svdm.SvdmBussinesUnitAnalysisRealTimeEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public interface CompanyRealService {
   /* List<Object> findUnitAll(Integer unitId);*/
   List<Map<String,Object>> findUnitAll(Long unitId);
   List findUnitAnalysis(Long unitId);


}
