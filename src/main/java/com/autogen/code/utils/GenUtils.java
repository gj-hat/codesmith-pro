package com.autogen.code.utils;

import com.autogen.code.Constants;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/11 13:50
 * @description：生成代码工具类
 * @modified By：
 * @version: $
 */
public class GenUtils {

//    /**
//     * 生成java代码  打包输出
//     *
//     * @param data            传入的数据
//     * @param templates       模板库
//     * @param zipOutputStream zip输出流
//     */
//    public static void generatorCode(Map<String, Object> data, List<String> templates, ZipOutputStream zipOutputStream) throws Exception {
//
//        // 1. 设置资源加载器
//        Properties prop = new Properties();
//        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
//        // 2. 初始化Velocity引擎
//        Velocity.init(prop);
//        // 3. 创建Velocity容器    并存入容器中
//        VelocityContext velocityContext = new VelocityContext(data);
//
//
//        // 4. 加载Velocity模版文件  遍历每一个模板
//        for (String template : templates) {
//            // 4. 加载Velocity模版文件
//            Template tpl = Velocity.getTemplate(template, "utf-8");
//            // 合并代码
//            StringWriter sw = new StringWriter();
//            tpl.merge(velocityContext, sw);
//
//            // 把代码数据输出到zip中
//            //zip 文件名
//            String fileName = getFileName(template, data.get("className").toString(), data.get("package").toString());
//            // 创建一个Zip流
//            zipOutputStream.putNextEntry(new ZipEntry(fileName));
//            // 往zip流里写数据
//            IOUtils.write(sw.toString(), zipOutputStream, "UTF-8");
//            // 6. 释放资源
//            IOUtils.closeQuietly(sw);
//
//        }
//    }


    /**
     * @param data      传入的数据
     * @param templates 模板库
     * @param tableName 表名  处理后的java大驼峰
     * @param rootPath  项目根目录
     */
    public static void generatorCode(Map<String, Object> data, List<String> templates, String tableName, String rootPath) {


        if (rootPath.charAt(rootPath.length() - 2) == '/') {
            rootPath = rootPath.substring(0, rootPath.length() - 1);
        }
        // 1. 设置资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2. 初始化Velocity引擎
        Velocity.init(prop);
        // 3. 创建Velocity容器    并存入容器中
        VelocityContext velocityContext = new VelocityContext(data);

        // 4. 加载Velocity模版文件  遍历每一个模板
        for (String template : templates) {
            // 4. 加载Velocity模版文件
            Template tpl = Velocity.getTemplate(template, "utf-8");
            try {
                // 5. 合并数据到模版   新生成一个文件
                FileWriter fw = null;

                String outPath = getFileName(template, tableName, (String) data.get("package"));
                fw = new FileWriter(outPath);

                tpl.merge(velocityContext, fw);
                // 6. 释放资源
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 返回模板的路径字符串
     *
     * @param template    模板名 templateDiy的模板名
     * @param tableName   表名  转化过java风格的数据库结构表名 即大驼峰
     * @param packageName 包名 小数点格式
     * @return
     */
    public static String getFileName(String template, String tableName, String packageName) {

        String classPrefix = Constants.PREFIX_PATH + "java";
        String configPrefix = Constants.PREFIX_PATH + "resources";
        // 包中的点换成斜线
        if (StringUtils.isNoneEmpty(packageName)) {
            packageName = DataHandle.pointToSlash(packageName);
        }
        switch (template) {
            case "vms/application.yml":
                return configPrefix + File.separator + "application.yml";
            case "vms/controller.java":
                return classPrefix + File.separator + packageName + File.separator + "controller" + File.separator + DataHandle.lowToBig(tableName) + "Controller.java";
            case "vms/mybatis-domain.java":
            case "vms/mybatisPlus-domain.java":
                return classPrefix + File.separator + packageName + File.separator + "domain" + File.separator + DataHandle.lowToBig(tableName) + "Domain.java";
            case "vms/mybatis-service.java":
            case "vms/mybatisPlus-service.java":
                return classPrefix + File.separator + packageName + File.separator + "service" + File.separator + DataHandle.lowToBig(tableName) + "Service.java";
            case "vms/mybatis-serviceImpl.java":
            case "vms/mybatisPlus-serviceImpl.java":
                return classPrefix + File.separator + packageName + File.separator + "service" + File.separator + "impl" + File.separator + DataHandle.lowToBig(tableName) + "ServiceImpl.java";
            case "vms/mybatis-mapper.java":
            case "vms/mybatisPlus-mapper.java":
                return classPrefix + File.separator + packageName + File.separator + "mapper" + File.separator + DataHandle.lowToBig(tableName) + "Mapper.java";
            case "vms/mybatis-mapper.xml":
            case "vms/mybatisPlus-mapper.xml":
                return configPrefix + File.separator + "mapper" + File.separator + DataHandle.lowToBig(tableName) + "Mapper.yml";
        }
        return null;
    }


}
