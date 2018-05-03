package com.jiuqu.cloud.service.impl.realtime;

import com.jiuqu.cloud.base.service.BaseService;
import com.jiuqu.cloud.service.realtime.IllegaRealTimeAnalysisResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class IllegaRealTimeAnalysisResultsServiceImpl implements IllegaRealTimeAnalysisResultsService{
    @Autowired
    private BaseService baseService;

    /**
     * 查询风险提示
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findCarRiskHints(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.risk_hints\n" +
                "FROM\n" +
                "single_unit_car_analysis_real_time AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    /**
     *
     * 查詢車輛5大分類的分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findCarAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.driver_analysis,\n" +
                "s.vehicle_conditions_analysis,\n" +
                "s.road_condition_analysis,\n" +
                "s.weather_condition_analysis,\n" +
                "s.management_situation_analysis\n" +
                "FROM\n" +
                "single_unit_car_analysis_real_time AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    /**
     * 查询车辆整改建议表
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findCarHandlingOpinions(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "\td.handling_opinions\n" +
                "FROM\n" +
                "\tsingle_unit_car_analysis_real_time_handling_opinions AS d\n" +
                "WHERE\n" +
                "\td.car_analysis_uuid = (\n" +
                "\t\tSELECT\n" +
                "\t\t\ts.car_analysis_uuid\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit_car_analysis_real_time AS s\n" +
                "\t\tWHERE\n" +
                "\t\t\ts.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "\t\tORDER BY\n" +
                "\t\t\ts.send_time DESC\n" +
                "\t\tLIMIT 0,\n" +
                "\t\t1\n" +
                "\t)";
        return baseService.find(sql);
    }

    /**
     * 返回车辆基本信息
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findCarBasicMessage(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "unit.unit_name,\n" +
                "car.car_number,\n" +
                "car.send_time,\n" +
                "car.risk_grade,\n" +
                "car.rai_count\n" +
                "FROM\n" +
                "single_unit AS unit ,\n" +
                "single_unit_car_analysis_real_time AS car\n" +
                "WHERE\n" +
                "unit.id = car.unit_id AND\n" +
                "car.car_number = '"+carNumber+"' AND\n" +
                "car.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "car.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }


    /**事故违法
     * 表头:
     * 根据车牌照号查询违法的分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findAccidentConstitutesAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.accident_constitutes_crime_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1\n";
        return baseService.find(sql);
    }

    /**事故违法
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findAccidentIllegalMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 1\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }

    /**事故违法
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findAccidentConstitutesNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.accident_constitutes_crime_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    /**交通拥堵违规行驶
     * 表头:
     * 根据车牌照号查询违法的分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findTrafficCongestionAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql = "SELECT\n" +
                "s.traffic_congestion_irregularities_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    /**交通拥堵违规行驶
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findTrafficIllegalMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 2\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }

    /**交通拥堵违规行驶
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findTrafficCongestionNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.traffic_congestion_irregularities_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    /**使用伪造驾驶证
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findUseCounterfeitAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.use_counterfeit_driver_license_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**使用伪造驾驶证
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findUseCounterfeitIllegalMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 3\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }

    /**使用伪造驾驶证
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findUseCounterfeitNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.use_counterfeit_driver_license_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //无证驾驶
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findUnlicensedDrivingAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.unlicensed_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findUnlicensedDrivingIllegalMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 4\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findUnlicensedDrivingNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.unlicensed_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //疲劳驾驶

    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findFatigueDrivingAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.fatigue_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findFatigueDrivingIllegalMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 5\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findFatigueDrivingNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.fatigue_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //肇事逃逸

    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHitAndRunAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.hit_and_run_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findHitAndRunIllegalMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 6\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHitAndRunNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.hit_and_run_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //超员行驶

    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findOvercrowdingAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.overcrowding_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findOvercrowdingMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 7\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findOvercrowdingNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.overcrowding_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }

    /*--------------------------------------------------------------------------------------------------------*/
    //超载行驶

    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findOverloadingAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.overloading_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findOverloadingMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 8\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findOverloadingNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.overloading_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //超速行驶

    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findOverspeedDrivingAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.overspeed_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findOverspeedDrivingMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "                s.search_illegal_address,\n" +
                "                s.search_illegal_datetime,\n" +
                "                s.search_illegal_behaviour\n" +
                "                FROM\n" +
                "                single_search_illegal_detail AS s\n" +
                "                WHERE\n" +
                "                s.search_carno = '"+searchCarno+"' AND\n" +
                "                s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "                s.search_illegal_classification = 9\n" +
                "                ORDER BY\n" +
                "                s.search_illegal_datetime DESC\n" +
                "                LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findOverspeedDrivingNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.overspeed_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //违规行为
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findIrregularitiesAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.irregularities_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findIrregularitiesMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 10\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findIrregularitiesNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.irregularities_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //违规行驶
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */

    @Override
    public List<Map<String, Object>> findIrregularitiesDriverAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.irregularities_driver_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findIrregularitiesDriverMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 11\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findIrregularitiesDriverNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.irregularities_driver_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //违规载人载物
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */

    @Override
    public List<Map<String, Object>> findCarryingHumanLoadAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.irregularities_carrying_human_load_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findCarryingHumanLoadMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 12\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findCarryingHumanLoadNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.irregularities_carrying_human_load_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //酒驾醉驾
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */

    @Override
    public List<Map<String, Object>> findDrunkenDrivingAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.drunken_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findDrunkenDrivingMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 13\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findDrunkenDrivingNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.drunken_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //驾驶人违规行为
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findDriverIrregularitiesAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.driver_irregularities_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findDriverIrregularitiesMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 14\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findDriverIrregularitiesNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.driver_irregularities_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //驾驶证异常行驶
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findDrivingLicenseAbnormalAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.driving_license_abnormal_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findDrivingLicenseAbnormalMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 15\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findDrivingLicenseAbnormalNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.driving_license_abnormal_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //高速超速行驶

    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHighSpeedOverspeedAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.high_speed_overspeed_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findHighSpeedOverspeedMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 16\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHighSpeedOverspeedNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.high_speed_overspeed_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
    /*--------------------------------------------------------------------------------------------------------*/
    //高速违规行驶
    /**
     * 表头:
     * 根据车牌照号查询违法分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHighSpeedViolationAnalysis(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.high_speed_violation_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }
    /**
     * 表:
     * 根据车牌照号查询违法的地点,时间,行为
     * @param searchCarno
     * @return
     */
    @Override
    public List<Map<String, Object>> findHighSpeedViolationMessage(String searchCarno) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
                "s.search_illegal_datetime >= "+"'"+sdf.format(new Date())+"' AND\n"+
                "s.search_illegal_classification = 17\n" +
                "ORDER BY\n" +
                "s.search_illegal_datetime DESC\n" +
                "LIMIT 0, 5";
        return baseService.find(sql);
    }
    /**
     *
     * 图:
     * 根据车牌照号查询违法的次数
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHighSpeedViolationNumber(String carNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String sql ="SELECT\n" +
                "s.high_speed_violation_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"' AND\n" +
                "s.send_time >= "+"'"+sdf.format(new Date())+"'\n"+
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
}
