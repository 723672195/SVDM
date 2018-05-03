package com.jiuqu.cloud.service.svdm.realtime;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
public interface CarRealService {
    List<Map<String,Object>> findCarRealRAL(Long unitId);

}
