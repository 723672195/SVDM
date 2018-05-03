<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
//	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/searchpage/formpages/";
//	String basePath2 = request.getScheme()+"http://localhost:8016";
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
					<div class="w3ls-row alert" style="margin-top: 8em;margin-bottom: 3em;">
						<div class="col-md-6 welcome-right" style="box-shadow: 0 0 1px 1px transparent;">
							<h4 style="color: white;padding-left: 6.5em;text-indent: -6.5em;">公司名称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="unit_name" style="margin-left: 0.1em"></span></h4>
							<h4 style="color: white;">车辆牌照&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="car_license_plate" style="margin-left: 0.1em"></span></h4>
						</div>
						<div class="col-md-6 welcome-right" style="box-shadow: 0 0 1px 1px transparent;">
							<h4 style="color: white;">评分日期&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="date"></span> </h4>
							<h4 style="color: white;">风险评级&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<span id="RAI_grade"></span> </h4>
							<a href="javascript:void(0)" id="RAI" class="more" style="float: right;">RAI指数：<span id="RAI_index" style="font-size: 18px;"></span></a>
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
			<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h3>静态数据分析结果</h3>
				<p>Static data analysis results. </p>
			</div>
			<div class="clearfix"> </div>
			<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="margin: 3em 0;">
				<ul id="myTab" class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">车辆数据</a></li>
					<li role="presentation"><a href="#user" role="tab" id="user-tab" data-toggle="tab" aria-controls="user">驾驶人数据</a></li>
					<li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile">运输数据</a></li>
				</ul>
				<div id="myTabContent" class="tab-content">
					<div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
						<div class="bs-docs-example ">
							<table class="table table-bordered">
								<tbody>
								<tr>
									<td class="active">车辆号牌</td>
									<td id="unitcar_car_license_plate"></td>
									<td class="active">车辆入户日期</td>
									<td id="unitcar_home_date"></td>
									<td colspan="2" class="active">截止上月底累计行驶公里数</td>
									<td id="unitcar_travel_kilometers"></td>
								</tr>
								<tr>
									<td class="active">其他参数</td>
									<td id="unitcar_transport_type"></td>
									<td id="unitcar_car_brand"></td>
									<td id="unitcar_axle_number"></td>
									<td id="unitcar_transportation_capacity"></td>
									<td id="unitcar_displacement"></td>
									<td id="unitcar_gear_box"></td>
								</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="user" aria-labelledby="user-tab">
						<div class="bs-docs-example ">
							<table  data-pagination="true" id="car_user_table" class="table table-bordered">
								<thead>
								</tbody>
							</table>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
						<div class="bs-docs-example ">
							<table class="table table-bordered">
								<tbody>
								<tr>
									<td class="active">燃油类型</td>
									<td id="unitcar_item_type"></td>
									<td class="active">核载</td>
									<td id="unitcar_real_load"></td>
									<td class="active">运输形式</td>
									<td id="unitcar_transport_mode">拖挂</td>
								</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<div class="clearfix"> </div>
			<div id="staticView" style="width: auto;height: 350px;"></div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!-- //welcome -->
	<!-- slid -->
	<div class="slid banner banner-top" style="min-height:100px;">
		<div class="container" style="width: 95%">
			<section class="slider">
				<div class="flexslider">
					<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
						<h3 style="color: white">基于车载卫星定位数据及天气，道路等数据进行综合分析</h3>
					</div>
					<div class="clearfix"> </div>
				</div>
			</section>
		</div>
	</div>
	<!-- //slid -->
	<!-- latest -->
	<div class="latest">
		<div class="container">
			<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h3>动态数据分析结果</h3>
				<p>Dynamic data analysis results. </p>
			</div>
			<div class="clearfix" style="margin-top: 3em;"> </div>
			<%--<div class="page-header ">
				<h3 class="hdg">行驶路线数据分析</h3>
			</div>
			<div class="w3ls-row">
				<div class="col-sm-12 col-md-12  w3latest-grids">
					<table id="road"
						   class="table-striped">
						<thead>
						<tr class="active">
							<th data-field="qidian">起点</th>
							<th data-field="zhongdian">终点</th>
							<th data-field="licheng">总里程数</th>
							<th data-field="guodao">高速里程数</th>
							<th data-field="chengshi">城市里程数</th>
							<th data-field="tianqi">天气情况</th>
							<th data-field="shijian">起止时间</th>
						</tr>
						</thead>
					</table>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix" style="margin-top: 3em;"> </div>--%>
			<div class="page-header ">
				<h3 class="hdg">高危行为数据及风险分析</h3>
			</div>
			<%--<div id="clam" style="text-align: center" ><h4>暂无分析数据！</h4></div>--%>
			<%--违法--超速--%>
			<div id="speeding_illegal">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">高危超速违法</li>
					<li class="active" id = "speeding_illegal_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="speeding_illegal_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="speeding_illegal_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-事故构成犯罪--%>
			<div id="accident_constitutes_crime">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">事故构成犯罪</li>
					<li class="active" id = "accident_constitutes_crime_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="accident_constitutes_crime_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="accident_constitutes_crime_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-交通拥堵违规行驶--%>
			<div id="Traffic_congestion_irregularities">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">交通拥堵违规行驶</li>
					<li class="active" id = "Traffic_congestion_irregularities_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Traffic_congestion_irregularities_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Traffic_congestion_irregularities_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-使用伪造驾驶证--%>
			<div id="use_counterfeit">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">使用伪造驾驶证</li>
					<li class="active" id = "use_counterfeit_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="use_counterfeit_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="use_counterfeit_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-无证驾驶--%>
			<div id="Unlicensed_driving">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">无证驾驶</li>
					<li class="active" id = "Unlicensed_driving_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Unlicensed_driving_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Unlicensed_driving_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-疲劳驾驶--%>
			<div id="Fatigue_driving">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">疲劳驾驶</li>
					<li class="active" id = "Fatigue_driving_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Fatigue_driving_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Fatigue_driving_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-肇事逃逸--%>
			<div id="Hit_and_run">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">肇事逃逸</li>
					<li class="active" id = "Hit_and_run_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Hit_and_run_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Hit_and_run_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-超员行驶--%>
			<div id="Overcrowding_man">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">超员行驶</li>
					<li class="active" id = "Overcrowding_man_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Overcrowding_man_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Overcrowding_man_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-超载行驶--%>
			<div id="Overcrowding">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">超载行驶</li>
					<li class="active" id = "Overcrowding_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Overcrowding_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Overcrowding_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-违规行为--%>
			<div id="Irregularities">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">违规行为</li>
					<li class="active" id = "Irregularities_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Irregularities_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Irregularities_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-违规载人载物--%>
			<div id="Irregularities_carrying_human_load">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">违规载人载物</li>
					<li class="active" id = "Irregularities_carrying_human_load_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Irregularities_carrying_human_load_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Irregularities_carrying_human_load_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-酒驾醉驾--%>
			<div id="drunk_driving">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">酒驾醉驾</li>
					<li class="active" id = "drunk_driving_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="drunk_driving_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="drunk_driving_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-违规行驶--%>
			<div id="Irregularities_travel">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">违规行驶</li>
					<li class="active" id = "Irregularities_travel_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Irregularities_travel_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Irregularities_travel_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-驾驶人违规行为--%>
			<div id="Driver_irregularities">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">驾驶人违规行为</li>
					<li class="active" id = "Driver_irregularities_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Driver_irregularities_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Driver_irregularities_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-驾驶证异常行驶--%>
			<div id="Driving_license_abnormal">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">驾驶证异常行驶</li>
					<li class="active" id = "Driving_license_abnormal_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Driving_license_abnormal_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Driving_license_abnormal_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-高速超速行驶--%>
			<div id="High_speed_overspeed">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">高速超速行驶</li>
					<li class="active" id = "High_speed_overspeed_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="High_speed_overspeed_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="High_speed_overspeed_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--违法-高速违规行驶--%>
			<div id="High_speed_violation">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">高速违规行驶</li>
					<li class="active" id = "High_speed_violation_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="High_speed_violation_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="illegal_time">违法时间</th>
								<th data-field="illegal_address">违法地点</th>
								<th data-field="illegal_behavior">违法行为</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="High_speed_violation_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--&lt;%&ndash;其他违法&ndash;%&gt;--%>
			<%--<div id="other_illegal">--%>
				<%--<ol class="breadcrumb">--%>
					<%--<li><a href="#">高危行为数据及风险分析</a></li>--%>
					<%--<li class="active">高危其他违法</li>--%>
				<%--</ol>--%>
				<%--<div class="w3ls-row">--%>
					<%--<div class="col-sm-6 col-md-6  w3latest-grids">--%>
						<%--<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>--%>
						<%--<table id="other_illegal_table" data-pagination="true" class="table-striped">--%>
							<%--<thead>--%>
							<%--<tr>--%>
								<%--<th data-field="illegal_time">违法时间</th>--%>
								<%--<th data-field="illegal_address">违法地点</th>--%>
								<%--<th data-field="illegal_behavior">违法行为</th>--%>
							<%--</tr>--%>
							<%--</thead>--%>
						<%--</table>--%>
					<%--</div>--%>
					<%--<div class="col-sm-6 col-md-6  w3latest-grids">--%>
						<%--<div id="chart2" style="width: auto;height: 450px;"></div>--%>
					<%--</div>--%>
					<%--<div class="clearfix"> </div>--%>
				<%--</div>--%>
				<%--<div class="clearfix"></div>--%>
			<%--</div>--%>

			<%--超速预警--%>
			<div id="speeding_alarm">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">高危超速预警</li>
					<li class="active" id = "speeding_alarm_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="speeding_alarm_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="speeding_alarm_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--疲劳预警--%>
			<div id="fatigue_alarm">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">高危疲劳预警</li>
					<li class="active" id = "fatigue_alarm_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="fatigue_alarm_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="fatigue_alarm_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--预警--%>
			<div id="early_warning">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">预警</li>
					<li class="active" id = "early_warning_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="early_warning_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="early_warning_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--终端设备故障预警--%>
			<div id="Terminal_equipment_fault_warning">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">终端设备故障预警</li>
					<li class="active" id = "Terminal_equipment_fault_warning_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Terminal_equipment_fault_warning_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Terminal_equipment_fault_warning_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--驾驶时长异常预警--%>
			<div id="Abnormal_early_warning">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">驾驶时长异常预警</li>
					<li class="active" id = "Abnormal_early_warning_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Abnormal_early_warning_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Abnormal_early_warning_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--超时停车预警--%>
			<div id="timeout_parking">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">超时停车预警</li>
					<li class="active" id = "timeout_parking_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="timeout_parking_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="timeout_parking_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--行驶路线异常预警--%>
			<div id="driving_route_warnning">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">行驶路线异常预警</li>
					<li class="active" id = "driving_route_warnning_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="driving_route_warnning_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="driving_route_warnning_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--路线偏离预警--%>
			<div id="Line_deviation_early">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">路线偏离预警</li>
					<li class="active" id = "Line_deviation_early_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Line_deviation_early_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Line_deviation_early_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--车辆异常预警--%>
			<div id="Abnormal_warning_vehicle">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">车辆异常预警</li>
					<li class="active" id = "Abnormal_warning_vehicle_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="Abnormal_warning_vehicle_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="Abnormal_warning_vehicle_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>

			<%--车辆非法行驶预警--%>
			<div id="warning_vehicle_illegal_driving">
				<ol class="breadcrumb">
					<li><a href="#">高危行为数据及风险分析</a></li>
					<li class="active">车辆非法行驶预警</li>
					<li class="active" id = "warning_vehicle_illegal_driving_head"></li>
				</ol>
				<div class="w3ls-row">
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>
						<table id="warning_vehicle_illegal_driving_table" data-pagination="true" class="table-striped">
							<thead>
							<tr>
								<th data-field="alarm_time">时间</th>
								<th data-field="alarm_speed">速度</th>
								<th data-field="alarm_address">地点</th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="col-sm-6 col-md-6  w3latest-grids">
						<div id="warning_vehicle_illegal_driving_chart" style="width: 450px;height: 450px;"></div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div>
				<h4 id="zanwu" style="display: none;">暂无分析数据！</h4>
				<div class="clearfix"> </div>
			</div>

			<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h3>风险提示</h3>
				<p>Risk tip. </p>
			</div>
			<p id="msg"></p>
			<div class="clearfix"> </div>
			<%--&lt;%&ndash;其他预警&ndash;%&gt;--%>
			<%--<div id="other_alarm">--%>
				<%--<ol class="breadcrumb">--%>
					<%--<li><a href="#">高危行为数据及风险分析</a></li>--%>
					<%--<li class="active">高危其他预警</li>--%>
				<%--</ol>--%>
				<%--<div class="w3ls-row">--%>
					<%--<div class="col-sm-6 col-md-6  w3latest-grids">--%>
						<%--<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>--%>
						<%--<table id="other_alarm_table" data-pagination="true" class="table-striped">--%>
							<%--<thead>--%>
							<%--<tr>--%>
								<%--<th data-field="alarm_time">时间</th>--%>
								<%--<th data-field="alarm_speed">速度</th>--%>
								<%--<th data-field="alarm_address">地点</th>--%>
							<%--</tr>--%>
							<%--</thead>--%>
						<%--</table>--%>
					<%--</div>--%>
					<%--<div class="col-sm-6 col-md-6  w3latest-grids">--%>
						<%--<div id="chart5" style="width: auto;height: 450px;"></div>--%>
					<%--</div>--%>
					<%--<div class="clearfix"> </div>--%>
				<%--</div>--%>
				<%--<div class="clearfix"> </div>--%>
			<%--</div>--%>
			<%----%>
			<%--&lt;%&ndash;天气预警&ndash;%&gt;--%>
			<%--<div id="weather_alarm">--%>
				<%--<ol class="breadcrumb">--%>
					<%--<li><a href="#">高危行为数据及风险分析</a></li>--%>
					<%--<li class="active">高危天气预警</li>--%>
				<%--</ol>--%>
				<%--<div class="w3ls-row">--%>
					<%--<div class="col-sm-6 col-md-6  w3latest-grids">--%>
						<%--<p style="font-size: 1.3em;color: black;margin-top: -10px;padding-bottom: 10px;font-weight: 700">数据展示</p>--%>
						<%--<table id="weather_alarm_table" data-pagination="true" class="table-striped">--%>
							<%--<thead>--%>
							<%--<tr>--%>
								<%--<th data-field="alarm_time">时间</th>--%>
								<%--<th data-field="alarm_speed">速度</th>--%>
								<%--<th data-field="alarm_address">地点</th>--%>
							<%--</tr>--%>
							<%--</thead>--%>
						<%--</table>--%>
					<%--</div>--%>
					<%--<div class="col-sm-6 col-md-6  w3latest-grids">--%>
						<%--<div id="chart6" style="width: auto;height: 450px;"></div>--%>
					<%--</div>--%>
					<%--<div class="clearfix"> </div>--%>
				<%--</div>--%>
				<%--<div class="clearfix"> </div>--%>
			<%--</div>--%>

			<div class="title" style="padding: 2em 0;margin-bottom: 1em;">
				<h3>整改意见</h3>
				<p>Rectification opinion. </p>
			</div>
			<div class="w3ls-row">
				<div class="col-sm-12 col-md-12  w3latest-grids">
					<table id="table2"
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
        <%--var car_id = <%=request.getParameter("carId")%>;--%>
//        var car_number = "豫G96501";
        var car_number = "<%=request.getParameter("car_number")%>";
        var webPath='<%=basePath%>';
        var unit_id = <%=request.getParameter("unit_id")%>;
        <%--var leidaVal = <%=request.getParameter("leidaVal")%>;--%>
        <%--var carLicensePlate = "<%=request.getParameter("carLicensePlate")%>";--%>
        <%--var maxShow = "<%=request.getParameter("maxShow")%>";--%>
        var leidaVal = "<%=request.getParameter("leidaVal")%>";
        var jtfxdt = [];
        var unit_name= "<%=request.getParameter("unit_name")%>";

        //获取当前日期
        var todaytime = (new Date()).getTime();

        var suggest = [];
		var ChoiceNum =1;

		//所有违法的表格
		var speeding = [];
		var crime = [];
		var traffic_irregularities = [];
		var counterfeit = [];
		var unlicensed = [];
		var fatigue = [];
		var hitandrun= [];
		var overcrowdingman = [];
		var overloading = [];
		var irregularities = [];
		var violation_load = [];
		var drunk_driving=[];
		var irregularities_dirver = [];
		var driver_irregularities=[];
		var abnormal = [];
		var high_speed=[];
		var high_irregularities=[];
		//所有预警的表格
		var overspeed_warning=[];
		var fatigue_warning=[];
		var early_warning=[];
		var equipment=[];
		var driving_times=[];
		var parking=[];
		var route = [];
		var deviation = [];
		var vehicle=[];
		var illegally_run=[];
		//所有违法的图横坐标
        var speeding1 = [];
        var crime1 = [];
        var traffic_irregularities1 = [];
        var counterfeit1 = [];
        var unlicensed1 = [];
        var fatigue1 = [];
        var hitandrun1= [];
        var overcrowdingman1 = [];
        var overloading1 = [];
        var irregularities1 = [];
        var violation_load1 = [];
        var drunk_driving1=[];
        var irregularities_dirver1 = [];
        var driver_irregularities1=[];
        var abnormal1 = [];
        var high_speed1=[];
        var high_irregularities1=[];
		//所有预警的图横坐标
        var overspeed_warning1=[];
        var fatigue_warning1=[];
        var early_warning1=[];
        var equipment1=[];
        var driving_times1=[];
        var parking1=[];
        var route1 = [];
        var deviation1 = [];
        var vehicle1=[];
        var illegally_run1=[];
        //所有违法的图数据内容
        var speeding2 = [];
        var crime2 = [];
        var traffic_irregularities2 = [];
        var counterfeit2 = [];
        var unlicensed2 = [];
        var fatigue2 = [];
        var hitandrun2= [];
        var overcrowdingman2 = [];
        var overloading2 = [];
        var irregularities2 = [];
        var violation_load2 = [];
        var drunk_driving2=[];
        var irregularities_dirver2 = [];
        var driver_irregularities2=[];
        var abnormal2 = [];
        var high_speed2=[];
        var high_irregularities2=[];
        //所有预警的图数据内容
        var overspeed_warning2=[];
        var fatigue_warning2=[];
        var early_warning2=[];
        var equipment2=[];
        var driving_times2=[];
        var parking2=[];
        var route2 = [];
        var deviation2 = [];
        var vehicle2=[];
        var illegally_run2=[];





        var carCount = [];
        var carCount2 = "";

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

        function getRandomMaxValue(arr) {
			var max = arr[0];
			var len = arr.length;
			for (var i = 1; i < len; i++){
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
        }

        function Zero(val) {
            if (val==null||val==""||val==undefined){
                return 0;
            }else {
                return val;
            }
        }

        //表头百分比指数创建
        function setHead(id,datahead) {
            document.getElementById(id+"_head").innerText=datahead+"%";
            document.getElementById(id+"_head").style.float = 'right';
            document.getElementById(id+"_head").style.fontSize = "1.5em";
            document.getElementById(id+"_head").style.height="1em";
            document.getElementById(id+"_head").style.lineHeight="1em";

            if (datahead>0&&datahead<=20) {
                document.getElementById(id+"_head").style.color = "#66CC33"
            } else if (datahead>20&&datahead<=40) {
                document.getElementById(id+"_head").style.color = "#FFD700"
            } else if (datahead>40&&datahead<=60) {
                document.getElementById(id+"_head").style.color = "#FF8C00"
            } else if (datahead>60&&datahead<=80) {
                document.getElementById(id+"_head").style.color = "#FF0000"
            } else if (datahead>80&&datahead<=100) {
                document.getElementById(id+"_head").style.color = "#990000"
            }
        };

        function settable1(id,datatable) {//违法表格创建
            $("#"+id+"_table").bootstrapTable({
                striped: true, //表格显示条纹
                uniqueId: "Id",
                pagination: false, //启动分页
                pageSize: 5, //每页显示的记录数
                pageNumber: 1, //当前第几页
                pageList: [5, 10, 15, 20, 25], //记录数可选列表
                dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
                data: datatable,
                columns: [
                    {
                        title: '违法时间',
                        field: 'search_illegal_datetime',
                        formatter: function (value, row, index){
                            return new Date(value).Format("yyyy-MM-dd hh:mm:ss");
						}
                    },
                    {
                        title: '违法地点',
                        field: 'search_illegal_address'
                    },
                    {
                        title: '违法行为',
                        field: 'search_illegal_behaviour'
                    }
				]
            });
        }
        function settable2(id,datatable) {//预警表格创建
            $("#"+id+"_table").bootstrapTable({
                striped: true, //表格显示条纹
                uniqueId: "Id",
                pagination: false, //启动分页
                pageSize: 5, //每页显示的记录数
                pageNumber: 1, //当前第几页
                pageList: [5, 10, 15, 20, 25], //记录数可选列表
                dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
                data: datatable,
                columns: [
                    {
                        title: '时间',
                        field: 'Time',
                        formatter: function (value, row, index){
                            return new Date(value).Format("yyyy-MM-dd hh:mm:ss");
                        }
                    },
                    {
                        title: '速度',
                        field: 'SUDU',
						formatter:function (value, row, index) {
							return value+"千米/小时";
                        }
                    },
                    {
                        title: '地点',
                        field: 'DIDIAN'
                    }
                ]
            });
        }

        //判断使用什么图，同时兼容模块显隐


        function ChoiceEchar (id,xdata,seriesdata) {
            if (ChoiceNum % 2 == 0&&document.getElementById(id).style.display!='none')
            {
                var myChart = echarts.init(document.getElementById(id+"_chart"));
                var option = {
                    tooltip: {
                        trigger: 'axis'
                    },
                    legend: {
                        data:['数据']
                    },
                    xAxis: [
                        {
                            type: 'category',
                            data: xdata,
//							interval: 0,
                            axisLabel: {
                                interval: 0,
                                rotate: -40
                            }
                        }
					],
                    yAxis: [
                        {
                            type: 'value',
                            name: '次数',
                            min: 0,
//                            interval: 10,
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
                        data: seriesdata
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                ChoiceNum++;
            } else if(ChoiceNum % 2 != 0&&document.getElementById(id).style.display!='none'){
                var myChart = echarts.init(document.getElementById(id+"_chart"));
                // 指定图表的配置项和数据
                var option = {
                    title: {
                        text: ''
                    },
                    tooltip: {
                        trigger: 'axis'
					},
                    legend: {
                        data: ['数据']
                    },
                    xAxis: {
                        data: xdata,
//						interval: 0,
                        rotate: -30,
                        margin:30,
                        axisLabel: {
                            interval:0,
                            rotate:-40
                        }
                    },
                    yAxis: {},
                    series: [{
                        name: '风险',
                        type: 'bar',
                        barWidth: 30,
                        data: seriesdata,
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                ChoiceNum++;
            }
        }

        function staticBigP() {
            var staticView = echarts.init(document.getElementById('staticView'));
            var option = {
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['日期']
                },
                xAxis: [
                    {
                        type: 'category',
                        data: ['车辆', '驾驶', '道路', '天气', '管理']
                    }],
                yAxis: [
                    {
                        type: 'value',
                        name: '指数',
                        min: 0,
                        interval: 10,
                        axisLabel: {
                            formatter: '{value} '
                        }
                    }],
                series: [{
                    name: '',
                    type: 'line',
                    itemStyle: {
//                    /!*设置折线颜色*!/
                        normal: {
                            color: '#ff9a00'
                        }
                    },
                    data: jtfxdt,
                }]
            };

            staticView.setOption(option);
        }

        function getEveryData() {

            //获取静态数据分析大图数据
            $.ajax({
                type:"POST",
                url:webPath+"/svdm/results/getHistoryCarAnalysis",
                data:{car_number: car_number},
                async:false,
                success:function (data) {
                    if(data!="") {
                        json = JSON.parse(data);
                        for (var i = 0; i < json.length; i++) {
                            jtfxdt.push(json[i].vehicle_conditions_analysis);
                            jtfxdt.push(json[i].driver_analysis);
                            jtfxdt.push(json[i].road_condition_analysis);
                            jtfxdt.push(json[i].weather_condition_analysis);
                            jtfxdt.push(json[i].management_situation_analysis);
                        }
                    }
                    staticBigP();
                }
            });



            $.ajax({//获取车辆信息
                type: "POST",
                url: webPath+"/svdm/results/getHistoryCarBasicMessage",
                data: {car_number: car_number},
                async: false,
                success: function (data) {
                    if(data!=""&&data!="[]") {
                        json = JSON.parse(data);
                        $("#unit_name").html(json[0].unit_name);
                        $("#car_license_plate").html(car_number);
                        $("#date").html(new Date(json[0].send_time).Format("yyyy-MM-dd"));
                        $("#RAI_grade").html(json[0].risk_grade);
                        $("#RAI_index").html(json[0].rai_count + "%");

                        var grade = json[0].risk_grade;
                        if (grade == "稍有危险") {
                            $("#RAI_grade").css("color", "#66CC33");
                            $("#RAI").css("background-color", "#66CC33");
                        } else if (grade == "一般危险") {
                            $("#RAI_grade").css("color", "#FFD700");
                            $("#RAI").css("background-color", "#FFD700");
                        } else if (grade == "显著危险") {
                            $("#RAI_grade").css("color", "#FF8C00");
                            $("#RAI").css("background-color", "#FF8C00");
                        } else if (grade == "高度危险") {
                            $("#RAI_grade").css("color", "#FF0000");
                            $("#RAI").css("background-color", "#FF0000");
                        } else if (grade == "极其危险") {
                            $("#RAI_grade").css("color", "#990000");
                            $("#RAI").css("background-color", "#990000");
                        }
                    }else {
                        $("#unit_name").html(unit_name);
                        $("#car_license_plate").html(car_number);
                        $("#date").html(new Date(todaytime).Format("yyyy年MM月dd日"));
                        $("#RAI_index").html("0%");
					}
                }
            });


            $.ajax({
                type: "POST",
                url: webPath+"/svdm/results/getHistoryCarList",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data != ""){
                        var json = JSON.parse(data);
                            biao = eval(json.table_name[0]);
                            hezai = eval(json.table_head_name[0]);
                            $("#unitcar_car_license_plate").html(biao.car_license_plate==""?"暂无数据":biao.car_license_plate);//车牌号
                            $("#unitcar_home_date").html(biao.settle_date==""?"暂无数据":new Date(biao.settle_date).Format("yyyy-MM-dd"));//车辆入户日期
                            $("#unitcar_travel_kilometers").html("暂无数据");//截止上月底累计行驶公里数
                            $("#unitcar_transport_type").html("暂无数据");//其他参数
                            $("#unitcar_car_brand").html("暂无数据");//其他参数
                            $("#unitcar_axle_number").html("暂无数据");//其他参数
                            $("#unitcar_transportation_capacity").html("暂无数据");//其他参数
                            $("#unitcar_displacement").html("暂无数据");//其他参数
                            $("#unitcar_gear_box").html("暂无数据");//其他参数
                            $("#unitcar_real_load").html(hezai.HEZAI==""?"暂无数据":hezai.HEZAI);//核载
//                            $("#unitcar_transport_mode").html();//运输形式
                            $("#unitcar_item_type").html(biao.fuel_type==""?"暂无数据":biao.fuel_type);//燃油类型


                        }
                    }
			});





            $.ajax({//获取超速违法模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryOverspeedDrivingIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].overspeed_driving_analysis);
                            if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                document.getElementById(idname).style.display = "none";
                            } else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    speeding1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    speeding2.push(chartXY[i].overspeed_driving_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,speeding1,speeding2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取事故构成犯罪模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryAccidentConstitutesIllegal",
                data: {car_number: car_number},
                async: false,
                success: function (data) {
                    if (data != "") {
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname = json.Modular_name;
                        chartXY = json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                            document.getElementById(idname).style.display = "none";
                        } else {
                            biaotou = eval(json.table_head_name[0].accident_constitutes_crime_analysis);
                            if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                document.getElementById(idname).style.display = "none";
                            } else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname, biao);
                                for (var i = 0; i < chartXY.length; i++) {
                                    crime1.push(new Date(chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    crime2.push(chartXY[i].accident_constitutes_crime_number);//图内容，换前后
                                }
                                ChoiceEchar(idname, crime1, crime2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取交通拥堵违规行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryTrafficCongestionIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].traffic_congestion_irregularities_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname, biao);
                                for (var i = 0; i < chartXY.length; i++) {
                                    traffic_irregularities1.push(new Date(chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    traffic_irregularities2.push(chartXY[i].traffic_congestion_irregularities_number);//图内容，换前后
                                }
                                ChoiceEchar(idname, traffic_irregularities1, traffic_irregularities2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取使用伪造驾驶证模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryUseCounterfeitIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].use_counterfeit_driver_license_analysis);
                            if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                document.getElementById(idname).style.display = "none";
                            } else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname, biao);
                                for (var i = 0; i < chartXY.length; i++) {
                                    counterfeit1.push(new Date(chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    counterfeit2.push(chartXY[i].use_counterfeit_driver_license_number);//图内容，换前后
                                }
                                ChoiceEchar(idname, counterfeit1, counterfeit2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取无证驾驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryUnlicensedDrivingIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].unlicensed_driving_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    unlicensed1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    unlicensed2.push(chartXY[i].unlicensed_driving_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,unlicensed1,unlicensed2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取疲劳驾驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryFatigueDrivingIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].fatigue_driving_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    fatigue1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    fatigue2.push(chartXY[i].fatigue_driving_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,fatigue1,fatigue2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取肇事逃逸模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryHitAndRunIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].hit_and_run_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    hitandrun1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    hitandrun2.push(chartXY[i].hit_and_run_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,hitandrun1,hitandrun2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取超员行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryOvercrowdingIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].overcrowding_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    overcrowdingman1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    overcrowdingman2.push(chartXY[i].overcrowding_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,overcrowdingman1,overcrowdingman2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取超载行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryOverloadingIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].overloading_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    overloading1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    overloading2.push(chartXY[i].overloading_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,overloading1,overloading2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取违规行为模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryIrregularitiesIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].irregularities_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    irregularities1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    irregularities2.push(chartXY[i].irregularities_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,irregularities1,irregularities2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取违规载人载物模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryCarryingHumanLoadIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].irregularities_carrying_human_load_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    violation_load1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    violation_load2.push(chartXY[i].irregularities_carrying_human_load_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,violation_load1,violation_load2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取酒驾醉驾模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryDrunkenDrivingIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].drunken_driving_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    drunk_driving1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    drunk_driving2.push(chartXY[i].drunken_driving_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,drunk_driving1,drunk_driving2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取违规行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryIrregularitiesDriverIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].irregularities_driver_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    irregularities_dirver1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    irregularities_dirver2.push(chartXY[i].irregularities_driver_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,irregularities_dirver1,irregularities_dirver2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取驾驶人违规行为模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryDriverIrregularitiesIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].driver_irregularities_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    driver_irregularities1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    driver_irregularities2.push(chartXY[i].driver_irregularities_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,driver_irregularities1,driver_irregularities2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取驾驶证异常行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryDrivingLicenseAbnormalIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].driving_license_abnormal_driving_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    abnormal1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    abnormal2.push(chartXY[i].driving_license_abnormal_driving_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,abnormal1,abnormal2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取高速超速行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryHighSpeedOverspeedIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].high_speed_overspeed_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    high_speed1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    high_speed2.push(chartXY[i].high_speed_overspeed_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,high_speed1,high_speed2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取高速违规行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryHighSpeedViolationIllegal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].high_speed_violation_analysis);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable1(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    high_irregularities1.push(new Date (chartXY[i].send_time).Format("yyyy-MM-dd"));//图X轴，换前后
                                    high_irregularities2.push(chartXY[i].high_speed_violation_number);//图内容，换前后
                                }
                                ChoiceEchar(idname,high_irregularities1,high_irregularities2);
                            }
                        }
                    }
                }
            });



            //以下为预警

            $.ajax({//获取超速预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryOverspeed",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].CHAOSUFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    overspeed_warning1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    overspeed_warning2.push(chartXY[i].超速预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,overspeed_warning1,overspeed_warning2);
                            }
                        }
                    }
                }
            });
            $.ajax({//获取疲劳驾驶预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryFatigue",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].PILAOJIASHIFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    fatigue_warning1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    fatigue_warning2.push(chartXY[i].疲劳驾驶预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,fatigue_warning1,fatigue_warning2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryWarning",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].YUJINGFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    early_warning1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    early_warning2.push(chartXY[i].预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,early_warning1,early_warning2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取终端设备故障预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryTerminal",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].ZHONGDUANFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    equipment1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    equipment2.push(chartXY[i].终端设备故障预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,equipment1,equipment2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取驾驶时长异常预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryDrivingTime",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].JIASHISHICHANGFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    driving_times1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    driving_times2.push(chartXY[i].驾驶时长异常预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,driving_times1,driving_times2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取超时停车预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryTimeoutParking",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].CHAOSHITINGCHEFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    parking1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    parking2.push(chartXY[i].超时停车预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,parking1,parking2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取行驶路线异常预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryAbnormalRoute",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].XINGSHILUXIANYICHANGFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    route1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    route2.push(chartXY[i].行驶路线异常预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,route1,route2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取路线偏离预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryLineDeviation",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].LUXIANPIANLIYUJINGFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    deviation1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    deviation2.push(chartXY[i].路线偏离预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,deviation1,deviation2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取车辆异常预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryAbnormalVehicle",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].CHELIANGYICHANGFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    vehicle1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    vehicle2.push(chartXY[i].车辆异常预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,vehicle1,vehicle2);
                            }
                        }
                    }
                }
            });

            $.ajax({//获取车辆非法行驶预警数据
                type: "POST",
                url: webPath+"/svdm/results/getHistoryIllegalDriving",
                data:{car_number:car_number},
                async: false,
                success: function(data) {
                    if(data!=""){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        biaotoutou = eval(json.table_head_name[0]);
                        if(biaotoutou==0||biaotoutou==""||biaotoutou==undefined||biaotoutou==null){
                            document.getElementById(idname).style.display="none";
                        }else {
                            biaotou = eval(json.table_head_name[0].CHELIANGFEIFAFENXIZHI);
                            if(biaotou==0||biaotou==""||biaotou==undefined||biaotou==null){
                                document.getElementById(idname).style.display="none";
                            }else {
                                carCount.push(json.name);
                                setHead(idname, biaotou);
                                settable2(idname,biao);
                                for(var i = 0;i<chartXY.length;i++) {
                                    illegally_run1.push(new Date(chartXY[i].TIME).Format("yyyy-MM-dd"));//图X轴，换前后
                                    illegally_run2.push(chartXY[i].车辆非法行驶预警次数);//图内容，换前后
                                }
                                ChoiceEchar(idname,illegally_run1,illegally_run2);
                            }
                        }
                    }
                }
            });

			$.ajax({
				type: "POST",
				url: webPath+"/svdm/results/getHistoryCarHandlingOpinions",
				async: false,
				data: {car_number:car_number},
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
			});
            $('#table2').bootstrapTable({
                data: suggest
            });

            if(ChoiceNum==1){
                document.getElementById("zanwu").style.display="block";
            }else {
                document.getElementById("zanwu").style.display="none";
            };
            riskTip();
        }

        function riskTip() {
            $.ajax({
                type: "POST",
                url: webPath+"/svdm/results/getHistoryCarRiskHints",
                async: false,
                data: {car_number: car_number},
                success: function (data) {
                    if (data != "[]") {
                        var json = JSON.parse(data);
                        carCount2 = json[0].risk_hints;
                    }else {
                        carCount = "";
                    }
                }
            });
            var message = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+unit_name+"在安全生产中存在以下风险行为：";
            if (carCount =="" && carCount2=="") {
                $("#msg").html(message+"无风险。");
            }else {
                $("#msg").html(message+carCount2+","+carCount+"。");
            }
        }




        function goBack() {
            window.location.href=webPath+"/formpages/sheet2-history.jsp?unit_id="+unit_id;
        }

	</script>
    <script>
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
<script>

</script>
</body>
</html>
<script>
    getEveryData();



</script>