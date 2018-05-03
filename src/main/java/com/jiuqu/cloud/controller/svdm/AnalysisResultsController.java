package com.jiuqu.cloud.controller.svdm;

import com.alibaba.fastjson.JSON;
import com.jiuqu.cloud.feign.svdm.AnalysisResultsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping(value = "/svdm/results/")
public class AnalysisResultsController {

    @Autowired
    AnalysisResultsFeignClient analysisResultsFeignClient;


    public static boolean isChinese(String string){
        int n = 0;
        for(int i = 0; i < string.length(); i++) {
            n = (int)string.charAt(i);
            if(!(19968 <= n && n <40869)) {
                return false;
            }
        }
        return true;
    }

    public Map getRandom(String Modular_name,String name,String chart_name_name, String table_head_name_name,String table_name_name1,String table_name_name2,String table_name_name3){
        Map map = new HashMap();
        Random rand = new Random();
        map.put("Modular_name",Modular_name);
        map.put("name",name);
        //指数
        List table_head_name_list = new ArrayList();
        double b = 37.53;
        double min = 0; //最小
        double max = 100; //最大
        int    scl =  2; // 小数最大位数
        int    pow = (int) Math.pow(10, scl); // 用于提取指定小数位
        double one ;
        one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
        Map<String, Object> table_head_name_map = new HashMap<String, Object>();
        table_head_name_map.put(table_head_name_name,one);
        table_head_name_list.add(table_head_name_map);
        map.put("table_head_name", table_head_name_list);
        //图表
        List chart_name_list = new ArrayList();
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal1=Calendar.getInstance();
        int time = 2;
        int j = 6;
        if(one == 0.00){
            for(int i=1;i<6;i++){
                Map temp = new HashMap();
                cal1.set(Calendar.MINUTE,-(time*j));
                if(this.isChinese(chart_name_name)){
                    temp.put(chart_name_name,new Random().nextInt(0));
                    temp.put("TIME",sdf1.format((cal1.getTime())));
                }else {
                    temp.put("send_time",sdf1.format((cal1.getTime())));
                    temp.put(chart_name_name,new Random().nextInt(0));
                }
                chart_name_list.add(temp);
                j--;
            }
        }else if(one >0.00 && one <= 20.00){
            for(int i=1;i<6;i++){
                Map temp = new HashMap();
                cal1.set(Calendar.MINUTE,-(time*j));
                if(this.isChinese(chart_name_name)){
                    temp.put(chart_name_name,new Random().nextInt(5));
                    temp.put("TIME",sdf1.format((cal1.getTime())));
                }else {
                    temp.put("send_time",sdf1.format((cal1.getTime())));
                    temp.put(chart_name_name,new Random().nextInt(5));
                }
                chart_name_list.add(temp);
                j--;
            }
        }else if(one >20.00 && one <= 40.00){
            for(int i=1;i<6;i++){
                Map temp = new HashMap();
                cal1.set(Calendar.MINUTE,-(time*j));
                if(this.isChinese(chart_name_name)){
                    temp.put(chart_name_name,new Random().nextInt(10));
                    temp.put("TIME",sdf1.format((cal1.getTime())));
                }else {
                    temp.put("send_time",sdf1.format((cal1.getTime())));
                    temp.put(chart_name_name,new Random().nextInt(10));
                }
                chart_name_list.add(temp);
                j--;
            }
        }else if(one >40.00 && one <= 60.00){
            for(int i=1;i<6;i++){
                Map temp = new HashMap();
                cal1.set(Calendar.MINUTE,-(time*j));
                if(this.isChinese(chart_name_name)){
                    temp.put(chart_name_name,new Random().nextInt(15));
                    temp.put("TIME",sdf1.format((cal1.getTime())));
                }else {
                    temp.put("send_time",sdf1.format((cal1.getTime())));
                    temp.put(chart_name_name,new Random().nextInt(15));
                }
                chart_name_list.add(temp);
                j--;
            }
        }else if(one >60.00 && one <= 80.00){
            for(int i=1;i<6;i++){
                Map temp = new HashMap();
                cal1.set(Calendar.MINUTE,-(time*j));
                if(this.isChinese(chart_name_name)){
                    temp.put(chart_name_name,new Random().nextInt(20));
                    temp.put("TIME",sdf1.format((cal1.getTime())));
                }else {
                    temp.put("send_time",sdf1.format((cal1.getTime())));
                    temp.put(chart_name_name,new Random().nextInt(20));
                }
                chart_name_list.add(temp);
                j--;
            }
        }else if(one >80.00 && one <= 100.00){
            for(int i=1;i<6;i++){
                Map temp = new HashMap();
                cal1.set(Calendar.MINUTE,-(time*j));
                if(this.isChinese(chart_name_name)){
                    temp.put(chart_name_name,new Random().nextInt(25));
                    temp.put("TIME",sdf1.format((cal1.getTime())));
                }else {
                    temp.put("send_time",sdf1.format((cal1.getTime())));
                    temp.put(chart_name_name,new Random().nextInt(25));
                }
                chart_name_list.add(temp);
                j--;
            }
        }
        map.put("chart_name", chart_name_list);
        //表格
        List table_name_list = new ArrayList();
        List data1 = new ArrayList();
        data1.add("京深107国道868公里");
        data1.add("其它路口");
        data1.add("金孟231省道");
        data1.add("省道227线(长晋线)66公里450米");
        data1.add("卫柿306省道44公里700米");
        data1.add("东环路与红旗渠大道交叉口");
        data1.add("肿瘤医院（南院区）压线");
        data1.add("大广高速2684公里300米");
        data1.add("G233国道(新237线)99公里530米");
        data1.add("西曹227省道42公里");
        data1.add("国道208线853公里");
        data1.add("省道218线(岢大线)82公里400米");
        data1.add("世纪大道与黄池路交叉口");
        data1.add("河南省开封市金明大道");
        data1.add("园康路出山连路北侧60米非机动车道");
        //超速违法
        List speeding_illegal_data = new ArrayList();
        speeding_illegal_data.add("在高速公路上超速不足50%的");
        speeding_illegal_data.add("中型以上载货汽车超速20%以上未达50%的");
        speeding_illegal_data.add("超速50%以下");
        speeding_illegal_data.add("危险物品运输车辆超速20%以上未达50%的");
        speeding_illegal_data.add("驾驶中型以上载客汽车在高速公路、城市快速路以外的道路上行驶超过规定时速大于10%小于20%的");
        speeding_illegal_data.add("驾驶中型以上载客载货汽车、校车、危险物品运输车辆以外的机动车行驶超过规定时速50%的");
        speeding_illegal_data.add("驾驶危险物品运输车辆在高速公路、城市快速路以外的道路上行驶超过规定时速大于10%小于20%的");
        speeding_illegal_data.add("驾驶中型以上载货汽车在高速公路以外的道路上行驶超过规定时速50%的");
        //违规行驶
        List Irregularities_travel_data = new ArrayList();
        Irregularities_travel_data.add("驾驶与准驾车型不符的机动车");
        Irregularities_travel_data.add("在高速公路上倒车、逆行、穿越中央分隔带掉头");
        Irregularities_travel_data.add("在高速公路车道内停车");
        Irregularities_travel_data.add("辆超过4小时未停车休息或者停车休息时间少于20分钟");
        Irregularities_travel_data.add("载物超过核定载质量30%以上或者违反规定载客");
        Irregularities_travel_data.add("快速路上违法占用应急车道行驶");
        //疲劳驾驶
        List  Fatigue_driving_data = new ArrayList();
        Fatigue_driving_data.add("驾驶人连续驾驶机动车超过四个小时");
        Fatigue_driving_data.add("连续驾驶中型以上载客汽车、危险物品运输车辆超过6小时未停车休息");
        Fatigue_driving_data.add("连续驾驶中型以上载客汽车机动车超过4小时休息时间少于20分钟");
        Fatigue_driving_data.add("驾驶人连续驾驶机动车超过8个小时未休息");
        Fatigue_driving_data.add("过度疲劳仍继续驾驶");
        Fatigue_driving_data.add("驾驶时间过长休息时间少于20分钟");
        Fatigue_driving_data.add("驾驶人过度劳累");
        Fatigue_driving_data.add("驾驶时间过长仍继续驾驶");
        //交通拥堵违规行驶
        List  Traffic_congestion_irregularities_data = new ArrayList();
        Traffic_congestion_irregularities_data.add("交通拥堵处不按规定停车等候");
        Traffic_congestion_irregularities_data.add("交通拥堵处未依次交替行驶");
        Traffic_congestion_irregularities_data.add("交通拥堵处随意穿插");
        Traffic_congestion_irregularities_data.add("交通拥堵处随意穿插、借道超车");
        Traffic_congestion_irregularities_data.add("机动车在高速公路遇交通拥堵，占用应急车道行驶的");
        //驾驶人违规行为
        List Driver_irregularities_data = new ArrayList();
        Driver_irregularities_data.add("违法占用应急车道行驶");
        Driver_irregularities_data.add("使用其他车辆行驶证");
        Driver_irregularities_data.add("低能见度气象条件下，驾驶机动车在高速公路上不按规定行驶");
        Driver_irregularities_data.add("驾驶机动车运载超限的不可解体的物品，未按指定的时间、路线、速度行驶或者未悬挂明显标志");
        Driver_irregularities_data.add("驾驶营运客车以外的机动车在高速公路车道内停车");
        //高速超速行驶
        List High_speed_overspeed_data = new ArrayList();
        High_speed_overspeed_data.add("行驶超过规定时速50%以上");
        High_speed_overspeed_data.add("行驶超过规定时速未达20%的");
        High_speed_overspeed_data.add("行驶或者驾驶其他机动车行驶超过规定时速20%以上未达到50%");
        //高速违规行驶
        List High_speed_violation_data = new ArrayList();
        High_speed_violation_data.add("机动车有超载行为或违反载人规定");
        High_speed_violation_data.add("驾驶不符合安全标准的车子");
        High_speed_violation_data.add("不按规定停车，超车或者变更车道");
        High_speed_violation_data.add("没有按规定系安全带的或者在特殊天气下不按指挥行车");
        High_speed_violation_data.add("超过或者低于规定时速");
        High_speed_violation_data.add("没有保持好行车间距的或者骑、压车道分界线行驶和在超车道上连续行驶");
        //超员行驶
        List Overcrowding_man_data = new ArrayList();
        Overcrowding_man_data.add("驾驶载客汽车以外的其他机动车载人超员的");
        Overcrowding_man_data.add("超员20%以下");
        Overcrowding_man_data.add("超过核载人数百分之二十以上百分之五十以下");
        Overcrowding_man_data.add("超过核载人数百分之五十以上");
        Overcrowding_man_data.add("超过核载人数百分之十以上百分之二十以下");
        Overcrowding_man_data.add("超过核载人数");
        //违规载人载物
        List Irregularities_carrying_human_load_data= new ArrayList();
        Irregularities_carrying_human_load_data.add("货运机动车超过核定载质量");
        Irregularities_carrying_human_load_data.add("超过核定载质量30%");
        Irregularities_carrying_human_load_data.add("载客超过额定乘员");
        Irregularities_carrying_human_load_data.add("超过额定乘员20%");
        //违规行为
        List Irregularities_data= new ArrayList();
        Irregularities_data.add("在高速公路上倒车、逆行或者穿越中央分离带掉头、转弯");
        Irregularities_data.add("在高速公路上不按规定停车");
        Irregularities_data.add("行经铁路道口不按规定行车或者停车");
        Irregularities_data.add("在高速公路上不按规定超车或者变更车道");
        Irregularities_data.add("车辆发生故障、事故停车后，不按规定使用灯光和设置警告标志");
        //超载行驶
        List Overcrowding_data = new ArrayList();
        Overcrowding_data.add("超载30%以下");
        Overcrowding_data.add("货运车辆驾驶人1年内违法超限运输超过3次");
        Overcrowding_data.add("超载10%以上30%以下");
        Overcrowding_data.add("超载30%以上50%以下");
        Overcrowding_data.add("超载50%以上");
        Overcrowding_data.add("因违法超限超载造成重大责任事故");



        String date = "";
        Calendar cal2=Calendar.getInstance();
        for(int i=1;i<6;i++){
            Map<String, Object> table_name_map = new HashMap<String, Object>();
            Random r = new Random();
            cal2.set(Calendar.YEAR,2018);
            cal2.set(Calendar.MONTH,-r.nextInt(5));
            cal2.set(Calendar.HOUR,-r.nextInt(11));
            if (table_name_name1 == "SUDU"){
                table_name_map.put(table_name_name1,r.nextInt(50)+60);
            }else {
                table_name_map.put(table_name_name1,data1.get(r.nextInt(data1.size())));
            }
            if (table_name_name2 == "DIDIAN"){
                table_name_map.put(table_name_name2,data1.get(r.nextInt(data1.size())));
            }else {
                if(Modular_name == "speeding_illegal"){
                    table_name_map.put(table_name_name2,speeding_illegal_data.get(r.nextInt(speeding_illegal_data.size())));
                }else if(Modular_name == "Irregularities_travel"){
                    table_name_map.put(table_name_name2,Irregularities_travel_data.get(r.nextInt(Irregularities_travel_data.size())));
                }else if(Modular_name == "Fatigue_driving"){
                    table_name_map.put(table_name_name2,Fatigue_driving_data.get(r.nextInt(Fatigue_driving_data.size())));
                }else if(Modular_name == "Traffic_congestion_irregularities"){
                    table_name_map.put(table_name_name2,Traffic_congestion_irregularities_data.get(r.nextInt(Traffic_congestion_irregularities_data.size())));
                }else if(Modular_name == "Driver_irregularities"){
                    table_name_map.put(table_name_name2,Driver_irregularities_data.get(r.nextInt(Driver_irregularities_data.size())));
                }else if(Modular_name == "High_speed_overspeed"){
                    table_name_map.put(table_name_name2,High_speed_overspeed_data.get(r.nextInt(High_speed_overspeed_data.size())));
                }else if(Modular_name == "High_speed_violation"){
                    table_name_map.put(table_name_name2,High_speed_violation_data.get(r.nextInt(High_speed_violation_data.size())));
                }else if(Modular_name == "Overcrowding_man"){
                    table_name_map.put(table_name_name2,Overcrowding_man_data.get(r.nextInt(Overcrowding_man_data.size())));
                }else if(Modular_name == "Irregularities_carrying_human_load"){
                    table_name_map.put(table_name_name2,Irregularities_carrying_human_load_data.get(r.nextInt(Irregularities_carrying_human_load_data.size())));
                }else if(Modular_name == "Irregularities"){
                    table_name_map.put(table_name_name2,Irregularities_data.get(r.nextInt(Irregularities_data.size())));
                }else if(Modular_name == "Overcrowding"){
                    table_name_map.put(table_name_name2,Overcrowding_data.get(r.nextInt(Overcrowding_data.size())));
                }

            }
            table_name_map.put(table_name_name3,sdf2.format(cal2.getTime()));
            table_name_list.add(table_name_map);
        }
        map.put("table_name", table_name_list);

        return map;
    }






    //sheet3界面，一开始的车辆信息
    @RequestMapping(value = "/getCarBasicMessage",method = RequestMethod.POST)
    public String getCarBasicMessage(HttpServletRequest request, @RequestParam("car_number") String  car_number) {
        Map message = new HashMap();
        message.put("car_number", car_number);
        String s = this.analysisResultsFeignClient.findCarBasicMessage(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，超速行驶违法模块
    @RequestMapping(value = "/getOverspeedDrivingIllegal",method = RequestMethod.POST)
//    public String getOverspeedDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number) {
//        Map message = new HashMap();
//        message.put("car_number", car_number);
//        String s = this.analysisResultsFeignClient.findOverspeedDrivingIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getOverspeedDrivingIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生0-10的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生0-10的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生0-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生0-10的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("overspeed_driving_number",11);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("overspeed_driving_number",24);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("overspeed_driving_number",9);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("overspeed_driving_number",10);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("overspeed_driving_number",23);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("overspeed_driving_number",11);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","speeding_illegal");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("overspeed_driving_analysis",37.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","超速行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","京深107国道868公里");
//        mapxx1.put("search_illegal_behaviour","在高速公路、城市快速路以外的道路上行驶时，驾驶人未按规定使用安全带的");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","京深107国道868公里");
//        mapxx2.put("search_illegal_behaviour","在高速公路、城市快速路以外的道路上行驶时，驾驶人未按规定使用安全带的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","京深107国道868公里");
//        mapxx3.put("search_illegal_behaviour","在高速公路、城市快速路以外的道路上行驶时，驾驶人未按规定使用安全带的");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","其它路口");
//        mapxx4.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","京深107国道");
//        mapxx5.put("search_illegal_behaviour","未放置保险标志");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        Map mapxx6 = new HashMap<>();
//        mapxx6.put("search_illegal_address","金孟231省道");
//        mapxx6.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx6.put("search_illegal_datetime",sdf2.format((cal6.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        listxx.add(mapxx6);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
         Map apple= getRandom("speeding_illegal","超速行驶","overspeed_driving_number","overspeed_driving_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，事故构成犯罪模块
    @RequestMapping(value = "/getAccidentConstitutesIllegal",method = RequestMethod.POST)
//    public String getAccidentConstitutesIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findAccidentConstitutesIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getAccidentConstitutesIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("accident_constitutes_crime_number",13);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("accident_constitutes_crime_number",22);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("accident_constitutes_crime_number",9);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("accident_constitutes_crime_number",12);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("accident_constitutes_crime_number",20);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("accident_constitutes_crime_number",13);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","accident_constitutes_crime");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("accident_constitutes_crime_analysis",35.2);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","事故构成犯罪");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","幸福路与封曹路交叉口");
//        mapxx1.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","斗武233省道20公里");
//        mapxx2.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","新兰岗至兰花北岗");
//        mapxx3.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","卫柿306省道66公里");
//        mapxx4.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","限高架—解放路三门河东西向东2");
//        mapxx5.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("accident_constitutes_crime","事故构成犯罪","accident_constitutes_crime_number","accident_constitutes_crime_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，交通拥堵违规行驶模块
    @RequestMapping(value = "/getTrafficCongestionIllegal",method = RequestMethod.POST)
//    public String getTrafficCongestionIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findTrafficCongestionIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getTrafficCongestionIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("traffic_congestion_irregularities_number",4);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("traffic_congestion_irregularities_number",8);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("traffic_congestion_irregularities_number",18);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("traffic_congestion_irregularities_number",11);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("traffic_congestion_irregularities_number",5);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("traffic_congestion_irregularities_number",4);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Traffic_congestion_irregularities");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("traffic_congestion_irregularities_analysis",32.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","交通拥堵违规行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","其它路口");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","三原229省道-101公里");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","三原229省道-101公里");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","213省道开封段");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Traffic_congestion_irregularities","交通拥堵违规行驶","traffic_congestion_irregularities_number","traffic_congestion_irregularities_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，使用伪造驾驶证模块
    @RequestMapping(value = "/getUseCounterfeitIllegal",method = RequestMethod.POST)
//    public String getUseCounterfeitIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findUseCounterfeitIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getUseCounterfeitIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("use_counterfeit_driver_license_number",35);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("use_counterfeit_driver_license_number",13);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("use_counterfeit_driver_license_number",9);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("use_counterfeit_driver_license_number",22);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("use_counterfeit_driver_license_number",18);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("use_counterfeit_driver_license_number",35);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","use_counterfeit");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("use_counterfeit_driver_license_analysis",85.9);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","使用伪造驾驶证");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","其它路口");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","三原229省道-101公里");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","213省道开封段");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("use_counterfeit","使用伪造驾驶证","use_counterfeit_driver_license_number","use_counterfeit_driver_license_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，无证驾驶模块
    @RequestMapping(value = "/getUnlicensedDrivingIllegal",method = RequestMethod.POST)
//    public String getUnlicensedDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findUnlicensedDrivingIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getUnlicensedDrivingIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("unlicensed_driving_number",19);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("unlicensed_driving_number",13);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("unlicensed_driving_number",6);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("unlicensed_driving_number",9);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("unlicensed_driving_number",15);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("unlicensed_driving_number",19);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Unlicensed_driving");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("unlicensed_driving_analysis",67.3);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","无证驾驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","济聊一级路35公里");
//        mapxx1.put("search_illegal_behaviour","驾驶机动车在高速公路、城市快速路以外的道路上不按规定车道行驶");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","河西街与东外环岔口");
//        mapxx2.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","晋新高速25公里790米");
//        mapxx3.put("search_illegal_behaviour","在高速公路上不按规定车道行驶的");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx4.put("search_illegal_behaviour","未放置保险标志");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx5.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Unlicensed_driving","无证驾驶","unlicensed_driving_number","unlicensed_driving_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，疲劳驾驶模块
    @RequestMapping(value = "/getFatigueDrivingIllegal",method = RequestMethod.POST)
//    public String getFatigueDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findFatigueDrivingIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getFatigueDrivingIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("fatigue_driving_number",13);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("fatigue_driving_number",21);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("fatigue_driving_number",20);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("fatigue_driving_number",8);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("fatigue_driving_number",15);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("fatigue_driving_number",13);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Fatigue_driving");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("fatigue_driving_analysis",38.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","疲劳驾驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","省道316377公里");
//        mapxx1.put("search_illegal_behaviour","在高速公路、城市快速路以外的道路上行驶时，驾驶人未按规定使用安全带的");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","国道309646公里49米至国道309");
//        mapxx2.put("search_illegal_behaviour","驾驶中型以上载货汽车在高速公路、城市快速路以外的道路上行驶超过规定时速10%未达20%的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","省道7066公里500米至省道706");
//        mapxx3.put("search_illegal_behaviour","驾驶中型以上载客载货汽车，危险物品运输车辆以外的其他机动车行驶超过规定时速未达20%的");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","卫辉市击磬路");
//        mapxx4.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","泰山路与淇河路路口");
//        mapxx5.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Fatigue_driving","疲劳驾驶","fatigue_driving_number","fatigue_driving_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，肇事逃逸模块
    @RequestMapping(value = "/getHitAndRunIllegal",method = RequestMethod.POST)
//    public String getHitAndRunIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findHitAndRunIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getHitAndRunIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("hit_and_run_number",17);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("hit_and_run_number",26);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("hit_and_run_number",11);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("hit_and_run_number",5);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("hit_and_run_number",12);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("hit_and_run_number",17);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Hit_and_run");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("hit_and_run_analysis",3.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","肇事逃逸");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","泰山路与淇河路路口");
//        mapxx1.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","绕城路与逢春社区交叉口");
//        mapxx2.put("search_illegal_behaviour","机动车违反禁止标线指示的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","S104省道7KM+200M-17KM+500M处");
//        mapxx3.put("search_illegal_behaviour","中型以上载货汽车超速20%以上未达50%的");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","叩街路26公里960米");
//        mapxx4.put("search_illegal_behaviour","在高速公路、城市快速路以外的道路上行驶时，驾驶人未按规定使用安全带的");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","山詹225省道31公里150米");
//        mapxx5.put("search_illegal_behaviour","驾驶中型以上载货汽车在高速公路、城市快速路以外的道路上行驶超过规定时速10%未达20%的");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Hit_and_run","肇事逃逸","hit_and_run_number","hit_and_run_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，超员行驶模块
    @RequestMapping(value = "/getOvercrowdingIllegal",method = RequestMethod.POST)
//    public String getOvercrowdingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findOvercrowdingIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getOvercrowdingIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("overcrowding_number",5);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("overcrowding_number",18);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("overcrowding_number",15);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("overcrowding_number",21);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("overcrowding_number",41);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("overcrowding_number",5);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Overcrowding_man");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("overcrowding_analysis",23.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","超员行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","新一街与南环路路口北150米");
//        mapxx1.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","牧野大道与南环路路口北100米");
//        mapxx2.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","牧野大道与南环路路口北50米");
//        mapxx3.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","卡口—人民路中原路向西100米东向西3");
//        mapxx4.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","G6高速390KM-100M处");
//        mapxx5.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Overcrowding_man","超员行驶","overcrowding_number","overcrowding_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，超载行驶模块
    @RequestMapping(value = "/getOverloadingIllegal",method = RequestMethod.POST)
//    public String getOverloadingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findOverloadingIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getOverloadingIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("overloading_number",8);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("overloading_number",10);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("overloading_number",22);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("overloading_number",13);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("overloading_number",15);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("overloading_number",8);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Overcrowding");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("overloading_analysis",37.47);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","超载行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","人民路与枣乡大道路口");
//        mapxx1.put("search_illegal_behaviour","机动车违反禁令标线指示的");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","世纪大道与黄池路交叉口");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","世纪大道与黄池路交叉口");
//        mapxx3.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","京港澳高速758公里");
//        mapxx4.put("search_illegal_behaviour","在高速公路上行驶时，驾驶人未按规定使用安全带的");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","竹林大道幸福路口");
//        mapxx5.put("search_illegal_behaviour","未放置保险标志");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Overcrowding","超载行驶","overloading_number","overloading_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，违规行为模块
    @RequestMapping(value = "/getIrregularitiesIllegal",method = RequestMethod.POST)
//    public String getIrregularitiesIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findIrregularitiesIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getIrregularitiesIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("irregularities_number",22);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("irregularities_number",14);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("irregularities_number",23);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("irregularities_number",18);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("irregularities_number",8);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("irregularities_number",22);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Irregularities");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("irregularities_analysis",67.32);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","违规行为");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","京深107国道868公里");
//        mapxx1.put("search_illegal_behaviour","在高速公路、城市快速路以外的道路上行驶时，驾驶人未按规定使用安全带的");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","河南开封金明大道");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","河南省开封市金明大道");
//        mapxx3.put("search_illegal_behaviour","不按车道行驶");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","永安大道与棉东路交叉口");
//        mapxx4.put("search_illegal_behaviour","未放置保险标志");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","园康路出山连路北侧60米非机动车道");
//        mapxx5.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Irregularities","违规行为","irregularities_number","irregularities_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，违规载人载物模块
    @RequestMapping(value = "/getCarryingHumanLoadIllegal",method = RequestMethod.POST)
//    public String getCarryingHumanLoadIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findCarryingHumanLoadIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getCarryingHumanLoadIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("irregularities_carrying_human_load_number",12);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("irregularities_carrying_human_load_number",13);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("irregularities_carrying_human_load_number",7);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("irregularities_carrying_human_load_number",18);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("irregularities_carrying_human_load_number",20);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("irregularities_carrying_human_load_number",12);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Irregularities_carrying_human_load");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("irregularities_carrying_human_load_analysis",34.67);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","违规载人载物");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","其它路口");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","三原229省道-101公里");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","213省道开封段");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//        String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Irregularities_carrying_human_load","违规载人载物","irregularities_carrying_human_load_number","irregularities_carrying_human_load_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，酒驾醉驾模块
    @RequestMapping(value = "/getDrunkenDrivingIllegal",method = RequestMethod.POST)
//    public String getDrunkenDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findDrunkenDrivingIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getDrunkenDrivingIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("drunken_driving_number",10);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("drunken_driving_number",20);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("drunken_driving_number",13);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("drunken_driving_number",14);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("drunken_driving_number",8);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("drunken_driving_number",10);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","drunk_driving");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("drunken_driving_analysis",23.67);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","酒驾醉驾");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","其它路口");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","三原229省道-101公里");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","213省道开封段");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("drunk_driving","酒驾醉驾","drunken_driving_number","drunken_driving_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，违规行驶模块
    @RequestMapping(value = "/getIrregularitiesDriverIllegal",method = RequestMethod.POST)
//    public String getIrregularitiesDriverIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findIrregularitiesDriverIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getIrregularitiesDriverIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("irregularities_driver_number",27);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("irregularities_driver_number",14);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("irregularities_driver_number",15);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("irregularities_driver_number",30);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("irregularities_driver_number",22);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("irregularities_driver_number",27);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Irregularities_travel");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("irregularities_driver_analysis",74.38);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","违规行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","国道G107河南省新乡段");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","三原229省道-101公里");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","213省道开封段");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Irregularities_travel","违规行驶","irregularities_driver_number","irregularities_driver_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，驾驶人违规行为模块
    @RequestMapping(value = "/getDriverIrregularitiesIllegal",method = RequestMethod.POST)
//    public String getDriverIrregularitiesIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findDriverIrregularitiesIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getDriverIrregularitiesIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("driver_irregularities_number",14);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("driver_irregularities_number",2);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("driver_irregularities_number",13);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("driver_irregularities_number",8);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("driver_irregularities_number",11);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("driver_irregularities_number",14);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Driver_irregularities");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("driver_irregularities_analysis",32.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","驾驶人违规行为");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","其它路口");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","三原229省道-101公里");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","213省道开封段");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Driver_irregularities","驾驶人违规行为","driver_irregularities_number","driver_irregularities_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }


    //sheet3界面，驾驶证异常行驶模块
    @RequestMapping(value = "/getDrivingLicenseAbnormalIllegal",method = RequestMethod.POST)
//    public String getDrivingLicenseAbnormalIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findDrivingLicenseAbnormalIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getDrivingLicenseAbnormalIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("driving_license_abnormal_driving_number",20);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("driving_license_abnormal_driving_number",8);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("driving_license_abnormal_driving_number",12);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("driving_license_abnormal_driving_number",16);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("driving_license_abnormal_driving_number",14);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("driving_license_abnormal_driving_number",20);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Driving_license_abnormal");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("driving_license_abnormal_driving_analysis",43.89);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","驾驶证异常行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","其它路口");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","河南省焦作市沁阳市紫黄路");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","机场路");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","三原229省道-101公里");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","葛嘴302省道55公里");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Driving_license_abnormal","驾驶证异常行驶","driving_license_abnormal_driving_number","driving_license_abnormal_driving_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，高速超速行驶模块
    @RequestMapping(value = "/getHighSpeedOverspeedIllegal",method = RequestMethod.POST)
//    public String getHighSpeedOverspeedIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findHighSpeedOverspeedIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getHighSpeedOverspeedIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("high_speed_overspeed_number",13);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("high_speed_overspeed_number",16);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("high_speed_overspeed_number",20);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("high_speed_overspeed_number",23);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("high_speed_overspeed_number",22);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("high_speed_overspeed_number",13);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","High_speed_overspeed");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("high_speed_overspeed_analysis",34.78);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","高速超速行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","七一西三环");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","213省道开封段");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","葛嘴302省道55公里");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","三原229省道-101公里");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("High_speed_overspeed","高速超速行驶","high_speed_overspeed_number","high_speed_overspeed_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，高速违规行驶模块
    @RequestMapping(value = "/getHighSpeedViolationIllegal",method = RequestMethod.POST)
//    public String getHighSpeedViolationIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findHighSpeedViolationIllegal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getHighSpeedViolationIllegal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("send_time",sdf1.format((cal1.getTime())));
//        map1.put("high_speed_violation_number",13);
//        //2
//        map2.put("send_time",sdf1.format((cal2.getTime())));
//        map2.put("high_speed_violation_number",17);
//        //3
//        map3.put("send_time",sdf1.format((cal3.getTime())));
//        map3.put("high_speed_violation_number",23);
//        //4
//        map4.put("send_time",sdf1.format((cal4.getTime())));
//        map4.put("high_speed_violation_number",20);
//        //5
//        map5.put("send_time",sdf1.format((cal5.getTime())));
//        map5.put("high_speed_violation_number",14);
//        //6
//        map6.put("send_time",sdf1.format((cal6.getTime())));
//        map6.put("high_speed_violation_number",13);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","High_speed_violation");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("high_speed_violation_analysis",37.73);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","高速违规行驶");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("search_illegal_address","213省道开封段");
//        mapxx1.put("search_illegal_behaviour","未放置保险标志");
//        mapxx1.put("search_illegal_datetime",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("search_illegal_address","河南省开封市连云港—郑州—天水");
//        mapxx2.put("search_illegal_behaviour","违反限制或者禁止通行规定的");
//        mapxx2.put("search_illegal_datetime",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("search_illegal_address","九山路与太行大道交叉口");
//        mapxx3.put("search_illegal_behaviour","擅自改变机动车外形和已登记的有关技术数据");
//        mapxx3.put("search_illegal_datetime",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("search_illegal_address","其它路口");
//        mapxx4.put("search_illegal_behaviour","未按照规定安装侧面以及后下部防护装置、粘贴车身反光标识");
//        mapxx4.put("search_illegal_datetime",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("search_illegal_address","三原229省道-101公里");
//        mapxx5.put("search_illegal_behaviour","过度疲劳仍继续驾驶");
//        mapxx5.put("search_illegal_datetime",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("High_speed_violation","高速违规行驶","high_speed_violation_number","high_speed_violation_analysis","search_illegal_address","search_illegal_behaviour","search_illegal_datetime");
        String ko = JSON.toJSONString(apple);
        return ko;
    }


    //下面是预警的模块


    //sheet3界面，超速预警模块
    @RequestMapping(value = "/getListOverspeed",method = RequestMethod.POST)
//    public String getListOverspeed(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListOverspeed(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListOverspeed() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("超速预警次数",3);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("超速预警次数",9);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("超速预警次数",4);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("超速预警次数",13);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("超速预警次数",18);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("超速预警次数",11);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","speeding_alarm");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("CHAOSUFENXIZHI",6.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","超速预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","72");
//        mapxx1.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","41");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","41");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","63");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","79");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("speeding_alarm","超速预警","超速预警次数","CHAOSUFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，疲劳驾驶预警模块
    @RequestMapping(value = "/getListFatigue",method = RequestMethod.POST)
//    public String getListFatigue(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListFatigue(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListFatigue() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("疲劳驾驶预警次数",6);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("疲劳驾驶预警次数",9);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("疲劳驾驶预警次数",20);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("疲劳驾驶预警次数",9);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("疲劳驾驶预警次数",24);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("疲劳驾驶预警次数",13);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","fatigue_alarm");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("PILAOJIASHIFENXIZHI",23.3);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","疲劳驾驶预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","69");
//        mapxx1.put("DIDIAN","湖南省湘潭市湘乡市毛田镇G60沪昆高速水府庙服务区");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","61");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","63");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","79");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","40");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("fatigue_alarm","疲劳驾驶预警","疲劳驾驶预警次数","PILAOJIASHIFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，预警模块
    @RequestMapping(value = "/getListWarning",method = RequestMethod.POST)
//    public String getListWarning(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListWarning(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListWarning() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("预警次数",8);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("预警次数",9);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("预警次数",12);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("预警次数",24);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("预警次数",7);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("预警次数",4);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","early_warning");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("YUJINGFENXIZHI",32.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","69");
//        mapxx1.put("DIDIAN","湖南省邵阳市绥宁县长铺子苗族乡靖武高速");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","40");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","33");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","35");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","36");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("early_warning","其他预警","预警次数","YUJINGFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，终端设备故障预警模块
    @RequestMapping(value = "/getListTerminal",method = RequestMethod.POST)
//    public String getListTerminal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListTerminal(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListTerminal() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("终端设备故障预警次数",8);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("终端设备故障预警次数",10);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("终端设备故障预警次数",16);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("终端设备故障预警次数",4);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("终端设备故障预警次数",8);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("终端设备故障预警次数",23);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Terminal_equipment_fault_warning");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("ZHONGDUANFENXIZHI",35.4);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","终端设备故障预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","57");
//        mapxx1.put("DIDIAN","江苏省连云港市赣榆区黑林镇242省道");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","57");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","68");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","68");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","31");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Terminal_equipment_fault_warning","终端设备故障预警","终端设备故障预警次数","ZHONGDUANFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，驾驶时长异常预警模块
    @RequestMapping(value = "/getListDrivingTime",method = RequestMethod.POST)
//    public String getListDrivingTime(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListDrivingTime(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListDrivingTime() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("驾驶时长异常预警次数",6);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("驾驶时长异常预警次数",10);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("驾驶时长异常预警次数",8);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("驾驶时长异常预警次数",13);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("驾驶时长异常预警次数",11);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("驾驶时长异常预警次数",20);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Abnormal_early_warning");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("JIASHISHICHANGFENXIZHI",36.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","驾驶时长异常预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","38");
//        mapxx1.put("DIDIAN","江苏省连云港市赣榆区黑林镇242省道");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","85");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","85");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","53");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","53");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Abnormal_early_warning","驾驶时长异常预警","驾驶时长异常预警次数","JIASHISHICHANGFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，超时停车预警模块
    @RequestMapping(value = "/getListTimeoutParking",method = RequestMethod.POST)
//    public String getListTimeoutParking(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListTimeoutParking(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListTimeoutParking() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("超时停车预警次数",13);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("超时停车预警次数",11);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("超时停车预警次数",9);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("超时停车预警次数",6);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("超时停车预警次数",21);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("超时停车预警次数",4);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","timeout_parking");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("CHAOSHITINGCHEFENXIZHI",53.5);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","超时停车预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","39");
//        mapxx1.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","53");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","60");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","60");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","67");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("timeout_parking","超时停车预警","超时停车预警次数","CHAOSHITINGCHEFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，行驶路线异常预警模块
    @RequestMapping(value = "/getListAbnormalRoute",method = RequestMethod.POST)
//    public String getListAbnormalRoute(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListAbnormalRoute(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListAbnormalRoute() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("行驶路线异常预警次数",10);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("行驶路线异常预警次数",14);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("行驶路线异常预警次数",8);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("行驶路线异常预警次数",20);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("行驶路线异常预警次数",24);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("行驶路线异常预警次数",15);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","driving_route_warnning");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("XINGSHILUXIANYICHANGFENXIZHI",32.6);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","行驶路线异常预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","72");
//        mapxx1.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","66");
//        mapxx2.put("DIDIAN","江苏省连云港市赣榆区黑林镇242省道");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","78");
//        mapxx3.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","78");
//        mapxx4.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","67");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("driving_route_warnning","行驶路线异常预警","行驶路线异常预警次数","XINGSHILUXIANYICHANGFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，路线偏离预警模块
    @RequestMapping(value = "/getListLineDeviation",method = RequestMethod.POST)
//    public String getListLineDeviation(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListLineDeviation(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListLineDeviation() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("路线偏离预警次数",8);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("路线偏离预警次数",12);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("路线偏离预警次数",13);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("路线偏离预警次数",5);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("路线偏离预警次数",28);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("路线偏离预警次数",15);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Line_deviation_early");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("LUXIANPIANLIYUJINGFENXIZHI",35.2);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","路线偏离预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","22");
//        mapxx1.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","65");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","80");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","80");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","63");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Line_deviation_early","路线偏离预警","路线偏离预警次数","LUXIANPIANLIYUJINGFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，车辆异常预警模块
    @RequestMapping(value = "/getListAbnormalVehicle",method = RequestMethod.POST)
//    public String getListAbnormalVehicle(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListAbnormalVehicle(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListAbnormalVehicle() {
//        List list = new ArrayList();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Map map1 = new HashMap<>();
//        Map map2 = new HashMap<>();
//        Map map3 = new HashMap<>();
//        Map map4 = new HashMap<>();
//        Map map5 = new HashMap<>();
//        Map map6 = new HashMap<>();
//        int a=(int)(Math.random()*2);//产生0-2的整数随机数
//        Calendar cal1=Calendar.getInstance();
//        cal1.set(Calendar.MINUTE,-a);
//
//        int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//        Calendar cal2=Calendar.getInstance();
//        cal2.set(Calendar.MINUTE,-b);
//
//        int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//        Calendar cal3=Calendar.getInstance();
//        cal3.set(Calendar.MINUTE,-c);
//
//
//        int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//        Calendar cal4=Calendar.getInstance();
//        cal4.set(Calendar.MINUTE,-d);
//
//
//        int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//        Calendar cal5=Calendar.getInstance();
//        cal5.set(Calendar.MINUTE,-e);
//
//        int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//        Calendar cal6=Calendar.getInstance();
//        cal6.set(Calendar.MINUTE,-e2);
//
//        //1
//        map1.put("TIME",sdf1.format((cal1.getTime())));
//        map1.put("车辆异常预警次数",15);
//        //2
//        map2.put("TIME",sdf1.format((cal2.getTime())));
//        map2.put("车辆异常预警次数",18);
//        //3
//        map3.put("TIME",sdf1.format((cal3.getTime())));
//        map3.put("车辆异常预警次数",22);
//        //4
//        map4.put("TIME",sdf1.format((cal4.getTime())));
//        map4.put("车辆异常预警次数",10);
//        //5
//        map5.put("TIME",sdf1.format((cal5.getTime())));
//        map5.put("车辆异常预警次数",16);
//        //6
//        map6.put("TIME",sdf1.format((cal6.getTime())));
//        map6.put("车辆异常预警次数",9);
//
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        list.add(map5);
//        list.add(map6);
//        Map map0 =new HashMap();
//        map0.put("chart_name",list);
//        map0.put("Modular_name","Abnormal_warning_vehicle");
//        Map overspeed_driving_analysis =new HashMap();
//        overspeed_driving_analysis.put("CHELIANGYICHANGFENXIZHI",41.1);
//        List listx = new ArrayList();
//        listx.add(overspeed_driving_analysis);
//        map0.put("table_head_name",listx);
//        map0.put("name","车辆异常预警");
//        List listxx = new ArrayList();
//        Map mapxx1 = new HashMap<>();
//        mapxx1.put("SUDU","53");
//        mapxx1.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx1.put("Time",sdf2.format((cal1.getTime())));
//        Map mapxx2 = new HashMap<>();
//        mapxx2.put("SUDU","63");
//        mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//        mapxx2.put("Time",sdf2.format((cal2.getTime())));
//        Map mapxx3 = new HashMap<>();
//        mapxx3.put("SUDU","63");
//        mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//        mapxx3.put("Time",sdf2.format((cal3.getTime())));
//        Map mapxx4 = new HashMap<>();
//        mapxx4.put("SUDU","22");
//        mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//        mapxx4.put("Time",sdf2.format((cal4.getTime())));
//        Map mapxx5 = new HashMap<>();
//        mapxx5.put("SUDU","22");
//        mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//        mapxx5.put("Time",sdf2.format((cal5.getTime())));
//        listxx.add(mapxx1);
//        listxx.add(mapxx2);
//        listxx.add(mapxx3);
//        listxx.add(mapxx4);
//        listxx.add(mapxx5);
//        map0.put("table_name",listxx);
//                String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("Abnormal_warning_vehicle","车辆异常预警","车辆异常预警次数","CHELIANGYICHANGFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
    }

    //sheet3界面，车辆非法行驶预警模块
    @RequestMapping(value = "/getListIllegalDriving",method = RequestMethod.POST)
//    public String getListIllegalDriving(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        Map message =new HashMap();
//        message.put("car_number",car_number);
//        String s = this.analysisResultsFeignClient.findListIllegalDriving(message);
////        String s = JSON.toJSONString(some);
//        return s;
//    }
    public String getListIllegalDriving() {
//            List list = new ArrayList();
//            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
//            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Map map1 = new HashMap<>();
//            Map map2 = new HashMap<>();
//            Map map3 = new HashMap<>();
//            Map map4 = new HashMap<>();
//            Map map5 = new HashMap<>();
//            Map map6 = new HashMap<>();
//            int a=(int)(Math.random()*2);//产生0-2的整数随机数
//            Calendar cal1=Calendar.getInstance();
//            cal1.set(Calendar.MINUTE,-a);
//
//            int b=(int)(Math.random()*4+2);//产生2-4的整数随机数
//            Calendar cal2=Calendar.getInstance();
//            cal2.set(Calendar.MINUTE,-b);
//
//            int c=(int)(Math.random()*6+4);//产生4-6的整数随机数
//            Calendar cal3=Calendar.getInstance();
//            cal3.set(Calendar.MINUTE,-c);
//
//
//            int d=(int)(Math.random()*8+6);//产生6-8的整数随机数
//            Calendar cal4=Calendar.getInstance();
//            cal4.set(Calendar.MINUTE,-d);
//
//
//            int e=(int)(Math.random()*10+8);//产生8-10的整数随机数
//            Calendar cal5=Calendar.getInstance();
//            cal5.set(Calendar.MINUTE,-e);
//
//            int e2=(int)(Math.random()*12+10);//产生10-12的整数随机数
//            Calendar cal6=Calendar.getInstance();
//            cal6.set(Calendar.MINUTE,-e2);
//
//            //1
//            map1.put("TIME",sdf1.format((cal1.getTime())));
//            map1.put("车辆非法行驶预警次数",18);
//            //2
//            map2.put("TIME",sdf1.format((cal2.getTime())));
//            map2.put("车辆非法行驶预警次数",20);
//            //3
//            map3.put("TIME",sdf1.format((cal3.getTime())));
//            map3.put("车辆非法行驶预警次数",23);
//            //4
//            map4.put("TIME",sdf1.format((cal4.getTime())));
//            map4.put("车辆非法行驶预警次数",15);
//            //5
//            map5.put("TIME",sdf1.format((cal5.getTime())));
//            map5.put("车辆非法行驶预警次数",10);
//            //6
//            map6.put("TIME",sdf1.format((cal6.getTime())));
//            map6.put("车辆非法行驶预警次数",21);
//
//            list.add(map1);
//            list.add(map2);
//            list.add(map3);
//            list.add(map4);
//            list.add(map5);
//            list.add(map6);
//            Map map0 =new HashMap();
//            map0.put("chart_name",list);
//            map0.put("Modular_name","warning_vehicle_illegal_driving");
//            Map overspeed_driving_analysis =new HashMap();
//            overspeed_driving_analysis.put("CHELIANGFEIFAFENXIZHI",42.3);
//            List listx = new ArrayList();
//            listx.add(overspeed_driving_analysis);
//            map0.put("table_head_name",listx);
//            map0.put("name","车辆非法行驶预警");
//            List listxx = new ArrayList();
//            Map mapxx1 = new HashMap<>();
//            mapxx1.put("SUDU","76");
//            mapxx1.put("DIDIAN","安徽省马鞍山市雨山区银塘镇G4211宁芜高速");
//            mapxx1.put("Time",sdf2.format((cal1.getTime())));
//            Map mapxx2 = new HashMap<>();
//            mapxx2.put("SUDU","74");
//            mapxx2.put("DIDIAN","安徽省马鞍山市博望区丹阳镇S24常合高速");
//            mapxx2.put("Time",sdf2.format((cal2.getTime())));
//            Map mapxx3 = new HashMap<>();
//            mapxx3.put("SUDU","81");
//            mapxx3.put("DIDIAN","湖南省湘潭市湘乡市东郊乡G60沪昆高速");
//            mapxx3.put("Time",sdf2.format((cal3.getTime())));
//            Map mapxx4 = new HashMap<>();
//            mapxx4.put("SUDU","81");
//            mapxx4.put("DIDIAN","广东省佛山市南海区里水镇S82佛山一环高速");
//            mapxx4.put("Time",sdf2.format((cal4.getTime())));
//            Map mapxx5 = new HashMap<>();
//            mapxx5.put("SUDU","49");
//            mapxx5.put("DIDIAN","福建省三明市明溪县胡坊镇G72泉南高速");
//            mapxx5.put("Time",sdf2.format((cal5.getTime())));
//            listxx.add(mapxx1);
//            listxx.add(mapxx2);
//            listxx.add(mapxx3);
//            listxx.add(mapxx4);
//            listxx.add(mapxx5);
//            map0.put("table_name",listxx);
//                    String ko = JSON.toJSONString(map0);
//        return ko;
        Map apple= getRandom("warning_vehicle_illegal_driving","车辆非法行驶预警","车辆非法行驶预警次数","CHELIANGFEIFAFENXIZHI","SUDU","DIDIAN","Time");
        String ko = JSON.toJSONString(apple);
        return ko;
        }

    //sheet3界面，根据车牌号获得三个分页的表格数据
    @RequestMapping(value = "/getCarList",method = RequestMethod.POST)
    public String getCarList(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findCarList(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，车辆整改意见
    @RequestMapping(value = "/getCarHandlingOpinions",method = RequestMethod.POST)
    public String CarHandlingOpinions(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findCarHandlingOpinions(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，静态数据分析大图
    @RequestMapping(value = "/getCarAnalysis",method = RequestMethod.POST)
    public String getCarAnalysis(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findCarAnalysis(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3风险提示
    @RequestMapping(value = "/getCarRiskHints",method = RequestMethod.POST)
    public String getCarRiskHints(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findCarRiskHints(message);
//        String s = JSON.toJSONString(some);
        return s;
    }






    //以下是History版本的Sheet3
    //sheet3界面，根据车牌照查询车辆整改建议
    @RequestMapping(value = "/getHistoryCarHandlingOpinions",method = RequestMethod.POST)
    public String GetHistoryCarHandlingOpinions(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryCarHandlingOpinions(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，根据车牌照查询车辆基本信息
    @RequestMapping(value = "/getHistoryCarBasicMessage",method = RequestMethod.POST)
    public String GetHistoryCarBasicMessage(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryCarBasicMessage(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，事故整合1
    @RequestMapping(value = "/getHistoryAccidentConstitutesIllegal",method = RequestMethod.POST)
    public String GetHistoryAccidentConstitutesIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryAccidentConstitutesIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合交通拥堵违规行驶2
    @RequestMapping(value = "/getHistoryTrafficCongestionIllegal",method = RequestMethod.POST)
    public String GetHistoryTrafficCongestionIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryTrafficCongestionIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合使用伪造驾驶证3
    @RequestMapping(value = "/getHistoryUseCounterfeitIllegal",method = RequestMethod.POST)
    public String GetHistoryUseCounterfeitIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryUseCounterfeitIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，驾驶证异常行驶15
    @RequestMapping(value = "/getHistoryDrivingLicenseAbnormalIllegal",method = RequestMethod.POST)
    public String GetHistoryDrivingLicenseAbnormalIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryDrivingLicenseAbnormalIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合无证驾驶4
    @RequestMapping(value = "/getHistoryUnlicensedDrivingIllegal",method = RequestMethod.POST)
    public String GetHistoryUnlicensedDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryUnlicensedDrivingIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合疲劳驾驶5
    @RequestMapping(value = "/getHistoryFatigueDrivingIllegal",method = RequestMethod.POST)
    public String GetHistoryFatigueDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryFatigueDrivingIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合肇事逃逸6
    @RequestMapping(value = "/getHistoryHitAndRunIllegal",method = RequestMethod.POST)
    public String GetHistoryHitAndRunIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryHitAndRunIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合超员行驶7
    @RequestMapping(value = "/getHistoryOvercrowdingIllegal",method = RequestMethod.POST)
    public String GetHistoryOvercrowdingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryOvercrowdingIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合超载行驶8
    @RequestMapping(value = "/getHistoryOverloadingIllegal",method = RequestMethod.POST)
    public String GetHistoryOverloadingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryOverloadingIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合超速行驶9
    @RequestMapping(value = "/getHistoryOverspeedDrivingIllegal",method = RequestMethod.POST)
    public String GetHistoryOverspeedDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryOverspeedDrivingIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合违规行为10
    @RequestMapping(value = "/getHistoryIrregularitiesIllegal",method = RequestMethod.POST)
    public String GetHistoryIrregularitiesIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryIrregularitiesIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合违规行驶11
    @RequestMapping(value = "/getHistoryIrregularitiesDriverIllegal",method = RequestMethod.POST)
    public String GetHistoryIrregularitiesDriverIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryIrregularitiesDriverIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合违规载人载物12
    @RequestMapping(value = "/getHistoryCarryingHumanLoadIllegal",method = RequestMethod.POST)
    public String GetHistoryCarryingHumanLoadIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryCarryingHumanLoadIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合酒驾醉驾13
    @RequestMapping(value = "/getHistoryDrunkenDrivingIllegal",method = RequestMethod.POST)
    public String GetHistoryDrunkenDrivingIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryDrunkenDrivingIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合驾驶人违规行为14
    @RequestMapping(value = "/getHistoryDriverIrregularitiesIllegal",method = RequestMethod.POST)
    public String GetHistoryDriverIrregularitiesIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryDriverIrregularitiesIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，整合高速超速行驶16
    @RequestMapping(value = "/getHistoryHighSpeedOverspeedIllegal",method = RequestMethod.POST)
    public String GetHistoryHighSpeedOverspeedIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryHighSpeedOverspeedIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，高速违规行驶17
    @RequestMapping(value = "/getHistoryHighSpeedViolationIllegal",method = RequestMethod.POST)
    public String GetHistoryHighSpeedViolationIllegal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryHighSpeedViolationIllegal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，18超速预警
    @RequestMapping(value = "/getHistoryOverspeed",method = RequestMethod.POST)
    public String GetHistoryOverspeed(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.getHistoryOverspeed(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，19疲劳驾驶预警
    @RequestMapping(value = "/getHistoryFatigue",method = RequestMethod.POST)
    public String GetHistoryFatigue(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryFatigue(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，20预警
    @RequestMapping(value = "/getHistoryWarning",method = RequestMethod.POST)
    public String GetHistoryWarning(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryWarning(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，21终端设备故障预警
    @RequestMapping(value = "/getHistoryTerminal",method = RequestMethod.POST)
    public String GetHistoryTerminal(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryTerminal(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，22驾驶时长异常预警
    @RequestMapping(value = "/getHistoryDrivingTime",method = RequestMethod.POST)
    public String GetHistoryDrivingTime(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryDrivingTime(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，23超时停车预警
    @RequestMapping(value = "/getHistoryTimeoutParking",method = RequestMethod.POST)
    public String GetHistoryTimeoutParking(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryTimeoutParking(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，24行驶路线异常预警
    @RequestMapping(value = "/getHistoryAbnormalRoute",method = RequestMethod.POST)
    public String GetHistoryAbnormalRoute(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryAbnormalRoute(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，25路线偏离预警
    @RequestMapping(value = "/getHistoryLineDeviation",method = RequestMethod.POST)
    public String GetHistoryLineDeviation(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryLineDeviation(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，26车辆异常预警
    @RequestMapping(value = "/getHistoryAbnormalVehicle",method = RequestMethod.POST)
    public String GetHistoryAbnormalVehicle(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryAbnormalVehicle(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，27车辆非法行驶预警
    @RequestMapping(value = "/getHistoryIllegalDriving",method = RequestMethod.POST)
    public String GetHistoryIllegalDriving(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryIllegalDriving(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，根据车牌照号获得运输数据
    @RequestMapping(value = "/getHistoryCarList",method = RequestMethod.POST)
    public String getHistoryCarList(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.getHistoryCarList(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3界面，静态数据分析大图
    @RequestMapping(value = "/getHistoryCarAnalysis",method = RequestMethod.POST)
    public String getHistoryCarAnalysis(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryCarAnalysis(message);
//        String s = JSON.toJSONString(some);
        return s;
    }

    //sheet3风险提示
    @RequestMapping(value = "/getHistoryCarRiskHints",method = RequestMethod.POST)
    public String getHistoryCarRiskHints(HttpServletRequest request, @RequestParam("car_number") String  car_number){
        Map message =new HashMap();
        message.put("car_number",car_number);
        String s = this.analysisResultsFeignClient.findHistoryCarRiskHints(message);
//        String s = JSON.toJSONString(some);
        return s;
    }




//    @RequestMapping(value = "/test",method = RequestMethod.POST)
//    public String gettest(HttpServletRequest request, @RequestParam("car_number") String  car_number){
//        return "{\"table\":[{\"tablename\":\"speeding_illegal\"}],\"biao\":[{\"search_illegal_address\":\"斗武线\",\"search_illegal_behaviour\":\"驾驶中型以上载货汽车在高速公路、城市快速路以外的道路上行驶超过规定时速10%未达20%的\",\"search_illegal_datetime\":1516339603000},{\"search_illegal_address\":\"斗武线2\",\"search_illegal_behaviour\":\"驾驶da型以上载货汽车在高速公路、城市快速路以外的道路上行驶超过规定时速10%未达20%的\",\"search_illegal_datetime\":1516339603000}],\"tou\":[{\"send_time\":1516353360000,\"overspeed_driving_analysis\":5.0}],\"tu\":[]}\n" ;
//    }
}
