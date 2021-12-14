package ${package}.web.domain;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的实体类
 * @modified By：
 * @version: 1.0
 */
@Data
@TableName("\" ${DataHandle.underscoreName(${TableName})}\"")
public class ${TableName}Domain {
 #foreach($item in ${tableAttribute.entrySet()})
     #if(${item.value.get(2)} == "isPriKey")
     @TableId(type = IdType.AUTO)
     #end
     private ${item.value.get(0)}  ${DataHandle.bigToLow(${item.key})};
 #end
}
