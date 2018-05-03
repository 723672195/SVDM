package com.jiuqu.cloud.filter;


import com.jiuqu.cloud.util.Config;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhaoyanan on 2017/5/25.
 */
@Component
public class SessionInterceptor implements HandlerInterceptor {



    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     * 只有返回true才会继续向下执行，返回false取消当前请求
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        Map<String,Object> map=new HashMap();
        Set set = request.getParameterMap().keySet();
        for (Object o : set) {
            Object o1 = request.getParameterMap().get(o);
            String[] s=(String[])o1;
            map.put(o.toString(),s[0]);
        }
        request.setAttribute("getparameter",map);
        return true;
    }




    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }

}
