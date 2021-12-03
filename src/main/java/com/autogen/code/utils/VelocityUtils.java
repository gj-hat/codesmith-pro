package com.autogen.code.utils;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 *
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 10:56
 */
public class VelocityUtils {

    private VelocityUtils(){}

    /**
     * 生成java代码  打包输出
     *
     * @param data            传入的数据
     * @param templates       模板库
     * @param zipOutputStream zip输出流
     */
    public static void generatorCode(Map<String, Object> data, List<String> templates, ZipOutputStream zipOutputStream) throws Exception {

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
            // 合并代码
            StringWriter sw = new StringWriter();


            tpl.merge(velocityContext, sw);

            // 把代码数据输出到zip中
            //zip 文件名
            String fileName = getFileName(template, data.get("className").toString(), data.get("package").toString());
            // 创建一个Zip流
            zipOutputStream.putNextEntry(new ZipEntry(fileName));
            // 往zip流里写数据
            IOUtils.write(sw.toString(), zipOutputStream, "UTF-8");
            // 6. 释放资源
            IOUtils.closeQuietly(sw);

        }


    }


    /**
     * 生成路径名
     * 根据模板名称 类名 包名拼接成一个完整的文件名
     *
     * @param template    模板名称
     * @param className   实体类的类名
     * @param packageName 包名
     * @return /main/java/com/XXXX/controller/UserController.java
     */
    public static String getFileName(String template, String className, String packageName) {
        // 包名 main/java   因为main/java是通用的
        String packagePath = "main" + File.separator + "java" + File.separator;

        // 如果传入的包名不为空  则把包名中的.全部换成/
        // 例如com.gj.study -> main/java/com/gj/study/
        if (StringUtils.isNoneEmpty(packageName)) {
            packagePath += packageName.replace(".", File.separator) + File.separator;
        }

        // 控制层
        // 传入的模板字符串包含Controller.java.vm
        // 则制作成 main/java/com/gj/study/Controller/UserController.java
        if (template.contains("Controller.java.vm")) {
            return packagePath + "Controller" + File.separator + className + "Controller.java";
        }

        // 业务层
        if (template.contains("mybatis-ServiceImpl.java.vm")) {
            return packagePath + "Service" + File.separator + className + "Service.java";
        }
        // 持久层
        if (template.contains("mybatis-Mapper.java.vm")) {
            return packagePath + "Mapper" + File.separator + className + "Mapper.java";
        }

        return null;
    }



}
