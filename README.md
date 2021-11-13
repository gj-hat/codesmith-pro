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

2021年11月19日 前完成
1. 对接 SpringBoot 官方，定期获取 依赖及相关信息；为生成项目提供支撑；
2. SpringBoot项目依赖信息管理、全局参数配置功能、模板管理、数据源管理、项目管理 增删改查；
3. 生成项目(项目 ——> 数据源 、模板) 接口、生成代码接口；




