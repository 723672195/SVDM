package com.jiuqu.cloud.util;

import net.sf.json.JSONArray;

import java.util.List;

/**
 * Created by zhaoyanan on 2017/5/31.
 */
public class Config {

    public static final int PAGE=10;
    public static final String ISNOTDEL="0";
    public static final String ISDEL="1";

    public static final  String JS="<script>alert('登录超时，请重新登录！');window.parent.location.href='/viewspage/pages/login.jsp'</script>";
    public static final  String JS_2="<script>window.parent.location.href='/viewspage/pages/login.jsp'</script>";

    public static final  String WEB_JS="<script>alert('登录超时，请重新登录！');window.parent.location.href='/webpage/login.jsp'</script>";
    public static final  String WEB_JS_2="<script>window.parent.location.href='/webpage/login.jsp'</script>";
    public static final  String APIKEY= "f43db6a712d09c01dd257c1d448ac71b";
    public static JSONArray JSONSTRING= null;
}
