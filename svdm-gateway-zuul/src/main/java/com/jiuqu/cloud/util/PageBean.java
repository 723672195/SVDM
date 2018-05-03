package com.jiuqu.cloud.util;

import org.springframework.data.domain.Pageable;

import java.util.Map;

/**
 * Created by zhaoyanan on 2017/5/31.
 */
public class PageBean {

    private Pageable pageable;
    private Map map;

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
