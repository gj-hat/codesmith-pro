package com.testcase.velocity;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/16 08:48
 * @description：测试jdbc获取数据库信息
 * @modified By：
 * @version: 1.0
 */
public class VelocitySqlTest {

    @Test
    public void test1() throws ClassNotFoundException, SQLException {

        String keyColumn = null;
        String columnName;
        String tableName;
        String isNull;
        String isPriKey;
        String url = "jdbc:mysql://127.0.0.1:3306/testMysql";
        String username = "root";
        String psd = "321321321";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, psd);
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet tablesRes = metaData.getTables(connection.getCatalog(), null, "%", new String[]{"TABLE"});

        // map<String  表名, Map<String 列名, List<列属性(比如列的数据类型,主键, 自增......)> >  >
        Map<String, Map> tables = new HashMap<String, Map>();
        List<String> test = new ArrayList<>();
//        Map<String, List> tableNameAndAttribute = new HashMap<String, List>();


        // 获取表
        // connection.getCatalog() = 链接的数据库名 = testMysql
        ResultSetMetaData md = tablesRes.getMetaData();//获取键名
        while (tablesRes.next()) {                                      // 两次
            Map<String, List> tableNameAndAttribute = new HashMap<String, List>();

            // 获取每一个表的表名
            tableName = tablesRes.getString("TABLE_NAME");
//            System.out.println("tableName = " + tableName);
            // 返回表的结果集
            ResultSet columns = metaData.getColumns(connection.getCatalog(), "%", tableName, "%");
            // 获取主键
            ResultSet primaryKeys = metaData.getPrimaryKeys(connection.getCatalog(), null, tableName);
            while (primaryKeys.next()) {                            // 只有一次有结果
                keyColumn = primaryKeys.getString("COLUMN_NAME");
            }
            while (columns.next()) {                                //  四次
                List<String> attribute = new ArrayList<String>();
                if (columns.getString("COLUMN_NAME").equals(keyColumn)) {
                    isPriKey = "isPriKey";
                } else isPriKey = "notPriKey";
                if ("1".equals(columns.getString("NULLABLE"))) {
                    isNull = "notNull";
                } else isNull = "null";
                columnName = columns.getString("COLUMN_NAME");
                attribute.add(columns.getString("COLUMN_NAME"));
                attribute.add(columns.getString("TYPE_NAME"));
                attribute.add(columns.getString("COLUMN_SIZE"));
                attribute.add(isNull);
                attribute.add(isPriKey);

                tableNameAndAttribute.put(columnName, attribute);

            }

            tables.put(tableName, tableNameAndAttribute);

        }
        System.out.println(tables);

    }


}
