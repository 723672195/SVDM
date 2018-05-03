package com.jiuqu.cloud.feign.svdm;

import com.jiuqu.cloud.config.FeignConfig;
import feign.Headers;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@FeignClient(name = "risk-service", configuration = FeignConfig.class, url = "${service.risk-url}", fallbackFactory = RiskFeignClientFallbackFactory.class)
@PropertySource("classpath:application.yml")
public interface RiskFeignClient {
    //sheet2界面，根据公司id查询驾驶人员,车辆,道路,天气,管理信息雷达图以及风险信息和RAL
    @RequestMapping(value = "/findUnitMessage", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findUnitRALMessage(Map<String,?> map);

    //sheet2界面，根据公司id查询大分类小分类的表
    @RequestMapping(value = "/findUnitAnalysis",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findUnitAnalysis(Map<String,?> map);

    //sheet2界面，根据公司id查询车辆Ral指数
    @RequestMapping(value = "/findUnitRAL" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findUnitRAL(Map<String ,?> map);

    //sheet2界面，根据公司id查询车辆车牌号
    @RequestMapping(value = "/findCarNumber" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findCarNumber(Map<String ,?> map);

    //sheet2_2界面,驾驶人员数据展示，上表
    @RequestMapping(value = "/SvdmAnalyzeDataController/getListDriverAnalysisDataDisplay1",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findDriverAnalysisDataDisplay1(Map<String,?> map);

    //sheet2_2界面,驾驶人员模块，数据展示，下表
    @RequestMapping(value = "/SvdmAnalyzeDataController/getListDriverAnalysisDataDisplay2",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findDriverAnalysisDataDisplay2(Map<String,?> map);

    //sheet2_2界面，驾驶人模块，数据展示小块
    @RequestMapping(value = "/findDriverAnalysis",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findDriverAnalysis(Map<String,?> map);

    //sheet2_2界面，驾驶人员模块，柱状图
    @RequestMapping(value = "/findOverSpeedDriving",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findOverSpeedDriving(Map<String,?> map);

    //sheet2_2界面，车辆情况模块，数据展示小块
    @RequestMapping(value = "/findVehicleAnalysis",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findVehicleAnalysis(Map<String,?> map);

    //sheet2_2界面，车辆情况模块，折线图数据
    @RequestMapping(value = "/findDynamicSystem",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findDynamicSystem(Map<String,?> map);

    //sheet2_2界面，道路情况模块，表
    @RequestMapping(value = "/RoadController/getListRoadDataDisplay",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findListRoadDataDisplay(Map<String,?> map);

    //sheet2_2界面，道路情况模块，小块
    @RequestMapping(value = "/findRoadAnalysis",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findRoadAnalysis(Map<String,?> map);

    //sheet2_2界面，道路情况模块，图
    @RequestMapping(value = "/findAverageElevation",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findAverageElevation(Map<String,?> map);

    //sheet2_2界面，天气情况模块，表
    @RequestMapping(value = "/WeatherController/getListWeatherDataDisplay",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findListRoadDataDisplay2(Map<String,?> map);

    //sheet2_2界面，天气情况模块，小块
    @RequestMapping(value = "/findWeatherAnalysis",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findWeatherAnalysis(Map<String,?> map);

    //sheet2_2界面，天气情况模块，图
    @RequestMapping(value = "/findWeatherTime",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findWeatherTime(Map<String,?> map);

    //sheet2_2界面，管理情况模块，表
    @RequestMapping(value = "/ManagementController/getListManagementDataDisplay",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findListManagementDataDisplay(Map<String,?> map);

    //sheet2_2界面，管理情况模块，小块
    @RequestMapping(value = "/findManagement",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findManagement(Map<String,?> map);


    //sheet2_2界面，管理情况模块，图
    @RequestMapping(value = "/findVehicleManagement",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findVehicleManagement(Map<String,?> map);



    //下面开始是History版本界面的项目接口


    //sheet2-History界面，根据公司id查询驾驶人员,车辆,道路,天气,管理信息雷达图以及风险信息和RAL
    @RequestMapping(value = "/history/riskController/findUnitHistoryMessage", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findUnitHistoryMessage(Map<String,?> map);

    //sheet2-History界面，根据公司id查询大分类小分类的表
    @RequestMapping(value = "/history/riskController/findUnitHistoryAnalysis",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findUnitHistoryAnalysis(Map<String,?> map);

    //sheet2-History界面，根据公司id查询车辆Ral指数
    @RequestMapping(value = "/history/riskController/findCarHistoryRAL" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findCarHistoryRAL(Map<String ,?> map);

    //sheet2-History界面，根据公司ID查询处理意见
    @RequestMapping(value = "/history/riskController/findUnitHistoryOpinions" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findUnitHistoryOpinions(Map<String ,?> map);

    //sheet2-History界面，驾驶人员数据展示上表
    @RequestMapping(value = "/history/riskController/getHistoryDriverAnalysisDataDisplay1" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findHistoryDriverAnalysisDataDisplay1(Map<String ,?> map);

    //sheet2-History界面，驾驶人员数据展示下表
    @RequestMapping(value = "/history/riskController/getHistoryDriverAnalysisDataDisplay2" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findHistoryDriverAnalysisDataDisplay2(Map<String ,?> map);

    //sheet2-History界面，根据公司id查询驾驶人员下小分类的分析值
    @RequestMapping(value = "/history/riskController/findDriverHistoryAnalysis" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findDriverHistoryAnalysis(Map<String ,?> map);


    //sheet2-History界面，根据公司id查询驾驶人柱状图的数据
    @RequestMapping(value = "/history/riskController/findOverSpeedHistoryDriving" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findOverSpeedHistoryDriving(Map<String ,?> map);

    //sheet2-History界面，根据公司id查询车辆情况下小分类的分析值
    @RequestMapping(value = "/history/riskController/findVehicleHistoryAnalysis" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findVehicleHistoryAnalysis(Map<String ,?> map);


    //sheet2-History界面，根据公司id查询车辆折线图数据
    @RequestMapping(value = "/history/riskController/findDynamicSystemHistory" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findDynamicSystemHistory(Map<String ,?> map);


    //sheet2-History界面，道路情况数据展示
    @RequestMapping(value = "/history/riskController/getHistoryRoadDataDisplay" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findHistoryRoadDataDisplay(Map<String ,?> map);


    //sheet2-History界面，根据公司id查询道路情况下小分类的分析值
    @RequestMapping(value = "/history/riskController/findRoadHistoryAnalysis" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findRoadHistoryAnalysis(Map<String ,?> map);


    //sheet2-History界面，根据公司id查询道路折线图数据
    @RequestMapping(value = "/history/riskController/findAverageElevationHistory" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findAverageElevationHistory(Map<String ,?> map);

    //sheet2-History界面，天气数据展示
    @RequestMapping(value = "/history/riskController/getListWeatherDataDisplay" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findListWeatherDataDisplay(Map<String ,?> map);


    //sheet2-History界面，根据公司id查询天气情况下小分类的分析值
    @RequestMapping(value = "/history/riskController/findWeatherHistoryAnalysis" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findWeatherHistoryAnalysis(Map<String ,?> map);


    //sheet2-History界面，查询天气时间
    @RequestMapping(value = "/history/riskController/findWeatherTimeHistory" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findWeatherTimeHistory(Map<String ,?> map);


    //sheet2-History界面，管理情况数据展示
    @RequestMapping(value = "/history/riskController/getHistoryManagementDataDisplay" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findHistoryManagementDataDisplay(Map<String ,?> map);


    //sheet2-History界面，根据公司id查询管理情况下小分类的分析值
    @RequestMapping(value = "/history/riskController/findManagementHistory" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findManagementHistory(Map<String ,?> map);


    //sheet2-History界面，根据公司id查询管理情况折线图的数据
    @RequestMapping(value = "/history/riskController/findVehicleManagementHistory" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public List findVehicleManagementHistory(Map<String ,?> map);











}
@Component
class RiskFeignClientFallbackFactory implements FallbackFactory<RiskFeignClient> {
    @Override
    public RiskFeignClient create(Throwable cause) {
        return new RiskFeignClient() {
            @Override
            public List findUnitRALMessage(Map param){
                return new ArrayList();
            }
            @Override
            public List findUnitAnalysis(Map param){
                return new ArrayList();
            }
            @Override
            public List findUnitRAL(Map param){
                return new ArrayList();
            }
            @Override
            public List findCarNumber(Map param){
                return new ArrayList();
            }
            @Override
            public List findDriverAnalysisDataDisplay1(Map param){return new ArrayList();}
            @Override
            public List findDriverAnalysisDataDisplay2(Map param){return new ArrayList();}
            @Override
            public List findDriverAnalysis(Map param){return new ArrayList();}
            @Override
            public List findOverSpeedDriving(Map param){return new ArrayList();}
            @Override
            public List findVehicleAnalysis(Map param){return new ArrayList();}
            @Override
            public List findDynamicSystem(Map param){return new ArrayList();}
            @Override
            public List findListRoadDataDisplay(Map param){return new ArrayList();}
            @Override
            public List findRoadAnalysis(Map param){return new ArrayList();}
            @Override
            public List findAverageElevation(Map param){return new ArrayList();}
            @Override
            public List findListRoadDataDisplay2(Map param){return new ArrayList();}
            @Override
            public List findWeatherAnalysis(Map param){return new ArrayList();}
            @Override
            public List findWeatherTime(Map param){return new ArrayList();}
            @Override
            public List findListManagementDataDisplay(Map param){return new ArrayList();}
            @Override
            public List findManagement(Map param){return new ArrayList();}
            @Override
            public List findVehicleManagement(Map param){return new ArrayList();}

            //下面是History版本的界面
            @Override
            public List findUnitHistoryMessage(Map param){
                return new ArrayList();
            }
            @Override
            public List findUnitHistoryAnalysis(Map param){
                return new ArrayList();
            }
            @Override
            public List findCarHistoryRAL(Map param){
                return new ArrayList();
            }
            @Override
            public List findUnitHistoryOpinions(Map param){
                return new ArrayList();
            }
            @Override
            public List findHistoryDriverAnalysisDataDisplay1(Map param){
                return new ArrayList();
            }
            @Override
            public List findHistoryDriverAnalysisDataDisplay2(Map param){
                return new ArrayList();
            }
            @Override
            public List findDriverHistoryAnalysis(Map param){
                return new ArrayList();
            }
            @Override
            public List findOverSpeedHistoryDriving(Map param){
                return new ArrayList();
            }
            @Override
            public List findVehicleHistoryAnalysis(Map param){
                return new ArrayList();
            }
            @Override
            public List findDynamicSystemHistory(Map param){
                return new ArrayList();
            }
            @Override
            public List findHistoryRoadDataDisplay(Map param){
                return new ArrayList();
            }
            @Override
            public List findRoadHistoryAnalysis(Map param){
                return new ArrayList();
            }
            @Override
            public List findAverageElevationHistory(Map param){
                return new ArrayList();
            }
            @Override
            public List findListWeatherDataDisplay(Map param){
                return new ArrayList();
            }
            @Override
            public List findWeatherHistoryAnalysis(Map param){
                return new ArrayList();
            }
            @Override
            public List findWeatherTimeHistory(Map param){
                return new ArrayList();
            }
            @Override
            public List findHistoryManagementDataDisplay(Map param){
                return new ArrayList();
            }
            @Override
            public List findManagementHistory(Map param){
                return new ArrayList();
            }
            @Override
            public List findVehicleManagementHistory(Map param){
                return new ArrayList();
            }



        };

    }

}
