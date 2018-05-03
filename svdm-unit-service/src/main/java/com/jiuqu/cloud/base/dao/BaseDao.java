package com.jiuqu.cloud.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseDao<T,ID extends Serializable> extends JpaRepository<T,ID> {
}
