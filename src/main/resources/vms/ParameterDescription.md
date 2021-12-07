###参数说明:


1. AnalysisSQL.analysisSqlStruct(datasources)  返回数据库原始表结构
2. DataHandle.sqlStructToJavaStruct(1的返回值)   处理后的java结构



1. Controller.java.vm
+  TableName       格式: String    表名  格式:大驼峰
+  package         格式: String    表示:包名  com.XXX.XXX

2. mybatis-domain.java.vm
+ tableAttribute  格式: map类型   java风格表结构
+ TableName       格式: String    表名  格式:大驼峰
+ package     格式: String    表示:包名

3. mybatis-Mapper.java.vm
+ TableName       格式: String    表示:表名  大驼峰
+ package         格式: String    表示:包名  com.XXX.XXX


4. mybatis-Mapper.xml.vm
+ TableName       格式: String    表名  格式:大驼峰
+ package     格式: String    表示:包名
+ underLineTableAttribute   sql风格表结构
+ underLineTableName      下划线风格表名
+ underLinePriKey   下划线风格主键


5. mybatis-service.java.vm
+ TableName       格式: String    表名  格式:大驼峰
+ package         格式: String    表示:包名  com.XXX.XXX

6. mybatis-ServiceImpl.java.vm
+ TableName       格式: String    表名  格式:大驼峰
+ package         格式: String    表示:包名  com.XXX.XXX



7. mybatisPlus-domain.java.vm
+ TableName       格式: String    表名  格式:大驼峰
+ package         格式: String    表示:包名  com.XXX.XXX
+ tableAttribute  格式: map类型   java风格表结构


8. mybatisPlus-Mapper.java.vm
+ TableName       格式: String    表名  格式:大驼峰
+ package         格式: String    表示:包名  com.XXX.XXX


9. mybatisPlus-Mapper.xml.vm
+ package         格式: String    表示:包名  com.XXX.XXX


10. mybatisPlus-Service.java.vm
+ TableName       格式: String    表名  格式:大驼峰
+ package         格式: String    表示:包名  com.XXX.XXX


11. mybatisPlus-ServiceImpl.java.vm
+ TableName       格式: String    表名  格式:大驼峰
+ package         格式: String    表示:包名  com.XXX.XXX















