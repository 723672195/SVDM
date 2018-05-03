package com.jiuqu.cloud.freemarker;


import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyanan on 2017/5/31.
 */
@Service
public class BaseServiceImpl implements BaseService {

    @PersistenceContext
    private EntityManager entityManager;


    /**
     * 原生sql查询分页
     * @param pageable
     * @param sql
     * @return 返回List<Map<String,Object>>
     */
    public Page find(Pageable pageable, String sql){
        try {
            Query query = entityManager.createNativeQuery(sql.toString());
            query.setFirstResult(pageable.getPageNumber() * pageable.getPageSize());
            query.setMaxResults(pageable.getPageSize());
            query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//            query.unwrap(SQLQuery.class).
            List<Map<String,Object>> rows = query.getResultList();
            return new PageImpl(rows,pageable,find(sql).size());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 原生sql查询分页
     * @param pageable
     * @param sql
     * @return 返回List<Map<String,Object>>
     */
    public Map<String, Object> findByBootstrap(Pageable pageable, String sql, String countSql){
        try {
            Query query = entityManager.createNativeQuery(sql.toString());
            query.setFirstResult(pageable.getPageNumber());
            query.setMaxResults(pageable.getPageSize());
            query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//            query.unwrap(SQLQuery.class).
            List<Map<String,Object>> rows = query.getResultList();
            PageImpl counts = new PageImpl(rows, pageable, Integer.valueOf(find(countSql).get(0).get("counts").toString()));
            Map<String, Object> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("page",counts);
            objectObjectHashMap.put("counts",Integer.valueOf(find(countSql).get(0).get("counts").toString()));
            return objectObjectHashMap;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 原生sql查询分页
     * @param pageable
     * @param sql
     * @param aClass
     * @return 返回List<Bean>
     */
    public Page find(Pageable pageable, String sql, Class aClass){
        try {
            Query query = entityManager.createNativeQuery(sql.toString(),aClass);
            query.setFirstResult(pageable.getPageNumber() * pageable.getPageSize());
            query.setMaxResults(pageable.getPageSize());
            List rows = query.getResultList();
            return new PageImpl(rows,pageable,find(sql).size());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 原生sql查询
     * @param sql
     * @return List<Map<String,Object>>
     */
    public List<Map<String,Object>> find(String sql){
        try {
            Query query = entityManager.createNativeQuery(sql.toString());
            query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
            List<Map<String,Object>> rows = query.getResultList();
            return rows;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



    /**
     * 原生sql查询
     * @param sql
     * @param aClass
     * @return 返回List<Bean>
     */
    public List find(String sql,Class aClass){
        try {
            Query query = entityManager.createNativeQuery(sql.toString(),aClass);
            List rows = query.getResultList();
            return rows;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
