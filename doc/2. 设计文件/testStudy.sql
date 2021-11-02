--
-- PostgreSQL database dump
--

-- Dumped from database version 14.0
-- Dumped by pg_dump version 14.0

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: TemplateManage; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."TemplateManage" (
    "className" character(255),
    "packageName" character(255),
    "tableName" character(255),
    "templateContent" character(255),
    "templateId" integer NOT NULL,
    "delMark" boolean,
    "createTime" character(255)
);


ALTER TABLE public."TemplateManage" OWNER TO postgres;

--
-- Name: TemplateManage_templateId_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."TemplateManage_templateId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."TemplateManage_templateId_seq" OWNER TO postgres;

--
-- Name: TemplateManage_templateId_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."TemplateManage_templateId_seq" OWNED BY public."TemplateManage"."templateId";


--
-- Name: templateDiy; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."templateDiy" (
    "templateId" integer NOT NULL,
    "templateType" character(255),
    "templateContent" text,
    "packageName" character(255),
    path character(255),
    "extensionName" character(255),
    "prefixDefault" character(255),
    "createTime" character(255),
    author character(255),
    "templateName" character(255)
);


ALTER TABLE public."templateDiy" OWNER TO postgres;

--
-- Name: templateDiy_templateId_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."templateDiy_templateId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."templateDiy_templateId_seq" OWNER TO postgres;

--
-- Name: templateDiy_templateId_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."templateDiy_templateId_seq" OWNED BY public."templateDiy"."templateId";


--
-- Name: TemplateManage templateId; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."TemplateManage" ALTER COLUMN "templateId" SET DEFAULT nextval('public."TemplateManage_templateId_seq"'::regclass);


--
-- Name: templateDiy templateId; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."templateDiy" ALTER COLUMN "templateId" SET DEFAULT nextval('public."templateDiy_templateId_seq"'::regclass);


--
-- Data for Name: TemplateManage; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."TemplateManage" ("className", "packageName", "tableName", "templateContent", "templateId", "delMark", "createTime") VALUES ('class1                                                                                                                                                                                                                                                         ', 'package_name1                                                                                                                                                                                                                                                  ', 'table1                                                                                                                                                                                                                                                         ', 'temp_content1                                                                                                                                                                                                                                                  ', 1, false, '2021/10/27                                                                                                                                                                                                                                                     ');
INSERT INTO public."TemplateManage" ("className", "packageName", "tableName", "templateContent", "templateId", "delMark", "createTime") VALUES ('class3                                                                                                                                                                                                                                                         ', 'pack3                                                                                                                                                                                                                                                          ', 'table3                                                                                                                                                                                                                                                         ', 'temp3                                                                                                                                                                                                                                                          ', 3, false, '2021/10/14                                                                                                                                                                                                                                                     ');
INSERT INTO public."TemplateManage" ("className", "packageName", "tableName", "templateContent", "templateId", "delMark", "createTime") VALUES ('class3                                                                                                                                                                                                                                                         ', 'pack3                                                                                                                                                                                                                                                          ', 'table3                                                                                                                                                                                                                                                         ', 'temp3                                                                                                                                                                                                                                                          ', 4, true, '2021/10/14                                                                                                                                                                                                                                                     ');
INSERT INTO public."TemplateManage" ("className", "packageName", "tableName", "templateContent", "templateId", "delMark", "createTime") VALUES ('class3                                                                                                                                                                                                                                                         ', 'pack3                                                                                                                                                                                                                                                          ', 'table3                                                                                                                                                                                                                                                         ', 'temp3                                                                                                                                                                                                                                                          ', 5, false, '2021/10/14                                                                                                                                                                                                                                                     ');
INSERT INTO public."TemplateManage" ("className", "packageName", "tableName", "templateContent", "templateId", "delMark", "createTime") VALUES ('class4                                                                                                                                                                                                                                                         ', 'pack4                                                                                                                                                                                                                                                          ', 'table4                                                                                                                                                                                                                                                         ', 'temp4                                                                                                                                                                                                                                                          ', 2, true, '2021/10/14                                                                                                                                                                                                                                                     ');


--
-- Data for Name: templateDiy; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."templateDiy" ("templateId", "templateType", "templateContent", "packageName", path, "extensionName", "prefixDefault", "createTime", author, "templateName") VALUES (1, 'type1                                                                                                                                                                                                                                                          ', 'content1', 'pack1                                                                                                                                                                                                                                                          ', 'path1                                                                                                                                                                                                                                                          ', 'extension1                                                                                                                                                                                                                                                     ', 'pre1                                                                                                                                                                                                                                                           ', '2010\1\1                                                                                                                                                                                                                                                       ', 'ma                                                                                                                                                                                                                                                             ', NULL);


--
-- Name: TemplateManage_templateId_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."TemplateManage_templateId_seq"', 1, false);


--
-- Name: templateDiy_templateId_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."templateDiy_templateId_seq"', 1, true);


--
-- Name: TemplateManage Template_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."TemplateManage"
    ADD CONSTRAINT "Template_pkey" PRIMARY KEY ("templateId");


--
-- Name: templateDiy templatediy_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."templateDiy"
    ADD CONSTRAINT templatediy_pk PRIMARY KEY ("templateId");


--
-- PostgreSQL database dump complete
--

