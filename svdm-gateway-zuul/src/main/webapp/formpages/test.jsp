<%--
  Created by IntelliJ IDEA.
  User: msi
  Date: 2018/1/25
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link rel="shortcut icon" href="/img/favicon.ico">
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

</body>
<script>
function a() {


    $.ajax({
        type: "POST",
        async: false,
        url: "/svdm/risk/getCarNumber",
        data: {unit_id: 51},
        success: function (data) {
            if (data != "") {
                var json = JSON.parse(data);
//                var temp = "";
                for (var i = 0; i < json.length; i++) {
                    var obj = json[i];
//                    var objColor = '';
//						    var carZhishu ;
//                    if (obj.risk_grade == "稍有危险") {
//                        objColor = "#66CC33"
//                    } else if (obj.risk_grade == "一般危险") {
//                        objColor = "#FFD700"
//                    } else if (obj.risk_grade == "显著危险") {
//                        objColor = "#FF8C00"
//                    } else if (obj.risk_grade == "高度危险") {
//                        objColor = "#FF0000"
//                    } else if (obj.risk_grade == "极其危险") {
//                        objColor = "#990000"
//                    }else if (obj.risk_grade == ""||obj.risk_grade==undefined||obj.risk_grade==null){
//                        objColor = "#9ca0a8"
//                    }
//
//                    if(obj.rai_count==""||obj.rai_count==null||obj.rai_count==undefined){
//                        carZhishu = 0;
//                    }
                    var temp = "";
                    var thisIsCarId ='IsCarId' + obj.car_code;
                    alert(thisIsCarId);
                    temp="<span href='javascript:void(0);' id="+thisIsCarId+"  class='glyphicon effect-1' style='width:87px;height: 87px;padding-top: 33px;font-size: 1.3em' aria-hidden='true'>"+"0%"+"</span>"
                    alert(temp);
                    break;
//                    temp+="<div class='col-md-2 services-grid'>" +
//                        "<span href='javascript:void(0);' class='glyphicon effect-1' style='width:87px;height: 87px;padding-top: 33px;font-size: 1.3em;background-color: "+objColor+"' aria-hidden='true' onclick='toSheet3Jsp(\""+obj.car_license_plate+"\")'>"+"0%"+"</span>" +
//                        "<h5>"+obj.car_license_plate+"</h5>" +
//                        "</div>"

                }
//                $("#cars_no").html(temp);
            }
        }

    });
}
a();
</script>
</html>
