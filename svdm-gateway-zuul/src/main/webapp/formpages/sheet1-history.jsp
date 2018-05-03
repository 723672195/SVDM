<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath  = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/sheet";
%>
<!DOCTYPE html>
<html lang="en">
<!DOCTYPE html>
<html>
<head>
<title>交通运输管理系统</title>
<!-- mobile apps -->
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
	<script type="text/javascript">
        var webPath='<%=basePath%>';
        var ppp = "请选择";
        var ccc = "请选择";
        var ddd = "请选择";
        function getBusinessAllInfo() {
            $.ajax({
                type: "POST",
                url: webPath+"/svdm/count/CountUnit",
                async: false,
                success: function (data) {
                    if (data != "") {
                        var json = eval(data);
                        $("#keyungongsi").html(Zero(json.keyungongsi));
                        $("#keyuncheliang").html(Zero(json.keyuncheliang));
                        $("#keyunyunshunengli").html(Zero(json.keyunnengli)+"座");
                        $("#keyunrenyuan").html(Zero(json.keyunjiashiren));
                        $("#yingyungongsi").html(Zero(json.huoyungongsi));
                        $("#yingyunyunshunengli").html(Zero(json.yunshunengli));
                        $("#yingyuncheliang").html(Zero(json.huoyuncheliang));
                        $("#yingyunrenyuan").html(Zero(json.huoyunjiashiren));

                    }
                }
            })
        }
        function getAllBusinessUnitInfo() {
            $('#table2').bootstrapTable('destroy');
            $('#table2').bootstrapTable({
                method: "post",
                url: webPath+"/svdm/unit/findHistoryUnitAll",
				dataType: "json",
                contentType : "application/x-www-form-urlencoded",
                queryParams: function(params) {
                    return {
                        pageNumber: params.offset,
                        size: params.limit,
                        province:ppp,
                        city:ccc,
                        district:ddd
                    };
                },
                //是否显示行间隔色
                striped: true,
                //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                cache: false,
                //是否显示分页（*）
                pagination: true,
                //是否启用排序
                sortable: false,
                //排序方式
                //sortOrder: "asc",
                //初始化加载第一页，默认第一页
                //我设置了这一项，但是貌似没起作用，而且我这默认是0,- -
                pageNumber:1,
                //每页的记录行数（*）
                pageSize: 5,
                //可供选择的每页的行数（*）
                pageList: [10, 25, 50, 100],
                //分页方式：client客户端分页，server服务端分页（*）
                sidePagination: "server",
                //是否显示搜索
                search: false,
                //Enable the strict search.
                strictSearch: true,
                //Indicate which field is an identity field.
                idField : "id",
                columns: [
                    {
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index + 1;
                        }
                    },
                    {
                        title: '公司ID',
                        field: 'id',
//                        visible: false

                    },
                    {
                        title: '公司名称',
                        field: 'unit_name',
                    },
                    {
                        title: '运输性质',
                        field:'unit_type',
                        align: 'center',
                        formatter: function (value,row,index) {
                            var apple = row.seat;
                            var banana = row.tonnage;
                            if (apple!=0&&banana!=0){
                                return "客运/货运"
                            }else if(apple==0&&banana!=0){
                                return "货运"
                            }else if(apple!=0&&banana==0){
                                return "客运"
                            }else {return "-"}
                        }
                    },
                    {
                        title: '公司地址',
                        field: 'unit_address',
                    },
                    {
                        title: '运营编号',
                        field: 'unit_permit_number'
                    },
					{field:'freight_car_number',visible: false},
					{field:'passenger_car_number',visible: false},
                    {
                        title: '车辆保有量',
                        field: 'car_count',
                        formatter: function (value, row, index) {
                            return row.freight_car_number+row.passenger_car_number + "辆"
                        }
                    },
                    {
                        title: '客运能力',
                        field: 'seat',
                        formatter: function (value, row, index) {
                            return value + "人"
                        }
                    },
                    {
                        title: '货运能力',
                        field: 'tonnage',
                        formatter: function (value, row, index) {
                            return value + "吨"
                        }
                    },
                    {
                        title: '驾驶人员',
                        field: 'driver_count',
                        formatter: function (value, row, index) {
                            return Math.ceil(value*1.6) + "人"
                        }
                    },
                    {
                        title: '综合RAI指数',
                        field: 'rai_count',
                        formatter:function (value,row,index) {
                            if(value==""||value==undefined){
                                return 0+"%";
                            }else {return value+"%"};
                        }
                    },
                    {
                        title: '风险级别',
                        field: 'risk_grade',
                        width: 25,
                        formatter: function (value, row, index) {
                            var temp = "";
                            if (value == "稍有危险") {
                                temp = "<a class='fa fa-lock' href='javascript:void(0)' onclick='toSheet2Jsp(" + row.id + ")' style='font-size:13px;color:#66CC33'><b>一级</b></a>"
                            } else if (value == "一般危险") {
                                temp = "<a class='fa fa-lock' href='javascript:void(0)' onclick='toSheet2Jsp(" + row.id + ")' style='font-size:13px;color:#FFD700'><b>二级</b></a>"
                            } else if (value == "显著危险") {
                                temp = "<a class='fa fa-lock' href='javascript:void(0)' onclick='toSheet2Jsp(" + row.id + ")' style='font-size:13px;color:#FF8C00'><b>三级</b></a>"
                            } else if (value == "高度危险") {
                                temp = "<a class='fa fa-lock' href='javascript:void(0)' onclick='toSheet2Jsp(" + row.id + ")' style='font-size:13px;color:#FF0000'><b>四级</b></a>"
                            } else if (value == "极其危险") {
                                temp = "<a class='fa fa-lock' href='javascript:void(0)' onclick='toSheet2Jsp(" + row.id + ")' style='font-size:13px;color:#990000'><b>五级</b></a>"
                            }else if (value == "无危险") {
                                temp = "<a class='fa fa-lock' href='javascript:void(0)' onclick='toSheet2Jsp(" + row.id + ")' style='font-size:13px;'><b>无危险</b></a>"
                            }else {
                                temp = "<a class='fa fa-lock' href='javascript:void(0)' onclick='toSheet2Jsp(" + row.id + ")' style='font-size:13px;'><b>暂无评级</b></a>"
                            }
                            return temp;
                        }
                    }
                ]
            });
            $('#table2').bootstrapTable('hideColumn', 'id');
        }

        function toSheet2Jsp(val){
            window.location.href=webPath+"/formpages/sheet2-history.jsp?unit_id="+val;
			//window.open(webPath+"/formpages/sheet2-history.jsp?unit_id="+val);
        }
        function gosheet1() {
            window.location.href=webPath+"/formpages/sheet1.jsp";
        }

        $(window).load(function () {
            $('#accordion-wrapper').raccordion({
                speed: 1000,
                sliderWidth: 700,
                sliderHeight: 300,
                autoCollapse: false
            });
            getBusinessAllInfo();
            getAllBusinessUnitInfo();

        });
        function huifu() {
            ppp = "请选择";
            ccc = "请选择";
            ddd = "请选择";
        };
        function Zero(val) {
            if (val==null||val==""||val==undefined){
                return 0;
            }else {
                return val;
            };
        }
	</script>
	<!--skycons-icons-->
	<script src="js/skycons.js"></script>
<!-- //end-smooth-scrolling -->
</head>
<body>
	<!-- banner -->
	<div class="banner">
		<div class="banner-info" style="height: 500px;">
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
					<div class="clearfix"> </div>
					<div class="w3ls-row" style="padding-top: 30px;">
						<div class="col-sm-3 col-md-3  w3latest-grids">
							<div class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;货运公司 </li>
										<li class="active" id="yingyungongsi"></li>
									</ol>
								</h2>
							</div>
						</div>
						<div class="col-sm-3 col-md-3  w3latest-grids">
							<div class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;货运车辆 </li>
										<li class="active" id="yingyuncheliang"></li>
									</ol>
								</h2>
							</div>
						</div>
						<div class="col-sm-3 col-md-3  w3latest-grids">
							<div class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;运输能力 </li>
										<li class="active" id="yingyunyunshunengli"></li>
									</ol>
								</h2>
							</div>
						</div>
						<div class="col-sm-3 col-md-3  w3latest-grids">
							<div class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;驾驶人员 </li>
										<li class="active" id="yingyunrenyuan"></li>
									</ol>
								</h2>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix"> </div>
					<div class="w3ls-row" style="padding-top: 0px;">
						<div class="col-sm-3 col-md-3  w3latest-grids" style="margin-top: 28px">
							<sdiv class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;客运公司 </li>
										<li class="active" id="keyungongsi"></li>
									</ol>
								</h2>
							</sdiv>
						</div>
						<div class="col-sm-3 col-md-3  w3latest-grids">
							<div class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;客运车辆 </li>
										<li class="active" id="keyuncheliang"></li>
									</ol>
								</h2>
							</div>
						</div>
						<div class="col-sm-3 col-md-3  w3latest-grids">
							<div class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;客运能力 </li>
										<li class="active" id="keyunyunshunengli"></li>
									</ol>
								</h2>
							</div>
						</div>
						<div class="col-sm-3 col-md-3  w3latest-grids">
							<div class="banner-text about-banner-text" style="padding: 2em 0;">
								<h2 style="padding: 0.3em 0.2em;width: 250px;">
									<ol class="breadcrumb" style="padding: 10px 0;">
										<li class="active">&nbsp;&nbsp;&nbsp;&nbsp;驾驶人员 </li>
										<li class="active" id="keyunrenyuan"></li>
									</ol>
								</h2>
							</div>
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
				<h3>营运公司RAI分析</h3>
				<p>Operating company RAI analysis. </p>
			</div>
			<div id="selectList" style="width: 100%;text-align: center;padding: 3%;}">
				省：
				<select id="province" style="width: 102px">

				</select>
				市：
				<select id="city" style="width: 102px">

				</select>
				 县（区）：
				<select id="district" style="width: 102px">

				</select>
				<button style="margin-left: 30px;" onclick="getAllBusinessUnitInfo(),huifu()">搜索</button>
				<%--<button style="margin-left: 10px;" onclick="getExport()">报告导出</button>--%>
				<div style="float: right;">
					<button onclick="gosheet1()">实时记录</button>
				</div>
			</div>
			<div class="w3ls-row">
				<div class="col-sm-12 col-md-12  w3latest-grids">
					<table id="table2"
						   data-pagination="true" class="table-striped">
					</table>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //welcome -->
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="footer-bottom">
				<p>© 2017 jiuqu data . All rights reserved | Design by <a href="http://w3layouts.com">jiuqu data.</a></p>
			</div>
		</div>
	</div>
    <script type="text/javascript">


        $(function(){
            var webPath='<%=basePath%>';
            $("#selectList").each(function(){
//                var url = webPath2+"/unit/getRegionJson";
                var areaJson;
                var temp_html;
                var oProvince = $(this).find("#province");
                var oCity = $(this).find("#city");
                var oDistrict = $(this).find("#district");
                //初始化省
                var province = function(){
                    $.each(areaJson,function(i,province){
                        temp_html+="<option value='"+province.p+"'>"+province.p+"</option>";
                    });
                    oProvince.html(temp_html);
                    m = oProvince.get(0).selectedIndex;
                    ppp = areaJson[m].p;
                    city();
                };
                //赋值市
                var city = function(){
                    temp_html = "";
                    var n = oProvince.get(0).selectedIndex;
                    $.each(areaJson[n].c,function(i,city){
                        temp_html+="<option value='"+city.ct+"'>"+city.ct+"</option>";
                    });
                    oCity.html(temp_html);
                    m = oCity.get(0).selectedIndex;
                    ccc = areaJson[m].p;
                    district();
                };
                //赋值县
                var district = function(){
                    temp_html = "";
                    var m = oProvince.get(0).selectedIndex;
                    var n = oCity.get(0).selectedIndex;
                    if(typeof(areaJson[m].c[n].d) == "undefined"){
                        oDistrict.css("display","none");
                    }else{
                        ppp = areaJson[m].p;
                        ccc = areaJson[m].c[n].ct;
                        oDistrict.css("display","inline");
                        $.each(areaJson[m].c[n].d,function(i,district){
                            temp_html+="<option value='"+district.dt+"'>"+district.dt+"</option>";
                        });
                        oDistrict.html(temp_html);
                    };
                };
                //获取选择
                var getSelect = function () {

                    var m = oProvince.get(0).selectedIndex;
                    var n = oCity.get(0).selectedIndex;
                    var o = oDistrict.get(0).selectedIndex;

                    ppp = areaJson[m].p;
                    ccc = areaJson[m].c[n].ct;
                    ddd = areaJson[m].c[n].d[o].dt;

                }
                //选择省改变市
                oProvince.change(function(){
                    city();
                });
                //选择市改变县
                oCity.change(function(){
                    district();
                });
                //选择县（区）
                oDistrict.change(function () {
                    getSelect();
                });
                //获取json数据
				$.ajax({
					type: "POST",
					url: webPath+"/svdm/unit/getRegionJson",
                    async: false,
					dataType : "json",
					success: function (data) {
						if(data!=""){
						    areaJson = data;
						    province();
						}
                    }
				})
//                $.getJSON(url,function(data){
//                    areaJson = data;
//                    province();
//                });
            });
        });

    </script>
	<!-- //footer -->
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