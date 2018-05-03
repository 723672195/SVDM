package com.jiuqu.cloud.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import org.apache.commons.collections.map.ListOrderedMap;

import java.sql.Timestamp;
import java.util.*;

public class JsonPluginsUtil {

	
	/**  
	 * 从一个JSON 对象字符格式中得到一个java对象  
	 *   
	 * @param jsonString  
	 * @param beanCalss  
	 * @return  
	 */
	@SuppressWarnings("unchecked")
	public static <T> T jsonToBean(String jsonString, Class<T> beanCalss) {
		
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		T bean = (T) JSONObject.toBean(jsonObject, beanCalss);
		
		return bean;
		
	}
	
	/**  
	 * 将java对象转换成json字符串  
	 *
	 * @param bean  
	 * @return  
	 */
	public static String beanToJson(Object bean) {
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor());

		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		return beanToJson(bean, jsonConfig);

	}
	public static String beanToJson(Object bean,String f) {
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor(f));
		jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor(f));

		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor(f));
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		return beanToJson(bean, jsonConfig);

	}
	public static String beanToJson(Object bean, JsonConfig jsonConfig) {
		JSONObject json = JSONObject.fromObject(bean,jsonConfig);
		return json.toString();

	}
	/**
	 * 将LIST转换json字符串  
	 * @param list
	 * @return
	 */
	public static String listToJson(List list){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(Object.class, new JsonDateValueProcessor());
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		/*JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);*/
		return listToJson(list, jsonConfig);
	}
	public static String listToJsony_m_d(List list){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		return listToJson(list, jsonConfig);
	}
	
	public static String listToJson(List list, JsonConfig jsonConfig){
		JSONArray jsonArray2 = JSONArray.fromObject( list,jsonConfig );
		return jsonArray2.toString();
	}
	
	/**
	 * map 转换 json
	 * @param list
	 * @param type
	 * @return
	 */
	public static String mapToJson(Map<String, String> list){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(Object.class, new JsonDateValueProcessor());
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		JSONArray jsonArray2 = JSONArray.fromObject(list,jsonConfig);
		return jsonArray2.toString();
	}
	
	/**
	 * map 转换 json
	 * 
	 * @param list
	 * @param type
	 * @return
	 */
	public static HashMap<String, String> mapToJson(String json) {
		HashMap<String, String> data = new HashMap<String, String>();
		// 将json字符串转换成jsonObject
		JSONObject jsonObject = JSONObject.fromObject(json);
		Iterator it = jsonObject.keys();
		// 遍历jsonObject数据，添加到Map对象
		while (it.hasNext()) {
			String key = String.valueOf(it.next());
			String value = (String) jsonObject.get(key);
			data.put(key, value);
		}
		return data;
	}
	
	/**
	 * 嵌套json 转换 list<map>
	 * @param jsonStr
	 * @return
	 */
	public static List<Map<String, Object>> parseJSON2List(String jsonStr){
        JSONArray jsonArr = JSONArray.fromObject(jsonStr);
        List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
        Iterator<JSONObject> it = jsonArr.iterator();
        while(it.hasNext()){
            JSONObject json2 = it.next();
            list.add(parseJSON2Map(json2.toString()));
        }
        return list;
    }
	
	public static Map<String, Object> parseJSON2Map(String jsonStr){
        ListOrderedMap map = new ListOrderedMap();
        //最外层解析
        JSONObject json = JSONObject.fromObject(jsonStr);
        for(Object k : json.keySet()){
            Object v = json.get(k);
            //如果内层还是数组的话，继续解析
            if(v instanceof JSONArray){
                List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
                Iterator<JSONObject> it = ((JSONArray)v).iterator();
                while(it.hasNext()){
                    JSONObject json2 = it.next();
                    list.add(parseJSON2Map(json2.toString()));
                }
                map.put(k.toString(), list);
            } else {
                map.put(k.toString(), v);
            }
        }
        return map;
    }
}
