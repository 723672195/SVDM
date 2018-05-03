package com.jiuqu.cloud.service.impl.history;

import com.jiuqu.cloud.base.service.BaseService;
import com.jiuqu.cloud.service.history.IllegaHistoryAnalysisResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IllegaHistoryAnalysisResultsServiceImpl implements IllegaHistoryAnalysisResultsService {
    @Autowired
    private BaseService baseService;

    /**
     * 查询车辆风险提示
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHistoryCarRiskHints(String carNumber) {
        String sql = "SELECT\n" +
                "s.risk_hints\n" +
                "FROM\n" +
                "single_unit_car_daily_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 1";
        return baseService.find(sql);
    }

    /**
     * 查询车辆分析值
     * @param carNumber
     * @return
     */
    @Override
    public List<Map<String, Object>> findHistoryCarAnalysis(String carNumber) {
        String sql = "SELECT\n" +
                "s.driver_analysis,\n" +
                "s.vehicle_conditions_analysis,\n" +
                "s.road_condition_analysis,\n" +
                "s.weather_condition_analysis,\n" +
                "s.management_situation_analysis\n" +
                "FROM\n" +
                "single_unit_car_daily_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryCarHandlingOpinions(String carNumber) {
        String sql = "SELECT\n" +
                "\td.handling_opinions\n" +
                "FROM\n" +
                "\tsingle_unit_car_daily_analysis_handling_opinions AS d\n" +
                "WHERE\n" +
                "\td.analysis_uuid = (\n" +
                "\t\tSELECT\n" +
                "\t\t\ts.analysis_uuid\n" +
                "\t\tFROM\n" +
                "\t\t\tsingle_unit_car_daily_analysis AS s\n" +
                "\t\tWHERE\n" +
                "\t\t\ts.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryCarBasicMessage(String carNumber) {
        String sql = "SELECT\n" +
                "unit.unit_name,\n" +
                "car.car_number,\n" +
                "car.send_time,\n" +
                "car.risk_grade,\n" +
                "car.rai_count\n" +
                "FROM\n" +
                "single_unit AS unit ,\n" +
                "single_unit_car_daily_analysis AS car\n" +
                "WHERE\n" +
                "unit.id = car.unit_id AND\n" +
                "car.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryAccidentConstitutesAnalysis(String carNumber) {
        String sql = "SELECT\n" +
                "s.accident_constitutes_crime_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryAccidentIllegalMessage(String searchCarno) {
        String sql = "SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryAccidentConstitutesNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.accident_constitutes_crime_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryTrafficCongestionAnalysis(String carNumber) {
        String sql = "SELECT\n" +
                "s.traffic_congestion_irregularities_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryTrafficIllegalMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryTrafficCongestionNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.traffic_congestion_irregularities_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryUseCounterfeitAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.use_counterfeit_driver_license_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryUseCounterfeitIllegalMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryUseCounterfeitNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.use_counterfeit_driver_license_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryUnlicensedDrivingAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.unlicensed_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryUnlicensedDrivingIllegalMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryUnlicensedDrivingNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.unlicensed_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryFatigueDrivingAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.fatigue_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryFatigueDrivingIllegalMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryFatigueDrivingNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.fatigue_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryHitAndRunAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.hit_and_run_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryHitAndRunIllegalMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryHitAndRunNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.hit_and_run_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryOvercrowdingAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.overcrowding_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryOvercrowdingMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryOvercrowdingNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.overcrowding_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryOverloadingAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.overloading_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryOverloadingMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryOverloadingNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.overloading_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryOverspeedDrivingAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.overspeed_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryOverspeedDrivingMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "                s.search_illegal_address,\n" +
                "                s.search_illegal_datetime,\n" +
                "                s.search_illegal_behaviour\n" +
                "                FROM\n" +
                "                single_search_illegal_detail AS s\n" +
                "                WHERE\n" +
                "                s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryOverspeedDrivingNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.overspeed_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryIrregularitiesAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.irregularities_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryIrregularitiesMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryIrregularitiesNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.irregularities_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryIrregularitiesDriverAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.irregularities_driver_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryIrregularitiesDriverMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryIrregularitiesDriverNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.irregularities_driver_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryCarryingHumanLoadAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.irregularities_carrying_human_load_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryCarryingHumanLoadMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryCarryingHumanLoadNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.irregularities_carrying_human_load_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryDrunkenDrivingAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.drunken_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryDrunkenDrivingMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryDrunkenDrivingNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.drunken_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryDriverIrregularitiesAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.driver_irregularities_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryDriverIrregularitiesMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryDriverIrregularitiesNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.driver_irregularities_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryDrivingLicenseAbnormalAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.driving_license_abnormal_driving_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryDrivingLicenseAbnormalMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryDrivingLicenseAbnormalNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.driving_license_abnormal_driving_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryHighSpeedOverspeedAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.high_speed_overspeed_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryHighSpeedOverspeedMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryHighSpeedOverspeedNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.high_speed_overspeed_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryHighSpeedViolationAnalysis(String carNumber) {
        String sql ="SELECT\n" +
                "s.high_speed_violation_analysis\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
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
    public List<Map<String, Object>> findHistoryHighSpeedViolationMessage(String searchCarno) {
        String sql ="SELECT\n" +
                "s.search_illegal_address,\n" +
                "s.search_illegal_datetime,\n" +
                "s.search_illegal_behaviour\n" +
                "FROM\n" +
                "single_search_illegal_detail AS s\n" +
                "WHERE\n" +
                "s.search_carno = '"+searchCarno+"' AND\n" +
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
    public List<Map<String, Object>> findHistoryHighSpeedViolationNumber(String carNumber) {
        String sql ="SELECT\n" +
                "s.high_speed_violation_number,\n" +
                "s.send_time\n" +
                "FROM\n" +
                "single_unit_car_diurnal_illegal_analysis AS s\n" +
                "WHERE\n" +
                "s.car_number = '"+carNumber+"'\n" +
                "ORDER BY\n" +
                "s.send_time DESC\n" +
                "LIMIT 0, 6";
        return baseService.find(sql);
    }
}
