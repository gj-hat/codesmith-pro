--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
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

--
-- Name: autogencode; Type: SCHEMA; Schema: -; Owner: gencode_dev
--

CREATE SCHEMA autogencode;


ALTER SCHEMA autogencode OWNER TO gencode_dev;

--
-- Name: templatediyup; Type: SEQUENCE; Schema: public; Owner: gencode_dev
--

CREATE SEQUENCE public.templatediyup
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.templatediyup OWNER TO gencode_dev;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: TemplateDiy; Type: TABLE; Schema: public; Owner: gencode_dev
--

CREATE TABLE public."TemplateDiy" (
    "templateId" integer DEFAULT nextval('public.templatediyup'::regclass) NOT NULL,
    "templateName" character(255),
    "templateType" character(255),
    "templateContent" text,
    "packageName" character(255),
    path character(255),
    "extensionName" integer,
    "prefixDefault" character(255),
    "createTime" character(255),
    author character(255)
);


ALTER TABLE public."TemplateDiy" OWNER TO gencode_dev;

--
-- Name: TemplateDiy_templateId_seq; Type: SEQUENCE; Schema: public; Owner: gencode_dev
--

CREATE SEQUENCE public."TemplateDiy_templateId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."TemplateDiy_templateId_seq" OWNER TO gencode_dev;

--
-- Name: TemplateDiy_templateId_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: gencode_dev
--

ALTER SEQUENCE public."TemplateDiy_templateId_seq" OWNED BY public."TemplateDiy"."templateId";


--
-- Name: templatemanageup; Type: SEQUENCE; Schema: public; Owner: gencode_dev
--

CREATE SEQUENCE public.templatemanageup
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.templatemanageup OWNER TO gencode_dev;

--
-- Name: TemplateManage; Type: TABLE; Schema: public; Owner: gencode_dev
--

CREATE TABLE public."TemplateManage" (
    "className" character(255),
    "packageName" character(255),
    "tableName" character(255),
    "templateContent" character(255),
    "templateId" integer DEFAULT nextval('public.templatemanageup'::regclass) NOT NULL,
    "delMark" boolean,
    "createTime" character(255)
);


ALTER TABLE public."TemplateManage" OWNER TO gencode_dev;

--
-- Name: TemplateManage_templateId_seq; Type: SEQUENCE; Schema: public; Owner: gencode_dev
--

CREATE SEQUENCE public."TemplateManage_templateId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."TemplateManage_templateId_seq" OWNER TO gencode_dev;

--
-- Name: TemplateManage_templateId_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: gencode_dev
--

ALTER SEQUENCE public."TemplateManage_templateId_seq" OWNED BY public."TemplateManage"."templateId";


--
-- Data for Name: TemplateDiy; Type: TABLE DATA; Schema: public; Owner: gencode_dev
--

COPY public."TemplateDiy" ("templateId", "templateName", "templateType", "templateContent", "packageName", path, "extensionName", "prefixDefault", "createTime", author) FROM stdin;
\.


--
-- Data for Name: TemplateManage; Type: TABLE DATA; Schema: public; Owner: gencode_dev
--

COPY public."TemplateManage" ("className", "packageName", "tableName", "templateContent", "templateId", "delMark", "createTime") FROM stdin;
1                                                                                                                                                                                                                                                              	1                                                                                                                                                                                                                                                              	1                                                                                                                                                                                                                                                              	1                                                                                                                                                                                                                                                              	1	f	1                                                                                                                                                                                                                                                              
2                                                                                                                                                                                                                                                              	2                                                                                                                                                                                                                                                              	2                                                                                                                                                                                                                                                              	2                                                                                                                                                                                                                                                              	2	f	2                                                                                                                                                                                                                                                              
22                                                                                                                                                                                                                                                             	22                                                                                                                                                                                                                                                             	22                                                                                                                                                                                                                                                             	22                                                                                                                                                                                                                                                             	3	f	22                                                                                                                                                                                                                                                             
22                                                                                                                                                                                                                                                             	22                                                                                                                                                                                                                                                             	22                                                                                                                                                                                                                                                             	22                                                                                                                                                                                                                                                             	4	f	22                                                                                                                                                                                                                                                             
#{className11}                                                                                                                                                                                                                                                 	#{packageName11}                                                                                                                                                                                                                                               	#{tableName11}                                                                                                                                                                                                                                                 	#{templateContent11}                                                                                                                                                                                                                                           	5	f	#{createTime11}                                                                                                                                                                                                                                                
class3                                                                                                                                                                                                                                                         	pack3                                                                                                                                                                                                                                                          	table3                                                                                                                                                                                                                                                         	temp3                                                                                                                                                                                                                                                          	6	f	03-11-2021 10:28:26                                                                                                                                                                                                                                            
\.


--
-- Name: TemplateDiy_templateId_seq; Type: SEQUENCE SET; Schema: public; Owner: gencode_dev
--

SELECT pg_catalog.setval('public."TemplateDiy_templateId_seq"', 1, false);


--
-- Name: TemplateManage_templateId_seq; Type: SEQUENCE SET; Schema: public; Owner: gencode_dev
--

SELECT pg_catalog.setval('public."TemplateManage_templateId_seq"', 1, false);


--
-- Name: templatediyup; Type: SEQUENCE SET; Schema: public; Owner: gencode_dev
--

SELECT pg_catalog.setval('public.templatediyup', 1, false);


--
-- Name: templatemanageup; Type: SEQUENCE SET; Schema: public; Owner: gencode_dev
--

SELECT pg_catalog.setval('public.templatemanageup', 6, true);


--
-- Name: TemplateDiy TemplateDiy_pkey; Type: CONSTRAINT; Schema: public; Owner: gencode_dev
--

ALTER TABLE ONLY public."TemplateDiy"
    ADD CONSTRAINT "TemplateDiy_pkey" PRIMARY KEY ("templateId");


--
-- Name: TemplateManage TemplateManage_pkey; Type: CONSTRAINT; Schema: public; Owner: gencode_dev
--

ALTER TABLE ONLY public."TemplateManage"
    ADD CONSTRAINT "TemplateManage_pkey" PRIMARY KEY ("templateId");


--
-- Name: templatediy_templateid_uindex; Type: INDEX; Schema: public; Owner: gencode_dev
--

CREATE UNIQUE INDEX templatediy_templateid_uindex ON public."TemplateDiy" USING btree ("templateId");


--
-- Name: SCHEMA autogencode; Type: ACL; Schema: -; Owner: gencode_dev
--

GRANT USAGE ON SCHEMA autogencode TO test;


--
-- Name: DEFAULT PRIVILEGES FOR TABLES; Type: DEFAULT ACL; Schema: autogencode; Owner: postgres
--

ALTER DEFAULT PRIVILEGES FOR ROLE postgres IN SCHEMA autogencode REVOKE ALL ON TABLES  FROM postgres;
ALTER DEFAULT PRIVILEGES FOR ROLE postgres IN SCHEMA autogencode GRANT SELECT ON TABLES  TO gencode_dev;
ALTER DEFAULT PRIVILEGES FOR ROLE postgres IN SCHEMA autogencode GRANT SELECT ON TABLES  TO test;


--
-- PostgreSQL database dump complete
--

