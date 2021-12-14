package com.autogen.code.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/3 08:40
 * @description：数据处理和转化工具类
 * @modified By：
 * @version: 1.0
 */
public class DataHandle {


    enum DbDataType {

        MySQL {
            private final Map<String, String> dataTypes = new HashMap<>();
            {
                dataTypes.put("varchar", "String");
                dataTypes.put("char", "String");
                dataTypes.put("tinyint", "Boolean");
                dataTypes.put("int", "int");
                dataTypes.put("bigint", "long");
                dataTypes.put("float", "float");
                dataTypes.put("double", "double");
                dataTypes.put("integer", "int");
                dataTypes.put("decimal", "BigDecimal");
                dataTypes.put("text", "String");
                dataTypes.put("datetime", "Date");
                dataTypes.put("timestamp", "Date");
            }

            @Override
            public String convert(String columnType) {
                return dataTypes.get(columnType);
            }
        },
        Postgresql {
            private final Map<String, String> dataTypes = new HashMap<>();
            {
                dataTypes.put("varchar", "String");
                dataTypes.put("bpchar", "String");
                dataTypes.put("cidr", "Object");
                dataTypes.put("inet", "Object");
                dataTypes.put("macaddr", "Object");
                dataTypes.put("text", "String");
                dataTypes.put("int8", "long");
                dataTypes.put("box", "Object");
                dataTypes.put("circle", "Object");
                dataTypes.put("float8", "float");
                dataTypes.put("int4", "int");
                dataTypes.put("interval", "Object");
                dataTypes.put("line", "Object");
                dataTypes.put("lseg", "Object");
                dataTypes.put("money", "Object");
                dataTypes.put("numeric", "BigDecimal");
                dataTypes.put("path", "Object");
                dataTypes.put("point", "Object");
                dataTypes.put("polygon", "Object");
                dataTypes.put("float4", "float");
                dataTypes.put("int2", "int");
                dataTypes.put("time", "Time");
                dataTypes.put("timestamp", "Timestamp");
                dataTypes.put("bit", "Boolean");
                dataTypes.put("varbit", "Object");
                dataTypes.put("bool", "Boolean");
                dataTypes.put("bytea", "byte");
                dataTypes.put("serial", "int");
            }

            @Override
            public String convert(String columnType) {
                return dataTypes.get(columnType);
            }
        };

        abstract String convert(String columnType);
    }


    /**
     * 原始jdbc风格结构转化为java风格的结构  比如 命名风格,数据类型
     *
     * @param jdbcStruct jdbc风格结构
     * @param sqlName    数据库名
     * @return java风格的数据结构  Map<String,Map<String,List<String>>>    数据库结构map：键:表名大驼峰 值:表结构map。 表结构map：键：字段名小驼峰  值：字段属性List<数据类型,主键>
     */
    public static Map<String, Map<String, List<String>>> sqlStructToJavaStruct(Map<String, Map<String, List<String>>> jdbcStruct, String sqlName) {
        Map<String, Map<String, List<String>>> resMap = new HashMap<>();

        for (Map.Entry<String, Map<String, List<String>>> entry1 : jdbcStruct.entrySet()) {
            Map<String, List<String>> tableStructMap = new HashMap<>();
            String mapKey1 = lowToBig(underlineToHump(entry1.getKey()));
            Map<String, List<String>> mapValue1 = entry1.getValue();

            for (Map.Entry<String, List<String>> entry2 : mapValue1.entrySet()) {
                String mapKey2 = bigToLow(underlineToHump(entry2.getKey()));
                List<String> mapValue2 = entry2.getValue();
                List<String> table = new ArrayList<String>();

                for (int i = 0; i < mapValue2.size(); i++) {
                    if (i == 1) {
                        continue;
                    }
                    if (i == 0) {
                        table.add(typeTransformation(sqlName, mapValue2.get(i)));
                    } else if (i == 2) {
                        table.add(mapValue2.get(i));
                    } else {
                        table.add(mapValue2.get(i));
                    }
                }
                tableStructMap.put(mapKey2, table);
            }
            resMap.put(DataHandle.underlineToBigHump(mapKey1), tableStructMap);
        }
        return resMap;

    }


    /**
     * Mysql数据类型转java数据类型
     *
     * @param sqlName     数据库名
     * @param sqlTypeName sql数据类型
     * @return java数据类型
     */
    public static String typeTransformation(String sqlName, String sqlTypeName) {
        if (sqlName.equals("mysql")) {
            return DbDataType.MySQL.convert(sqlTypeName);
        } else if (sqlName.equals("postgresql")) {
            return DbDataType.Postgresql.convert(sqlTypeName);
        } else return null;
    }


    /**
     * 首字母大写转小写
     *
     * @param st 大驼峰字符串
     * @return 小驼峰字符串
     */
    public static String bigToLow(String st) {
        if (StringUtils.isNoneEmpty(st)) {

            char[] stArr = st.toCharArray();
            if ((stArr[0] >= 65) && (stArr[0] <= 90)) {
                stArr[0] += 32;
            }
            return String.valueOf(stArr);
        }
        return null;
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
     * 下划线风格转驼峰  首字母不做大小写转化处理
     *
     * @param name 转换前的下划线方式命名的字符串
     * @return 转换后的驼峰式命名的字符串
     */
    public static String underlineToHump(String name) {
        StringBuilder result = new StringBuilder();
        // 快速检查
        if (name == null || name.isEmpty()) {
            // 没必要转换
            return "";
        } else if (!name.contains("_")) {
            // 不含下划线，仅将首字母小写
            return name;
        }
        // 用下划线将原始字符串分割
        String[] camels = name.split("_");
        for (String camel : camels) {
            // 跳过原始字符串中开头、结尾的下换线或双重下划线
            if (camel.isEmpty()) {
                continue;
            }
            // 处理真正的驼峰片段
            if (result.length() == 0) {
                // 第一个驼峰片段，全部字母都小写
                result.append(camel);
            } else {
                // 其他的驼峰片段，首字母大写
                result.append(camel.substring(0, 1).toUpperCase());
                result.append(camel.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }


    /**
     * 驼峰转下划线 全小写
     *
     * @param name 目标字符串
     * @return: tring
     */
    public static String underscoreName(String name) {
        StringBuilder result = new StringBuilder();
        if (name != null && name.length() > 0) {
            // 将第一个字符处理成大写
            result.append(name.substring(0, 1).toLowerCase());
            // 循环处理其余字符
            for (int i = 1; i < name.length(); i++) {
                String s = name.substring(i, i + 1);
                // 在大写字母前添加下划线
                if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
                    result.append("_");
                }
                // 其他字符直接转成大写
                result.append(s.toLowerCase());
            }
        }
        return result.toString();
    }


    /**
     * 下划线风格转小驼峰
     *
     * @param st
     * @return
     */
    public static String underlineToSmallHump(String st) {
        if (StringUtils.isNoneEmpty(st)) {
            return bigToLow(underlineToHump(st));

        }
        return null;
    }

    /**
     * 下划线风格转大驼峰
     *
     * @param st
     * @return
     */
    public static String underlineToBigHump(String st) {
        return lowToBig(underlineToHump(st));
    }


    /**
     * 将传入的字符串按顺序把"点" ---> "斜线"
     *
     * @param st 不定长参数
     * @return string
     */
    public static String pointToSlash(String st) {
        return st.replaceAll("\\.", "/");
    }

    /**
     * 将传入的字符串按顺序把"反斜线"  --->  "点"
     *
     * @param st 不定长参数
     * @return string
     */
    public static String slashToPort(String st) {
        return st.replaceAll("/", ".");
    }


}