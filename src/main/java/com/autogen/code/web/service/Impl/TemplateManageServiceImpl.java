package com.autogen.code.web.service.Impl;

import com.autogen.code.Constants;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.ManageDiyUnionQueryVO;
import com.autogen.code.web.domain.vo.TemplateManageVo;
import com.autogen.code.web.mapper.TemplateManageMapper;
import com.autogen.code.web.service.TemplateManageService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author     ：JiaGuo
 * @date       ：Created in 2021/11/13 18:00
 * @description：service实现类 templateManageService
 * @modified By：
 * @version:     1.0
 */
@Service
public class TemplateManageServiceImpl  extends ServiceImpl<TemplateManageMapper, TemplateManageDomain> implements TemplateManageService {





    @Autowired
    TemplateManageMapper templateManageMapper;
    @Override
    public TemplateManageVo findAllPaging(int pageNum) {
        TemplateManageVo templateVo = new TemplateManageVo();
        IPage<TemplateManageDomain> page = new Page<>(pageNum, Constants.RECORD);
        templateManageMapper.selectPage(page, null);
        templateVo.setCurrent(pageNum);
        templateVo.setSize(2);
        templateVo.setTotal(page.getTotal());
        templateVo.setTemplateManageDomainList(page.getRecords());
        return templateVo;
    }

    @Override
    public List<ManageDiyUnionQueryVO> manageDiyUnionQueryById(int id) {
        return templateManageMapper.manageDiyUnionQueryById(id);
    }

    @Override
    public List<ManageDiyUnionQueryVO> manageDiyUnionQueryByName(String name) {
        return templateManageMapper.manageDiyUnionQueryByName(name);
    }




    @Override
    public TemplateManageVo findNotAllPaging(int pageNum) {
        TemplateManageVo templateVo = new TemplateManageVo();
        IPage<TemplateManageDomain> page = new Page<>(pageNum, Constants.RECORD);
        QueryWrapper<TemplateManageDomain> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("del_mark", false);
        templateManageMapper.selectPage(page, queryWrapper);
        templateVo.setCurrent(pageNum);
        templateVo.setSize(2);
        templateVo.setTotal(page.getTotal());
        templateVo.setTemplateManageDomainList(page.getRecords());
        return templateVo;
    }
}
