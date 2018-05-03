<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath2 = request.getScheme()+"http://localhost:8016";
	String basePath  = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
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
			<p id="msg" style="font-size: 2em"></p>
			<br/>
			<div class="w3ls-row">
				<div class="col-sm-12 col-md-12  w3latest-grids">
					<table id="risk_table"
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


	<script type="text/javascript">
        <%--var car_id = <%=request.getParameter("carId")%>;--%>
//        var car_number = "豫G96501";
        var car_number = "<%=request.getParameter("car_number")%>";
        var webPath='<%=basePath%>';
        var unit_id = <%=request.getParameter("unit_id")%>;
        var raiApple = <%=request.getParameter("raiApple")%>;
        var suggestindex = [<%=request.getParameter("suggestindex")%>];
        <%--var leidaVal = <%=request.getParameter("leidaVal")%>;--%>
        <%--var carLicensePlate = "<%=request.getParameter("carLicensePlate")%>";--%>
        <%--var maxShow = "<%=request.getParameter("maxShow")%>";--%>
        var jtfxdt = [];
        var unit_name= "<%=request.getParameter("unit_name")%>";

        //获取当前日期
        var todaytime = (new Date()).getTime();
		//超速违法

        var suggest = [];

		var ChoiceNum =[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1];
		var ChoiceArr = [];

		var ChoiceBer = false;

		var ChoiceChart1 = [false];
        var ChoiceChart2 = [false];
        var ChoiceChart3 = [false];
        var ChoiceChart4 = [false];
        var ChoiceChart5 = [false];
        var ChoiceChart6 = [false];
        var ChoiceChart7 = [false];
        var ChoiceChart8 = [false];
        var ChoiceChart9 = [false];
        var ChoiceChart10 = [false];
        var ChoiceChart11 = [false];
        var ChoiceChart12 = [false];
        var ChoiceChart13 = [false];
        var ChoiceChart14 = [false];
        var ChoiceChart15 = [false];
        var ChoiceChart16 = [false];
        var ChoiceChart17 = [false];
        var ChoiceChart18 = [false];
        var ChoiceChart19 = [false];
        var ChoiceChart20 = [false];
        var ChoiceChart21 = [false];
        var ChoiceChart22 = [false];
        var ChoiceChart23 = [false];
        var ChoiceChart24 = [false];
        var ChoiceChart25 = [false];
        var ChoiceChart26 = [false];
        var ChoiceChart27 = [false];



		<%--所有违法的图横坐标--%>
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


		//所有表格的id
        var speedingid = $("#speeding_illegal_table");
        var crimeid = $("#accident_constitutes_crime_table");
        var traffic_irregularitiesid = $("#Traffic_congestion_irregularities_table");
        var counterfeitid = $("#use_counterfeit_table");
        var unlicensedid = $("#Unlicensed_driving_table");
        var fatigueid = $("#Fatigue_driving_table");
        var hitandrunid= $("#Hit_and_run_table");
        var overcrowdingmanid = $("#Overcrowding_man_table");
        var overloadingid = $("#Overcrowding_table");
        var irregularitiesid = $("#Irregularities_table");
        var violation_loadid = $("#Irregularities_carrying_human_load_table");
        var drunk_drivingid=$("#drunk_driving_table");
        var irregularities_dirverid = $("#Irregularities_travel_table");
        var driver_irregularitiesid=$("#Driver_irregularities_table");
        var abnormalid = $("#Driving_license_abnormal_table");
        var high_speedid=$("#High_speed_overspeed_table");
        var high_irregularitiesid=$("#High_speed_violation_table");
        //所有预警的表格
        var overspeed_warningid=$("#speeding_alarm_table");
        var fatigue_warningid=$("#fatigue_alarm_table");
        var early_warningid=$("#early_warning_table");
        var equipmentid=$("#Terminal_equipment_fault_warning_table");
        var driving_timesid=$("#Abnormal_early_warning_table");
        var parkingid=$("#timeout_parking_table");
        var routeid = $("#driving_route_warnning_table");
        var deviationid = $("#Line_deviation_early_table");
        var vehicleid=$("#Abnormal_warning_vehicle_table");
        var illegally_runid=$("#warning_vehicle_illegal_driving_table");

        //所有图的id
		var p1 = $("#chart_a1");
        var p2 = $("#chart_a2");
        var p3 = $("#chart_a3");
        var p4 = $("#chart_a4");
        var p5 = $("#chart_a5");
        var p6 = $("#chart_a6");
        var p7 = $("#chart_a7");
        var p8 = $("#chart_a8");
        var p9 = $("#chart_a9");
        var p10 = $("#chart_a10");
        var p11 = $("#chart_a11");
        var p12 = $("#chart_a12");
        var p13 = $("#chart_a13");
        var p14 = $("#chart_a14");
        var p15 = $("#chart_a15");
        var p16 = $("#chart_a16");
        var p17 = $("#chart_a17");
        var p18 = $("#chart_a18");
        var p19 = $("#chart_a19");
        var p20 = $("#chart_a20");
        var p21 = $("#chart_a21");
        var p22 = $("#chart_a22");
        var p23 = $("#chart_a23");
        var p24 = $("#chart_a24");
        var p25 = $("#chart_a25");
        var p26 = $("#chart_a26");
        var p27 = $("#chart_a27");


        var carCount = [];
        var carCount2="";

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
            if (ChoiceBer == true&&id!=undefined&&document.getElementById(id).style.display!='none')
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
                ChoiceBer=false;
            } else if(ChoiceBer == false&&id!=undefined&&document.getElementById(id).style.display!='none'){
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
                ChoiceBer = true;
            }
        }

        function panduan() {
            if (ChoiceChart1[0]==true&&
                ChoiceChart2[0]==true&&
                ChoiceChart3[0]==true&&
                ChoiceChart4[0]==true&&
                ChoiceChart5[0]==true&&
                ChoiceChart6[0]==true&&
                ChoiceChart7[0]==true&&
                ChoiceChart8[0]==true&&
                ChoiceChart9[0]==true&&
                ChoiceChart10[0]==true&&
                ChoiceChart11[0]==true&&
                ChoiceChart12[0]==true&&
                ChoiceChart13[0]==true&&
                ChoiceChart14[0]==true&&
                ChoiceChart15[0]==true&&
                ChoiceChart16[0]==true&&
                ChoiceChart17[0]==true&&
                ChoiceChart18[0]==true&&
                ChoiceChart19[0]==true&&
                ChoiceChart20[0]==true&&
                ChoiceChart21[0]==true&&
                ChoiceChart22[0]==true&&
                ChoiceChart23[0]==true&&
                ChoiceChart24[0]==true&&
                ChoiceChart25[0]==true&&
                ChoiceChart26[0]==true&&
                ChoiceChart27[0]==true){
                ChoiceEchar(ChoiceChart1[1],ChoiceChart1[2],ChoiceChart1[3]);
                ChoiceEchar(ChoiceChart2[1],ChoiceChart2[2],ChoiceChart2[3]);
                ChoiceEchar(ChoiceChart3[1],ChoiceChart3[2],ChoiceChart3[3]);
                ChoiceEchar(ChoiceChart4[1],ChoiceChart4[2],ChoiceChart4[3]);
                ChoiceEchar(ChoiceChart5[1],ChoiceChart5[2],ChoiceChart5[3]);
                ChoiceEchar(ChoiceChart6[1],ChoiceChart6[2],ChoiceChart6[3]);
                ChoiceEchar(ChoiceChart7[1],ChoiceChart7[2],ChoiceChart7[3]);
                ChoiceEchar(ChoiceChart8[1],ChoiceChart8[2],ChoiceChart8[3]);
                ChoiceEchar(ChoiceChart9[1],ChoiceChart9[2],ChoiceChart9[3]);
                ChoiceEchar(ChoiceChart10[1],ChoiceChart10[2],ChoiceChart10[3]);
                ChoiceEchar(ChoiceChart11[1],ChoiceChart11[2],ChoiceChart11[3]);
                ChoiceEchar(ChoiceChart12[1],ChoiceChart12[2],ChoiceChart12[3]);
                ChoiceEchar(ChoiceChart13[1],ChoiceChart13[2],ChoiceChart13[3]);
                ChoiceEchar(ChoiceChart14[1],ChoiceChart14[2],ChoiceChart14[3]);
                ChoiceEchar(ChoiceChart15[1],ChoiceChart15[2],ChoiceChart15[3]);
                ChoiceEchar(ChoiceChart16[1],ChoiceChart16[2],ChoiceChart16[3]);
                ChoiceEchar(ChoiceChart17[1],ChoiceChart17[2],ChoiceChart17[3]);
                ChoiceEchar(ChoiceChart18[1],ChoiceChart18[2],ChoiceChart18[3]);
                ChoiceEchar(ChoiceChart19[1],ChoiceChart19[2],ChoiceChart19[3]);
                ChoiceEchar(ChoiceChart20[1],ChoiceChart20[2],ChoiceChart20[3]);
                ChoiceEchar(ChoiceChart21[1],ChoiceChart21[2],ChoiceChart21[3]);
                ChoiceEchar(ChoiceChart22[1],ChoiceChart22[2],ChoiceChart22[3]);
                ChoiceEchar(ChoiceChart23[1],ChoiceChart23[2],ChoiceChart23[3]);
                ChoiceEchar(ChoiceChart24[1],ChoiceChart24[2],ChoiceChart24[3]);
                ChoiceEchar(ChoiceChart25[1],ChoiceChart25[2],ChoiceChart25[3]);
                ChoiceEchar(ChoiceChart26[1],ChoiceChart26[2],ChoiceChart26[3]);
                ChoiceEchar(ChoiceChart27[1],ChoiceChart27[2],ChoiceChart27[3]);
                riskTip();
            }
        }
        
        function yesorhave() {
            if(ChoiceNum.toString()==ChoiceArr.toString()){
                document.getElementById("zanwu").style.display="block";
            }else {
                document.getElementById("zanwu").style.display="none";
            };
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
                type: "POST",
                url: webPath + "/svdm/results/getCarAnalysis",
                data: {car_number: car_number},
                async: true,
                success: function (data) {
                    if (data != "" && data != "[]") {
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


            <%--$.ajax({//获取车辆信息
                type: "POST",
                url: webPath+"/svdm/results/getCarBasicMessage",
                data: {car_number: car_number},
                async: true,
                success: function (data) {
                    if(data!==""&&data!=="[]") {
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
				},
            });--%>

            $("#unit_name").html(unit_name);
            $("#car_license_plate").html(car_number);
            $("#date").html(new Date(todaytime).Format("yyyy年MM月dd日"));
            $("#RAI_index").html(raiApple + "%");
			if(raiApple==0){
                $("#RAI_grade").html("无");
                $("#RAI_grade").css("color", "#66CC33");
                $("#RAI").css("background-color", "#66CC33");
			}else if (raiApple >0&&raiApple<=20) {
                $("#RAI_grade").html("较小");
                $("#RAI_grade").css("color", "#66CC33");
                $("#RAI").css("background-color", "#66CC33");
            } else if (raiApple >20&&raiApple<=40) {
                $("#RAI_grade").html("一般");
                $("#RAI_grade").css("color", "#FFD700");
                $("#RAI").css("background-color", "#FFD700");
            } else if (raiApple >40&&raiApple<=60) {
                $("#RAI_grade").html("较大");
                $("#RAI_grade").css("color", "#FF8C00");
                $("#RAI").css("background-color", "#FF8C00");
            } else if (raiApple >60&&raiApple<=80) {
                $("#RAI_grade").html("重大");
                $("#RAI_grade").css("color", "#FF0000");
                $("#RAI").css("background-color", "#FF0000");
            } else if (raiApple >80&&raiApple<=100) {
                $("#RAI_grade").html("特别重大");
                $("#RAI_grade").css("color", "#990000");
                $("#RAI").css("background-color", "#990000");
            }


            $.ajax({
                type: "POST",
                url: webPath+"/svdm/results/getCarList",
                data:{car_number:car_number},
                async: true,
                success: function(data) {
                    if(data != ""&&data!="[]"){
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


                        }else {
                        $("#unitcar_car_license_plate").html("暂无数据");//车牌号
                        $("#unitcar_home_date").html("暂无数据");//车辆入户日期
                        $("#unitcar_travel_kilometers").html("暂无数据");//截止上月底累计行驶公里数
                        $("#unitcar_transport_type").html("暂无数据");//其他参数
                        $("#unitcar_car_brand").html("暂无数据");//其他参数
                        $("#unitcar_axle_number").html("暂无数据");//其他参数
                        $("#unitcar_transportation_capacity").html("暂无数据");//其他参数
                        $("#unitcar_displacement").html("暂无数据");//其他参数
                        $("#unitcar_gear_box").html("暂无数据");//其他参数
                        $("#unitcar_real_load").html("暂无数据");//核载
                        $("#unitcar_item_type").html("暂无数据");//燃油类型
					}
                    }
			});






            $.ajax({//获取超速违法模块数据
                type: "POST",
                url: webPath+"/svdm/results/getOverspeedDrivingIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]") {
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname = json.Modular_name;
                        chartXY = json.chart_name;
                        if (json.table_head_name != [null]) {
                        	biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].overspeed_driving_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        speeding1.push(chartXY[i].send_time);//图X轴，换前后
                                        speeding2.push(chartXY[i].overspeed_driving_number);//图内容，换前后
                                    }
                                    ChoiceChart1.push(idname);
                                    ChoiceChart1.push(speeding1);
                                    ChoiceChart1.push(speeding2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
						}
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
					}
                    ChoiceChart1[0] = true;
                    panduan();
 
                    yesorhave();
                },
            });

            $.ajax({//获取事故构成犯罪模块数据
                type: "POST",
                url: webPath+"/svdm/results/getAccidentConstitutesIllegal",
                data: {raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function (data) {
                    if (data != ""&&data!="[]") {
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname = json.Modular_name;
                        chartXY = json.chart_name;
                        if (json.table_head_name != [null]) {
//                            biaotoutou = eval(json.table_head_name[0]);
							biaotoutou=0;
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].accident_constitutes_crime_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        crime1.push(chartXY[i].send_time);//图X轴，换前后
                                        crime2.push(chartXY[i].accident_constitutes_crime_number);//图内容，换前后
                                    }
                                    ChoiceChart2.push(idname);
                                    ChoiceChart2.push(crime1);
                                    ChoiceChart2.push(crime2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
					}
                    ChoiceChart2[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取交通拥堵违规行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getTrafficCongestionIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].traffic_congestion_irregularities_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        traffic_irregularities1.push(chartXY[i].send_time);//图X轴，换前后
                                        traffic_irregularities2.push(chartXY[i].traffic_congestion_irregularities_number);//图内容，换前后
                                    }
                                    ChoiceChart3.push(idname);
                                    ChoiceChart3.push(traffic_irregularities1);
                                    ChoiceChart3.push(traffic_irregularities2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
					}
                    ChoiceChart3[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取使用伪造驾驶证模块数据
                type: "POST",
                url: webPath+"/svdm/results/getUseCounterfeitIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
//                            biaotoutou = eval(json.table_head_name[0]);
                            biaotoutou=0;
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].use_counterfeit_driver_license_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        counterfeit1.push(chartXY[i].send_time);//图X轴，换前后
                                        counterfeit2.push(chartXY[i].use_counterfeit_driver_license_number);//图内容，换前后
                                    }
                                    ChoiceChart4.push(idname);
                                    ChoiceChart4.push(counterfeit1);
                                    ChoiceChart4.push(counterfeit2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
					}
                    ChoiceChart4[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取无证驾驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getUnlicensedDrivingIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
//                            biaotoutou = eval(json.table_head_name[0]);
							biaotoutou=0;
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].unlicensed_driving_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        unlicensed1.push(chartXY[i].send_time);//图X轴，换前后
                                        unlicensed2.push(chartXY[i].unlicensed_driving_number);//图内容，换前后
                                    }
                                    ChoiceChart5.push(idname);
                                    ChoiceChart5.push(unlicensed1);
                                    ChoiceChart5.push(unlicensed2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
					}
                    ChoiceChart5[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取疲劳驾驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getFatigueDrivingIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].fatigue_driving_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        fatigue1.push(chartXY[i].send_time);//图X轴，换前后
                                        fatigue2.push(chartXY[i].fatigue_driving_number);//图内容，换前后
                                    }
                                    ChoiceChart6.push(idname);
                                    ChoiceChart6.push(fatigue1);
                                    ChoiceChart6.push(fatigue2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
					}
                    ChoiceChart6[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取肇事逃逸模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHitAndRunIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
//                            biaotoutou = eval(json.table_head_name[0]);
                            biaotoutou=0;
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].hit_and_run_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        hitandrun1.push(chartXY[i].send_time);//图X轴，换前后
                                        hitandrun2.push(chartXY[i].hit_and_run_number);//图内容，换前后
                                    }
                                    ChoiceChart7.push(idname);
                                    ChoiceChart7.push(hitandrun1);
                                    ChoiceChart7.push(hitandrun2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart7[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取超员行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getOvercrowdingIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].overcrowding_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        overcrowdingman1.push(chartXY[i].send_time);//图X轴，换前后
                                        overcrowdingman2.push(chartXY[i].overcrowding_number);//图内容，换前后
                                    }
                                    ChoiceChart8.push(idname);
                                    ChoiceChart8.push(overcrowdingman1);
                                    ChoiceChart8.push(overcrowdingman2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart8[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取超载行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getOverloadingIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].overloading_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        overloading1.push(chartXY[i].send_time);//图X轴，换前后
                                        overloading2.push(chartXY[i].overloading_number);//图内容，换前后
                                    }
                                    ChoiceChart9.push(idname);
                                    ChoiceChart9.push(overloading1);
                                    ChoiceChart9.push(overloading2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart9[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取违规行为模块数据
                type: "POST",
                url: webPath+"/svdm/results/getIrregularitiesIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].irregularities_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        irregularities1.push(chartXY[i].send_time);//图X轴，换前后
                                        irregularities2.push(chartXY[i].irregularities_number);//图内容，换前后
                                    }
                                    ChoiceChart10.push(idname);
                                    ChoiceChart10.push(irregularities1);
                                    ChoiceChart10.push(irregularities2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
					}else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart10[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取违规载人载物模块数据
                type: "POST",
                url: webPath+"/svdm/results/getCarryingHumanLoadIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].irregularities_carrying_human_load_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        violation_load1.push(chartXY[i].send_time);//图X轴，换前后
                                        violation_load2.push(chartXY[i].irregularities_carrying_human_load_number);//图内容，换前后
                                    }
                                    ChoiceChart11.push(idname);
                                    ChoiceChart11.push(violation_load1);
                                    ChoiceChart11.push(violation_load2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart11[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取酒驾醉驾模块数据
                type: "POST",
                url: webPath+"/svdm/results/getDrunkenDrivingIllegal",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
//                            biaotoutou = eval(json.table_head_name[0]);
							biaotoutou=0;
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].drunken_driving_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        drunk_driving1.push(chartXY[i].send_time);//图X轴，换前后
                                        drunk_driving2.push(chartXY[i].drunken_driving_number);//图内容，换前后
                                    }
                                    ChoiceChart12.push(idname);
                                    ChoiceChart12.push(drunk_driving1);
                                    ChoiceChart12.push(drunk_driving2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
					}
                    ChoiceChart12[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取违规行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getIrregularitiesDriverIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].irregularities_driver_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        irregularities_dirver1.push(chartXY[i].send_time);//图X轴，换前后
                                        irregularities_dirver2.push(chartXY[i].irregularities_driver_number);//图内容，换前后
                                    }
                                    ChoiceChart13.push(idname);
                                    ChoiceChart13.push(irregularities_dirver1);
                                    ChoiceChart13.push(irregularities_dirver2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart13[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取驾驶人违规行为模块数据
                type: "POST",
                url: webPath+"/svdm/results/getDriverIrregularitiesIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].driver_irregularities_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        driver_irregularities1.push(chartXY[i].send_time);//图X轴，换前后
                                        driver_irregularities2.push(chartXY[i].driver_irregularities_number);//图内容，换前后
                                    }
                                    ChoiceChart14.push(idname);
                                    ChoiceChart14.push(driver_irregularities1);
                                    ChoiceChart14.push(driver_irregularities2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart14[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取驾驶证异常行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getDrivingLicenseAbnormalIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
//                            biaotoutou = eval(json.table_head_name[0]);
                            biaotoutou=0;
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].driving_license_abnormal_driving_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        abnormal1.push(chartXY[i].send_time);//图X轴，换前后
                                        abnormal2.push(chartXY[i].driving_license_abnormal_driving_number);//图内容，换前后
                                    }
                                    ChoiceChart15.push(idname);
                                    ChoiceChart15.push(abnormal1);
                                    ChoiceChart15.push(abnormal2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart15[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取高速超速行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHighSpeedOverspeedIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].high_speed_overspeed_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        high_speed1.push(chartXY[i].send_time);//图X轴，换前后
                                        high_speed2.push(chartXY[i].high_speed_overspeed_number);//图内容，换前后
                                    }
                                    ChoiceChart16.push(idname);
                                    ChoiceChart16.push(high_speed1);
                                    ChoiceChart16.push(high_speed2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart16[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取高速违规行驶模块数据
                type: "POST",
                url: webPath+"/svdm/results/getHighSpeedViolationIllegal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].high_speed_violation_analysis);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable1(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        high_irregularities1.push(chartXY[i].send_time);//图X轴，换前后
                                        high_irregularities2.push(chartXY[i].high_speed_violation_number);//图内容，换前后
                                    }
                                    ChoiceChart17.push(idname);
                                    ChoiceChart17.push(high_irregularities1);
                                    ChoiceChart17.push(high_irregularities2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart17[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });



            //以下为预警

            $.ajax({//获取超速预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListOverspeed",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].CHAOSUFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        overspeed_warning1.push(chartXY[i].TIME);//图X轴，换前后
                                        overspeed_warning2.push(chartXY[i].超速预警次数);//图内容，换前后
                                    }
                                    ChoiceChart18.push(idname);
                                    ChoiceChart18.push(overspeed_warning1);
                                    ChoiceChart18.push(overspeed_warning2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart18[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });
            $.ajax({//获取疲劳驾驶预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListFatigue",
                data:{raiApple: raiApple},
                async: true,
				timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].PILAOJIASHIFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        fatigue_warning1.push(chartXY[i].TIME);//图X轴，换前后
                                        fatigue_warning2.push(chartXY[i].疲劳驾驶预警次数);//图内容，换前后
                                    }
                                    ChoiceChart19.push(idname);
                                    ChoiceChart19.push(fatigue_warning1);
                                    ChoiceChart19.push(fatigue_warning2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart19[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListWarning",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].YUJINGFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        early_warning1.push(chartXY[i].TIME);//图X轴，换前后
                                        early_warning2.push(chartXY[i].预警次数);//图内容，换前后
                                    }
                                    ChoiceChart20.push(idname);
                                    ChoiceChart20.push(early_warning1);
                                    ChoiceChart20.push(early_warning2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart20[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取终端设备故障预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListTerminal",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].ZHONGDUANFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        equipment1.push(chartXY[i].TIME);//图X轴，换前后
                                        equipment2.push(chartXY[i].终端设备故障预警次数);//图内容，换前后
                                    }
                                    ChoiceChart21.push(idname);
                                    ChoiceChart21.push(equipment1);
                                    ChoiceChart21.push(equipment2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart21[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取驾驶时长异常预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListDrivingTime",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].JIASHISHICHANGFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        driving_times1.push(chartXY[i].TIME);//图X轴，换前后
                                        driving_times2.push(chartXY[i].驾驶时长异常预警次数);//图内容，换前后
                                    }
                                    ChoiceChart22.push(idname);
                                    ChoiceChart22.push(driving_times1);
                                    ChoiceChart22.push(driving_times2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart22[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取超时停车预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListTimeoutParking",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].CHAOSHITINGCHEFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        parking1.push(chartXY[i].TIME);//图X轴，换前后
                                        parking2.push(chartXY[i].超时停车预警次数);//图内容，换前后
                                    }
                                    ChoiceChart23.push(idname);
                                    ChoiceChart23.push(parking1);
                                    ChoiceChart23.push(parking2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart23[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取行驶路线异常预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListAbnormalRoute",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].XINGSHILUXIANYICHANGFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        route1.push(chartXY[i].TIME);//图X轴，换前后
                                        route2.push(chartXY[i].行驶路线异常预警次数);//图内容，换前后
                                    }
                                    ChoiceChart24.push(idname);
                                    ChoiceChart24.push(route1);
                                    ChoiceChart24.push(route2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart24[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取路线偏离预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListLineDeviation",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].LUXIANPIANLIYUJINGFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        deviation1.push(chartXY[i].TIME);//图X轴，换前后
                                        deviation2.push(chartXY[i].路线偏离预警次数);//图内容，换前后
                                    }
                                    ChoiceChart25.push(idname);
                                    ChoiceChart25.push(deviation1);
                                    ChoiceChart25.push(deviation2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart25[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取车辆异常预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListAbnormalVehicle",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].CHELIANGYICHANGFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        vehicle1.push(chartXY[i].TIME);//图X轴，换前后
                                        vehicle2.push(chartXY[i].车辆异常预警次数);//图内容，换前后
                                    }
                                    ChoiceChart26.push(idname);
                                    ChoiceChart26.push(vehicle1);
                                    ChoiceChart26.push(vehicle2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart26[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });

            $.ajax({//获取车辆非法行驶预警数据
                type: "POST",
                url: webPath+"/svdm/results/getListIllegalDriving",
                data:{raiApple: raiApple},
                async: true,
                timeout: 300000,
                success: function(data) {
                    if(data!=""&&data!="[]"){
                        json = JSON.parse(data);
                        biao = json.table_name;
                        idname=json.Modular_name;
                        chartXY=json.chart_name;
                        if (json.table_head_name != [null]) {
                            biaotoutou = eval(json.table_head_name[0]);
                            if (biaotoutou == 0 || biaotoutou == "" || biaotoutou == undefined || biaotoutou == null) {
                                document.getElementById(idname).style.display = "none";
                                ChoiceArr.push(1);
                            } else {
                                biaotou = eval(json.table_head_name[0].CHELIANGFEIFAFENXIZHI);
                                if (biaotou == 0 || biaotou == "" || biaotou == undefined || biaotou == null) {
                                    document.getElementById(idname).style.display = "none";
                                    ChoiceArr.push(1);
                                } else {
                                    carCount.push(json.name);
                                    setHead(idname, biaotou);
                                    settable2(idname, biao);
                                    for (var i = 0; i < chartXY.length; i++) {
                                        illegally_run1.push(chartXY[i].TIME);//图X轴，换前后
                                        illegally_run2.push(chartXY[i].车辆非法行驶预警次数);//图内容，换前后
                                    }
                                    ChoiceChart27.push(idname);
                                    ChoiceChart27.push(illegally_run1);
                                    ChoiceChart27.push(illegally_run2);
                                }
                            }
                        }else {
                            document.getElementById(idname).style.display = "none";
                            ChoiceArr.push(1);
                        }
                    }else {
                        document.getElementById(idname).style.display = "none";
                        ChoiceArr.push(1);
                    }
                    ChoiceChart27[0] = true;
                    panduan();
 
                    yesorhave();
                }
            });


                $.ajax({
                    type: "POST",
                    url: webPath+"/svdm/results/getCarRiskHints",
                    async: true,
                    data: {car_number: car_number},
                    success: function (data) {
                        if (data != "[]") {
                            var json = JSON.parse(data);
                            carCount2 = json[0].risk_hints;
                        }else {
                            carCount2 = "";
                        }
     
                    }
                });



			<%--$.ajax({
				type: "POST",
				url: webPath+"/svdm/results/getCarHandlingOpinions",
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
			});--%>
//            $.ajax({
//                type: "POST",
//                url: webPath+"/svdm/suggest/getSuggestOver",
//                async: false,
//                data: {unit_id:unit_id},
//                success: function (data) {
//                    if (data != "") {
//                        var json = JSON.parse(data);
//                        if (json.length > 0) {
//                            for (var i = 0; i < json.length; i++) {
//                                var obj = json[i];
//                                var arr = obj.handling_opinions;
//                                var temp = new Object();
//                                temp.id = i + 1;
//                                temp.yijian = arr;
//                                suggest.push(temp);
//                            }
//                        }
//                    }
//                }
//            });

//            var temp = new Object();
//            temp.id = 1;
//            temp.yijian = "加强出车前安全管理";
//            suggest.push(temp);
//
//            var mycars = new Array()
//            mycars[0] = "出车前检查雨刷器、灯光";
//            mycars[1] = "刹车是否跑偏、雨刷器是否工作正常";
//            mycars[2] = "加大对超速行为的处罚力度";
//            mycars[3] = "加强安全检查，对酒驾司机零容忍，坚决按“五大禁令”处理";
//            mycars[4] = "加强车辆GPS全过程监控";
//            mycars[5] = "加强驾驶员安全讲话和出车前承诺签字";
//            mycars[6] = "坚持劳逸结合，驾车外出时要注意休息，保证足够的睡眠";
//			mycars[7] = "夜间行车不超过22点";
//            function getRandomNumber(start,end,n){
//                var arr=[];
//                for(var i=0;i<n;i++){
//                    var number=Math.floor(Math.random()*(end-start+1)+start);
//                    if(arr.indexOf(number)<0){
//                        arr.push(number);
//                    }else{
//                        i--;
//                    }
//                }
//                return arr;
//            }
//            var aoeiuv = getRandomNumber(0,7,4);
//            for(var i=0;i<aoeiuv.length;i++){
//                var msg = new Object();
//                msg.id = i + 2;
//                msg.yijian = mycars[aoeiuv[i]];
//                suggest.push(msg);
//            }




            var temp = new Object();
            temp.id = 1;
            temp.yijian = "加强出车前安全管理";
            suggest.push(temp);

            var mycarchaosu = new Array()
            mycarchaosu[0] = "加强车辆GPS全过程监控";
            mycarchaosu[1] = "加大对超速行为的处罚力度";
            mycarchaosu[2] = "加强驾驶员安全讲话和出车前承诺签字";
            mycarchaosu[3] = "搜集典型事故案例进行警示教育";
            mycarchaosu[4] = "严格按“三规一限”规定执行";
            var mycarpilao = new Array()
            mycarpilao[0] = "坚持劳逸结合，驾车外出时要注意休息，保证充足的睡眠";
            mycarpilao[1] = "夜间行车时间不超过22点";
            var mycarchaozai = new Array()
            mycarchaozai[0] = "加强驾驶员安全教育培训，严格按载货和载客规定拉运";
            mycarchaozai[1] = "熟知车辆性能，按车辆的核定载质量和定员进行装载和乘员";
            mycarchaozai[2] = "大型货运汽车载物，高度从地面起不准超过4米，宽度不准超过车厢，长度前端不准超出车身，后端不准超出车身2米，超过部分不准触地";
            mycarchaozai[3] = "载质量在1000公斤以上的小型货运汽车载物，高度从地面起不准超过2.5米，宽度不准超出车厢，前端不准超出车身，后端不准超出车厢1米";
            mycarchaozai[4] = "载质量不满1000公斤的小型货运汽车，高度从地面起不准超过2米，宽度不准超出车厢，长度前端不准超出车厢，后端不准超出车厢50厘米";
            var mycarweigui = new Array()
            mycarweigui[0] = "用事故案例，加强对司机的安全教育，增强安全行车意识;加强，路检路查和干部跟车力度，对违反规定的行为，加大处罚力度";
            mycarweigui[1] = "加强学习教育，遵守高速公路管理的各项行车规定";
            mycarweigui[2] = "提高驾驶员自觉遵守交通安全意识";
            mycarweigui[3] = "加强安全教育，增强安全意识;做好作业当中的风险识别和防范";
            mycarweigui[4] = "管理人员平时加做好风险提示";


            function getRandomNumber(start,end,n){
                var arr=[];
                for(var i=0;i<n;i++){
                    var number=Math.floor(Math.random()*(end-start+1)+start);
                    if(arr.indexOf(number)<0){
                        arr.push(number);
                    }else{
                        i--;
                    }
                }
                return arr;
            }
            var temp = new Object();
            var ionoob = 2;
            var ciishu = 2;
            var count2=[];
			count2 = getRandomNumber(2,8,1);
            var count=count2[0];
            if(ciishu!=count) {
                temp.id = ionoob;
                temp.yijian = mycarchaosu[suggestindex[0]];
                suggest.push(temp);
                ionoob++;

            }
            ciishu++;
            if(ciishu!=count){
                var temp = new Object();
                temp.id = ionoob;
                temp.yijian = mycarchaosu[suggestindex[1]];
                suggest.push(temp);
                ionoob++;
            }
            ciishu++;
            if(ciishu!=count){
                var temp = new Object();
                temp.id = ionoob;
                temp.yijian = mycarpilao[suggestindex[2]];
                suggest.push(temp);
                ionoob++;
            }
            ciishu++;
            if(ciishu!=count) {
                var temp = new Object();
                temp.id = ionoob;
                temp.yijian = mycarchaozai[suggestindex[3]];
                suggest.push(temp);
                ionoob++;
            }
            ciishu++;
            if(ciishu!=count) {
                var temp = new Object();
                temp.id = ionoob;
                temp.yijian = mycarchaozai[suggestindex[4]];
                suggest.push(temp);
                ionoob++;
            }
            ciishu++;
            if(ciishu!=count) {
                var temp = new Object();
                temp.id = ionoob;
                temp.yijian = mycarweigui[suggestindex[5]];
                suggest.push(temp);
                ionoob++;
            } ciishu++;

            if(ciishu!=count) {
                var temp = new Object();
                temp.id = ionoob;
                temp.yijian = mycarweigui[suggestindex[6]];
                suggest.push(temp);
                ionoob++;
            } ciishu++;


            $('#table2').bootstrapTable({
                data: suggest
            });


			
        }

        var message = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+unit_name+"在安全生产中存在以下风险行为：";
        $("#msg").html(message);
        var risk_msg=[];
        function riskTip() {

            for(var i=0;i<carCount.length;i++){
                var hehehe = new Object();
                hehehe.id = i + 1;
                hehehe.yijian = carCount[i];
                risk_msg.push(hehehe);
            }


            $('#risk_table').bootstrapTable({
                striped: true, //表格显示条纹
                uniqueId: "Id",
                pagination: true, //启动分页
                pageSize: 5, //每页显示的记录数
                pageNumber: 1, //当前第几页
                pageList: [5, 10, 15, 20, 25], //记录数可选列表
                dataField: "res",//bootstrap table 可以前端分页也可以后端分页，这里
                data:risk_msg
            })
/*

                    if (carCount =="" && carCount2=="") {
                        $("#msg").html(message+"无风险。");
                    }else {
                        $("#msg").html(message+carCount2+carCount+"。");
					}

*/
                }


        function goBack() {
//            window.location.href=webPath+"/formpages/sheet2.jsp?unit_id="+unit_id+"&raiApple="+raiApple;
			window.history.go(-1);
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