package com.autogen.code.web.domain.vo;

import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 23:56
 * @description：分页实体类 TemplateManage
 * @modified By：
 * @version: 1.0
 */

@TableName("\"Dependencies\"")
public class DependenciesVo {


    private Integer current;
    private Integer size;
    private Long total;

    private List<DependenciesDomain> dependenciesDomains;

    public DependenciesVo(){}

    public DependenciesVo(Integer current, Integer size, Long total, List<DependenciesDomain> dependenciesDomains) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.dependenciesDomains = dependenciesDomains;
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

    public List<DependenciesDomain> getDependenciesDomainList() {
        return dependenciesDomains;
    }

    public void setDependenciesDomains(List<DependenciesDomain> dependenciesDomains) {
        this.dependenciesDomains = dependenciesDomains;
    }
}
