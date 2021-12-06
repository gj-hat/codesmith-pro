package com.testcase.utils;

import com.autogen.code.utils.AnalysisSQL;
import com.autogen.code.utils.DataHandle;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/6 12:57
 * @description：测试外部数据库jdbc类
 * @modified By：
 * @version: 1.0
 */
public class AnalysisSQLTest {





    @Test
    public void test1() throws SQLException, ClassNotFoundException {


        String url = "jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "321321";

        Map<String,Map<String,List<String>>> stringMapMap = AnalysisSQL.analysisSqlStruct(url, driver, username, password);
        System.out.println("stringMapMap = " + stringMapMap);


    }


    // 测试sql to java 转化
    @Test
    public void test2() throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "321321";

        Map<String,Map<String,List<String>>> stringMapMap = AnalysisSQL.analysisSqlStruct(url, driver, username, password);
        System.out.println("sqlStructToJavaStruct = " + DataHandle.sqlStructToJavaStruct(stringMapMap, "postgresql"));

    }


    @Test
    public void test3(){
        String user_name = DataHandle.underlineToHump("user_name");
        System.out.println("user_name = " + user_name);


        String user_name1 = DataHandle.underlineToHump("_user_Name");
        System.out.println("user_name1 = " + user_name1);
    }



}
