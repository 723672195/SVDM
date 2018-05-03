<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
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
					<a href="javascript:void(0)">
						<div class="img-top-div"><img src="images/1.png" alt=""/></div>
						<h1>道路运输安全生产考核与评价系统<span id="top-span">新乡市道路运输管理局</span></h1>
					</a>
				</div>
				<div class="w3ls-row alert" style="margin-top: 10em;margin-bottom: 3em;">
					<div class="col-md-6 welcome-left">
						<div id="leida" style="width: 100%;height: 376px;border-color: white;"></div>
					</div>
					<div class="col-md-6 welcome-right" style="box-shadow: 0 0 1px 1px transparent;">
						<h4 style="color: white;padding-left: 6.5em;text-indent: -6.5em;" >公司名称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span style="margin-left: 0.5em" id="unit_name"></span></h4>
						<h4 style="color: white;" >运输性质&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="unit_type" style="margin-left: 0.5em"></span> </h4>
						<h4 style="color: white;" >车辆保有量：<span id="car_count" style="margin-left: 0.5em"></span> </h4>
						<h4 style="color: white;" id="HYNL">货运能力&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="transportation_capacity_count" style="margin-left: 0.5em"></span></h4>
						<h4 style="color: white;" id="KYNL">客运能力&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="seat" style="margin-left: 0.5em"></span></h4>
						<a href="javascript:void(0)" id="compute" class="more" style="float: right;"></a>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
</div>
<!-- //banner -->
<!-- welcome -->
<%--<div class="welcome" style="padding: 3em 0;">--%>
<%--<div class="container">--%>
<%--<div class="title" style="margin-bottom: 0em;">--%>
<%--<h3>分项数据分析结果</h3>--%>
<%--<p>Sub item data analysis results. </p>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<!-- //welcome -->
<!-- slid -->
<!-- //slid -->
<!-- latest -->
<div class="latest">
	<div class="container">
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="yyxw_header">
			<h3>综合营运行为分析</h3>
			<p>Integrated operating behavior analysis. </p>
		</div>
		<%--营运行为--%>
		<div  class="w3ls-row" id="yyxw_table">
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>

				<table id="operation_behavior_table" data-pagination="true" class="table-striped">
					<thead>
					<tr>
						<th data-field="time">时间</th>
						<th data-field="car_plate_number">车辆号牌</th>
						<th data-field="address">地点</th>
					</tr>
					</thead>
				</table>
			</div>
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<div id="operationBehavior" style="width: auto;height: 450px;"></div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合驾驶行为分析--%>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="jsxw_header">
			<h3>驾驶人员</h3>
			<p>Driver count. </p>
		</div>
		<div class="w3ls-row" id="jsxw">
			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>恶劣天气超速</h4>
					<p>Weather warning</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="weather_warning_analysis"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>超速预警 </h4>
					<p>Speeding warning</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="speeding_early_warning_analysis"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>疲劳驾驶预警</h4>
					<p>Fatigue driving warning</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="fatigue_driving_early_warning_analysis"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>疲劳驾驶</h4>
					<p>Satigue driving</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="fatigue_driving_analysis"></a>
				</div>
			</div>

			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>超载行驶</h4>
					<p>Overloading</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="overloading_analysis"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>超速行驶</h4>
					<p>Overspeed driving</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="overspeed_driving_analysis"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>违规载人载物</h4>
					<p>Irregularities carrying human load</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="irregularities_carrying_human_load_analysis"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3 w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>高速超速行驶</h4>
					<p>High speed overspeed</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="high_speed_overspeed_analysis"></a>
				</div>
			</div>

			<div class="clearfix"> </div>
		</div>
		<%--驾驶行为--%>
		<div  style="margin-top: 40px" id="jsxw_table">
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>

				<table id="driving_behavior_table1" data-pagination="true" class="table-striped" style="padding-bottom: 50px;">
					<thead>
					<tr>
						<th data-field="illegal_time">违法时间</th>
						<th data-field="illegal_address">违法地点</th>
						<th data-field="illegal_behavior">违法行为</th>
					</tr>
					</thead>
				</table>
				<br/>
				<table id="driving_behavior_table2" data-pagination="true" class="table-striped">
					<thead>
					<tr>
						<th data-field="illegal_time">时间</th>
						<th data-field="illegal_speed">速度</th>
						<th data-field="illegal_address">地点</th>
						<th data-field="illegal_type">类型</th>
					</tr>
					</thead>
				</table>
			</div>
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<div id="drivingBehavior" style="width: auto;height: 450px;"></div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合车况性能分析--%>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="ckxn_header">
			<h3>车辆情况</h3>
			<p>Vehicle condition. </p>
		</div>
		<div class="w3ls-row" id="ckxn">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>动力系统</h4>
					<p>Dynamic system</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="dynamic"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>制动系统</h4>
					<p>Braking system</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="braking"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>传动系统</h4>
					<p>Drive system</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="drive"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>转向系统</h4>
					<p>Steering system</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="steering"></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--车况性能--%>
		<div style="margin-top: 40px"  class="w3ls-row" id="ckxn_table">
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
				<table id="vehicle_performance_table" data-pagination="true" class="table-striped">
					<thead>
					<tr>
						<th data-field="time">时间</th>
						<th data-field="car_plate_number">车辆号牌</th>
						<th data-field="address">地点</th>
					</tr>
					</thead>
				</table>
			</div>
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<div id="vehiclePerformance" style="width: auto;height: 450px;"></div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合行驶路况分析--%>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="xslk_header">
			<h3>道路情况</h3>
			<p>Road condition. </p>
		</div>
		<div class="w3ls-row" id="xslk">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>平均海拔</h4>
					<p>Average elevation</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="haiba"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>道路曲度</h4>
					<p>Road curvature</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="qudu"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>道路坡度</h4>
					<p>Road slope</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="puodu"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>路线效率</h4>
					<p>Route efficiency</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="route_efficiency"></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--行驶路况--%>
		<div style="margin-top: 40px" class="w3ls-row" id="xslk_table">
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
				<table id="running_condition_table" data-pagination="true" class="table-striped">
					<thead>
					<tr>
						<th data-field="travel_date">日期</th>
						<th data-field="travel_car_no">牌照号</th>
						<th data-field="travel_route">行驶路线</th>
						<th data-field="travel_ideal_time">预计时间</th>
						<th data-field="travel_real_time">实际时间</th>
						<th data-field="travel_time_difference">时间差</th>
					</tr>
					</thead>
				</table>
			</div>
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<div id="runningCondition" style="width: auto;height: 450px;"></div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合时空数据分析--%>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="sksj_header">
			<h3>天气情况</h3>
			<p>Weather condition. </p>
		</div>
		<div class="w3ls-row" id="sksj">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>天气数据</h4>
					<p>Weather data</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id ="weather_efficiency"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>行驶时间</h4>
					<p>Travel time</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="running_time"></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--时空数据--%>
		<div  style="margin-top: 40px" class="w3ls-row" id="sksj_table">
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
				<table id="spatiotemporal_data_table" data-pagination="true" class="table-striped">
					<thead>
					<tr>
						<th data-field="travel_date">日期</th>
						<th data-field="travel_car_no">牌照号</th>
						<th data-field="travel_route">行驶路线</th>
						<th data-field="travel_real_time">实际时间</th>
						<th data-field="travel_weather">天气</th>
					</tr>
					</thead>
				</table>
			</div>
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<div id="spatiotemporalData" style="width: auto;height: 450px;"></div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合管理能力分析--%>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="glnl_header">
			<h3>管理情况</h3>
			<p>Management situation. </p>
		</div>
		<div class="w3ls-row" id="glnl">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>车辆管理</h4>
					<p>Vehicle management</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="cheliang"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>人员管理</h4>
					<p>Personnel management</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="renyuan"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>运输管理</h4>
					<p>Transportation management</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="yunshu"></a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>安全管理</h4>
					<p>Security management</p>
					<a href="javascript:void(0)" class="more" style="left: 32%" id="anquan"></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--管理能力--%>
		<div style="margin-top: 40px" class="w3ls-row" id="glnl_table">
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
				<table id="management_ability_table" data-pagination="true" class="table-striped">
					<thead>
					<tr>
						<th data-field="time">时间</th>
						<th data-field="car_plate_number">车辆号牌</th>
						<th data-field="address">地点</th>
					</tr>
					</thead>
				</table>
			</div>
			<div class="col-sm-6 col-md-6  w3latest-grids">
				<div id="managementAbility" style="width: auto;height: 450px;"></div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--<div class="clearfix" style="margin-top: 3em;"> </div>--%>
		<div class="clearfix"> </div>
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
    var webPath='<%=basePath%>';
    <%--var webPath2='<%=basePath2%>';--%>
    var unit_id = "<%=request.getParameter("unit_id")%>";
    var leidaVal = "<%=request.getParameter("leidaVal")%>";
    var unit_name = "<%=request.getParameter("unit_name")%>";
    <%--var weather_efficiency = "<%=request.getParameter("weather_efficiency")%>";--%>
    <%--$("#weather_efficiency").html(weather_efficiency+"%");--%>
    var maxShow = 100;

    var drivingBehaviorTable1=[];
    var drivingBehaviorTable2=[];
    var drivingBehaviorTitle=[];
    var drivingBehaviorNum=[];

    var runningConditionTable=[];
    var runningConditionTitle=[];
    var runningConditionNum=[];

    var spatiotemporalDataTable=[];
    var spatiotemporalDataColumnTitle=[];
    var spatiotemporalDataColumnNum=[];
    var spatiotemporalDataLineNum=[];

    var commonDataList=[];

    var suggest = [];
    var ckxnXVal = [];
    var glnlXVal = [];


    var carCount = "";
    //转换日期格式
    Date.prototype.Format = function(fmt)
    {
        var o = {
            "M+" : this.getMonth()+1,                 //月份
            "d+" : this.getDate(),                    //日
            "h+" : this.getHours(),                   //小时
            "m+" : this.getMinutes(),                 //分
            "s+" : this.getSeconds(),                 //秒
            "q+" : Math.floor((this.getMonth()+3)/3), //季度
            "S"  : this.getMilliseconds()             //毫秒
        };
        if(/(y+)/.test(fmt))
            fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
        for(var k in o)
            if(new RegExp("("+ k +")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        return fmt;
    };
//四舍五入取两位小数
    function keepTwoDecimal(num) {
        var result = parseFloat(num);
        result = Math.round(num * 100) / 100;
        return result;
    }


    function formatSeconds(value) {
        var theTime = parseInt(value);// 秒
        var theTime1 = 0;// 分
        var theTime2 = 0;// 小时
        if(theTime > 60) {
            theTime1 = parseInt(theTime/60);
            theTime = parseInt(theTime%60);
            if(theTime1 > 60) {
                theTime2 = parseInt(theTime1/60);
                theTime1 = parseInt(theTime1%60);
            }
        }
        var result = ""+parseInt(theTime)+"秒";
        if(theTime1 > 0) {
            result = ""+parseInt(theTime1)+"分"+result;
        }
        if(theTime2 > 0) {
            result = ""+parseInt(theTime2)+"小时"+result;
        }
        return result;
    }




    function getRandomMaxValue(arr) {
        var max = arr[0];
        var len = arr.length;
        for (var i = 1; i < len; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return parseInt(max);
    }

    function yyxw() {

    }

    function ckxn() {

        var dynamic;
        var braking;
        var drive;
        var steering;
        $.ajax({
            type: "POST",
            url:webPath+"/svdm/risk/getVehicleHistoryAnalysis",
            async: false,
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""||data!="[]"){
					var json = JSON.parse(data);
					obj=json[0];
					dynamic = obj.dynamic_system_analysis;
					braking = obj.braking_system_analysis;
					drive = obj.drive_system_analysis;
					steering =obj.steering_system_analysis;
					$("#dynamic").html(dynamic + '%');
					$("#braking").html(braking + '%');
					$("#drive").html(drive + '%');
					$("#steering").html(steering + '%');
                }else {
                    $("#dynamic").html( '0%');
                    $("#braking").html( '0%');
                    $("#drive").html( '0%');
                    $("#steering").html( '0%');
				}
            }
        });


        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getDynamicSystemHistory",
            data: {unit_id: unit_id},
            async: false,
            success: function (data) {
                if (data != "") {
                    var json = JSON.parse(data);
                        obj = json[0];
                        ckxnXVal.push(obj.dynamic_system_analysis);
                        ckxnXVal.push(obj.braking_system_analysis);
                        ckxnXVal.push(obj.drive_system_analysis);
                        ckxnXVal.push(obj.steering_system_analysis);
                }
            }
        });
        getEchart4();
    }
    function xslk() {

        runningConditionTitle=[];
        runningConditionNum=[];

        var haiba;
        var qudu;
        var puodu;
        var route_efficiency;
        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getRoadHistoryAnalysis",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""||data!="[]"){
                    var json = JSON.parse(data);
                    haiba=json[0].average_elevation_analysis;
                    qudu=json[0].road_curvature_analysis;
                    puodu=json[0].road_slope_analysis;
                    route_efficiency=json[0].route_efficiency_analysis;
                    $("#haiba").html(haiba+'%');
                    $("#qudu").html(qudu+'%');
                    $("#puodu").html(puodu+'%');
                    $("#route_efficiency").html(route_efficiency+'%');
                }else {
                    $("#haiba").html('0%');
                    $("#qudu").html('0%');
                    $("#puodu").html('0%');
                    $("#route_efficiency").html('0%');
				}
            }

        });

        getBusinessRouteEfficiencyGraphical();
    }
    xslk();
    function weatherkuai() {
        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getWeatherHistoryAnalysis",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""&&data!="[]"){
                    var json = JSON.parse(data);
                    $("#weather_efficiency").html(json[0].weather_data_analysis+'%');
                    $("#running_time").html(keepTwoDecimal(json[0].wicked_travel_time/3600)+"小时");
                }else {
                    $("#weather_efficiency").html('0%');
                    $("#running_time").html("0小时");
				}
            }
        });
    }
    weatherkuai();

    function sksj() {

        spatiotemporalDataColumnTitle=[];
        spatiotemporalDataColumnNum=[];
        spatiotemporalDataLineNum=[];
        getBusinessWeatherGraphicalAllTime();
    }
    function glnl() {

        var cheliang;
        var renyuan;
        var yunshu;
        var anquan;
        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getManagementHistory",
            data:{unit_id:unit_id},
            async: false,
            success: function(data) {
                if(data != ""&& data!="[]"){
                    var json = JSON.parse(data);
                    cheliang=json[0].vehicle_management_analysis;
                    renyuan=json[0].personnel_management_analysis;
                    yunshu=json[0].transportation_management_analysis;
                    anquan=json[0].security_management_analysis;
                    $("#cheliang").html(cheliang+'%');
                    $("#renyuan").html(renyuan+'%');
                    $("#yunshu").html(yunshu+'%');
                    $("#anquan").html(anquan+'%');
                }else {
                    $("#cheliang").html('0%');
                    $("#renyuan").html('0%');
                    $("#yunshu").html('0%');
                    $("#anquan").html('0%');
				}
            }
        });
        $.ajax({
            type: "POST",
            url:webPath+"/svdm/risk/getVehicleManagementHistory",
            data:{unit_id:unit_id},
            async: false,
            success: function(data) {
                var json = JSON.parse(data);
                for(var i =0;i<json.length;i++) {
                    obj = json[i];
                    glnlXVal.push(obj.vehicle_management_analysis);
                    glnlXVal.push(obj.personnel_management_analysis);
                    glnlXVal.push(obj.transportation_management_analysis);
                    glnlXVal.push(obj.security_management_analysis);
                }
            }
        });

        getEchart5();
    }


    function getAllBusinessUnitInfo(){
        $.ajax({//待修改
            type: "POST",
            url: webPath+"/svdm/unit/getCompanyInfo",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    var unit_type = "";

                    document.getElementById("car_count").innerHTML=json[0].BAOYOULIANG+"辆";  // 找到元素
//                    document.getElementById("compute").innerHTML="RAI指数："+json[0].compute+"%";  // 找到元素
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
                        unit_type = "-"
                        document.getElementById("HYNL").style.display="none";
                        document.getElementById("KYNL").style.display="none";
                    }
                    document.getElementById("unit_type").innerHTML=unit_type;  // 找到元素

                }
            }
        });
    }


    function getBusinessDriverIllegalActionList() {
        $('#driving_behavior_table1').bootstrapTable({
            //请求方法
            method: 'POST',
            //是否显示行间隔色
            striped: true,
            //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            cache: false,
            //是否显示分页（*）
            pagination: true,
            //是否启用排序
            sortable: false,
            //排序方式
//                sortOrder: "asc",
            //初始化加载第一页，默认第一页
            //我设置了这一项，但是貌似没起作用，而且我这默认是0,- -
            //pageNumber:1,
            //每页的记录行数（*）
            pageSize: 5,
            //可供选择的每页的行数（*）
            pageList: [10, 25, 50, 100],
            //这个接口需要处理bootstrap table传递的固定参数,并返回特定格式的json数据
            url: webPath+"/svdm/risk/getHistoryDriverAnalysisDataDisplay1",
            dataType: "json",
            contentType: "application/x-www-form-urlencoded",
            //默认值为 'limit',传给服务端的参数为：limit, offset, search, sort, order Else
            //queryParamsType:'',
            ////查询参数,每次调用是会带上这个参数，可自定义
            queryParams: function (params) {
                return {
                    number: params.offset,
                    size: params.limit,
                    unit_id: unit_id
                };
            },
            //分页方式：client客户端分页，server服务端分页（*）
            sidePagination: "client",//暂定
            //是否显示搜索
            search: false,
            //Enable the strict search.
            strictSearch: true,
            //Indicate which field is an identity field.
            idField: "id",
            columns: [
                {
                    field: 'WEIFATIME',
                    title: '违法时间',
                    align: 'center',
                    formatter: function (value, row, index) {
//                        time = new Date(value*1000);
//                        return time.getFullYear()+"-"+time.getMonth()+"-"+time.getDay()+" "+time.getHours()+":"+time.getMinutes()+":"+time.getSeconds();
                        time = new Date(value);
                        return time.Format("yyyy-MM-dd hh:mm:ss");
                    }
                }, {
                    field: 'WEIFADIDIAN',
                    title: '违法地点',
                    align: 'center'
                }, {
                    field: 'WEIFAXINGWEI',
                    title: '违法行为',
                    align: 'center'
                }
            ],
            pagination: true
        });

    }
    function getBusinessDriverActionList(){
        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getHistoryDriverAnalysisDataDisplay2",
            async: false,
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    if(json.length>0){
                        for(var i=0;i<json.length;i++){
                            var obj=json[i];
                            var temp = new Object();
                            var str = "";
                            time = new Date(obj.TIME);
                            temp.illegal_time=time.Format("yyyy-MM-dd hh:mm:ss");
                            temp.illegal_speed=obj.SUDU+"千米/时";
                            temp.illegal_address=obj.DIDIAN;

                            if (obj.LEIXING=="18"){
                                str="超速预警"
                            }else if (obj.LEIXING=="19") {
                                str="疲劳驾驶预警"
                            }else if (obj.LEIXING=="20") {
                                str="预警"
                            }else if (obj.LEIXING=="21") {
                                str="终端设备故障预警"
                            }else if (obj.LEIXING=="22") {
                                str="驾驶时常异常预警"
                            }else if (obj.LEIXING=="23") {
                                str="超时停车预警"
                            }else if (obj.LEIXING=="24") {
                                str="行驶录线异常预警"
                            }else if (obj.LEIXING=="25") {
                                str="路线偏离预警"
                            }else if (obj.LEIXING=="26") {
                                str="车辆异常预警"
                            }else if (obj.LEIXING=="27") {
                                str="车辆非法行驶预警"
                            }
                            temp.illegal_type=str;
                            drivingBehaviorTable2.push(temp);
                        }
                    }
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



    function Zero(val) {
        if (val==null||val==""||val==undefined){
            return 0;
        }else {
            return val;
        };
    };
    function getBusinessDriverActionRAI(){
//        count= 0;
        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getDriverHistoryAnalysis",
            async: false,
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""||data!="[]"){
                    var json = JSON.parse(data);
                    if(json.length>0){
                        for(var i=0;i<json.length;i++){
                            var obj=json[i];

                            $("#weather_warning_analysis").html(obj.weather_warning_analysis+"%");
                            $("#speeding_early_warning_analysis").html(obj.speeding_early_warning_analysis+"%");
                            $("#fatigue_driving_early_warning_analysis").html(obj.fatigue_driving_early_warning_analysis+"%");
                            $("#fatigue_driving_analysis").html(obj.fatigue_driving_analysis+"%");
                            $("#overloading_analysis").html(obj.overloading_analysis+"%");
                            $("#overspeed_driving_analysis").html(obj.overspeed_driving_analysis+"%");
                            $("#irregularities_carrying_human_load_analysis").html(obj.irregularities_carrying_human_load_analysis+"%");
                            $("#high_speed_overspeed_analysis").html(obj.high_speed_overspeed_analysis+"%");
                        }
                    }
                }else {
                    $("#weather_warning_analysis").html("0%");
                    $("#speeding_early_warning_analysis").html("0%");
                    $("#fatigue_driving_early_warning_analysis").html("0%");
                    $("#fatigue_driving_analysis").html("0%");
                    $("#overloading_analysis").html("0%");
                    $("#overspeed_driving_analysis").html("0%");
                    $("#irregularities_carrying_human_load_analysis").html("0%");
                    $("#high_speed_overspeed_analysis").html("0%");
				}
            }
        });
//        return count;
        $.ajax({
            type: "POST",
            url : webPath+"/svdm/risk/getOverSpeedHistoryDriving",
            async: false,
            data:{unit_id:unit_id},
            success: function (data) {
                if (data!="") {
                    var json = JSON.parse(data);
                    for (var i = 0; i < json.length; i++) {
                        obj=json[i];
                        drivingBehaviorTitle.push("恶劣天气超速");
                        drivingBehaviorTitle.push("超速预警");
                        drivingBehaviorTitle.push("疲劳驾驶预警");
                        drivingBehaviorTitle.push("疲劳驾驶");
                        drivingBehaviorTitle.push("超载行驶");
                        drivingBehaviorTitle.push("超速行驶");
                        drivingBehaviorTitle.push("违规载人载物");
                        drivingBehaviorTitle.push("高速超速行驶");
                        drivingBehaviorNum.push(obj.weather_warning_number);
                        drivingBehaviorNum.push(obj.speeding_early_warning_number);
                        drivingBehaviorNum.push(obj.fatigue_driving_early_warning_number);
                        drivingBehaviorNum.push(obj.fatigue_driving_number);
                        drivingBehaviorNum.push(obj.overloading_number);
                        drivingBehaviorNum.push(obj.overspeed_driving_number);
                        drivingBehaviorNum.push(obj.irregularities_carrying_human_load_number);
                        drivingBehaviorNum.push(obj.high_speed_overspeed_number);
                    }
                }
            }
        });
        getEchart1();
    }
    function getBusinessRouteEfficiencyList(){
        $.ajax({
            type: "POST",
            url: webPath+"/svdm/risk/getHistoryRoadDataDisplay",
            async: false,
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    if(json.length>0){
                        for(var i=0;i<json.length;i++){
                            var obj=json[i];
                            var temp = new Object();
                            time = new Date(obj.RIQI);
                            temp.travel_date=time.Format("yyyy-MM-dd hh:mm:ss");
                            temp.travel_car_no=obj.CHEPAIZHAO;
                            temp.travel_route=obj.XINGSHILUXIAN;
                            temp.travel_ideal_time=obj.YUQITIME;
                            temp.travel_real_time=obj.SHIJITIME;
                            temp.travel_time_difference=obj.SHIJIANCHA;
                            runningConditionTable.push(temp);
                        }
                    }
                }
            }
        });
    }

    function getBusinessRouteEfficiencyGraphical(){
        $.ajax({
            type: "POST",
            async: false,
            url: webPath+"/svdm/risk/getAverageElevationHistory",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
//                        runningConditionTitle.push(obj.create_time_group);
                        runningConditionNum.push(obj.average_elevation_analysis);
                        runningConditionNum.push(obj.road_curvature_analysis);
                        runningConditionNum.push(obj.road_slope_analysis);
                        runningConditionNum.push(obj.route_efficiency_analysis);
                    }
                    getEchart2();
                }
            }
        });
    }
    function getBusinessWeatherList(){
        $.ajax({
            type: "POST",
            async: false,
            url: webPath+"/svdm/risk/getListWeatherDataDisplay",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj=json[i];
                        var temp = new Object();
                        time=new Date(obj.RIQI);
                        temp.travel_date=time.Format("yyyy-MM-dd hh:mm:ss");
                        temp.travel_car_no=obj.CHEPAIZHAOHAO;
                        temp.travel_route=obj.XINGSHILUXIAN;
                        temp.travel_real_time=formatSeconds(obj.SHIJITIME);
                        if(obj.TIANQI == 0){
                            temp.travel_weather="雨";
                        }else if(obj.TIANQI == 1){
                            temp.travel_weather="雪";
                        }else if(obj.TIANQI == 2){
                            temp.travel_weather="雾";
                        }
                        spatiotemporalDataColumnTitle.push(temp);
                        spatiotemporalDataTable.push(temp);
                    }
                }
            }
        });
    }
    function getBusinessWeatherTravelTime(){
        $.ajax({
            type: "POST",
            async: false,
            url: webPath+"/search/businessUnitRisk/getBusinessWeatherTravelTime",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
                        if(obj.actual_duration!=null){
                            $("#running_time").html(formatSeconds(obj.actual_duration));
                        }else {
                            $("#running_time").html("0秒");

                        }

                    }
                }
            }
        });
    }
    function getBusinessWeatherGraphicalAllTime(){
        $.ajax({
            type: "POST",
            async: false,
            url: webPath+"/svdm/risk/getWeatherTimeHistory",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=json.length-1;i>=0;i--){
                        var obj = json[i];


                        spatiotemporalDataColumnNum.push((obj.wicked_travel_time/3600).toFixed(2));
                        spatiotemporalDataLineNum.push(new Date(obj.send_time).Format("hh:mm:ss"));
                    }
                    getEchart3();
                }
            }
        });
    }
    function getUnitCarGpsList(){
        $.ajax({
            type: "POST",
            async: false,
            url: webPath+"/svdm/risk/getHistoryManagementDataDisplay",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
                        var temp = new Object();
                        time = new Date(obj.RIQI);
                        temp.time=time.Format("yyyy-MM-dd");
                        temp.car_plate_number=obj.CHEPAIZHAOHAO;
                        temp.address=obj.XINGSHILUXIAN;
                        commonDataList.push(temp);
                    }
                }
            }
        });
    }




    function getEchart1() {
        var myChart = echarts.init(document.getElementById('drivingBehavior'));
        // 指定图表的配置项和数据
        var option = {
            title: {
                text: ''
            },
            tooltip: {},
            legend: {
                data: ['日期']
            },
            xAxis: {
                data: drivingBehaviorTitle,
                axisLabel: {
                    interval: 0,
                    rotate: -40
                }
            },
            yAxis: {},
            series: [{
                name: '风险',
                type: 'bar',
                barWidth: 30,
                data: drivingBehaviorNum
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }
    function getEchart2() {
        var myChart = echarts.init(document.getElementById('runningCondition'));
        // 指定图表的配置项和数据
        var option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:['日期']
            },
            xAxis: [
                {
                    type: 'category',
                    data: ['平均海拔','道路曲度','道路坡度','路线效率']
                }],
            yAxis: [
                {
                    type: 'value',
                    name: '指数',
                    min: 0,
                    axisLabel: {
                        formatter: '{value} '
                    }
                }],
            series: [{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ff9a00'
                    }
                },
                data: [runningConditionNum[0],runningConditionNum[1],runningConditionNum[2],runningConditionNum[3]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ff000a'
                    }
                },
                data: [runningConditionNum[4],runningConditionNum[5],runningConditionNum[6],runningConditionNum[7]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#37ff20'
                    }
                },
                data: [runningConditionNum[8],runningConditionNum[9],runningConditionNum[10],runningConditionNum[11]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#0002ff'
                    }
                },
                data: [runningConditionNum[12],runningConditionNum[13],runningConditionNum[14],runningConditionNum[15]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#f200ff'
                    }
                },
                data: [runningConditionNum[16],runningConditionNum[17],runningConditionNum[18],runningConditionNum[19]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#000000'
                    }
                },
                data: [runningConditionNum[20],runningConditionNum[21],runningConditionNum[22],runningConditionNum[23]]
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }
    function getEchart3() {
        var myChart = echarts.init(document.getElementById('spatiotemporalData'));

        // 指定图表的配置项和数据
        var option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:['行驶时间']
            },
            xAxis: [
                {
                    type: 'category',
                    data: spatiotemporalDataLineNum,
                    axisLabel: {
                        interval: 0,
                        rotate: -40
                    }
                }],
            yAxis: [
                {
                    type: 'value',
                    name: '行驶时间',
                    min: 0,
                    axisLabel: {
                        formatter: '{value} '
                    }
                }],
            series: [{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ff9a00'
                    }
                },
                data:spatiotemporalDataColumnNum
            }]
        };

// 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }
    function getEchart4() {
        var myChart = echarts.init(document.getElementById("vehiclePerformance"));
        var option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:['日期']
            },
            xAxis: [
                {
                    type: 'category',
                    data: ['动力系统','制动系统','传动系统','转向系统']
                }],
            yAxis: [
                {
                    type: 'value',
                    name: '指数',
                    min: 0,
                    axisLabel: {
                        formatter: '{value} '
                    }
                }],
            series: [{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ff9a00'
                    }
                },
                data: [ckxnXVal[0],ckxnXVal[1],ckxnXVal[2],ckxnXVal[3]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ff000a'
                    }
                },
                data: [ckxnXVal[4],ckxnXVal[5],ckxnXVal[6],ckxnXVal[7]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#37ff20'
                    }
                },
                data: [ckxnXVal[8],ckxnXVal[9],ckxnXVal[10],ckxnXVal[11]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#0002ff'
                    }
                },
                data: [ckxnXVal[12],ckxnXVal[13],ckxnXVal[14],ckxnXVal[15]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#f200ff'
                    }
                },
                data: [ckxnXVal[16],ckxnXVal[17],ckxnXVal[18],ckxnXVal[19]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#000000'
                    }
                },
                data: [ckxnXVal[20],ckxnXVal[21],ckxnXVal[22],ckxnXVal[23]]
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }
    function getEchart5() {
        var myChart = echarts.init(document.getElementById("managementAbility"));
        var  option= {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:['日期']
            },
            xAxis: [
                {
                    type: 'category',
                    data: ['车辆管理','人员管理','运输管理','安全管理']
                }],
            yAxis: [
                {
                    type: 'value',
                    name: '指数',
                    min: 0,
                    axisLabel: {
                        formatter: '{value} '
                    }
                }],
            series: [{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ff000c'
                    }
                },
                data:[glnlXVal[0],glnlXVal[1],glnlXVal[2],glnlXVal[3]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ff9b26'
                    }
                },
                data:[glnlXVal[4],glnlXVal[5],glnlXVal[6],glnlXVal[7]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#ffe700'
                    }
                },
                data:[glnlXVal[8],glnlXVal[9],glnlXVal[10],glnlXVal[11]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#13ff00'
                    }
                },
                data:[glnlXVal[12],glnlXVal[13],glnlXVal[14],glnlXVal[15]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#04abff'
                    }
                },
                data:[glnlXVal[16],glnlXVal[17],glnlXVal[18],glnlXVal[19]]
            },{
                name:'',
                type:'line',
                itemStyle : {
                    /*设置折线颜色*/
                    normal : {
                        color:'#0b00ff'
                    }
                },
                data:[glnlXVal[20],glnlXVal[21],glnlXVal[22],glnlXVal[23]]
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }

    function getLeiDa(){
        leidaVal = leidaVal.split(",")
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
                    { name: '驾驶人员', max: maxShow},
                    { name: '车辆情况', max: maxShow},
                    { name: '道路情况', max: maxShow},
                    { name: '天气情况', max: maxShow},
                    { name: '管理情况', max: maxShow}
                ]
            },
            series: [{
                name: '预算 vs 开销（Budget vs spending）',
                type: 'radar',
                // areaStyle: {normal: {}},
                data : [
                    {
                        value :leidaVal,
                        name : '综合营运行为分析（Integrated Operating Behavior Analysis）'
                    }
                ]
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        operationBehavior.setOption(option);
        leidaChart.setOption(option);
    }
    $(document).ready(function() {
//        $('#driving_behavior_table1').bootstrapTable({
//            striped: true, //表格显示条纹
//            uniqueId:"Id",
//            pagination: true, //启动分页
//            pageSize: 5, //每页显示的记录数
//            pageNumber:1, //当前第几页
//            pageList: [5, 10, 15, 20, 25], //记录数可选列表
//            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
//            data:drivingBehaviorTable1
//        });
        $('#driving_behavior_table2').bootstrapTable({
            striped: true, //表格显示条纹
            uniqueId:"Id",
            pagination: true, //启动分页
            pageSize: 5, //每页显示的记录数
            pageNumber:1, //当前第几页
            pageList: [5, 10, 15, 20, 25], //记录数可选列表
            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
            data:drivingBehaviorTable2
        });
        $('#running_condition_table').bootstrapTable({
            striped: true, //表格显示条纹
            uniqueId:"Id",
            pagination: true, //启动分页
            pageSize: 5, //每页显示的记录数
            pageNumber:1, //当前第几页
            pageList: [5, 10, 15, 20, 25], //记录数可选列表
            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
            data:runningConditionTable
        });
        $('#spatiotemporal_data_table').bootstrapTable({
            striped: true, //表格显示条纹
            uniqueId:"Id",
            pagination: true, //启动分页
            pageSize: 5, //每页显示的记录数
            pageNumber:1, //当前第几页
            pageList: [5, 10, 15, 20, 25], //记录数可选列表
            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
            data:spatiotemporalDataTable
        });
        $('#operation_behavior_table').bootstrapTable({
            striped: true, //表格显示条纹
            uniqueId:"Id",
            pagination: true, //启动分页
            pageSize: 5, //每页显示的记录数
            pageNumber:1, //当前第几页
            pageList: [5, 10, 15, 20, 25], //记录数可选列表
            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
//            data:commonDataList
        });
        $('#vehicle_performance_table').bootstrapTable({
            striped: true, //表格显示条纹
            uniqueId:"Id",
            pagination: true, //启动分页
            pageSize: 5, //每页显示的记录数
            pageNumber:1, //当前第几页
            pageList: [5, 10, 15, 20, 25], //记录数可选列表
            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
            data:commonDataList
        });
        $('#management_ability_table').bootstrapTable({
            striped: true, //表格显示条纹
            uniqueId:"Id",
            pagination: true, //启动分页
            pageSize: 5, //每页显示的记录数
            pageNumber:1, //当前第几页
            pageList: [5, 10, 15, 20, 25], //记录数可选列表
            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
            data:commonDataList
        });
        $('#suggest').bootstrapTable({
            data: suggest
        });
        $().UItoTop({ easingType: 'easeOutQuart' });
    });
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
                    }else if(flg == "一般危险"){
                        $("#compute").css("background-color","#FFD700");
                    }else if(flg == "显著危险"){
                        $("#compute").css("background-color","#FF8C00");
                    }else if(flg == "高度危险"){
                        $("#compute").css("background-color","#FF0000");
                    }else if(flg == "极其危险"){
                        $("#compute").css("background-color","#990000");
                    }else {driver=0}
                    document.getElementById("compute").innerHTML="RAI指数："+json[0].rai_count+"%";  // 找到元素
                    function getLeiDa() {
                        driver = json[0].driver_analysis;                 //driver_analysis   驾驶人员分析
                        car = json[0].vehicle_conditions_analysis;                                   //vehicle_conditions_analysis    车辆情况分析
                        road = json[0].road_condition_analysis;                    //road_condition_analysis  道路情况分析
                        weather = json[0].weather_condition_analysis;       //weather_condition_analysis  天气情况分析
                        administration = json[0].management_situation_analysis;                 //management_situation_analysis   管理情况分析
//                        maxShow = 100;

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

        var message = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+unit_name+"在安全生产中存在以下风险行为：";

        $("#msg").html(message+carCount+"。");
        //document.getElementById("msg").innerHTML=msg  // 找到元素
    }
    function goBack() {
        window.location.href=webPath+"/formpages/sheet2-history.jsp?unit_id="+unit_id;
    }
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
<script>
    getBusinessDriverActionRAI();
    getLeiDa();
    getAllBusinessUnitInfo();
    getUnitCarGpsList();
    getBusinessDriverIllegalActionList();
    getBusinessDriverActionList();
    getSuggest();
    getBusinessRouteEfficiencyList();
    //    getBusinessRouteEfficiency();
    getBusinessWeatherList();
    getBusinessWeatherTravelTime();
//    getBusinessUnitCarRAIList();
    yyxw();
//    jsxw();
    ckxn();
    sksj();
    glnl();
    weatherkuai();
    getMsg();
</script>
</html>
