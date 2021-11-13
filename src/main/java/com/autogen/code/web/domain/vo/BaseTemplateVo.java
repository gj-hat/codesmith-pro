package com.autogen.code.web.domain.vo;

import com.autogen.code.web.domain.TemplateManageDomain;

import java.util.List;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 17:42
 */
public class BaseTemplateVo {

    private Integer current;
    private Integer size;
    private Long total;


    public BaseTemplateVo() {
    }

    public BaseTemplateVo(Integer current, Integer size, Long total, List<TemplateManageDomain> templateManageDomainList) {
        this.current = current;
        this.size = size;
        this.total = total;

    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }


}
