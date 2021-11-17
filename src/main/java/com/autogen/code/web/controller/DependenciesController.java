package com.autogen.code.web.controller;


import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.vo.DependenciesVo;
import com.autogen.code.web.service.Impl.DependenciesServiceImpl;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dependencies")
public class DependenciesController {

    @Autowired
    private DependenciesServiceImpl dependenciesService;

    /**
     * 分页查找
     *
     * @param pageNum    页数
     * @return
     */
//    @RequestMapping("/findAll")
//    public DependenciesVo findAll(@RequestBody ReqPageParam<SpDependencyEntity> reqPageParam) {
//        return dependenciesService.findByPaging(reqPageParam);
//    }

    @RequestMapping("/findAll")
    public DependenciesVo findAll(int pageNum) {
        return dependenciesService.findByPaging(pageNum);
    }



    @RequestMapping("/del")
    public void del(int delId) {
        dependenciesService.removeById(delId);
    }


    @RequestMapping("/insert")
    public void insert(DependenciesDomain dependenciesDomain) {
        dependenciesService.save(dependenciesDomain);
    }

    @RequestMapping("/update")
    public void update(DependenciesDomain dependenciesDomain) {
        UpdateWrapper<DependenciesDomain> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", dependenciesDomain.getId());
        dependenciesService.update(dependenciesDomain, updateWrapper);
    }


}
