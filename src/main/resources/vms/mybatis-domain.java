package ${package}.web.domain;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的实体类
 * @modified By：
 * @version: 1.0
 */
@Data
public class ${TableName}Domain {
 #foreach($item in ${tableAttribute.entrySet()})
     private ${item.value.get(0)}  ${DataHandle.bigToLow(${item.key})};
 #end
}
