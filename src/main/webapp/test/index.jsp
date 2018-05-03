<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" media="all">
    <!-- js -->
    <script src="js/jquery-2.1.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body style="text-align: center;">
    <div>
        <table>
            <tr>
                <td>公司</td>
                <td id="unit_name"></td>
            </tr>
        </table>
    </div>
    <div style="margin: 0 auto;width: 1000px;height: 100%;text-align: center;">
        <button style="width: 100px;height: 50px;margin-top: 65%;" onclick="get()">获取</button>
    </div>
    <script type="text/javascript">
        var id = 53;
        function get() {
            $.ajax({
                type: "POST",
                url: "/unit/findUnitById",
                async: false,
                data: {id:id},
                success: function (data) {
                    var unit = eval(data)
                    $("#unit_name").html(unit.unitName)
                }
            })
        }
    </script>
</body>
</html>
