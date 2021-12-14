package com.testcase.velocity;

import com.autogen.code.utils.AnalysisSQL;
import com.autogen.code.utils.DataHandle;
import com.autogen.code.utils.FileUtils;
import com.autogen.code.utils.GenUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
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








    // controller.java.vm
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
        Template template = Velocity.getTemplate("vms/controller.java.vm", "utf-8");
        // 5. 合并数据到模版   新生成一个文件
        FileWriter fw = new FileWriter("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/test/resources/Controller.java");

        template.merge(velocityContext, fw);
        // 6. 释放资源
        fw.close();
    }


    // mybatis-domain.java
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
        Template template = Velocity.getTemplate("vms/mybatis-domain.java", "utf-8");
        // 5. 合并数据到模版   新生成一个文件
        FileWriter fw = new FileWriter("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/test/resources/domain.java");

        template.merge(velocityContext, fw);
        // 6. 释放资源
        fw.close();
    }



    // mybatis-mapper.xml
    @Test
    public void test3() throws IOException, SQLException, ClassNotFoundException {

        String url = "jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "321321";

        Map<String,Map<String,List<String>>> stringMapMap = AnalysisSQL.analysisSqlStruct(url, driver, username, password);
        Map<String, Map<String, List<String>>> map = DataHandle.sqlStructToJavaStruct(stringMapMap, "postgresql");

        Map<String, List<String>> res1 = map.get("TemplateDiy");
        Map<String, List<String>> res2 = stringMapMap.get("TemplateDiy");
        // 1. 设置资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2. 初始化Velocity引擎
        Velocity.init(prop);
        // 3. 创建Velocity容器
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("package", "com.guojia");
        velocityContext.put("TableName", "Users");
        velocityContext.put("tableAttribute", res1);
        velocityContext.put("underLineTableAttribute", res2);
        velocityContext.put("underLineTableName", "TemplateDiy");
        velocityContext.put("underLinePriKey", "template_id");
        velocityContext.put("humpPriKey", "templateId");
        velocityContext.put("DataHandle", DataHandle.class);

        // 4. 加载Velocity模版文件
        Template template = Velocity.getTemplate("vms/mybatis-mapper.xml", "utf-8");
        // 5. 合并数据到模版   新生成一个文件
        FileWriter fw = new FileWriter("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/test/resources/mapper.xml");

        template.merge(velocityContext, fw);
        // 6. 释放资源
        fw.close();
    }



    @Test
    public void test4() throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "321321";

        Map<String,Map<String,List<String>>> stringMapMap = AnalysisSQL.analysisSqlStruct(url, driver, username, password);
        Map<String, Map<String, List<String>>> map = DataHandle.sqlStructToJavaStruct(stringMapMap, "postgresql");

        Map<String, List<String>> res1 = map.get("TemplateDiy");
        Map<String, List<String>> res2 = stringMapMap.get("TemplateDiy");
        String rootPath = "templateDown/folder";
        Map<String, Object> data = new HashMap<>();
        data.put("package", "com.gj.AAA");
        data.put("TableName", "Users");
        data.put("tableAttribute", res1);
        data.put("underLineTableAttribute", res2);
        data.put("underLineTableName", "TemplateDiy");
        data.put("underLinePriKey", "template_id");
        data.put("humpPriKey", "templateId");
        data.put("DataHandle", DataHandle.class);
        data.put("url", url);
        data.put("driver", driver);
        data.put("username", username);
        data.put("password", password);

        FileUtils.injectionFolder("BaseDir", "com.gj.AAA");

        List<String> templates = new ArrayList<>();
        templates.add("vms/application.yml");
        templates.add("vms/controller.java");
        templates.add("vms/mybatis-service.java");
        templates.add("vms/mybatis-serviceImpl.java");
        templates.add("vms/mybatis-mapper.xml");
        templates.add("vms/mybatis-mapper.java");
        templates.add("vms/mybatis-domain.java");

//        GenUtils.generatorCode(data, templates, "UserInfo", rootPath);











    }





}



