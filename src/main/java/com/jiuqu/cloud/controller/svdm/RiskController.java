package com.jiuqu.cloud.controller.svdm;

import com.alibaba.fastjson.JSON;
import com.jiuqu.cloud.feign.svdm.RiskFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping(value = "/svdm/risk")
public class RiskController {

    @Autowired
    RiskFeignClient riskFeignClient;

    //sheet2界面，根据公司id查询驾驶人员,车辆,道路,天气,管理信息以及风险信息和RAL
    @RequestMapping(value = "/getSomeMessage",method = RequestMethod.POST)
    public String getSomeMessage(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map message =new HashMap();
        message.put("unit_id",unit_id);
        List some = this.riskFeignClient.findUnitRALMessage(message);
        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet2界面，根据公司id查询大分类小分类的表
    @RequestMapping(value = "/getUnitForClassify",method = RequestMethod.POST)
    public String getUnitForClassify(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map classify = new HashMap();
        classify.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findUnitAnalysis(classify);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2界面，根据公司id查询车辆RAI指数，和危险程度,还有Car_Code用来与下面车牌号对应着显示
    @RequestMapping(value = "/getUnitCarRAL",method = RequestMethod.POST)
    public String getUnitCarRAL(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findUnitRAL(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2界面，根据公司id查询车牌号,还有Car_Code用来与上面RAI对应着显示
    @RequestMapping(value = "/getCarNumber",method = RequestMethod.POST)
    public String getCarNumber(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findCarNumber(car);
        String u = JSON.toJSONString(unit);
        return u;
    }


    //sheet2_2界面,驾驶人员数据展示，上表
    @RequestMapping(value = "/getDriverAnalysisDataDisplay1",method = RequestMethod.POST)
    public String  getDriverAnalysisDataDisplay1(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map Driver = new HashMap();
        Driver.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findDriverAnalysisDataDisplay1(Driver);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面,驾驶人员数据展示，下表
    @RequestMapping(value = "/getDriverAnalysisDataDisplay2",method = RequestMethod.POST)
    public String  getDriverAnalysisDataDisplay2(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map Driver = new HashMap();
        Driver.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findDriverAnalysisDataDisplay2(Driver);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，驾驶人员模块，各个小块

    @RequestMapping(value = "/getDriverAnalysis",method = RequestMethod.POST)
    public String  getDriverAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map Driver = new HashMap();
        Driver.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findDriverAnalysis(Driver);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，驾驶人员模块，柱状图

    @RequestMapping(value = "/getOverSpeedDriving",method = RequestMethod.POST)
    public String  getOverSpeedDriving(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map Driver = new HashMap();
        Driver.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findOverSpeedDriving(Driver);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，车辆情况模块，小块
    @RequestMapping(value = "/getVehicleAnalysis",method = RequestMethod.POST)
    public String  getVehicleAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Car = new HashMap();
        Car.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findVehicleAnalysis(Car);
        String u = JSON.toJSONString(unit);
        return u;
    }
    //sheet2_2界面，车辆情况模块，图
    @RequestMapping(value = "/getDynamicSystem",method = RequestMethod.POST)
    public String  getDynamicSystem(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Car = new HashMap();
        Car.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findDynamicSystem(Car);
        String u = JSON.toJSONString(unit);
        return u;
    }
    //sheet2_2界面，道路情况模块，表
    @RequestMapping(value = "/getListRoadDataDisplay",method = RequestMethod.POST)
    public String  getListRoadDataDisplay(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Road = new HashMap();
        Road.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findListRoadDataDisplay(Road);
        String u = JSON.toJSONString(unit);
        return u;
    }
    //sheet2_2界面，道路情况模块，小块
    @RequestMapping(value = "/getRoadAnalysis",method = RequestMethod.POST)
    public String  getRoadAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Road = new HashMap();
        Road.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findRoadAnalysis(Road);
        String u = JSON.toJSONString(unit);
        return u;
    }
    //sheet2_2界面，道路情况模块，图
    @RequestMapping(value = "/getAverageElevation",method = RequestMethod.POST)
    public String  getAverageElevation(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Road = new HashMap();
        Road.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findAverageElevation(Road);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，天气情况模块，表
    @RequestMapping(value = "/getListRoadDataDisplay2",method = RequestMethod.POST)
    public String  getListRoadDataDisplay2(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Weather = new HashMap();
        Weather.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findListRoadDataDisplay2(Weather);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，天气情况模块，小块
    @RequestMapping(value = "/getWeatherAnalysis",method = RequestMethod.POST)
    public String  getWeatherAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Weather = new HashMap();
        Weather.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findWeatherAnalysis(Weather);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，天气情况模块，图
    @RequestMapping(value = "/getWeatherTime",method = RequestMethod.POST)
    public String  getWeatherTime(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Weather = new HashMap();
        Weather.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findWeatherTime(Weather);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，管理情况模块，表
    @RequestMapping(value = "/getListManagementDataDisplay",method = RequestMethod.POST)
    public String  getListManagementDataDisplay(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Management = new HashMap();
        Management.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findListManagementDataDisplay(Management);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，管理情况模块，小块
    @RequestMapping(value = "/getManagement",method = RequestMethod.POST)
    public String  getManagement(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Management = new HashMap();
        Management.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findManagement(Management);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2_2界面，管理情况模块，图
    @RequestMapping(value = "/getVehicleManagement",method = RequestMethod.POST)
    public String  getVehicleManagement(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
        Map Management = new HashMap();
        Management.put("unit_id", unit_id);
        List unit = this.riskFeignClient.findVehicleManagement(Management);
        String u = JSON.toJSONString(unit);
        return u;
    }


    //下面是History版本的界面

    //sheet2-History界面，根据公司id查询驾驶人员,车辆,道路,天气,管理信息雷达图以及风险信息和RAL
    @RequestMapping(value = "/getUnitHistoryMessage",method = RequestMethod.POST)
    public String getUnitHistoryMessage(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map message =new HashMap();
        message.put("unit_id",unit_id);
        List some = this.riskFeignClient.findUnitHistoryMessage(message);
        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet2-History界面，根据公司id查询大分类小分类的表
    @RequestMapping(value = "/getUnitHistoryAnalysis",method = RequestMethod.POST)
    public String getUnitHistoryAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map classify = new HashMap();
        classify.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findUnitHistoryAnalysis(classify);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询车辆Ral指数
       @RequestMapping(value = "/getCarHistoryRAL",method = RequestMethod.POST)
        public String getCarHistoryRAL(HttpServletRequest request, @RequestParam("unit_id") int unit_id) {
           Map car = new HashMap();
           car.put("unit_id", unit_id);
           List unit = this.riskFeignClient.findCarHistoryRAL(car);
           String u = JSON.toJSONString(unit);
           return u;
       }

    //sheet2-History界面，根据公司ID查询处理意见
    @RequestMapping(value = "/getUnitHistoryOpinions",method = RequestMethod.POST)
    public String getUnitHistoryOpinions(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findUnitHistoryOpinions(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，驾驶人员数据展示上
    @RequestMapping(value = "/getHistoryDriverAnalysisDataDisplay1",method = RequestMethod.POST)
    public String getHistoryDriverAnalysisDataDisplay1(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findHistoryDriverAnalysisDataDisplay1(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，驾驶人员数据展示下
    @RequestMapping(value = "/getHistoryDriverAnalysisDataDisplay2",method = RequestMethod.POST)
    public String getHistoryDriverAnalysisDataDisplay2(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findHistoryDriverAnalysisDataDisplay2(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询驾驶人员下小分类的分析值
    @RequestMapping(value = "/getDriverHistoryAnalysis",method = RequestMethod.POST)
    public String getDriverHistoryAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findDriverHistoryAnalysis(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询柱状图的数据
    @RequestMapping(value = "/getOverSpeedHistoryDriving",method = RequestMethod.POST)
    public String getOverSpeedHistoryDriving(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findOverSpeedHistoryDriving(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询车辆情况下小分类的分析值
    @RequestMapping(value = "/getVehicleHistoryAnalysis",method = RequestMethod.POST)
    public String getVehicleHistoryAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findVehicleHistoryAnalysis(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询车辆折线图数据
    @RequestMapping(value = "/getDynamicSystemHistory",method = RequestMethod.POST)
    public String getDynamicSystemHistory(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findDynamicSystemHistory(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，道路情况数据展示
    @RequestMapping(value = "/getHistoryRoadDataDisplay",method = RequestMethod.POST)
    public String getHistoryRoadDataDisplay(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findHistoryRoadDataDisplay(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询道路情况下小分类的分析值
    @RequestMapping(value = "/getRoadHistoryAnalysis",method = RequestMethod.POST)
    public String getRoadHistoryAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findRoadHistoryAnalysis(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询道路折线图数据
    @RequestMapping(value = "/getAverageElevationHistory",method = RequestMethod.POST)
    public String getAverageElevationHistory(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findAverageElevationHistory(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，天气数据展示
    @RequestMapping(value = "/getListWeatherDataDisplay",method = RequestMethod.POST)
    public String getListWeatherDataDisplay(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findListWeatherDataDisplay(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询天气情况下小分类的分析值
    @RequestMapping(value = "/getWeatherHistoryAnalysis",method = RequestMethod.POST)
    public String getWeatherHistoryAnalysis(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findWeatherHistoryAnalysis(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，查询天气图
    @RequestMapping(value = "/getWeatherTimeHistory",method = RequestMethod.POST)
    public String getWeatherTimeHistory(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findWeatherTimeHistory(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，管理情况数据展示
    @RequestMapping(value = "/getHistoryManagementDataDisplay",method = RequestMethod.POST)
    public String getHistoryManagementDataDisplay(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findHistoryManagementDataDisplay(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询管理情况下小分类的分析值
    @RequestMapping(value = "/getManagementHistory",method = RequestMethod.POST)
    public String getManagementHistory(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findManagementHistory(car);
        String u = JSON.toJSONString(unit);
        return u;
    }

    //sheet2-History界面，根据公司id查询管理情况折线图的数据
    @RequestMapping(value = "/getVehicleManagementHistory",method = RequestMethod.POST)
    public String getVehicleManagementHistory(HttpServletRequest request, @RequestParam("unit_id") int unit_id){
        Map car = new HashMap();
        car.put("unit_id",unit_id);
        List unit = this.riskFeignClient.findVehicleManagementHistory(car);
        String u = JSON.toJSONString(unit);
        return u;
    }






    //假数据，2-2界面的综合营运行为分析表



    @RequestMapping(value = "/getIntegratedOperatingBehavior",method = RequestMethod.POST)
    public String  getIntegratedOperatingBehavior() {
        List list = new ArrayList();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();
        Map<String, String> map5 = new HashMap<>();
        Map<String, String> map6 = new HashMap<>();
        Map<String, String> map7 = new HashMap<>();
        Map<String, String> map8 = new HashMap<>();
        Map<String, String> map9 = new HashMap<>();
        Map<String, String> map10 = new HashMap<>();
        int a=(int)(Math.random()*2);//产生0-2的整数随机数
        Calendar cal1=Calendar.getInstance();
        cal1.set(Calendar.MINUTE,-a);

        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
        Calendar cal2=Calendar.getInstance();
        cal2.set(Calendar.MINUTE,-b);

        int c=(int)(Math.random()*6+4);//产生0-10的整数随机数
        Calendar cal3=Calendar.getInstance();
        cal3.set(Calendar.MINUTE,-c);


        int d=(int)(Math.random()*8+6);//产生0-10的整数随机数
        Calendar cal4=Calendar.getInstance();
        cal4.set(Calendar.MINUTE,-d);


        int e=(int)(Math.random()*10+8);//产生0-10的整数随机数
        Calendar cal5=Calendar.getInstance();
        cal5.set(Calendar.MINUTE,-e);


        int a1=(int)(Math.random()*12+10);//产生0-10的整数随机数
        Calendar cal6=Calendar.getInstance();
        cal6.set(Calendar.MINUTE,-a1);


        int au=(int)(Math.random()*14+12);//产生0-10的整数随机数
        Calendar cal7=Calendar.getInstance();
        cal7.set(Calendar.MINUTE,-au);


        int al=(int)(Math.random()*16+14);//产生0-10的整数随机数
        Calendar cal8=Calendar.getInstance();
        cal8.set(Calendar.MINUTE,-al);

        int ax=(int)(Math.random()*18+16);//产生0-10的整数随机数
        Calendar cal9=Calendar.getInstance();
        cal9.set(Calendar.MINUTE,-ax);

        int ax1=(int)(Math.random()*20+18);//产生0-10的整数随机数
        Calendar cal10=Calendar.getInstance();
        cal10.set(Calendar.MINUTE,-ax1);

        //1
        map1.put("RIQI",sdf1.format((cal1.getTime())));
        map1.put("CHEPAIZHAOHAO","豫GB3102");
        map1.put("DIZHI","河南省新乡市卫辉市唐庄镇107国道");
        //2
        map2.put("RIQI",sdf1.format((cal2.getTime())));
        map2.put("CHEPAIZHAOHAO","豫G20989");
        map2.put("DIZHI","河南省新乡市牧野区荣校路街道新飞大道(中)");
        //3
        map3.put("RIQI",sdf1.format((cal3.getTime())));
        map3.put("CHEPAIZHAOHAO","豫G81362");
        map3.put("DIZHI","河南省新乡市延津县小潭乡226省道");
        //4
        map4.put("RIQI",sdf1.format((cal4.getTime())));
        map4.put("CHEPAIZHAOHAO","豫G81696");
        map4.put("DIZHI","河南省郑州市中原区双桥街道前庄王");
        //5
        map5.put("RIQI",sdf1.format((cal5.getTime())));
        map5.put("CHEPAIZHAOHAO","豫GC1295");
        map5.put("DIZHI","河南省新乡市辉县市百泉镇双龙商务酒店");
        //6
        map6.put("RIQI",sdf1.format((cal6.getTime())));
        map6.put("CHEPAIZHAOHAO","豫GN368挂");
        map6.put("DIZHI","河南省新乡市卫辉市唐庄镇107国道");
        //7
        map7.put("RIQI",sdf1.format((cal7.getTime())));
        map7.put("CHEPAIZHAOHAO","豫GA2608");
        map7.put("DIZHI","河南省新乡市红旗区开发区街道柳青路新乡·绿都城");
        //8
        map8.put("RIQI",sdf1.format((cal8.getTime())));
        map8.put("CHEPAIZHAOHAO","豫GB5337");
        map8.put("DIZHI","河南省新乡市获嘉县城关镇230省道");
        //9
        map9.put("RIQI",sdf1.format((cal9.getTime())));
        map9.put("CHEPAIZHAOHAO","豫GJ719挂");
        map9.put("DIZHI","河南省新乡市获嘉县位庄乡G5512晋新高速");
        //10
        map10.put("RIQI",sdf1.format((cal10.getTime())));
        map10.put("CHEPAIZHAOHAO","豫GT666挂");
        map10.put("DIZHI","河南省新乡市辉县市百泉镇稻香路");

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);
        list.add(map10);

        String u = JSON.toJSONString(list);
        return u;
    }


}
