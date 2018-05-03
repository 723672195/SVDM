package com.jiuqu.cloud.util;

import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertJson {

	/**
	 * LIST转换DataGrid JSON
	 * @param datalist
	 * @return
	 */
	public static String DataGrid(List datalist, long count){
		try {
			JsonConfig jsonConfig = new JsonConfig();

			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor());
			jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
			String listToJson = JsonPluginsUtil.listToJson(datalist,jsonConfig);
			listToJson="{\"total\":"+count+",\"rows\":"+listToJson+"}";
			return listToJson;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public static String DataGrid(List datalist, long count,String f){
		try {
			JsonConfig jsonConfig = new JsonConfig();

			jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor(f));
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor(f));
			jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor(f));
			jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
			String listToJson = JsonPluginsUtil.listToJson(datalist,jsonConfig);
			listToJson="{\"total\":"+count+",\"rows\":"+listToJson+"}";
			return listToJson;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	public static String DataGrid(List datalist, long count,String f,int page){
		try {
			JsonConfig jsonConfig = new JsonConfig();

			jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor(f));
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor(f));
			jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor(f));
			jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
			String listToJson = JsonPluginsUtil.listToJson(datalist,jsonConfig);
			listToJson="{\"total\":"+count+",\"page\":"+page+",\"rows\":" + listToJson + "}";
			return listToJson;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * LIST转换DataGrid JSON
	 * @param datalist
	 * @return
	 */
	public static String WebDataGrid(long current,List datalist, long count){
		try {
			JsonConfig jsonConfig = new JsonConfig();
            int x= (int) current;x++;
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor());
			jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
			String listToJson = JsonPluginsUtil.listToJson(datalist,jsonConfig);
			listToJson="{\"current\":"+x+",\"rowCount\":"+Config.PAGE+",\"rows\":"+listToJson+",\"total\":"+count+"}";
			return listToJson;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * LIST转换DataGrid JSON
	 * @param datalist
	 * @return
	 */
	public static String WebDataGrid(long current,List datalist, long count,String f){
		try {
			JsonConfig jsonConfig = new JsonConfig();
			int x= (int) current;x++;
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor(f));
			jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor(f));
			jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor(f));
			jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
			String listToJson = JsonPluginsUtil.listToJson(datalist,jsonConfig);
			listToJson="{\"current\":"+x+",\"rowCount\":"+Config.PAGE+",\"rows\":"+listToJson+",\"total\":"+count+"}";
			return listToJson;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
//	/**
//	 * LIST转换DataGrid JSON
//	 * @param datalist
//	 * @return
//	 */
//	public static String DataGrid(Object obj, int count){
//		try {
//			JsonConfig jsonConfig = new JsonConfig();
//			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
//			jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
//			String listToJson = JsonPluginsUtil.beanToJson(obj, jsonConfig);
//			listToJson="{\"total\":"+count+",\"rows\":["+listToJson+"]}";
//			return listToJson;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "";
//		}
//	}
	
	
	/**
	 * LIST转换DataGridFields JSON
	 * @param datalist
	 * @return
	 */
	public static String DataGridFields(List datalist){
		try {
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			String listToJson = JsonPluginsUtil.listToJson(datalist,jsonConfig);
			listToJson="{\"rows\":"+listToJson+"}";
			return listToJson;
		} catch (Exception e) {
			return "";
		}
	}
	/**
	 * 获取所有分类
	 * @param datalist
	 * @return
	 */
	public static String DataGridCategory(List datalist){
		try {
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			String listToJson = JsonPluginsUtil.listToJson(datalist,jsonConfig);
			return listToJson;
		} catch (Exception e) {
			return "";
		}
	}


	/**
	 * 将一个 JavaBean 对象转化为一个  Map
	 * @param bean 要转化的JavaBean 对象
	 * @return 转化出来的  Map 对象
	 * @throws IntrospectionException 如果分析类属性失败
	 * @throws IllegalAccessException 如果实例化 JavaBean 失败
	 * @throws InvocationTargetException 如果调用属性的 setter 方法失败
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map convertBean(Object bean)
			throws IntrospectionException, IllegalAccessException, InvocationTargetException {
		Class type = bean.getClass();
		Map returnMap = new HashMap();
		BeanInfo beanInfo = Introspector.getBeanInfo(type);

		PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();
		for (int i = 0; i< propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();
			if (!propertyName.equals("class")) {
				Method readMethod = descriptor.getReadMethod();
				Object result = readMethod.invoke(bean, new Object[0]);
				if (result != null) {
					returnMap.put(propertyName, result);
				} else {
					returnMap.put(propertyName, "");
				}
			}
		}
		return returnMap;
	}



	/**
	 * 将一个 Map 对象转化为一个 JavaBean
	 * @param type 要转化的类型
	 * @param map 包含属性值的 map
	 * @return 转化出来的 JavaBean 对象
	 * @throws IntrospectionException 如果分析类属性失败
	 * @throws IllegalAccessException 如果实例化 JavaBean 失败
	 * @throws InstantiationException 如果实例化 JavaBean 失败
	 * @throws InvocationTargetException 如果调用属性的 setter 方法失败
	 */
	@SuppressWarnings("rawtypes")
	public static Object convertMap(Class type, Map map)
			throws IntrospectionException, IllegalAccessException,
			InstantiationException, InvocationTargetException {
		BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性
		Object obj = type.newInstance(); // 创建 JavaBean 对象

		// 给 JavaBean 对象的属性赋值
		PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();
		for (int i = 0; i< propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();

			if (map.containsKey(propertyName)) {
				// 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
				Object value = map.get(propertyName);

				Object[] args = new Object[1];
				args[0] = value;

				descriptor.getWriteMethod().invoke(obj, args);
			}
		}
		return obj;
	}




}
