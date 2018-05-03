package com.jiuqu.cloud.util.json;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class JSONUtil {
    public String mergeToJson(Map... args){
        JSONObject jsonObject = new JSONObject();
        for (int i = 0; i < args.length; i++) {
            for(Object key : args[i].keySet()){
                jsonObject.put(key.toString(),args[i].get(key.toString()));
            }
        }
        return jsonObject.toJSONString();
    }
}
