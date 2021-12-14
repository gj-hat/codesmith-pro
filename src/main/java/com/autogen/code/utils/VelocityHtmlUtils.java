package com.autogen.code.utils;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/11 08:42
 * @description：前端展示页面
 * @modified By：
 * @version: 1.0
 */
public class VelocityHtmlUtils {

    /**
     * 输出Html页面
     * @param data   数据 Map<String,List<String>>
     * @throws Exception
     */
    public void outIndexHtml(Map<String,Object> data) throws Exception {
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(prop);
        VelocityContext velocityContext = new VelocityContext(data);
        Template template = Velocity.getTemplate("templates/templateIndex.vm", "utf-8");
        FileWriter fw = new FileWriter("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/main/resources/static/index.html");
        template.merge(velocityContext, fw);
        fw.close();
    }





}
