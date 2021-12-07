package ${package}.web.mapper;
import ${package}.web.domain.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的持久层
 * @modified By：
 * @version: 1.0
 */
@Mapper
public interface ${TableName}Mapper extends BaseMapper<${TableName}Domain> {
}
