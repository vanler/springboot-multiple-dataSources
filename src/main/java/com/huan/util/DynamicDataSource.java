package com.huan.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源（需要继承AbstractRoutingDataSource）
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {
        //github修改
        //github修改2
        //github修改3
        return DatabaseContextHolder.getDatabaseType();
        //git提交修改
    }
}
