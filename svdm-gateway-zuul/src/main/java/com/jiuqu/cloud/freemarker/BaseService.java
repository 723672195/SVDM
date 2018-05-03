package com.jiuqu.cloud.freemarker;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BaseService {
    /**
     * 非权限
     * @param pageable
     * @param sql
     * @return
     */
    Page find(Pageable pageable, String sql);
    Map findByBootstrap(Pageable pageable, String sql, String countSql);
    Page find(Pageable pageable, String sql, Class aClass);
    List<Map<String,Object>> find(String sql);

    List find(String sql, Class aClass);

}
