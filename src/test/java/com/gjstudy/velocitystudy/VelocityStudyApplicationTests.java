package com.gjstudy.velocitystudy;

import com.gjstudy.velocitystudy.util.GenUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

@SpringBootTest
class VelocityStudyApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("swdawdaw");
    }

    @Test
    public void test1() throws Exception {


        // 数据
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("package", "com.gj.study");
        data.put("className", "User");
        data.put("classname", "user");

        // 模板列表
        List<String> templates = new ArrayList<String>();
        templates.add("Controller.java.vm");
        templates.add("Service.java.vm");
        templates.add("Mapper.java.vm");


        // 输出流
        File file = new File("/Users/jiaguo/Desktop");
        FileOutputStream outputStream = new FileOutputStream(file);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);

        // 输出
        GenUtils.generatorCode(data,templates,zipOutputStream);

        zipOutputStream.close();
        outputStream.close();

    }



}
