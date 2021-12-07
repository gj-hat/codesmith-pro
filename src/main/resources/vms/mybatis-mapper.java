package ${package}.web.mapper;
import ${package}.web.domain.*;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的持久层
 * @modified By：
 * @version: 1.0
 */
@Repository
public interface ${TableName}Mapper {
    List<${TableName}> list();
    void save();
    void update(${TableName} ${DataHandle.bigToLow(${TableName})});
    void del(int[] ids);
}
