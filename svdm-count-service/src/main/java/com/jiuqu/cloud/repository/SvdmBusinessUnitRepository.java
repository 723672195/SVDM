package com.jiuqu.cloud.repository;


import com.jiuqu.cloud.entity.svdm.SvdmBusinessUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


/**
 * @Author:jzh
 * @Description:Count
 * @Date:Created in 22:59 2018/1/9/009
 * @Modfied By:
 */

@Repository
public interface SvdmBusinessUnitRepository extends JpaRepository<SvdmBusinessUnitEntity,Integer>{

    //货运公司统计Count

    @Query(value = "SELECT COUNT(id) FROM single_unit WHERE single_unit.is_verify>0 AND (single_unit.dangerous_car_number+single_unit.freight_car_number)>0",nativeQuery = true)
    Integer  CountFreight();

    //客运公司统计Count

    @Query(value = "SELECT COUNT(id) FROM single_unit WHERE single_unit.is_verify>0 AND (single_unit.passenger_car_number+single_unit.bus_number)>0",nativeQuery = true)
    Integer  CountPassenger();

    //货运车辆统计Count

    @Query(value = "SELECT COUNT(id) FROM single_unit_car WHERE single_unit_car.tonnage > 0 AND single_unit_car.is_verify > 0",nativeQuery = true)
    Integer  CountCarFreight();

    //客运车辆统计Count

    @Query(value = "SELECT COUNT(id) FROM single_unit_car WHERE single_unit_car.seat > 0  AND single_unit_car.is_verify > 0",nativeQuery = true)
    Integer  CountCarPassenger();

    //运输能力统计Count

    @Query(value = "SELECT SUM(tonnage)FROM single_unit_car WHERE single_unit_car.is_verify  > 0",nativeQuery = true)
    Integer  CountFreightCarAbility();

    //客运能力统计Count

    @Query(value = "SELECT SUM(seat) FROM single_unit_car WHERE single_unit_car.is_verify > 0",nativeQuery = true )
    Integer CountPassengerCarAbility();

    //货运驾驶人统计Count//不能用了

    @Query(value = "SELECT COUNT(id) FROM single_unit_car WHERE single_unit_car.tonnage > 0 AND single_unit_car.is_verify > 0",nativeQuery = true)
    Integer  CountCarFreightPersen();

    //客运驾驶人统计Count//不能用了

    @Query(value = "SELECT COUNT(id) FROM single_unit_car WHERE single_unit_carr.seat > 0  AND single_unit_car.is_verify > 0",nativeQuery = true)
    Integer  CountCarPassengerPersen();

    // 根据公司id获得车牌号

    @Query(value = "SELECT\n" +
            "            single_unit_car.car_license_plate\n" +
            "            FROM\n" +
            "            single_unit_car\n" +
            "            WHERE\n" +
            "            single_unit_car.unit_id =?1\n",nativeQuery = true)
    List getCarbrandList (@PathVariable("id")int id);



}
