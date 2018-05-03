package com.jiuqu.cloud.service.impl.svdm;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.UnitRealOpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UnitRealOpinionsServiceImpl implements UnitRealOpinionsService {
    @Autowired
    BaseService baseService;
    @Override
    public List<Map<String, Object>> findUnitRealOpinions(Long unitId) {
        String sql="SELECT\n" +
                "\td.handling_opinions\n" +
                "FROM\n" +
                "\tsingle_unit_analysis_real_time_handling_opinions AS d\n" +
                "WHERE\n" +
                "\td.analysis_id = (\n" +
                "\t\tSELECT\n" +
                "\t\t\ts.id\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit_analysis_real_time AS s\n" +
                "\t\tWHERE\n" +
                "\t\t\ts.unit_id = "+unitId+"\n" +
                "\t\tORDER BY\n" +
                "\t\t\ts.send_time DESC\n" +
                "\t\tLIMIT 0,\n" +
                "\t\t1\n" +
                "\t)";
        return baseService.find(sql);
    }
}
