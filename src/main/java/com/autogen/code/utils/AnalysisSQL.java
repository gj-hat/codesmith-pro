package com.autogen.code.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/16 14:39
 * @description：用于解析sql数据库的信息
 * @modified By：
 * @version: 1.0
 */
public class AnalysisSQL {


    /**
     *
     * @param url          数据库url
     * @param driver       数据库驱动名
     * @param username     数据库用户名
     * @param password     数据库密码
     * @return             Map<String,Map<String,List<String>>>    数据库结构map：键:表名 值:表结构map。 表结构map：键：字段名  值：字段属性List
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Map<String,Map> analysisSqlStruct(String url,String driver, String username, String password) throws ClassNotFoundException, SQLException {

        String keyColumn = null;
        String columnName;
        String tableName;
        String isNull;
        String isPriKey;
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet tablesRes = metaData.getTables(connection.getCatalog(), null, "%", new String[]{"TABLE"});

        // map<String  表名, Map<String 列名, List<列属性(比如列的数据类型,主键, 自增......)> >  >
        Map<String, Map> tables = new HashMap<>();

        // 获取表
        // connection.getCatalog() = 链接的数据库名 = testMysql
        ResultSetMetaData md = tablesRes.getMetaData();//获取键名
        while (tablesRes.next()) {
            Map<String, List> tableNameAndAttribute = new HashMap<>();

            // 获取每一个表的表名
            tableName = tablesRes.getString("TABLE_NAME");
            // 返回表的结果集
            ResultSet columns = metaData.getColumns(connection.getCatalog(), "%", tableName, "%");
            // 获取主键
            ResultSet primaryKeys = metaData.getPrimaryKeys(connection.getCatalog(), null, tableName);
            while (primaryKeys.next()) {
                keyColumn = primaryKeys.getString("COLUMN_NAME");
            }
            while (columns.next()) {
                List<String> attribute = new ArrayList<String>();
                if (columns.getString("COLUMN_NAME").equals(keyColumn)) {
                    isPriKey = "isPriKey";
                } else isPriKey = "notPriKey";
                if ("1".equals(columns.getString("NULLABLE"))) {
                    isNull = "notNull";
                } else isNull = "null";
                columnName = columns.getString("COLUMN_NAME");
//                attribute.add(columns.getString("COLUMN_NAME"));
                attribute.add(columns.getString("TYPE_NAME"));
                attribute.add(columns.getString("COLUMN_SIZE"));
                attribute.add(isPriKey);
                attribute.add(isNull);
                tableNameAndAttribute.put(columnName, attribute);
            }
            tables.put(tableName, tableNameAndAttribute);
        }
        return tables;
    }
}
