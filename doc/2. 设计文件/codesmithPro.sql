/*
 Navicat Premium Data Transfer

 Source Server         : lalala
 Source Server Type    : PostgreSQL
 Source Server Version : 130001
 Source Host           : 10.254.130.27:5433
 Source Catalog        : postgres
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 130001
 File Encoding         : 65001

 Date: 09/11/2021 14:46:19
*/


-- ----------------------------
-- Sequence structure for TemplateDiy_templateId_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."TemplateDiy_templateId_seq";
CREATE SEQUENCE "public"."TemplateDiy_templateId_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for TemplateManage_templateId_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."TemplateManage_templateId_seq";
CREATE SEQUENCE "public"."TemplateManage_templateId_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for templatediyup
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."templatediyup";
CREATE SEQUENCE "public"."templatediyup" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for templatemanageup
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."templatemanageup";
CREATE SEQUENCE "public"."templatemanageup" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Table structure for TemplateDiy
-- ----------------------------
DROP TABLE IF EXISTS "public"."TemplateDiy";
CREATE TABLE "public"."TemplateDiy" (
  "templateId" int4 NOT NULL DEFAULT nextval('templatediyup'::regclass),
  "templateName" char(255) COLLATE "pg_catalog"."default",
  "templateType" char(255) COLLATE "pg_catalog"."default",
  "templateContent" text COLLATE "pg_catalog"."default",
  "packageName" char(255) COLLATE "pg_catalog"."default",
  "path" char(255) COLLATE "pg_catalog"."default",
  "extensionName" int4,
  "prefixDefault" char(255) COLLATE "pg_catalog"."default",
  "createTime" char(255) COLLATE "pg_catalog"."default",
  "author" char(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of TemplateDiy
-- ----------------------------

-- ----------------------------
-- Table structure for TemplateManage
-- ----------------------------
DROP TABLE IF EXISTS "public"."TemplateManage";
CREATE TABLE "public"."TemplateManage" (
  "className" char(255) COLLATE "pg_catalog"."default",
  "packageName" char(255) COLLATE "pg_catalog"."default",
  "tableName" char(255) COLLATE "pg_catalog"."default",
  "templateContent" char(255) COLLATE "pg_catalog"."default",
  "templateId" int4 NOT NULL DEFAULT nextval('templatemanageup'::regclass),
  "delMark" bool,
  "createTime" char(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of TemplateManage
-- ----------------------------
INSERT INTO "public"."TemplateManage" VALUES ('1                                                                                                                                                                                                                                                              ', '1                                                                                                                                                                                                                                                              ', '1                                                                                                                                                                                                                                                              ', '1                                                                                                                                                                                                                                                              ', 1, 'f', '1                                                                                                                                                                                                                                                              ');
INSERT INTO "public"."TemplateManage" VALUES ('2                                                                                                                                                                                                                                                              ', '2                                                                                                                                                                                                                                                              ', '2                                                                                                                                                                                                                                                              ', '2                                                                                                                                                                                                                                                              ', 2, 'f', '2                                                                                                                                                                                                                                                              ');
INSERT INTO "public"."TemplateManage" VALUES ('22                                                                                                                                                                                                                                                             ', '22                                                                                                                                                                                                                                                             ', '22                                                                                                                                                                                                                                                             ', '22                                                                                                                                                                                                                                                             ', 3, 'f', '22                                                                                                                                                                                                                                                             ');
INSERT INTO "public"."TemplateManage" VALUES ('22                                                                                                                                                                                                                                                             ', '22                                                                                                                                                                                                                                                             ', '22                                                                                                                                                                                                                                                             ', '22                                                                                                                                                                                                                                                             ', 4, 'f', '22                                                                                                                                                                                                                                                             ');
INSERT INTO "public"."TemplateManage" VALUES ('#{className11}                                                                                                                                                                                                                                                 ', '#{packageName11}                                                                                                                                                                                                                                               ', '#{tableName11}                                                                                                                                                                                                                                                 ', '#{templateContent11}                                                                                                                                                                                                                                           ', 5, 'f', '#{createTime11}                                                                                                                                                                                                                                                ');
INSERT INTO "public"."TemplateManage" VALUES ('class3                                                                                                                                                                                                                                                         ', 'pack3                                                                                                                                                                                                                                                          ', 'table3                                                                                                                                                                                                                                                         ', 'temp3                                                                                                                                                                                                                                                          ', 6, 'f', '03-11-2021 10:28:26                                                                                                                                                                                                                                            ');

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."TemplateDiy_templateId_seq"
OWNED BY "public"."TemplateDiy"."templateId";
SELECT setval('"public"."TemplateDiy_templateId_seq"', 2, false);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."TemplateManage_templateId_seq"
OWNED BY "public"."TemplateManage"."templateId";
SELECT setval('"public"."TemplateManage_templateId_seq"', 2, false);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"public"."templatediyup"', 2, false);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"public"."templatemanageup"', 7, true);

-- ----------------------------
-- Indexes structure for table TemplateDiy
-- ----------------------------
CREATE UNIQUE INDEX "templatediy_templateid_uindex" ON "public"."TemplateDiy" USING btree (
  "templateId" "pg_catalog"."int4_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table TemplateDiy
-- ----------------------------
ALTER TABLE "public"."TemplateDiy" ADD CONSTRAINT "TemplateDiy_pkey" PRIMARY KEY ("templateId");

-- ----------------------------
-- Primary Key structure for table TemplateManage
-- ----------------------------
ALTER TABLE "public"."TemplateManage" ADD CONSTRAINT "TemplateManage_pkey" PRIMARY KEY ("templateId");
