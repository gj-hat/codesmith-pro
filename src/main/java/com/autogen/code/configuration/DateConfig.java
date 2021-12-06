package com.autogen.code.configuration;

import ch.qos.logback.core.util.CachingDateFormatter;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 19:11
 * @description： 数据库表createTime自动填充日期
 * @modified By：
 * @version: 1.0
 */

@Component
public class DateConfig implements MetaObjectHandler {

    /**
     * 自动注入时间
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        //设置属性值
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.setFieldValByName("createTime",dateFormat.format(new Date()),metaObject);
    }


    @Override
    public void updateFill(MetaObject metaObject) {
    }




}
