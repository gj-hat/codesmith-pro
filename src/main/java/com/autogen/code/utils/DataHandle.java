package com.autogen.code.utils;

import org.apache.logging.log4j.message.StringFormattedMessage;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/3 08:40
 * @description：数据处理工具类
 * @modified By：
 * @version: 1.0
 */
public class DataHandle {
// TODO: 2021/12/3 待完善


    public static void main(String[] args) {
        System.out.println(slashToPort("User/account/name" ));
    }


    /**
     * sql数据类型转java数据类型
     *
     * @param sqlTypeName sql数据类型
     * @return java数据类型
     */
    public static String typeTransformation(String sqlTypeName) {
        return null;
    }


    /**
     * 首字母大写转小写
     *
     * @param st 大驼峰字符串
     * @return 小驼峰字符串
     */
    public static String bigToLow(String st) {
        char[] stArr = st.toCharArray();
        if ((stArr[0] >= 65) && (stArr[0] <= 90)) {
            stArr[0] += 32;
        }
        return String.valueOf(stArr);
    }


    /**
     * 首字母小写转大写
     *
     * @param st 小驼峰字符串
     * @return 大驼峰字符串
     */
    public static String lowToBig(String st) {
        char[] stArr = st.toCharArray();
        if ((stArr[0] >= 97) && (stArr[0] <= 122)) {
            stArr[0] -= 32;
        }
        return String.valueOf(stArr);
    }


    /**
     * sql经典命名转java经典命名
     *
     * @param st 下划线命名字符串
     * @return 驼峰字符串   不做大小写处理
     */
    public static String underlineToHump(String st) {
        return st.replaceAll("_", "/" );

    }




    /**
     * 将传入的字符串按顺序把"点" --- "斜线"
     *
     * @param st 不定长参数
     * @return   string
     */
    public static String pointToSlash(String st) {
        return st.replaceAll("\\.", "/" );
    }

    /**
     * 将传入的字符串按顺序把"反斜线"  ---  "点"
     *
     * @param st 不定长参数
     * @return    string
     */
    public static String slashToPort(String st) {


        return st.replaceAll("/", "." );
    }


}