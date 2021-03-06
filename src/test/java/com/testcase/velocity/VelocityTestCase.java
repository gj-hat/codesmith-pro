package com.testcase.velocity;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;


/**
 *
 */
public class VelocityTestCase {
    

    @Test
    public void test1() throws Exception {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("package", "com.gj.study");
        data.put("className", "User");
        data.put("classname", "user");

        // 模板列表
        List<String> templates = new ArrayList<String>();
        templates.add("vms/controller.java.vm");
        templates.add("vms/mybatis-serviceImpl.java");
        templates.add("vms/mybatis-Mapper.java");


        // 输出流
        File file = new File("aa.zip");
        FileOutputStream outputStream = new FileOutputStream(file);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);

        // 输出
//        GenUtils.generatorCode(data, templates, zipOutputStream);

        zipOutputStream.close();
        outputStream.close();
    }
}
