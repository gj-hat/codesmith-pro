package com.autogen.code.utils;

import com.autogen.code.Constants;

import javax.security.auth.login.Configuration;
import java.io.File;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/7 16:00
 * @description：创建文件夹
 * @modified By：
 * @version: 1.0
 */
public class MkdirFolder {


    public static void mkdirFolder(String proName, String packageName) {

        // srcPath= /Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/main/resources/tempDown/folder/proName/
        String path = Constants.DECOMPRESSION + proName + File.separator + "src" + File.separator + "main" +File.separator;
        File resourcesMapper = new File(path + "/resources/mapper/");
        if (!resourcesMapper.exists()) {
            resourcesMapper.mkdirs();
        }
        File controller = new File(path + "/java/" + DataHandle.pointToSlash(packageName) + "/controller");
        if (!controller.exists()) {
            controller.mkdirs();
        }

        File service = new File(path + "/java/" + DataHandle.pointToSlash(packageName) + "/service");
        if (!service.exists()) {
            service.mkdirs();
        }

        File impl = new File(path + "/java/" + DataHandle.pointToSlash(packageName) + "/service/impl");
        if (!impl.exists()) {
            impl.mkdirs();
        }


        File mapper = new File(path + "/java/" + DataHandle.pointToSlash(packageName) + "/mapper");
        if (!mapper.exists()) {
            mapper.mkdirs();
        }


        File domain = new File(path + "/java/" + DataHandle.pointToSlash(packageName) + "/domain");
        if (!domain.exists()) {
            domain.mkdirs();
        }

    }

}
