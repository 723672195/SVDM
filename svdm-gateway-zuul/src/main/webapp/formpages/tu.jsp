<%--
  Created by IntelliJ IDEA.
  User: msi
  Date: 2018/3/2
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath  = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
%>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Fascinating Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <!-- //mobile apps -->
    <!-- Custom Theme files -->
    <link rel="shortcut icon" href="images/logtitle.ico">
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="css/bootstrap-table.css" type="text/css" rel="stylesheet" media="all">
    <link href="css/style.css" type="text/css" rel="stylesheet" media="all">
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    <!-- //Custom Theme files -->
    <!-- js -->
    <script src="js/jquery-2.1.4.min.js"></script>
    <script src="js/echarts.min.js"></script>
    <!-- //js -->
    <!-- start-smooth-scrolling -->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
            });
        });
    </script>
    <link rel="stylesheet" type="text/css" href="css/tab/raccordion.css" />

</head>
<body>
<div id="operationBehavior" style="width: 540px;height: 450px;margin-left: 500px;display:none;"></div>


<script type="text/javascript">
    var webPath='<%=basePath%>';
    var unit_id=${param.unit_id};
    var leidaVal = [];
    var leidaChart = echarts.init(document.getElementById('operationBehavior'));
    var picInfo;
    $(document).ready(function downloadMyChart() {
        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getSomeMessage",
            async: false,
            data: {unit_id: unit_id},
            success: function (data) {
                if (data != "[]" && data != "") {
                    var json = JSON.parse(data);

                    driver = json[0].driver_analysis;                 //driver_analysis   驾驶人员分析
                    car = json[0].vehicle_conditions_analysis;                                   //vehicle_conditions_analysis    车辆情况分析
                    road = json[0].road_condition_analysis;                    //road_condition_analysis  道路情况分析
                    weather = json[0].weather_condition_analysis;       //weather_condition_analysis  天气情况分析
                    administration = json[0].management_situation_analysis;                 //management_situation_analysis   管理情况分析
                    maxShow = 100;

                    driver = parseFloat(driver).toFixed(2);
                    car = parseFloat(car).toFixed(2);
                    road = parseFloat(road).toFixed(2);
                    weather = parseFloat(weather).toFixed(2);
                    administration = parseFloat(administration).toFixed(2);

                    driver = 100 - parseInt(driver);
                    car = 100 - parseInt(car);
                    road = parseInt(road);
                    weather = parseInt(weather);
                    administration = 100 - parseInt(administration);

                    leidaVal = [driver, car, road, weather, administration];
                    option = {
                        animation:false,
                        tooltip: {},
                        legend: {
                            data: ['事故风险指数（RAI）']
                        },
                        radar: {
                            // shape: 'circle',
                            name: {
                                textStyle: {
                                    color: '#fff',
                                    backgroundColor: '#999',
                                    borderRadius: 3,
                                    padding: [3, 5]
                                }
                            },
                            indicator: [
                                {name: '驾驶人员', max: maxShow},
                                {name: '车辆情况', max: maxShow},
                                {name: '道路情况', max: maxShow},
                                {name: '天气情况', max: maxShow},
                                {name: '管理情况', max: maxShow}
                            ]
                        },
                        series: [{
                            name: '预算 vs 开销（Budget vs spending）',
                            type: 'radar',
                            // areaStyle: {normal: {}},
                            data: [
                                {
                                    value: leidaVal,
                                    name: '综合营运行为分析（Integrated Operating Behavior Analysis）'
                                }
                            ]
                        }]
                    };
                    leidaChart.setOption(option);

                    picInfo = leidaChart.getDataURL();
                }
            }
        });

        $.ajax({
            type: "POST",
            url: webPath+"/createWord",
            async: false,
            data: {unit_id: unit_id,coding:picInfo},
            success:function (data) {
                window.location.href=data;
            }

        })

    });



//    function EconfigAPI(data){
//        // 路径配置
//        require.config({
//            paths: {
//                echarts: './js/echarts'
//            }
//        });
//        // 使用
//        require(
//            [
//                'echarts',
//                'echarts/chart/pie' // 使用柱状图
//            ],
//            function (ec) {
//                synDrawEcharts(ec,data);
//            }
//        );
//    }
//
//    function synDrawEcharts(ec,data){
//        //--- 折柱 ---
//        barCampaign = ec.init(document.getElementById('operationBehavior'),theme);// 缴费情况
//        myChart = barCampaign;      // 赋给全局变量
//
//        barCampaign.showLoading({
//            text : "图表数据正在努力加载..."
//        });
//
//    }
//
//    var picBase64Info = myChart.getDataURL();   //获取base64编码
//    //  var picBase64Info = myChart.getImage();     //
</script>
</body>
</html>
