package ${package}.web.service.impl;


import ${package}.web.domain.*;
import ${package}.web.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的业务层实现
 * @modified By：
 * @version: 1.0
 */
@Service
public class ${TableName}ServiceImpl implements ${TableName}Service {
    @Autowired
    private ${TableName}Mapper ${DataHandle.bigToLow(${TableName})}Mapper;
    public List<${TableName}> list() {
        return ${DataHandle.bigToLow(${TableName})}Mapper.list();
    }
    public void save() {
        ${DataHandle.bigToLow(${TableName})}Mapper.save()};
    }
    public void update(${TableName} ${DataHandle.bigToLow(${TableName})}) {
        ${DataHandle.bigToLow(${TableName})}Mapper.update(${DataHandle.bigToLow(${TableName})})};
    }
    public void del(int[] ids) {
        ${DataHandle.bigToLow(${TableName})}Mapper.del(ids)};
    }
}
