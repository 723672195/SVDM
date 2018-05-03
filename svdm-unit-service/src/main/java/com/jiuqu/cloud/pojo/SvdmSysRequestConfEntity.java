package com.jiuqu.cloud.pojo;

import javax.persistence.*;

/**
 * Created by zhaoyanan on 2017/6/1.
 */
@Entity
@Table(name = "svdm_sys_request_conf")
public class SvdmSysRequestConfEntity {
    private int id;
    private String requestUrl;
    private String requestMethod;
    private String requestName;
    private String blacklist;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "request_url")
    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Basic
    @Column(name = "request_method")
    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    @Basic
    @Column(name = "request_name")
    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    @Basic
    @Column(name = "blacklist")
    public String getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(String blacklist) {
        this.blacklist = blacklist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SvdmSysRequestConfEntity that = (SvdmSysRequestConfEntity) o;

        if (id != that.id) return false;
        if (requestUrl != null ? !requestUrl.equals(that.requestUrl) : that.requestUrl != null) return false;
        if (requestMethod != null ? !requestMethod.equals(that.requestMethod) : that.requestMethod != null)
            return false;
        if (requestName != null ? !requestName.equals(that.requestName) : that.requestName != null) return false;
        if (blacklist != null ? !blacklist.equals(that.blacklist) : that.blacklist != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (requestUrl != null ? requestUrl.hashCode() : 0);
        result = 31 * result + (requestMethod != null ? requestMethod.hashCode() : 0);
        result = 31 * result + (requestName != null ? requestName.hashCode() : 0);
        result = 31 * result + (blacklist != null ? blacklist.hashCode() : 0);
        return result;
    }
}
