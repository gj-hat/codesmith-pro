package ${package}.controller;
import ${package}.web.domain.${TableName};
import ${package}.web.service.${TableName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/17 17:45
 * @description： 表现层
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/${DataHandle.bigToLow(${TableName})}")
public class ${TableName}Controller {
    @Autowired
    private ${TableName}Service ${DataHandle.bigToLow(${TableName})}Service;

    @RequestMapping("/list")
    public List<${TableName}> list() {
        return ${DataHandle.bigToLow(${TableName})}.list();
    }
    @RequestMapping("/save")
    public void save(@RequestBody ${TableName} ${DataHandle.bigToLow(${TableName})}) {
            ${DataHandle.bigToLow(${TableName})}Service.save();
    }
    @RequestMapping("/update")
    public void update(@RequestBody ${TableName} ${DataHandle.bigToLow(${TableName})}) {
            ${DataHandle.bigToLow(${TableName})}Service.update(${DataHandle.bigToLow(${TableName})});
    }
    @RequestMapping("/del")
    public void del(@RequestBody int[] ids) {
            ${DataHandle.bigToLow(${TableName})}Service.del(ids);
    }
}
