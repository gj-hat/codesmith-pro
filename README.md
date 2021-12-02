# codesmithPro

## 介绍

这是一个模板自动生成器


## 使用说明







## 软件技术栈

1. springBoot
2. Maven
3. mybatis-Plus
4. spring
5. postgresSql
6. junit 5


## 数据表

### 模板管理表:TemplateManage

模板管理相关字段：模板 ID，表名、模板内容、类名、包名、删除标识、创建时间。

| 中文注释 | 字段名          | 字段类型  | 约束           |
| -------- | --------------- | --------- | -------------- |
| 模板 ID  | templateId      | integer   | 非空,主键,自增 |
| 表名     | tableName       | char(255) |                |
| 模板内容 | templateContent | char(255) |                |
| 类名     | className       | char(255) |                |
| 包名     | packageName     | char(255) |                |
| 删除标识 | delMark         | boolean   |                |
| 创建时间 | createTime      | char(255) |                |

### 模板表: TemplateDiy

相关字段: 模板名 模板类型(java html sql)  模板内容(大文本)  包 路径   文件扩展名 默认前缀  创建时间  创建人

| 中文注释                | 字段名          | 字段类型  | 约束           |
| ----------------------- | --------------- | --------- | -------------- |
| 模板 ID                 | templateId      | integer   | 非空,主键,自增 |
| 模板名                  | templateName    | char(255) |                |
| 模板类型(java html sql) | templateType    | char(255) |                |
| 模板内容(大文本)        | templateContent | text      |                |
| 包                      | packageName     | char(255) |                |
| 路径                    | path            | char(255) |                |
| 文件扩展名              | extensionName   | char(255) |                |
| 默认前缀                | prefixDefault   | char(255) |                |
| 创建时间                | createTime      | char(255) |                |
| 创建人                  | author          | char(255) |                |



## todo

1. 通用: controller   
2. 通用: mapper.xml
3. 通用: application.xml
4. mybatis风格  service mapper domain
5. mybatis-plus风格  service mapper domain
6. pox.xml  不需要重写 只添加 mybatis-plus等springBoot官网没有的数据



