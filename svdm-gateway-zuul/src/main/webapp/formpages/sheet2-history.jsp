 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String basePath  = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/sheet";
%>
<!DOCTYPE html>
<html>
<head>
<title>交通运输管理系统</title>
<!-- mobile apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Fascinating Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
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
<!-- web-fonts -->
<link href='//fonts.googleapis.com/css?family=Buda:300' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>
<!-- //web-fonts -->
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
	<script type="text/javascript">
        $(window).load(function () {
            $('#accordion-wrapper').raccordion({
                speed: 1000,
                sliderWidth: 700,
                sliderHeight: 300,
                autoCollapse: false
            });
        });

	</script>
	<!--skycons-icons-->
	<script src="js/skycons.js"></script>
<!-- //end-smooth-scrolling -->
</head>
<body>
    <div style="z-index:10;width:100px;height:100px;position:fixed;bottom: 0;left: 3%;">
        <button onclick="goBack()" style="width: 50px;height: 50px;border: 1px solid GrayText;border-radius: 100%; margin-top: 25px;">返回</button>
    </div>
	<%--<div style="z-index:10;width:100px;height:100px;position:absolute;top:20px;right: 2%;">--%>
		<%--<button onclick="getExport()" style="color:#ffffff;width: 70px;height: 70px;border: 4px solid rgba(255,255,255,0.8);border-radius: 100%; margin-top: 25px;background-color:rgba(0,0,0,0);font-weight:bold;font-size: 18px">报告导出</button>--%>
	<%--</div>--%>
	<!-- banner -->
	<div class="banner">
		<div class="banner-info" >
			<div class="banner-top">
				<div class="container">
					<div class="banner-top-grids banner-top-left" style="width: 20%">
						<ul class="social-icons">
							<li style="color: white;"></li>
							<li style="color: white;"></li>
							<li style="color: white;"></li>
						</ul>
					</div>
					<div class="banner-top-grids banner-logo" style="width: 60%">
						<a href="index.html">
							<div class="img-top-div"><img src="images/1.png" alt=""/></div>
							<h1>道路运输安全生产考核与评价系统<span id="top-span">新乡市道路运输管理局</span></h1>
						</a>
					</div>
					<div class="w3ls-row alert" style="margin-top: 10em;margin-bottom: 3em;">
						<div class="col-md-6 welcome-left">
							<div id="leida" onclick="et2_2Jsp()" style="width: 100%;height: 376px;border-color: white;" ></div>
						</div>
						<div class="col-md-6 welcome-right" style="box-shadow: 0 0 1px 1px transparent;">
							<h4 style="color: white;padding-left: 6.5em;text-indent: -6.5em;" >公司名称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span style="margin-left: 0.5em;width: 100%;" id="unit_name"></span></h4>
							<h4 style="color: white;" >运输性质&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="unit_type" style="margin-left: 0.5em"></span> </h4>
							<h4 style="color: white;" >车辆保有量：<span id="car_count" style="margin-left: 0.5em;"></span> </h4>
							<h4 style="color: white;" id="HYNL">货运能力&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="transportation_capacity_count" style="margin-left: 0.5em"></span></h4>
							<h4 style="color: white;" id="KYNL">客运能力&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="seat" style="margin-left: 0.5em"></span></h4>
							<h4 style="color: white;">风险级别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="RAI_number" style="margin-left: 0.5em"></span> </h4>
							<%--<a href="javascript:void(0)" class="more"  onclick="getExport()" class="more" style="float: right;">报告导出</a>--%>
							<a href="javascript:void(0)" id="compute" class="more" style="float: right;margin-right: 80px;"></a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix">  </div>
				</div>
			</div>
		</div>
	</div>

	<div class="latest">
		<div class="container">
			<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="yyxw_header">
				<h3>综合营运行为分析</h3>
				<p>Integrated operating behavior analysis. </p>
			</div>
			<%--营运行为--%>
			<div class="w3ls-row" id="yyxw_table">
				<div class="col-sm-6 col-md-6  w3latest-grids">
					<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示 </p>

					<table id="operation_behavior_table" data-pagination="true" class="table-striped">
						<thead>
						<tr>
							<th data-field="time">一级分类</th>
							<th data-field="car_plate_number">二级分类</th>
							<th data-field="address">分析指数</th>
						</tr>
						</thead>
					</table>
				</div>
				<div class="col-sm-6 col-md-6  w3latest-grids">
                    <div style="align-content: center ; font-size: 1em"><a href="javascript:void(0)" onclick="toSheet2_2Jsp()">查看详情</a></div>
					<div id="operationBehavior" onclick="toSheet2_2Jsp()" style="width: auto;height: 450px;"></div>

				</div>
				<div class="clearfix"> </div>
			</div>

			<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h3>风险提示</h3>
				<p>Risk tip. </p>
			</div>
			<p id="msg"></p>
			<%--<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h4 style="color: white;" id="msg"> </h4>
				&lt;%&ndash;<p id="msg"> </p>&ndash;%&gt;
			</div>--%>

			<div class="clearfix"> </div>

			<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h3>整改意见</h3>
				<p>Rectification opinion. </p>
			</div>
			<div class="w3ls-row">
				<div class="col-sm-12 col-md-12  w3latest-grids">
					<table id="suggest"
						   class="table-striped">
						<thead>
						<tr>
							<th data-field="id">序号</th>
							<th data-field="yijian">详细信息</th>
						</tr>
						</thead>
					</table>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
			<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h3>车辆RAI分析</h3>
				<p>Vehicle RAI analysis. </p>
			</div>
			<div class="services-w3ls-row" id="cars_no">
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //latest -->
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="footer-bottom">
				<p>© 2017 jiuqu data . All rights reserved | Design by <a href="http://w3layouts.com">jiuqu data.</a></p>
			</div>
		</div>
	</div>
	<!-- //footer --> 
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
        var webPath='<%=basePath%>';                  //网址相关
        <%--var webPath2='<%=basePath2%>';              //同上--%>
        <%--var unit_id = "<%=request.getParameter("unit_id")%>";--%>
        var unit_id=${param.unit_id};//指这个界面公司的id
        var unit_name="";                                         //公司名字
        var commonDataList=[];                                //
        var suggest = [];
        var leidaVal=[];
        var weather_efficiency=0;
        var maxShow ;
        var driver=0;

        var carCount = "";


        function goBack(){
            window.location.href=webPath+"/formpages/sheet1-history.jsp";
        };

        function getMsg() {
            $.ajax({
                type: "POST",
                url: webPath+"/svdm/risk/getUnitHistoryMessage",
                async: false,
                data: {unit_id: unit_id},
                success: function (data) {
                    if (data != "[]") {
                        var json = JSON.parse(data);
                        carCount = json[0].risk_hints;

                        var flg = json[0].risk_grade;
                        if(flg == "稍有危险"){
                            $("#compute").css("background-color","#66CC33");
                            document.getElementById("RAI_number").innerHTML="一级";
                        }else if(flg == "一般危险"){
                            $("#compute").css("background-color","#FFD700");
                            document.getElementById("RAI_number").innerHTML="二级";
                        }else if(flg == "显著危险"){
                            $("#compute").css("background-color","#FF8C00");
                            document.getElementById("RAI_number").innerHTML="三级";
                        }else if(flg == "高度危险"){
                            $("#compute").css("background-color","#FF0000");
                            document.getElementById("RAI_number").innerHTML="四级";
                        }else if(flg == "极其危险"){
                            $("#compute").css("background-color","#990000");
                            document.getElementById("RAI_number").innerHTML="五级";
                        }else {driver=0
                            document.getElementById("RAI_number").innerHTML="无等级";
                        }

                        document.getElementById("compute").innerHTML="RAI指数："+json[0].rai_count+"%";  // 找到元素
                        function getLeiDa() {
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


                            weather_efficiency = weather;
                            leidaVal = [driver, car, road, weather, administration];
                            option = {
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
                            // 使用刚指定的配置项和数据显示图表。
                            operationBehavior.setOption(option);
                            leidaChart.setOption(option);
                        }

                        getLeiDa();
                    }else {
                        var json = JSON.parse(data);
                        carCount = "暂无数据";
                        document.getElementById("compute").innerHTML="RAI指数：0%";  // 找到元素
                        function getLeiDa() {
                            leidaVal = [0,0,0,0,0];
                            option = {
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
                            // 使用刚指定的配置项和数据显示图表。
                            operationBehavior.setOption(option);
                            leidaChart.setOption(option);
                        }
                        getLeiDa();
                    }
                }
            });

            var message = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+unit_name+"在安全生产中存在以下风险行为："

            $("#msg").html(message+carCount+"。");


        }


        function getAllBusinessUnitInfo(){// 页面一开始，公司信息
            $.ajax({
                type: "POST",
                url: webPath+"/svdm/unit/getCompanyInfo",
                data:{unit_id:unit_id},
                success: function(data) {
                    if(data != ""){
                        var json = JSON.parse(data);
                        var unit_type = "";
                        unit_name = json[0].unit_name;

                        document.getElementById("car_count").innerHTML=json[0].BAOYOULIANG+"辆";  // 找到元素
//                        document.getElementById("compute").innerHTML="RAI指数："+json[0].compute+"%";  // 找到元素
                        document.getElementById("transportation_capacity_count").innerHTML=json[0].HUOYUN+"吨";  // 找到元素
                        document.getElementById("seat").innerHTML=json[0].KEYUN+"人";  // 找到元素
                        document.getElementById("unit_name").innerHTML=json[0].unit_name;  // 找到元素

						var ke = json[0].KEYUN;
						var huo = json[0].HUOYUN;
                        if (ke!=0&&huo!=0){
                            unit_type = "客运/货运";
                            document.getElementById("HYNL").style.display="block";
                            document.getElementById("KYNL").style.display="block";
                        }else if(ke==0&&huo!=0){
                            unit_type = "货运";
                            document.getElementById("KYNL").style.display="none";
                            document.getElementById("HYNL").style.display="block";
                        }else if(ke!=0&&huo==0){
                            unit_type = "客运";
                            document.getElementById("KYNL").style.display="block";
                            document.getElementById("HYNL").style.display="none";
                        }else {
                            unit_type = "-";
                            document.getElementById("HYNL").style.display="none";
                            document.getElementById("KYNL").style.display="none";
                        }
                        document.getElementById("unit_type").innerHTML=unit_type;  // 找到元素
						var flg = json[0].hazard_coefficient;
                        if(flg == "稍有危险"){
                            driver = 1+Math.random()*19;
                            $("#compute").css("background-color","#66CC33");
                        }else if(flg == "一般危险"){
                            driver = 21+Math.random()*19;
                            $("#compute").css("background-color","#FFD700");
                        }else if(flg == "显著危险"){
                            driver = 41+Math.random()*19;
                            $("#compute").css("background-color","#FF8C00");
                        }else if(flg == "高度危险"){
                            driver = 61+Math.random()*19;
                            $("#compute").css("background-color","#FF0000");
                        }else if(flg == "极其危险"){
                            driver = 81+Math.random()*19;
                            $("#compute").css("background-color","#990000");
                        }else {driver=0}
                        getMsg();
//                        getLeiDa();
                    }

                }
            });
        }
        function getSuggest() {
            $.ajax({
                type: "POST",
                url: webPath+"/svdm/risk/getUnitHistoryOpinions",
                async: false,
                data: {unit_id: unit_id},
                success: function (data) {
                    if (data != "") {
                        var json = JSON.parse(data);
                        if (json.length > 0) {
                            for (var i = 0; i < json.length; i++) {
                                var obj = json[i];
                                var arr = obj.handling_opinions;
                                var temp = new Object();
                                temp.id = i + 1;
                                temp.yijian = arr;
                                suggest.push(temp);
                            }
                        }
                    }
                }
            })
        }
        getSuggest();

        toSheet3Jsp = function(val){
           	window.location.href=webPath+"/formpages/sheet3-history.jsp?car_number="+val+"&unit_id="+unit_id+"&leidaVal="+leidaVal+"&unit_name="+unit_name;
            //window.open(webPath+"/formapages/sheet3-History.jsp?car_number="+val+"&unit_id="+unit_id+"&ckxnXVal="+leidaVal+"&maxShow="+maxShow);
            event.stopPropagation();
        };
        function toSheet2_2Jsp(){
//            window.open(webPath+"sheet2_2.jsp?unit_id="+unit_id+"&leidaVal="+leidaVal+"&weather_efficiency="+weather_efficiency);
            window.location.href=webPath+"/formpages/sheet2_2-history.jsp?unit_id="+unit_id+"&leidaVal="+leidaVal+"&unit_name="+unit_name;
        }
        function getBusinessUnitCarRAIList(){
            $.ajax({
                type: "POST",
                async: false,
                url: webPath+"/svdm/risk/getCarHistoryRAL",
                data:{unit_id:unit_id},
                success: function(data) {
                    if(data != ""){
                        var json = JSON.parse(data);
                        var temp = "";
                        for (var i=0;i<json.length;i++){
                            var obj = json[i];
                            var objColor = '';
                            var carZhishu ;
                            if (obj.risk_grade == "稍有危险") {
                                objColor = "#66CC33"
                            } else if (obj.risk_grade == "一般危险") {
                                objColor = "#FFD700"
                            } else if (obj.risk_grade == "显著危险") {
                                objColor = "#FF8C00"
                            } else if (obj.risk_grade == "高度危险") {
                                objColor = "#FF0000"
                            } else if (obj.risk_grade == "极其危险") {
                                objColor = "#990000"
                            }else if (obj.risk_grade == ""||obj.risk_grade==undefined||obj.risk_grade==null){
                                objColor = "#9ca0a8"
                            }

                            if(obj.rai_count==""||obj.rai_count==null||obj.rai_count==undefined){
                                carZhishu = 0;
                            }else {
                                carZhishu = obj.rai_count;
							}
//							var thisIsCarId ='thisIsCarId'+obj.car_code;
                            temp+="<div class='col-md-2 services-grid'>" +
                                "<span href='javascript:void(0);' class='glyphicon effect-1' style='width:87px;height: 87px;padding-top: 33px;font-size: 1.3em;background-color: "+objColor+"' aria-hidden='true' onclick='toSheet3Jsp(\""+obj.car_number+"\")'>"+carZhishu+"%"+"</span>" +
                                "<h5>"+obj.car_number+"</h5>" +
                                "</div>"
                        }
                        $("#cars_no").html(temp);
                    }
                }
            });
        }
        getBusinessUnitCarRAIList();




        $(document).ready(function() {
				$.ajax({
				type:"POST",
				url: webPath+"/svdm/risk/getUnitHistoryAnalysis",
				async: false,
				data:{unit_id:unit_id},
				success: function (data) {
				    if (data!=""){
                var json = JSON.parse(data);
                $('#operation_behavior_table').bootstrapTable({
                    striped: true, //表格显示条纹
                    uniqueId: "Id",
                    pagination: true, //启动分页
                    pageSize: 5, //每页显示的记录数
                    pageNumber: 1, //当前第几页
                    pageList: [5, 10, 15, 20, 25], //记录数可选列表
                    dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
                    data:json,
					columns: [
					    {
                        title:'一级分类',
						field:'1'
					    },
                        {
                            title:'二级分类',
                            field:'2'
                        },
                        {
                            title:'分析指数',
                            field:'3',
                            formatter: function (value, row, index) {
                                return value + "%"
                            }
                        }
					]
                })
            }}});

            $('#suggest').bootstrapTable({
                data: suggest
            });

			$().UItoTop({ easingType: 'easeOutQuart' });

		});
	</script>
	<script>
        // 基于准备好的dom，初始化echarts实例
        var leidaChart = echarts.init(document.getElementById('leida'));
        var operationBehavior = echarts.init(document.getElementById('operationBehavior'));
	</script>
	<!-- //smooth-scrolling-of-move-up -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-zh-CN.min.js"></script>
	<script src="js/jquery.raccordion.js" type="text/javascript"></script>
	<script src="js/jquery.animation.easing.js" type="text/javascript"></script>
</body>
</html>
<script type="text/javascript">
    getAllBusinessUnitInfo();



//    getMsg();
</script>