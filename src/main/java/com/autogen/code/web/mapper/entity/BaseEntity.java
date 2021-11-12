package com.autogen.code.web.mapper.entity;

import java.util.Date;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 17:32
 */
public class BaseEntity {


    private Date createtime;
    private String createby;

    private Date updatetime;

    private String updateby;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }
}
