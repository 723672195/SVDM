package com.jiuqu.cloud.service.impl.svdm.realtime;

import com.jiuqu.cloud.service.base.BaseService;
import com.jiuqu.cloud.service.svdm.realtime.CarRealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class CarRealServiceImpl implements CarRealService{

    @Autowired
    BaseService baseService;

    @Override
    public List<Map<String, Object>> findCarRealRAL(Long  unitId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT \n" +
                "\tsingle_unit_car.car_license_plate AS car_number,\n" +
                "\tMAX(single_unit_car_analysis_real_time.id ),\n" +
                "\tsingle_unit_car_analysis_real_time.rai_count,\n" +
                "\tsingle_unit_car_analysis_real_time.risk_grade\n" +
                "FROM\n" +
                "\tsingle_unit_car\n" +
                "LEFT JOIN\n" +
                "\tsingle_unit_car_analysis_real_time\n" +
                "ON\n" +
                "\tsingle_unit_car_analysis_real_time.car_code = single_unit_car.car_code\n" +
                "AND\n" +
                "\tsingle_unit_car_analysis_real_time.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "AND\n" +
                "\tsingle_unit_car_analysis_real_time.unit_id = "+unitId+"\n" +
                "WHERE\n" +
                "\tsingle_unit_car.unit_id = "+unitId+"\n" +
                "GROUP BY\n" +
                "\tsingle_unit_car.car_license_plate\n"+
                "ORDER BY\n"+
                "\tsingle_unit_car_analysis_real_time.rai_count DESC";
        return baseService.find(sql);
    }


}
