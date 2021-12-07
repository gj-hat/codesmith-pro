package ${package}.web.service;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的业务层接口
 * @modified By：
 * @version: 1.0
 */
public interface ${TableName}Service {
    public List<${TableName}> list() ;
    public void save() ;
    public void update(${TableName} ${DataHandle.bigToLow(${TableName})});
    public void del(int[] ids);
}
