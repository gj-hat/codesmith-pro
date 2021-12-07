package ${package}.web.service.Impl;
import ${package}.web.domain.${TableName}Domain;
import ${package}.web.mapper.${TableName}Mapper;
import ${package}.web.service.${TableName}Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的业务层实现
 * @modified By：
 * @version: 1.0
 */
@Service
public class ${TableName}ServiceImpl extends ServiceImpl<${TableName}Mapper, ${TableName}Domain> implements ${TableName}Service {
}
