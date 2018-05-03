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

@FeignClient(name = "analysis-results-service", configuration = FeignConfig.class, url = "${service.results-url}", fallbackFactory = AnalysisResultsFeignClientFallbackFactory.class)
@PropertySource("classpath:application.yml")
public interface AnalysisResultsFeignClient {
    //sheet3界面，开始车辆信息
    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findCarBasicMessage",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findCarBasicMessage(Map<String,?> map);

//    //sheet3界面，超速行驶违法模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findOverspeedDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findOverspeedDrivingIllegal(Map<String,?> map);
//
//    //sheet3界面，事故构成犯罪模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findAccidentConstitutesIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findAccidentConstitutesIllegal(Map<String,?> map);
//
//    //sheet3界面，交通拥堵违规行驶模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findTrafficCongestionIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findTrafficCongestionIllegal(Map<String,?> map);
//
//    //sheet3界面，使用伪造驾驶证模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findUseCounterfeitIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findUseCounterfeitIllegal(Map<String,?> map);
//
//    //sheet3界面，无证驾驶模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findUnlicensedDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findUnlicensedDrivingIllegal(Map<String,?> map);
//
//    //sheet3界面，疲劳驾驶模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findFatigueDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findFatigueDrivingIllegal(Map<String,?> map);
//
//    //sheet3界面，肇事逃逸模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findHitAndRunIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findHitAndRunIllegal(Map<String,?> map);
//
//    //sheet3界面，超员行驶违法模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findOvercrowdingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findOvercrowdingIllegal(Map<String,?> map);
//
//    //sheet3界面，超载行驶违法模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findOverloadingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findOverloadingIllegal(Map<String,?> map);
//
//    //sheet3界面，违规行为模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findIrregularitiesIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findIrregularitiesIllegal(Map<String,?> map);
//
//    //sheet3界面，违规载人载物模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findCarryingHumanLoadIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findCarryingHumanLoadIllegal(Map<String,?> map);
//
//    //sheet3界面，酒驾醉驾模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findDrunkenDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findDrunkenDrivingIllegal(Map<String,?> map);
//
//    //sheet3界面，违规行驶模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findIrregularitiesDriverIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findIrregularitiesDriverIllegal(Map<String,?> map);
//
//    //sheet3界面，驾驶人违规行为模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findDriverIrregularitiesIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findDriverIrregularitiesIllegal(Map<String,?> map);
//
//    //sheet3界面，驾驶证异常行驶模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findDrivingLicenseAbnormalIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findDrivingLicenseAbnormalIllegal(Map<String,?> map);
//
//    //sheet3界面，高速超速行驶模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findHighSpeedOverspeedIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findHighSpeedOverspeedIllegal(Map<String,?> map);
//
//    //sheet3界面，高速违规行驶模块
//    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findHighSpeedViolationIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findHighSpeedViolationIllegal(Map<String,?> map);
//
//
//    //下面是预警的模块
//
//    //sheet3界面，超速预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListOverspeed",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListOverspeed(Map<String,?> map);
//
//    //sheet3界面，疲劳驾驶预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListFatigue",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListFatigue(Map<String,?> map);
//
//    //sheet3界面，预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListWarning",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListWarning(Map<String,?> map);
//
//    //sheet3界面，终端设备故障预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListTerminal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListTerminal(Map<String,?> map);
//
//    //sheet3界面，驾驶时长异常预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListDrivingTime",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListDrivingTime(Map<String,?> map);
//
//    //sheet3界面，超时停车预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListTimeoutParking",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListTimeoutParking(Map<String,?> map);
//
//    //sheet3界面，行驶路线异常预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListAbnormalRoute",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListAbnormalRoute(Map<String,?> map);
//
//    //sheet3界面，路线偏离预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListLineDeviation",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListLineDeviation(Map<String,?> map);
//
//    //sheet3界面，车辆异常预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListAbnormalVehicle",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListAbnormalVehicle(Map<String,?> map);
//
//    //sheet3界面，车辆非法行驶预警模块
//    @RequestMapping(value = "/realtime/warningAnalysisResultsController/findListIllegalDriving",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    @Headers("Content-Type = application/x-www-form-urlencoded")
//    public String findListIllegalDriving(Map<String,?> map);
//
    //sheet3界面，根据车牌号获得三个分页的表格数据
    @RequestMapping(value = "/realtime/warningAnalysisResultsController/getCarList",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findCarList(Map<String,?> map);

    //sheet3界面，车辆整改意见
    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findCarHandlingOpinions",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findCarHandlingOpinions(Map<String,?> map);

    //sheet3界面，静态数据分析大图
    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findCarAnalysis",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findCarAnalysis(Map<String,?> map);

    //sheet3风险提示
    @RequestMapping(value = "/realtime/illegalAnalysisResultsController/findCarRiskHints",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findCarRiskHints(Map<String,?> map);



    //History版本Sheet3
    //根据车牌照查询车辆整改建议
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryCarHandlingOpinions",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryCarHandlingOpinions(Map<String,?> map);

    //根据车牌照查询车辆基本信息
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryCarBasicMessage",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryCarBasicMessage(Map<String,?> map);

    //事故整合1
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryAccidentConstitutesIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryAccidentConstitutesIllegal(Map<String,?> map);

    //整合交通拥堵违规行驶2
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryTrafficCongestionIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryTrafficCongestionIllegal(Map<String,?> map);

    //整合使用伪造驾驶证3
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryUseCounterfeitIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryUseCounterfeitIllegal(Map<String,?> map);

    //整合无证驾驶4
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryUnlicensedDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryUnlicensedDrivingIllegal(Map<String,?> map);

    //整合疲劳驾驶5
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryFatigueDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryFatigueDrivingIllegal(Map<String,?> map);

    //整合肇事逃逸6
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryHitAndRunIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryHitAndRunIllegal(Map<String,?> map);

    //整合超员行驶7
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryOvercrowdingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryOvercrowdingIllegal(Map<String,?> map);

    //整合超载行驶8
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryOverloadingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryOverloadingIllegal(Map<String,?> map);

    //整合超速行驶9
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryOverspeedDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryOverspeedDrivingIllegal(Map<String,?> map);

    //整合违规行为10
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryIrregularitiesIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryIrregularitiesIllegal(Map<String,?> map);

    //整合违规行驶11
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryIrregularitiesDriverIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryIrregularitiesDriverIllegal(Map<String,?> map);

    //整合违规载人载物12
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryCarryingHumanLoadIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryCarryingHumanLoadIllegal(Map<String,?> map);

    //整合酒驾醉驾13
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryDrunkenDrivingIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryDrunkenDrivingIllegal(Map<String,?> map);

    //整合驾驶人违规行为14
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryDriverIrregularitiesIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryDriverIrregularitiesIllegal(Map<String,?> map);

    //驾驶证异常行驶15
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryDrivingLicenseAbnormalIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryDrivingLicenseAbnormalIllegal(Map<String,?> map);

    //整合高速超速行驶16
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryHighSpeedOverspeedIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryHighSpeedOverspeedIllegal(Map<String,?> map);

    //高速违规行驶17
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryHighSpeedViolationIllegal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryHighSpeedViolationIllegal(Map<String,?> map);

    //预警
    //18超速预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryOverspeed",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String getHistoryOverspeed(Map<String,?> map);

    //19疲劳驾驶预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryFatigue",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryFatigue(Map<String,?> map);

    //20预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryWarning",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryWarning(Map<String,?> map);

    //21终端设备故障预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryTerminal",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryTerminal(Map<String,?> map);

    //22驾驶时长异常预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryDrivingTime",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryDrivingTime(Map<String,?> map);

    //23超时停车预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryTimeoutParking",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryTimeoutParking(Map<String,?> map);

    //24行驶路线异常预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryAbnormalRoute",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryAbnormalRoute(Map<String,?> map);

    //25路线偏离预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryLineDeviation",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryLineDeviation(Map<String,?> map);

    //26车辆异常预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryAbnormalVehicle",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryAbnormalVehicle(Map<String,?> map);

    //27车辆非法行驶预警
    @RequestMapping(value = "/history/warningAnalysisResultsController/findHistoryIllegalDriving",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryIllegalDriving(Map<String,?> map);

    //根据车牌照号获得运输数据
    @RequestMapping(value = "/history/warningAnalysisResultsController/getHistoryCarList",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String getHistoryCarList(Map<String,?> map);

    //静态分析大图
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryCarAnalysis",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryCarAnalysis(Map<String,?> map);

    //sheet3风险提示
    @RequestMapping(value = "/history/illegalAnalysisResultsController/findHistoryCarRiskHints",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @Headers("Content-Type = application/x-www-form-urlencoded")
    public String findHistoryCarRiskHints(Map<String,?> map);
}



@Component
class AnalysisResultsFeignClientFallbackFactory implements FallbackFactory<AnalysisResultsFeignClient> {
    @Override
    public AnalysisResultsFeignClient create(Throwable cause) {
        return new AnalysisResultsFeignClient() {
            @Override
            public String findCarBasicMessage (Map param){
                return new String();
            }
//            @Override
//            public String findOverspeedDrivingIllegal(Map param){
//                return new String();
//            }
//            @Override
//            public String findAccidentConstitutesIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findTrafficCongestionIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findUseCounterfeitIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findUnlicensedDrivingIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findFatigueDrivingIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findHitAndRunIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findOvercrowdingIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findOverloadingIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findIrregularitiesIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findCarryingHumanLoadIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findDrunkenDrivingIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findIrregularitiesDriverIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findDriverIrregularitiesIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findDrivingLicenseAbnormalIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findHighSpeedOverspeedIllegal(Map param) {
//                return new String();
//            }
//            @Override
//            public String findHighSpeedViolationIllegal(Map param) {
//                return new String();
//            }
//
//
//            @Override
//            public String findListOverspeed(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListFatigue(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListWarning(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListTerminal(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListDrivingTime(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListTimeoutParking(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListAbnormalRoute(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListLineDeviation(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListAbnormalVehicle(Map param) {
//                return new String();
//            }
//
//            @Override
//            public String findListIllegalDriving(Map param) {
//                return new String();
//            }
//
            @Override
            public String findCarList(Map param) {
                return new String();
            }

            @Override
            public String findCarHandlingOpinions(Map param) {
                return new String();
            }

            @Override
            public String findCarAnalysis(Map param) {
                return new String();
            }

            @Override
            public String findCarRiskHints(Map param) {
                return new String();
            }



            @Override
            public String findHistoryCarHandlingOpinions(Map param) {
                return new String();
            }

            @Override
            public String findHistoryCarBasicMessage(Map param) {
                return new String();
            }

            @Override
            public String findHistoryAccidentConstitutesIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryTrafficCongestionIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryUseCounterfeitIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryUnlicensedDrivingIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryFatigueDrivingIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryHitAndRunIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryOvercrowdingIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryOverloadingIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryOverspeedDrivingIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryIrregularitiesIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryIrregularitiesDriverIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryCarryingHumanLoadIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryDrunkenDrivingIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryDriverIrregularitiesIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryDrivingLicenseAbnormalIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryHighSpeedOverspeedIllegal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryHighSpeedViolationIllegal(Map param) {
                return new String();
            }

            @Override
            public String getHistoryOverspeed(Map param) {
                return new String();
            }

            @Override
            public String findHistoryWarning(Map param) {
                return new String();
            }

            @Override
            public String findHistoryTerminal(Map param) {
                return new String();
            }

            @Override
            public String findHistoryDrivingTime(Map param) {
                return new String();
            }

            @Override
            public String findHistoryTimeoutParking(Map param) {
                return new String();
            }

            @Override
            public String findHistoryAbnormalRoute(Map param) {
                return new String();
            }

            @Override
            public String findHistoryLineDeviation(Map param) {
                return new String();
            }

            @Override
            public String findHistoryAbnormalVehicle(Map param) {
                return new String();
            }

            @Override
            public String findHistoryIllegalDriving(Map param) {
                return new String();
            }

            @Override
            public String getHistoryCarList(Map param) {
                return new String();
            }

            @Override
            public String findHistoryFatigue(Map param) {
                return new String();
            }

            @Override
            public String findHistoryCarAnalysis(Map param) {
                return new String();
            }

            @Override
            public String findHistoryCarRiskHints(Map param) {
                return new String();
            }





        };
    }
}