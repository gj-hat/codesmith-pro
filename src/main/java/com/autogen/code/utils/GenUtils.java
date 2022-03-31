package com.autogen.code.utils;

import com.autogen.code.Constants;
import com.autogen.code.web.controller.dto.RequestParameterDto;
import com.autogen.code.web.domain.vo.ManageLibraryUnionQueryVO;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import java.io.*;
import java.util.Map;
import java.util.Properties;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/11 13:50
 * @description：生成代码工具类
 * @modified By：
 * @version: $
 */
public class GenUtils {

    /**
     * @param data                  模板参数
     * @param template              模板名
     * @param requestParameterDto   请求参数实体
     * @param manageLibraryUnionQueryVO 多表查询参数
     */
    public static void generatorCode(Map<String, Object> data, String template, RequestParameterDto requestParameterDto, ManageLibraryUnionQueryVO manageLibraryUnionQueryVO,String tableName) {
        try {
            FileWriter fileWriter = new FileWriter(Constants.TEMPLATE_FILE+"velocity.vm");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(template);
            bufferedWriter.close();
            Properties prop = new Properties();
            prop.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, Constants.TEMPLATE_FILE);
            Velocity.init(prop);
            VelocityContext velocityContext = new VelocityContext(data);
            Template tp = Velocity.getTemplate("velocity.vm", "utf-8");
            String outPath = getFileName(requestParameterDto.getArtifactId(), requestParameterDto.getPackageName(), manageLibraryUnionQueryVO.getLibraryName(), manageLibraryUnionQueryVO.getLibraryPrefix(),tableName);
            assert outPath != null;
            FileWriter fw = new FileWriter(outPath);
            tp.merge(velocityContext, fw);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 返回模板的路径
     *
     * @param artifactId   参数类的对应属性
     * @param packageName  参数类的对应属性
     * @param templateName 模板参数的模板名 manageName
     * @param preFix       模板参数的前缀   Template_library_Prefix
     * @return 返回模板的路径
     */
    public static String getFileName(String artifactId, String packageName, String templateName, String preFix, String tableName) {
        String classPrefix = Constants.DECOMPRESSION + artifactId + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + DataHandle.pointToSlash(packageName) + File.separator;
        String configPrefix = Constants.DECOMPRESSION +artifactId;

        switch (templateName) {

            case "mybatis-mapper.java":
            case "mybatisPlus-mapper.java":
                return classPrefix + preFix +tableName+"Mapper.java";
            case "mybatis-serviceImpl.java":
            case "mybatisPlus-serviceImpl.java":
                return classPrefix + preFix +tableName+"ServiceImpl.java";
            case "mybatis-domain.java":
            case "mybatisPlus-mysql-domain.java":
            case "mybatisPlus-postgresql-domain.java":
                return classPrefix + preFix +tableName+"Domain.java";
            case "mybatis-service.java":
            case "mybatisPlus-service.java":
                return classPrefix + preFix +tableName+"Service.java";
            case "controller.java":
                return classPrefix + preFix +tableName+"Controller.java";
            case "mybatisPlus-mapper.xml":
            case "mybatis-mapper.xml":
                return configPrefix + preFix + tableName+"Mapper.xml";
            case "application.yml":
                return configPrefix + File.separator + preFix + "application.yml";
        }
        return null;
    }


}
