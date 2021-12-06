package com.testcase.velocity;

import com.autogen.code.utils.AnalysisSQL;
import com.autogen.code.utils.DataHandle;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/6 21:00
 * @description：最终模板测试
 * @modified By：
 * @version: 1.0
 */
public class VelocityTest {








    // Controller.java.vm
    @Test
    public void test1() throws IOException {
        // 1. 设置资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2. 初始化Velocity引擎
        Velocity.init(prop);
        // 3. 创建Velocity容器
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("package", "com.guojia");
        velocityContext.put("TableName", "Users");
        velocityContext.put("DataHandle", DataHandle.class);

        // 4. 加载Velocity模版文件
        Template template = Velocity.getTemplate("vms/Controller.java.vm", "utf-8");
        // 5. 合并数据到模版   新生成一个文件
        FileWriter fw = new FileWriter("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/test/resources/Controller.java");

        template.merge(velocityContext, fw);
        // 6. 释放资源
        fw.close();
    }


    // mybatis-domain.java.vm
    @Test
    public void test2() throws IOException, SQLException, ClassNotFoundException {

        String url = "jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "321321";

        Map<String,Map<String,List<String>>> stringMapMap = AnalysisSQL.analysisSqlStruct(url, driver, username, password);
        Map<String, Map<String, List<String>>> map = DataHandle.sqlStructToJavaStruct(stringMapMap, "postgresql");

        Map<String, List<String>> diy = map.get("TemplateDiy");

        // 1. 设置资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2. 初始化Velocity引擎
        Velocity.init(prop);
        // 3. 创建Velocity容器
        VelocityContext velocityContext = new VelocityContext();



        velocityContext.put("package", "com.guojia");
        velocityContext.put("TableName", "Users");
        velocityContext.put("tableAttribute", diy);
        velocityContext.put("DataHandle", DataHandle.class);

        // 4. 加载Velocity模版文件
        Template template = Velocity.getTemplate("vms/mybatis-domain.java.vm", "utf-8");
        // 5. 合并数据到模版   新生成一个文件
        FileWriter fw = new FileWriter("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/test/resources/domain.java");

        template.merge(velocityContext, fw);
        // 6. 释放资源
        fw.close();
    }



    // mybatis-Mapper.xml.vm
    @Test
    public void test3() throws IOException, SQLException, ClassNotFoundException {

        String url = "jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "321321";

        Map<String,Map<String,List<String>>> stringMapMap = AnalysisSQL.analysisSqlStruct(url, driver, username, password);
        System.out.println("stringMapMap = " + stringMapMap);
        Map<String, Map<String, List<String>>> map = DataHandle.sqlStructToJavaStruct(stringMapMap, "postgresql");

        Map<String, List<String>> diy = map.get("TemplateDiy");

        // 1. 设置资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2. 初始化Velocity引擎
        Velocity.init(prop);
        // 3. 创建Velocity容器
        VelocityContext velocityContext = new VelocityContext();



        velocityContext.put("package", "com.guojia");
        velocityContext.put("TableName", "Users");
        velocityContext.put("tableAttribute", diy);
        velocityContext.put("underLineTableAttribute", stringMapMap);
        velocityContext.put("underLineTableName", "TemplateDiy");
        velocityContext.put("underLinePriKey", "template_id");
        velocityContext.put("humpPriKey", "templateId");
        velocityContext.put("DataHandle", DataHandle.class);

        // 4. 加载Velocity模版文件
        Template template = Velocity.getTemplate("vms/mybatis-Mapper.xml.vm", "utf-8");
        // 5. 合并数据到模版   新生成一个文件
        FileWriter fw = new FileWriter("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/test/resources/mapper.xml");

        template.merge(velocityContext, fw);
        // 6. 释放资源
        fw.close();
    }




}



