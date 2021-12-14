package com.autogen.code.utils;

import com.autogen.code.Constants;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/7 15:00
 * @description：zip的压缩和解压
 * @modified By：
 * @version: 1.0
 */
public class FileUtils {


// ---------------------------------------------压缩------------------------------------------------------------------------------------------


    /**
     * 压缩文件
     *
     * @param sourceFilePath 源文件路径
     * @param zipFilePath    压缩后文件存储路径
     * @param zipFilename    压缩文件名
     */
    public static void compressToZip(String sourceFilePath, String zipFilePath, String zipFilename) {
        File sourceFile = new File(sourceFilePath);
        File zipPath = new File(zipFilePath);
        if (!zipPath.exists()) {
            zipPath.mkdirs();
        }
        File zipFile = new File(zipPath + File.separator + zipFilename);
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile))) {
            writeZip(sourceFile, "", zos);
            //文件压缩完成后，删除被压缩文件
            boolean flag = deleteDir(sourceFile);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    /**
     * 遍历所有文件，压缩
     *
     * @param file       源文件目录
     * @param parentPath 压缩文件目录
     * @param zos        文件流
     */
    private static void writeZip(File file, String parentPath, ZipOutputStream zos) {
        if (file.isDirectory()) {
            //目录
            parentPath += file.getName() + File.separator;
            File[] files = file.listFiles();
            for (File f : files) {
                writeZip(f, parentPath, zos);
            }
        } else {
            //文件
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
                //指定zip文件夹
                ZipEntry zipEntry = new ZipEntry(parentPath + file.getName());
                zos.putNextEntry(zipEntry);
                int len;
                byte[] buffer = new byte[1024 * 10];
                while ((len = bis.read(buffer, 0, buffer.length)) != -1) {
                    zos.write(buffer, 0, len);
                    zos.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e.getMessage(), e.getCause());
            }
        }
    }




    // ---------------------------------------------删除相关------------------------------------------------------------------------------------------






    /**
     * 删除文件夹
     *
     * @param dir
     * @return
     */
    private static boolean deleteDir(File dir) {

        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        //删除空文件夹
        return dir.delete();
    }



    /**
     * 工具
     * @param folderPath 文件夹完整绝对路径 ,"Z:/xuyun/save"
     */
    private static void delFolder(String folderPath) {
        try {
            delAllFile(folderPath); //删除完里面所有内容
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            myFilePath.delete(); //删除空文件夹
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 删除指定文件夹下所有文件
     * @param path 文件夹完整绝对路径
     */
    public static boolean delAllFile(String path) {
        boolean flag = false;
        File file = new File(path);
        if (!file.exists()) {
            return flag;
        }
        if (!file.isDirectory()) {
            return flag;
        }
        String[] tempList = file.list();
        File temp = null;
        for (int i = 0; i < tempList.length; i++) {
            if (path.endsWith(File.separator)) {
                temp = new File(path + tempList[i]);
            } else {
                temp = new File(path + File.separator + tempList[i]);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
                delFolder(path + "/" + tempList[i]);//再删除空文件夹
                flag = true;
            }
        }
        return flag;
    }


// ---------------------------------------------解压------------------------------------------------------------------------------------------


    /**
     * 解压
     *
     * @param zipFilePath  源文件
     * @param desDirectory 解压到的目录
     */
    public static void decompressionToZip(String zipFilePath, String desDirectory) {

        File file1 = new File(desDirectory);
        deleteDir(file1);

        try {
            File desDir = new File(desDirectory);
            if (!desDir.exists()) {
                boolean mkdirSuccess = desDir.mkdir();
                if (!mkdirSuccess) {
                    throw new Exception("创建解压目标文件夹失败");
                }
            }
            // 读入流
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath));
            // 遍历每一个文件
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                if (zipEntry.isDirectory()) { // 文件夹
                    String unzipFilePath = desDirectory + File.separator + zipEntry.getName();
                    // 直接创建
                    mkdir(new File(unzipFilePath));
                } else { // 文件
                    String unzipFilePath = desDirectory + File.separator + zipEntry.getName();
                    File file = new File(unzipFilePath);
                    // 创建父目录
                    mkdir(file.getParentFile());
                    // 写出文件流
                    BufferedOutputStream bufferedOutputStream =
                            new BufferedOutputStream(new FileOutputStream(unzipFilePath));
                    byte[] bytes = new byte[1024];
                    int readLen;
                    while ((readLen = zipInputStream.read(bytes)) != -1) {
                        bufferedOutputStream.write(bytes, 0, readLen);
                    }
                    bufferedOutputStream.close();
                }
                zipInputStream.closeEntry();
                zipEntry = zipInputStream.getNextEntry();
            }
            zipInputStream.close();
            deleteFile(zipFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.delete()) {
                throw new Exception("删除失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 如果父目录不存在则创建
    private static void mkdir(File file) {
        if (null == file || file.exists()) {
            return;
        }
        mkdir(file.getParentFile());
        file.mkdir();
    }


// ---------------------------------------------注入基础文件夹------------------------------------------------------------------------------------------

    public static void injectionFolder(String artifactId, String packageName) {

        String rootPath = Constants.DECOMPRESSION + artifactId + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator;
        File resourcesMapper = new File(Constants.DECOMPRESSION + artifactId + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "mapper");
        if (!resourcesMapper.exists()) {
            resourcesMapper.mkdirs();
        }
        File controller = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "web" + File.separator + "controller");
        if (!controller.exists()) {
            controller.mkdirs();
        }

        File service = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "web" + File.separator + "service");
        if (!service.exists()) {
            service.mkdirs();
        }

        File impl = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "web" + File.separator + "service/impl");
        if (!impl.exists()) {
            impl.mkdirs();
        }


        File mapper = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "web" + File.separator + "mapper");
        if (!mapper.exists()) {
            mapper.mkdirs();
        }


        File domain = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "web" + File.separator + "domain");
        if (!domain.exists()) {
            domain.mkdirs();
        }
        File utils = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "utils");
        if (!utils.exists()) {
            utils.mkdirs();
        }
        File configuration = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "configuration");
        if (!configuration.exists()) {
            configuration.mkdirs();
        }
        File advice = new File(rootPath + DataHandle.pointToSlash(packageName) + File.separator + "advice");
        if (!advice.exists()) {
            advice.mkdirs();
        }

    }


}
