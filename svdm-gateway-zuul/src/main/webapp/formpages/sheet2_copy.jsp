<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/searchpage/formpages/";
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
<!-- banner -->
<div class="banner">
	<div class="banner-info" >
		<div class="banner-top">
			<div class="container">
				<div class="banner-top-grids banner-top-left" style="width: 28%">
					<ul class="social-icons">
						<li style="color: white;"></li>
						<li style="color: white;"></li>
						<li style="color: white;"></li>
					</ul>
				</div>
				<div class="banner-top-grids banner-logo" style="width: 45%">
					<a href="index.html">
						<img src="images/1.png" alt=""/>
						<h1>新乡市交通运输管理局 <span>安全营运指数分析系统</span></h1>
					</a>
				</div>
				<div class="w3ls-row alert" style="margin-top: 10em;margin-bottom: 3em;">
					<div class="col-md-6 welcome-left">
						<div id="leida" style="width: 100%;height: 376px;border-color: white;"></div>
					</div>
					<div class="col-md-6 welcome-right" style="box-shadow: 0 0 1px 1px transparent;">
						<h4 style="color: white;padding-left: 6.5em;text-indent: -6.5em;" id="unit_name"></h4>
						<h4 style="color: white;" id="unit_type"> </h4>
						<h4 style="color: white;" id="car_count"> </h4>
						<h4 style="color: white;" id="transportation_capacity_count"></h4>
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
<div class="welcome" style="padding: 3em 0;">
	<div class="container">
		<div class="title" style="margin-bottom: 0em;">
			<h3>分项数据分析结果</h3>
			<p>Sub item data analysis results. </p>
		</div>
	</div>
</div>
<!-- //welcome -->
<!-- slid -->
<div class="slid banner banner-top" style="min-height:100px;">
	<div class="container">
		<section class="slider">
			<div class="flexslider">
				<!-- top-navigation -->
				<div class="main">
					<div class="container">
						<nav id="menu" class="nav top-nav">
							<button  class="navtoogle">
								<span class="icon-menu glyphicon glyphicon-menu-hamburger"> </span> Menu
							</button>
							<ul>
								<li>
									<%--<a href="index.html">--%>
									<a href="#" onclick="yyxw()">
											<span class="icon">
												<i aria-hidden="true" class="icon-home glyphicon glyphicon-home"></i>
											</span>
										<span>综合营运行为分析</span>
									</a>
								</li>
								<li>
									<%--<a href="about.html" onclick="$('#section-2').animatescroll();">--%>
									<a href="#" onclick="jsxw(this)">
											<span class="icon">
												<i aria-hidden="true" class="icon-services glyphicon glyphicon-info-sign"></i>
											</span>
										<span>综合驾驶行为分析</span>
									</a>
								</li>
								<li>
									<%--<a href="services.html" onclick="$('#section-3').animatescroll();">--%>
									<a href="#" onclick="ckxn()">
											<span class="icon">
												<i aria-hidden="true" class="icon-portfolio glyphicon glyphicon-cog"></i>
											</span>
										<span>综合车况性能分析</span>
									</a>
								</li>
								<li>
									<%--<a href="gallery.html" onclick="$('#section-4').animatescroll();">--%>
									<a href="#" onclick="xslk()">
											<span class="icon">
												<i aria-hidden="true" class="icon-blog glyphicon glyphicon-picture"></i>
											</span>
										<span>综合行驶路况分析</span>
									</a>
								</li>
								<li>
									<%--<a href="codes.html" onclick="$('#section-5').animatescroll();">--%>
									<a href="#" onclick="sksj()">
											<span class="icon">
												<i aria-hidden="true" class="icon-team glyphicon glyphicon-check"></i>
											</span>
										<span>综合时空数据分析</span>
									</a>
								</li>
								<li>
									<%--<a href="contact.html" onclick="$('#section-6').animatescroll();">--%>
									<a href="#" onclick="glnl()">
											<span class="icon">
												<i aria-hidden="true" class="icon-contact glyphicon glyphicon-envelope"></i>
											</span>
										<span>综合管理能力分析</span>
									</a>
								</li>
							</ul>
						</nav>
						<!-- script-for-menu -->
						<script>
                            //                                $(".navtoogle").click(function(){
                            //                                    $(".top-nav ul").slideToggle("slow" , function(){
                            //                                    });
                            //                                });
						</script>
						<!-- //script-for-menu -->
						<script src="js/modernizr.custom.js"></script>
					</div>
				</div>
				<!-- //top-navigation -->
				<div class="clearfix"> </div>
			</div>
		</section>
	</div>
</div>
<!-- //slid -->
<!-- latest -->
<div class="latest">
	<div class="container">
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="yyxw_header">
			<h3>综合营运行为分析</h3>
			<p>Integrated operating behavior analysis. </p>
		</div>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="jsxw_header">
			<h3>综合驾驶行为分析</h3>
			<p>Integrated driving behavior analysis. </p>
		</div>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="ckxn_header">
			<h3>综合车况性能分析</h3>
			<p>Integrated vehicle performance analysis. </p>
		</div>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="xslk_header">
			<h3>综合行驶路况分析</h3>
			<p>Integrated road condition analysis. </p>
		</div>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="sksj_header">
			<h3>综合时空数据分析</h3>
			<p>Integrated spatio temporal data analysis. </p>
		</div>
		<div class="title" style="padding: 2em 0;margin-bottom: 1em;" id="glnl_header">
			<h3>综合管理能力分析</h3>
			<p>Integrated management capability analysis. </p>
		</div>
		<%--综合驾驶行为分析--%>
		<div class="w3ls-row" id="jsxw">
			<div class="col-sm-2 col-md-2  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>超速违法</h4>
					<p>Speeding violation</p>
					<a href="single.html" class="more" id="speeding_illegal_RAI_percent"></a>
				</div>
			</div>
			<div class="col-sm-2 col-md-2  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>其他违法 </h4>
					<p>Other violations</p>
					<a href="single.html" class="more" id="other_illegal_RAI_percent"></a>
				</div>
			</div>
			<div class="col-sm-2 col-md-2  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>超速预警</h4>
					<p>Speeding warning</p>
					<a href="single.html" class="more" id="speeding_alarm_RAI_percent"></a>
				</div>
			</div>
			<div class="col-sm-2 col-md-2  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>疲劳预警</h4>
					<p>Fatigue early warning</p>
					<a href="single.html" class="more" id="fatigue_alarm_RAI_percent"></a>
				</div>
			</div>
			<div class="col-sm-2 col-md-2  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>其他预警</h4>
					<p>Other warning</p>
					<a href="single.html" class="more" id="other_alarm_RAI_percent"></a>
				</div>
			</div>
			<div class="col-sm-2 col-md-2  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>天气预警</h4>
					<p>Weather warning</p>
					<a href="single.html" class="more" id="weather_alarm_RAI_percent"></a>
				</div>
			</div>

			<div class="clearfix"> </div>
		</div>
		<%--综合车况性能分析--%>
		<div class="w3ls-row" id="ckxn">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>动力系统</h4>
					<p>dynamic system</p>
					<a href="single.html" class="more" style="left: 32%" id="dynamic">1.00%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>制动系统</h4>
					<p>braking system</p>
					<a href="single.html" class="more" style="left: 32%" id="braking">1.00%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>传动系统</h4>
					<p>drive system</p>
					<a href="single.html" class="more" style="left: 32%" id="drive">1.00%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>转向系统</h4>
					<p>steering system</p>
					<a href="single.html" class="more" style="left: 32%" id="steering">1.00%</a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合行驶路况分析--%>
		<div class="w3ls-row" id="xslk">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>平均海拔</h4>
					<p>Average elevation</p>
					<a href="single.html" class="more" style="left: 32%" id="haiba">1%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>道路曲度</h4>
					<p>Road curvature</p>
					<a href="single.html" class="more" style="left: 32%" id="qudu">2%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>道路坡度</h4>
					<p>Road slope</p>
					<a href="single.html" class="more" style="left: 32%" id="puodu">3%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>路线效率</h4>
					<p>Route efficiency</p>
					<a href="single.html" class="more" style="left: 32%" id="route_efficiency"></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合时空数据分析--%>
		<div class="w3ls-row" id="sksj">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>天气数据</h4>
					<p>Weather data</p>
					<a href="single.html" class="more" style="left: 32%">18%</a>
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
					<a href="single.html" class="more" style="left: 32%" id="running_time"></a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<%--综合管理能力分析--%>
		<div class="w3ls-row" id="glnl">
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>车辆管理</h4>
					<p>Vehicle management</p>
					<a href="single.html" class="more" style="left: 32%" id="cheliang">1%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>人员管理</h4>
					<p>Personnel management</p>
					<a href="single.html" class="more" style="left: 32%" id="renyuan">2%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>运输管理</h4>
					<p>transportation management</p>
					<a href="single.html" class="more" style="left: 32%" id="yunshu">3%</a>
				</div>
			</div>
			<div class="col-sm-3 col-md-3  w3latest-grids">
				<div class="w3latest-grids-text">
					<h4>安全管理</h4>
					<p>security management</p>
					<a href="single.html" class="more" style="left: 32%" id="anquan">4%</a>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="clearfix" style="margin-top: 3em;"> </div>
		<%--营运行为--%>
		<div class="w3ls-row" id="yyxw_table">
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
		<%--驾驶行为--%>
		<div id="jsxw_table">
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
		<%--车况性能--%>
		<div class="w3ls-row" id="ckxn_table">
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
		<%--行驶路况--%>
		<div class="w3ls-row" id="xslk_table">
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
		<%--时空数据--%>
		<div class="w3ls-row" id="sksj_table">
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
		<%--管理能力--%>
		<div class="w3ls-row" id="glnl_table">
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
			<%--<div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: red" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: red" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: yellow" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: red" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: yellow" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: red" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: red" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>
            <div class="col-md-2 services-grid">
                <span class="glyphicon effect-1" style="height: 67px;padding-top: 23px;font-size: 1.3em;background-color: yellow" aria-hidden="true">19%</span>
                <h5>豫G16888</h5>
            </div>--%>
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
    var webPath='<%=basePath%>';
    var unit_id = "<%=request.getParameter("unit_id")%>";
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
    function controlCss(val){
        $("div").filter(".title").each(function(){
            var baseName = this.id.split('_')[0];
            var endName = '#'+this.id+',#'+baseName+',#'+baseName + "_table";
            if(new RegExp('_header').test(this.id)){
                $(endName).css("display","none");
                if(new RegExp(val).test(this.id)){
                    $(endName).css("display","block");
                }
            }
        });
    }

    function getRandomMaxValue(arr) {
        var max = arr[0];
        var len = arr.length;
        for (var i = 1; i < len; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return parseInt(max+Math.random()*max);
    }

    function yyxw() {
        var thisFunName = /function\s+(\w+)/.exec(arguments.callee)[1];
        controlCss(thisFunName);
    }
    function jsxw() {
        var thisFunName = /function\s+(\w+)/.exec(arguments.callee)[1];
        controlCss(thisFunName);
        drivingBehaviorTitle=[];
        drivingBehaviorNum=[];
        getBusinessDriverActionRAI();
    }
    function ckxn() {
        var thisFunName = /function\s+(\w+)/.exec(arguments.callee)[1];
        controlCss(thisFunName);
        var dynamic = 54+Math.random()*54;
        var braking = 62+Math.random()*62;
        var drive = 49+Math.random()*49;
        var steering = 57+Math.random()*57;
        $("#dynamic").html(dynamic.toFixed(2)+'%');
        $("#braking").html(braking.toFixed(2)+'%');
        $("#drive").html(drive.toFixed(2)+'%');
        $("#steering").html(steering.toFixed(2)+'%');
        ckxnXVal.push(dynamic);
        ckxnXVal.push(braking);
        ckxnXVal.push(drive);
        ckxnXVal.push(steering);
        getEchart4();
    }
    function xslk() {
        var thisFunName = /function\s+(\w+)/.exec(arguments.callee)[1];
        controlCss(thisFunName);
        runningConditionTitle=[];
        runningConditionNum=[];
        var haiba = 4+Math.random()*4;
        var qudu = 16+Math.random()*16;
        var puodu = 38+Math.random()*38;
        $("#haiba").html(haiba.toFixed(2)+'%');
        $("#qudu").html(qudu.toFixed(2)+'%');
        $("#puodu").html(puodu.toFixed(2)+'%');
        getBusinessRouteEfficiencyGraphical();
    }
    function sksj() {
        var thisFunName = /function\s+(\w+)/.exec(arguments.callee)[1];
        controlCss(thisFunName);
        spatiotemporalDataColumnTitle=[];
        spatiotemporalDataColumnNum=[];
        spatiotemporalDataLineNum=[];
        getBusinessWeatherGraphicalAllTime();
    }
    function glnl() {
        var thisFunName = /function\s+(\w+)/.exec(arguments.callee)[1];
        controlCss(thisFunName);
        var cheliang = 94+Math.random()*54;
        var renyuan = 22+Math.random()*62;
        var yunshu = 139+Math.random()*49;
        var anquan = 47+Math.random()*57;
        $("#cheliang").html(cheliang.toFixed(2)+'%');
        $("#renyuan").html(renyuan.toFixed(2)+'%');
        $("#yunshu").html(yunshu.toFixed(2)+'%');
        $("#anquan").html(anquan.toFixed(2)+'%');
        glnlXVal.push(cheliang);
        glnlXVal.push(renyuan);
        glnlXVal.push(yunshu);
        glnlXVal.push(anquan);
        getEchart5();
    }
    controlCss('yyxw');

    function getAllBusinessUnitInfo(){
        $.ajax({
            type: "POST",
            url:"/search/businessUnitRisk/getBusinessUnitRisk",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    var unit_type = "";
                    document.getElementById("car_count").innerHTML="车辆保有量&nbsp;： "+json[0].car_count+"辆";  // 找到元素
                    document.getElementById("compute").innerHTML="RAI指数："+json[0].compute+"%";  // 找到元素
                    document.getElementById("transportation_capacity_count").innerHTML="运输能力&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;： "+json[0].transportation_capacity_count+"吨";  // 找到元素
                    document.getElementById("unit_name").innerHTML="公司名称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<font> "+json[0].unit_name +"</font>";  // 找到元素
                    switch(json[0].unit_type)
                    {
                        case "1" :unit_type="客运";break;
                        case "2" :unit_type="公交";break;
                        case "3" :unit_type="危化品运输";break;
                        case "4" :unit_type="货运";break;
                    }
                    document.getElementById("unit_type").innerHTML="运输性质&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;： "+unit_type;  // 找到元素
                    var flg = json[0].hazard_coefficient
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
                    }
                }
            }
        });
    }
    function getBusinessDriverIllegalActionList(){
        $.ajax({
            type: "POST",
            url:"/search/businessUnitRisk/getBusinessDriverIllegalActionList",
            async: false,
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    if(json.length>0){
                        for(var i=0;i<json.length;i++){
                            var obj=json[i];
                            var temp = new Object();
                            temp.illegal_time=obj.search_illegal_datetime;
                            temp.illegal_address=obj.search_illegal_address;
                            temp.illegal_behavior=obj.search_illegal_behaviour;
                            drivingBehaviorTable1.push(temp);
                        }
                    }
                }
            }
        });
    }
    function getBusinessDriverActionList(){
        $.ajax({
            type: "POST",
            url:"/search/businessUnitRisk/getBusinessDriverActionList",
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
                            temp.illegal_time=obj.send_time;
                            temp.illegal_speed=obj.velocity+"千米/时";
                            temp.illegal_address=obj.location;
                            if(obj.type == "1"){
                                str="恶劣天气预警"
                            }else if(obj.type == "2"){
                                str="超速预警"
                            }else if(obj.type == "3"){
                                str="疲劳驾驶预警"
                            }else if(obj.type == "4"){
                                str="其他预警"
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
            url: "/search/businessUnitRisk/getBusinessDriverActionRAI",
            async: false,
            data: {unit_id: unit_id},
            success: function (data) {
                if (data != "") {
                    var json = JSON.parse(data);
                    if (json.length > 0) {
                        for (var i = 0; i < json.length; i++) {
                            var obj = json[i];
                            var arr = obj.cuoshiList;
                            for (var j = 0; j < arr.length; j++) {
                                var arrObj = arr[j]
                                var temp = new Object();
                                temp.id = j + 1;
                                temp.yijian = arrObj;
                                suggest.push(temp);
                            }
                        }
                    }
                }
            }
        })
    }

    function replaceZeroPoint(val) {
        if(new RegExp('0%').test(val)){
            return '0.00%';
        }else{
            return val;
        }

    }
    function getBusinessDriverActionRAI(){
        $.ajax({
            type: "POST",
            url:"/search/businessUnitRisk/getBusinessDriverActionRAI",
            async: false,
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    if(json.length>0){
                        for(var i=0;i<json.length;i++){
                            var obj=json[i];
							/*var arr = obj.cuoshiList;
							 for(var j=0;j<arr.length;j++){
							 var arrObj = arr[j]
							 var temp = new Object();
							 temp.id=j+1;
							 temp.yijian=arrObj;
							 suggest.push(temp);
							 }*/
                            console.log(obj.speedingRAIIllegalSumRAI)
                            $("#speeding_illegal_RAI_percent").html(replaceZeroPoint(obj.speedingRAIIllegalSumRAI));
                            $("#other_illegal_RAI_percent").html(replaceZeroPoint(obj.otherRAIIllegalSumRAI));
                            $("#speeding_alarm_RAI_percent").html(replaceZeroPoint(obj.speedingRAISumRAI));
                            $("#fatigue_alarm_RAI_percent").html(replaceZeroPoint(obj.fatigueRAISumRAI));
                            $("#other_alarm_RAI_percent").html(replaceZeroPoint(obj.otherRAISumRAI));
                            $("#weather_alarm_RAI_percent").html(replaceZeroPoint(obj.weatherAlarmRAISumRAI));
                            drivingBehaviorTitle.push("超速违法");
                            drivingBehaviorTitle.push("其他违法");
                            drivingBehaviorTitle.push("超速预警");
                            drivingBehaviorTitle.push("其他预警");
                            drivingBehaviorTitle.push("疲劳预警");
                            drivingBehaviorTitle.push("天气预警");
                            drivingBehaviorNum.push(obj.speedingRAIIllegalSum);
                            drivingBehaviorNum.push(obj.otherRAIIllegalSum);
                            drivingBehaviorNum.push(obj.speedingRAISum);
                            drivingBehaviorNum.push(obj.otherRAISum);
                            drivingBehaviorNum.push(obj.fatigueRAISum);
                            drivingBehaviorNum.push(obj.weatherAlarmRAISum);
                        }
                    }
                    getEchart1();
                }
            }
        });
    }
    function getBusinessRouteEfficiencyList(){
        $.ajax({
            type: "POST",
            url:"/search/businessUnitRisk/getBusinessRouteEfficiencyList",
            async: false,
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    if(json.length>0){
                        for(var i=0;i<json.length;i++){
                            var obj=json[i];
                            var temp = new Object();
                            temp.travel_date=obj.travel_date;
                            temp.travel_car_no=obj.plate_no;
                            temp.travel_route=obj.travel_path;
                            temp.travel_ideal_time=obj.ideal_duration;
                            temp.travel_real_time=obj.actual_duration;
                            temp.travel_time_difference=obj.time_difference;
                            runningConditionTable.push(temp);
                        }
                    }
                }
            }
        });
    }
    function getBusinessRouteEfficiency(){
        $.ajax({
            type: "POST",
            async: false,
            url:"/search/businessUnitRisk/getBusinessRouteEfficiency",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
                        $("#route_efficiency").html(obj.computes+"%");
                    }
                }
            }
        });
    }
    function getBusinessRouteEfficiencyGraphical(){
        $.ajax({
            type: "POST",
            async: false,
            url:"/search/businessUnitRisk/getBusinessRouteEfficiencyGraphical",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
                        runningConditionTitle.push(obj.create_time_group);
                        runningConditionNum.push(obj.compute);
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
            url:"/search/businessUnitRisk/getBusinessWeatherList",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj=json[i];
                        var temp = new Object();
                        temp.travel_date=obj.travel_date;
                        temp.travel_car_no=obj.plate_no;
                        temp.travel_route=obj.travel_path;
                        temp.travel_real_time=formatSeconds(obj.actual_duration);
                        if(obj.weather == 1){
                            temp.travel_weather="雨";
                        }else if(obj.weather == 2){
                            temp.travel_weather="雪";
                        }else if(obj.weather == 3){
                            temp.travel_weather="雾";
                        }

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
            url:"/search/businessUnitRisk/getBusinessWeatherTravelTime",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
                        $("#running_time").html(formatSeconds(obj.actual_duration));
                    }
                }
            }
        });
    }
    function getBusinessWeatherGraphicalAllTime(){
        $.ajax({
            type: "POST",
            async: false,
            url:"/search/businessUnitRisk/getBusinessWeatherGraphicalAllTime",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
                        if(obj.weather == "1"){
                            temp="雨";
                        }else if(obj.weather == "2"){
                            temp="雪";
                        }else if(obj.weather == "3"){
                            temp="雾";
                        }
                        spatiotemporalDataColumnTitle.push(temp);
                        spatiotemporalDataColumnNum.push((obj.actual_duration/(3600*24)).toFixed(2));
                        spatiotemporalDataLineNum.push(obj.count);
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
            url:"/search/businessUnitRisk/getUnitCarGpsList",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    for(var i=0;i<json.length;i++){
                        var obj = json[i];
                        var temp = new Object();
                        temp.time=obj.sendTime;
                        temp.car_plate_number=obj.plateNo;
                        temp.address=obj.location;
                        commonDataList.push(temp);
                    }
                }
            }
        });
    }
    function toSheet3Jsp(val){
        window.location.href=webPath+"sheet3.jsp?carId="+val;
    }
    function getBusinessUnitCarRAIList(){
        $.ajax({
            type: "POST",
            async: false,
            url:"/search/businessUnitRisk/getBusinessUnitCarRAIList",
            data:{unit_id:unit_id},
            success: function(data) {
                if(data != ""){
                    var json = JSON.parse(data);
                    var temp = "";
                    for (var i=0;i<json.length;i++){
                        var obj = json[i];
                        var objColor = '';
                        if (obj.hazard_coefficient == "稍有危险") {
                            objColor = "#66CC33"
                        } else if (obj.hazard_coefficient == "一般危险") {
                            objColor = "#FFD700"
                        } else if (obj.hazard_coefficient == "显著危险") {
                            objColor = "#FF8C00"
                        } else if (obj.hazard_coefficient == "高度危险") {
                            objColor = "#FF0000"
                        } else if (obj.hazard_coefficient == "极其危险") {
                            objColor = "#990000"
                        }
                        temp+="<div class='col-md-2 services-grid' onclick='toSheet3Jsp("+obj.id+")'>" +
                            "<span class='glyphicon effect-1' style='height: 87px;padding-top: 33px;font-size: 1.3em;background-color: "+objColor+"' aria-hidden='true'>"+obj.evaluation_value+"%"+"</span>" +
                            "<h5>"+obj.car_license_plate+"</h5></div>"
                    }
                    $("#cars_no").html(temp);
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
                data: drivingBehaviorTitle
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
            title: {
                text: ''
            },
            tooltip: {},
            legend: {
                data: ['日期']
            },
            xAxis: {
                data: runningConditionTitle
            },
            yAxis: {},
            series: [{
                name: '风险',
                type: 'bar',
                barWidth: 30,
                data: runningConditionNum
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
                data:['行驶时间','行驶次数']
            },
            xAxis: [
                {
                    type: 'category',
                    data: spatiotemporalDataColumnTitle
                }],
            yAxis: [
                {
                    type: 'value',
                    name: '',
                    min: 0,
                    max: 8,
                    interval: 0.5,
                    axisLabel: {
                        formatter: '{value} '
                    }
                }],
            series: [
                {
                    name:'行驶时间',
                    type:'bar',
                    barWidth: 30,
                    itemStyle: {
                        normal: {
                            color: function(params) {
                                // build a color map as your need.
                                var colorList = [
                                    '#0097e0','#0097e0','#0097e0','#0097e0','#0097e0',
                                    '#0097e0','#0097e0'
                                ];
                                return colorList[params.dataIndex]
                            },
							/*信息显示方式*/
                            label: {
                                show: true,
                                position: 'top',
                                formatter: '{b}\n{c}'
                            }
                        }
                    },
                    data:spatiotemporalDataColumnNum
                },
                {
                    name:'行驶次数',
                    type:'line',
                    itemStyle : {
						/*设置折线颜色*/
                        normal : {
                            color:'#ff9a00'
                        }
                    },
                    data:spatiotemporalDataLineNum
                }
            ]};

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
                    max: getRandomMaxValue(ckxnXVal),
                    interval: 10,
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
                data:ckxnXVal
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }
    function getEchart5() {
        var myChart = echarts.init(document.getElementById("managementAbility"));
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
                    data: ['车辆管理','人员管理','运输管理','安全管理']
                }],
            yAxis: [
                {
                    type: 'value',
                    name: '指数',
                    min: 0,
                    max: getRandomMaxValue(glnlXVal),
                    interval: 20,
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
                data:glnlXVal
            }]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }
    $(document).ready(function() {
        $('#driving_behavior_table1').bootstrapTable({
            striped: true, //表格显示条纹
            uniqueId:"Id",
            pagination: true, //启动分页
            pageSize: 5, //每页显示的记录数
            pageNumber:1, //当前第几页
            pageList: [5, 10, 15, 20, 25], //记录数可选列表
            dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
            data:drivingBehaviorTable1
        });
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
            data:commonDataList
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
</script>
<script>
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    option = {
        title: {
            text: '数据分析'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'cross'
            }
        },
        toolbox: {
            show: true,
            feature: {
                saveAsImage: {}
            }
        },
        xAxis:  {
            type: 'category',
            boundaryGap: false,
            data: ['00:00', '01:15', '02:30', '03:45', '05:00', '06:15', '07:30', '08:45', '10:00', '11:15', '12:30', '13:45', '15:00', '16:15', '17:30', '18:45', '20:00', '21:15', '22:30', '23:45']
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                formatter: '{value} W'
            },
            axisPointer: {
                snap: true
            }
        },
        visualMap: {
            show: false,
            dimension: 0,
            pieces: [{
                lte: 6,
                color: 'green'
            }, {
                gt: 6,
                lte: 8,
                color: 'red'
            }, {
                gt: 8,
                lte: 14,
                color: 'green'
            }, {
                gt: 14,
                lte: 17,
                color: 'red'
            }, {
                gt: 17,
                color: 'green'
            }]
        },
        series: [
            {
                name:'用电量',
                type:'line',
                smooth: true,
                data: [300, 280, 250, 260, 270, 300, 550, 500, 400, 390, 380, 390, 400, 500, 600, 750, 800, 700, 600, 400],
                markArea: {
                    data: [ [{
                        name: '早高峰',
                        xAxis: '07:30'
                    }, {
                        xAxis: '10:00'
                    }], [{
                        name: '晚高峰',
                        xAxis: '17:30'
                    }, {
                        xAxis: '21:15'
                    }] ]
                }
            }
        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
<script>
    // 基于准备好的dom，初始化echarts实例
    var leidaChart = echarts.init(document.getElementById('leida'));
    var operationBehavior = echarts.init(document.getElementById('operationBehavior'));
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
                { name: '驾驶行为', max: 6500},
                { name: '车况性能', max: 16000},
                { name: '行驶路况', max: 30000},
                { name: '时空数据', max: 38000},
                { name: '管理能力', max: 52000}
            ]
        },
        series: [{
            name: '预算 vs 开销（Budget vs spending）',
            type: 'radar',
            // areaStyle: {normal: {}},
            data : [
                {
                    value : [4300, 10000, 28000, 35000, 50000, 19000],
                    name : '预算分配（Allocated Budget）'
                }
            ]
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    operationBehavior.setOption(option);
    leidaChart.setOption(option);
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
<script>
    getAllBusinessUnitInfo();

    getUnitCarGpsList();

    getBusinessDriverIllegalActionList();
    getBusinessDriverActionList();
    getSuggest();

    getBusinessRouteEfficiencyList();
    getBusinessRouteEfficiency();

    getBusinessWeatherList();
    getBusinessWeatherTravelTime();


    getBusinessUnitCarRAIList();
</script>