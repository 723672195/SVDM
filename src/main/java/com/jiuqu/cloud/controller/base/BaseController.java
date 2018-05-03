package com.jiuqu.cloud.controller.base;


import com.jiuqu.cloud.util.Config;
import com.jiuqu.cloud.util.ConvertJson;
import com.jiuqu.cloud.util.PageBean;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by zhaoyanan on 2017/5/27.
 */

public class BaseController {

    /**
     * 获取前端页面参数值
     * @return
     */
    protected Map getParameter(){
        Object getparameter = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getAttribute("getparameter");
        if(getparameter==null){return null;}
        return (Map) getparameter;
    }

    /**
     * 获取前端页面参数值
     * @return
     */
    protected Map getParameterByPage(){
        Map map = null;
        Object getparameter = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getAttribute("getparameter");
        if (getparameter!=null){
            map = (Map) getparameter;
            PageBean pageBean = getPageBean((Map) getparameter);
            if (pageBean != null){
                map.put("pageNumber",pageBean.getPageable().getPageNumber());
                map.put("size",pageBean.getPageable().getPageSize());
            }
        }
        return map;
    }

    /**
     * 获取前端页面参数值
     * @return
     */
    protected Object getParameter(Class aClass) throws InvocationTargetException, IntrospectionException, InstantiationException, IllegalAccessException {
        Object getparameter = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getAttribute("getparameter");
        if(getparameter==null){return null;}
        return ConvertJson.convertMap(aClass,((Map) getparameter));
    }



    /**
     * 获取当前页数
     * @return
     */
    protected int getPageNumber(){
        try {
            Object pageNumber = null;
            if (getParameter().get("pageNumber") !=null){
                pageNumber = getParameter().get("pageNumber");
            }else{
                pageNumber = getParameter().get("current");
            }
            return Integer.valueOf(pageNumber.toString())-1;
        }catch (Exception e){
            return 0;
        }
    }


    /**
     * 获取分页对象和前端页面参数值
     * @return
     */
    protected PageBean getPageBean(){
        PageBean pageBean=new PageBean();
        pageBean.setPageable(new PageRequest(getPageNumber(), Config.PAGE, null));
        pageBean.setMap(getParameter());
        return pageBean;
    }
    /**
     * 获取分页对象和前端页面参数值
     * @return
     */
    protected PageBean getPageBean(Map parameter){
        PageBean pageBean=new PageBean();
        PageRequest pageRequest = new PageRequest(Integer.valueOf(parameter.get("pageNumber").toString()), Integer.valueOf(parameter.get("size").toString()), null);
        pageBean.setPageable(pageRequest);
        pageBean.setMap(parameter);
        return pageBean;
    }

    protected  String file(MultipartFile multipartFile){
        String[] file_={"jpg","png","bmp"};
        String originalFilename = multipartFile.getOriginalFilename();
        if(originalFilename.lastIndexOf(".")==-1){
            return "文件格式错误";
        }
        String substring = originalFilename.substring(originalFilename.lastIndexOf(".")+1, originalFilename.length());
        boolean f=false;
        for (String s : file_) {
            if(s.equals(substring.toLowerCase())){
                f=true;
                break;
            }
        }
        if(!f){
            return "文件格式错误";
        }
        long max=3;
        long size = multipartFile.getSize();
        long s=max*1024*1024;
        if(size>s){
            return "文件不能大于"+max+"MB";
        }
        return "success";
    }

}
