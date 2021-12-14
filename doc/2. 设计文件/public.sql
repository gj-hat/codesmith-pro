/*
 Navicat Premium Data Transfer

 Source Server         : localPgSQL
 Source Server Type    : PostgreSQL
 Source Server Version : 140000
 Source Host           : localhost:5432
 Source Catalog        : postgres
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 140000
 File Encoding         : 65001

 Date: 14/12/2021 08:43:00
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
ALTER SEQUENCE "public"."TemplateDiy_templateId_seq" OWNER TO "postgres";

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
ALTER SEQUENCE "public"."TemplateManage_templateId_seq" OWNER TO "postgres";

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
ALTER SEQUENCE "public"."templatediyup" OWNER TO "postgres";

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
ALTER SEQUENCE "public"."templatemanageup" OWNER TO "postgres";

-- ----------------------------
-- Table structure for dependencies
-- ----------------------------
DROP TABLE IF EXISTS "public"."dependencies";
CREATE TABLE "public"."dependencies" (
  "id" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "description" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "group_name" varchar(255) COLLATE "pg_catalog"."default",
  "version_range" varchar(255) COLLATE "pg_catalog"."default",
  "reference" varchar(255) COLLATE "pg_catalog"."default",
  "source_type" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."dependencies" OWNER TO "postgres";
COMMENT ON COLUMN "public"."dependencies"."source_type" IS '自定义的还是官方的依赖';

-- ----------------------------
-- Records of dependencies
-- ----------------------------
BEGIN;
INSERT INTO "public"."dependencies" VALUES ('codecentric-spring-boot-admin-client', 'Required for your application to register with a Codecentric''s Spring Boot Admin Server instance.', 'Codecentric''s Spring Boot Admin (Client)', 'Ops', '[2.0.0.RELEASE,2.6.0.M1)', 'https://codecentric.github.io/spring-boot-admin/current/#getting-started', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter-zookeeper-config', 'Enable and configure common patterns inside your application and build large distributed systems with Apache Zookeeper based components. The provided patterns include Service Discovery and Configuration.', 'Apache Zookeeper Configuration', 'Spring Cloud Config', NULL, 'https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#distributed-configuration-usage', NULL);
INSERT INTO "public"."dependencies" VALUES ('mybatis-plus', 'MyBatis-Plus (opens new window)（MP for short）is an powerful enhanced tool for MyBatis (opens new window), Born To Simplify Development.', NULL, 'baomidou', NULL, 'https://mp.baomidou.com/', 'personal');
INSERT INTO "public"."dependencies" VALUES ('native', 'Incubating support for compiling Spring applications to native executables using the GraalVM native-image compiler.', 'Spring Native [Experimental]', 'Developer Tools', '[2.4.3.RELEASE,2.7.0.M1)', 'https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/', NULL);
INSERT INTO "public"."dependencies" VALUES ('configuration-processor', 'Generate metadata for developers to offer contextual help and "code completion" when working with custom configuration keys (ex.application.properties/.yml files).', 'Spring Configuration Processor', 'Developer Tools', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#configuration-metadata-annotation-processor', NULL);
INSERT INTO "public"."dependencies" VALUES ('h2', 'Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.', 'H2 Database', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('data-redis', 'Advanced and thread-safe Java Redis client for synchronous, asynchronous, and reactive usage. Supports Cluster, Sentinel, Pipelining, Auto-Reconnect, Codecs and much more.', 'Spring Data Redis (Access+Driver)', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-redis', NULL);
INSERT INTO "public"."dependencies" VALUES ('webflux', 'Build reactive web applications with Spring WebFlux and Netty.', 'Spring Reactive Web', 'Web', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('data-rest', 'Exposing Spring Data repositories over REST via Spring Data REST.', 'Rest Repositories', 'Web', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint', NULL);
INSERT INTO "public"."dependencies" VALUES ('session', 'Provides an API and implementations for managing user session information.', 'Spring Session', 'Web', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('data-rest-explorer', 'Browsing Spring Data REST repositories in your browser.', 'Rest Repositories HAL Explorer', 'Web', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('hateoas', 'Eases the creation of RESTful APIs that follow the HATEOAS principle when working with Spring / Spring MVC.', 'Spring HATEOAS', 'Web', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-spring-hateoas', NULL);
INSERT INTO "public"."dependencies" VALUES ('web-services', 'Facilitates contract-first SOAP development. Allows for the creation of flexible web services using one of the many ways to manipulate XML payloads.', 'Spring Web Services', 'Web', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-webservices', NULL);
INSERT INTO "public"."dependencies" VALUES ('jersey', 'Framework for developing RESTful Web Services in Java that provides support for JAX-RS APIs.', 'Jersey', 'Web', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jersey', NULL);
INSERT INTO "public"."dependencies" VALUES ('vaadin', 'A web framework that allows you to write UI in pure Java without getting bogged down in JS, HTML, and CSS.', 'Vaadin', 'Web', '[2.0.0.RELEASE,2.6.0.M1)', 'https://vaadin.com/spring', NULL);
INSERT INTO "public"."dependencies" VALUES ('thymeleaf', 'A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.', 'Thymeleaf', 'Template Engines', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-spring-mvc-template-engines', NULL);
INSERT INTO "public"."dependencies" VALUES ('freemarker', 'Java library to generate text output (HTML web pages, e-mails, configuration files, source code, etc.) based on templates and changing data.', 'Apache Freemarker', 'Template Engines', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-spring-mvc-template-engines', NULL);
INSERT INTO "public"."dependencies" VALUES ('mustache', 'Logic-less Templates. There are no if statements, else clauses, or for loops. Instead there are only tags.', 'Mustache', 'Template Engines', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-spring-mvc-template-engines', NULL);
INSERT INTO "public"."dependencies" VALUES ('groovy-templates', 'Groovy templating engine.', 'Groovy Templates', 'Template Engines', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-spring-mvc-template-engines', NULL);
INSERT INTO "public"."dependencies" VALUES ('security', 'Highly customizable authentication and access-control framework for Spring applications.', 'Spring Security', 'Security', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security', NULL);
INSERT INTO "public"."dependencies" VALUES ('oauth2-client', 'Spring Boot integration for Spring Security''s OAuth2/OpenID Connect client features.', 'OAuth2 Client', 'Security', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security-oauth2-client', NULL);
INSERT INTO "public"."dependencies" VALUES ('oauth2-resource-server', 'Spring Boot integration for Spring Security''s OAuth2 resource server features.', 'OAuth2 Resource Server', 'Security', '2.1.0.M2', 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security-oauth2-server', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-ldap', 'Makes it easier to build Spring based applications that use the Lightweight Directory Access Protocol.', 'Spring LDAP', 'Security', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-ldap', NULL);
INSERT INTO "public"."dependencies" VALUES ('okta', 'Okta specific configuration for Spring Security/Spring Boot OAuth2 features. Enable your Spring Boot application to work with Okta via OAuth 2.0/OIDC.', 'Okta', 'Security', '[2.1.2.RELEASE,2.6.0.M1)', 'https://github.com/okta/okta-spring-boot#readme', NULL);
INSERT INTO "public"."dependencies" VALUES ('jdbc', 'Database Connectivity API that defines how a client may connect and query a database.', 'JDBC API', 'SQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-sql', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-jpa', 'Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.', 'Spring Data JPA', 'SQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-jdbc', 'Persist data in SQL stores with plain JDBC using Spring Data.', 'Spring Data JDBC', 'SQL', NULL, 'https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-r2dbc', 'Provides Reactive Relational Database Connectivity to persist data in SQL stores using Spring Data in reactive applications.', 'Spring Data R2DBC', 'SQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/html/spring-boot-features.html#boot-features-r2dbc', NULL);
INSERT INTO "public"."dependencies" VALUES ('mybatis', 'Persistence framework with support for custom SQL, stored procedures and advanced mappings. MyBatis couples objects with stored procedures or SQL statements using a XML descriptor or annotations.', 'MyBatis Framework', 'SQL', '[2.0.0.RELEASE,2.6.0.M1)', 'https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/', NULL);
INSERT INTO "public"."dependencies" VALUES ('liquibase', 'Liquibase database migration and source control library.', 'Liquibase Migration', 'SQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-execute-liquibase-database-migrations-on-startup', NULL);
INSERT INTO "public"."dependencies" VALUES ('flyway', 'Version control for your database so you can migrate from any version (incl. an empty database) to the latest version of the schema.', 'Flyway Migration', 'SQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup', NULL);
INSERT INTO "public"."dependencies" VALUES ('jooq', 'Generate Java code from your database and build type safe SQL queries through a fluent API.', 'JOOQ Access Layer', 'SQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jooq', NULL);
INSERT INTO "public"."dependencies" VALUES ('db2', 'A JDBC driver that provides access to IBM DB2.', 'IBM DB2 Driver', 'SQL', '2.2.0.M6', NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('derby', 'An open source relational database implemented entirely in Java.', 'Apache Derby Database', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('devtools', 'Provides fast application restarts, LiveReload, and configurations for enhanced development experience.', 'Spring Boot DevTools', 'Developer Tools', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#using-boot-devtools', NULL);
INSERT INTO "public"."dependencies" VALUES ('lombok', 'Java annotation library which helps to reduce boilerplate code.', 'Lombok', 'Developer Tools', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('web', 'Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.', 'Spring Web', 'Web', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications', NULL);
INSERT INTO "public"."dependencies" VALUES ('mysql', 'MySQL JDBC and R2DBC driver.', 'MySQL Driver', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('oracle', 'A JDBC driver that provides access to Oracle.', 'Oracle Driver', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('postgresql', 'A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.', 'PostgreSQL Driver', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('data-redis-reactive', 'Access Redis key-value data stores in a reactive fashion with Spring Data Redis.', 'Spring Data Reactive Redis', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-redis', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-mongodb', 'Store data in flexible, JSON-like documents, meaning fields can vary from document to document and data structure can be changed over time.', 'Spring Data MongoDB', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-mongodb', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-mongodb-reactive', 'Provides asynchronous stream processing with non-blocking back pressure for MongoDB.', 'Spring Data Reactive MongoDB', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-mongodb', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-elasticsearch', 'A distributed, RESTful search and analytics engine with Spring Data Elasticsearch.', 'Spring Data Elasticsearch (Access+Driver)', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-elasticsearch', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-cassandra', 'A free and open-source, distributed, NoSQL database management system that offers high-scalability and high-performance.', 'Spring Data for Apache Cassandra', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-cassandra', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-cassandra-reactive', 'Access Cassandra NoSQL Database in a reactive fashion.', 'Spring Data Reactive for Apache Cassandra', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-cassandra', NULL);
INSERT INTO "public"."dependencies" VALUES ('geode', 'Apache Geode is a data management platform that helps users build real-time, highly concurrent, highly performant and reliable Spring Boot applications at scale that is compatible with Pivotal Cloud Cache.', 'Spring for Apache Geode', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot-data-geode-build/current/reference/html5/', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-couchbase', 'NoSQL document-oriented database that offers in memory-first architecture, geo-distributed deployments, and workload isolation.', 'Spring Data Couchbase', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-couchbase', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-couchbase-reactive', 'Access Couchbase NoSQL database in a reactive fashion with Spring Data Couchbase.', 'Spring Data Reactive Couchbase', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-couchbase', NULL);
INSERT INTO "public"."dependencies" VALUES ('data-neo4j', 'An open source NoSQL database that stores data structured as graphs consisting of nodes, connected by relationships.', 'Spring Data Neo4j', 'NoSQL', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-neo4j', NULL);
INSERT INTO "public"."dependencies" VALUES ('integration', 'Adds support for Enterprise Integration Patterns. Enables lightweight messaging and supports integration with external systems via declarative adapters.', 'Spring Integration', 'Messaging', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-integration', NULL);
INSERT INTO "public"."dependencies" VALUES ('amqp', 'Gives your applications a common platform to send and receive messages, and your messages a safe place to live until received.', 'Spring for RabbitMQ', 'Messaging', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-amqp', NULL);
INSERT INTO "public"."dependencies" VALUES ('kafka', 'Publish, subscribe, store, and process streams of records.', 'Spring for Apache Kafka', 'Messaging', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-kafka', NULL);
INSERT INTO "public"."dependencies" VALUES ('kafka-streams', 'Building stream processing applications with Apache Kafka Streams.', 'Spring for Apache Kafka Streams', 'Messaging', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('activemq', 'Spring JMS support with Apache ActiveMQ ''Classic''.', 'Spring for Apache ActiveMQ 5', 'Messaging', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-activemq', NULL);
INSERT INTO "public"."dependencies" VALUES ('artemis', 'Spring JMS support with Apache ActiveMQ Artemis.', 'Spring for Apache ActiveMQ Artemis', 'Messaging', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-artemis', NULL);
INSERT INTO "public"."dependencies" VALUES ('websocket', 'Build WebSocket applications with SockJS and STOMP.', 'WebSocket', 'Messaging', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-websockets', NULL);
INSERT INTO "public"."dependencies" VALUES ('rsocket', 'RSocket.io applications with Spring Messaging and Netty.', 'RSocket', 'Messaging', '2.2.0.M2', NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('camel', 'Apache Camel is an open source integration framework that empowers you to quickly and easily integrate various systems consuming or producing data.', 'Apache Camel', 'Messaging', '[2.0.0.M1,2.6.0.M1)', NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('solace', 'Connect to a Solace PubSub+ Advanced Event Broker to publish, subscribe, request/reply and store/replay messages', 'Solace PubSub+', 'Messaging', '[2.2.0.RELEASE,2.6.0.M1)', NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('batch', 'Batch applications with transactions, retry/skip and chunk based processing.', 'Spring Batch', 'I/O', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-batch-applications', NULL);
INSERT INTO "public"."dependencies" VALUES ('validation', 'Bean Validation with Hibernate validator.', 'Validation', 'I/O', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-validation', NULL);
INSERT INTO "public"."dependencies" VALUES ('mail', 'Send email using Java Mail and Spring Framework''s JavaMailSender.', 'Java Mail Sender', 'I/O', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-email', NULL);
INSERT INTO "public"."dependencies" VALUES ('quartz', 'Schedule jobs using Quartz.', 'Quartz Scheduler', 'I/O', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cache', 'Provides cache-related operations, such as the ability to update the content of the cache, but does not provide the actual data store.', 'Spring cache abstraction', 'I/O', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-caching', NULL);
INSERT INTO "public"."dependencies" VALUES ('picocli', 'Build command line applications with picocli.', 'Picocli', 'I/O', '[2.4.0.RELEASE,2.6.0.BUILD-SNAPSHOT)', 'https://picocli.info/#_spring_boot_example', NULL);
INSERT INTO "public"."dependencies" VALUES ('actuator', 'Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions, etc.', 'Spring Boot Actuator', 'Ops', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#production-ready', NULL);
INSERT INTO "public"."dependencies" VALUES ('hsql', 'Lightweight 100% Java SQL Database Engine.', 'HyperSQL Database', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('mariadb', 'MariaDB JDBC and R2DBC driver.', 'MariaDB Driver', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('sqlserver', 'A JDBC and R2DBC driver that provides access to Microsoft SQL Server and Azure SQL Database from any Java application.', 'MS SQL Server Driver', 'SQL', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('graphite', 'Publish Micrometer metrics to Graphite, a hierarchical metrics system backed by a fixed-size database.', 'Graphite', 'Observability', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/html/production-ready-features.html#production-ready-metrics-export-graphite', NULL);
INSERT INTO "public"."dependencies" VALUES ('new-relic', 'Publish Micrometer metrics to New Relic, a SaaS offering with a full UI and a query language called NRQL.', 'New Relic', 'Observability', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/html/production-ready-features.html#production-ready-metrics-export-new-relic', NULL);
INSERT INTO "public"."dependencies" VALUES ('prometheus', 'Expose Micrometer metrics in Prometheus format, an in-memory dimensional time series database with a simple built-in UI, a custom query language, and math operations.', 'Prometheus', 'Observability', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/html/production-ready-features.html#production-ready-metrics-export-prometheus', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter-sleuth', 'Distributed tracing via logs with Spring Cloud Sleuth.', 'Sleuth', 'Observability', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('wavefront', 'Publish Micrometer metrics to Tanzu Observability by Wavefront, a SaaS-based metrics monitoring and analytics platform that lets you visualize, query, and alert over data from across your entire stack.', 'Wavefront', 'Observability', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter-zipkin', 'Distributed tracing with an existing Zipkin installation and Spring Cloud Sleuth Zipkin.', 'Zipkin Client', 'Observability', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('restdocs', 'Document RESTful services by combining hand-written with Asciidoctor and auto-generated snippets produced with Spring MVC Test.', 'Spring REST Docs', 'Testing', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('testcontainers', 'Provide lightweight, throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container.', 'Testcontainers', 'Testing', NULL, 'https://www.testcontainers.org/', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-contract-verifier', 'Moves TDD to the level of software architecture by enabling Consumer Driven Contract (CDC) development.', 'Contract Verifier', 'Testing', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-contract-stub-runner', 'Stub Runner for HTTP/Messaging based communication. Allows creating WireMock stubs from RestDocs tests.', 'Contract Stub Runner', 'Testing', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('unboundid-ldap', 'Provides a platform neutral way for running a LDAP server in unit tests.', 'Embedded LDAP Server', 'Testing', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/html/boot-features-nosql.html#boot-features-ldap-embedded', NULL);
INSERT INTO "public"."dependencies" VALUES ('flapdoodle-mongo', 'Provides a platform neutral way for running MongoDB in unit tests.', 'Embedded MongoDB Database', 'Testing', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter', 'Non-specific Spring Cloud features, unrelated to external libraries or integrations (e.g. Bootstrap context and @RefreshScope).', 'Cloud Bootstrap', 'Spring Cloud', NULL, 'https://spring.io/projects/spring-cloud-commons', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-function', 'Promotes the implementation of business logic via functions and supports a uniform programming model across serverless providers, as well as the ability to run standalone (locally or in a PaaS).', 'Function', 'Spring Cloud', NULL, 'https://cloud.spring.io/spring-cloud-function/', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-task', 'Allows a user to develop and run short lived microservices using Spring Cloud. Run them locally, in the cloud, and on Spring Cloud Data Flow.', 'Task', 'Spring Cloud', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('open-service-broker', 'Framework for building Spring Boot apps that implement the Open Service Broker API, which can deliver services to applications running within cloud native platforms such as Cloud Foundry, Kubernetes and OpenShift.', 'Open Service Broker', 'Spring Cloud Tools', '[2.0.0.RELEASE,2.5.0.M1)', 'https://docs.spring.io/spring-cloud-open-service-broker/docs/current/reference/', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-config-client', 'Client that connects to a Spring Cloud Config Server to fetch the application''s configuration.', 'Config Client', 'Spring Cloud Config', NULL, 'https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-config-server', 'Central management for configuration via Git, SVN, or HashiCorp Vault.', 'Config Server', 'Spring Cloud Config', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter-vault-config', 'Provides client-side support for externalized configuration in a distributed system. Using HashiCorp''s Vault you have a central place to manage external secret properties for applications across all environments.', 'Vault Configuration', 'Spring Cloud Config', NULL, 'https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter-consul-config', 'Enable and configure the common patterns inside your application and build large distributed systems with Hashicorp’s Consul. The patterns provided include Service Discovery, Distributed Configuration and Control Bus.', 'Consul Configuration', 'Spring Cloud Config', NULL, 'https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#distributed-configuration-usage', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-eureka', 'A REST based service for locating services for the purpose of load balancing and failover of middle-tier servers.', 'Eureka Discovery Client', 'Spring Cloud Discovery', NULL, 'https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-eureka-server', 'spring-cloud-netflix Eureka Server.', 'Eureka Server', 'Spring Cloud Discovery', NULL, 'https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter-zookeeper-discovery', 'Service discovery with Apache Zookeeper.', 'Apache Zookeeper Discovery', 'Spring Cloud Discovery', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-cloudfoundry-discovery', 'Service discovery with Cloud Foundry.', 'Cloud Foundry Discovery', 'Spring Cloud Discovery', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-starter-consul-discovery', 'Service discovery with Hashicorp Consul.', 'Consul Discovery', 'Spring Cloud Discovery', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('codecentric-spring-boot-admin-server', 'A community project to manage and monitor your Spring Boot applications. Provides a UI on top of the Spring Boot Actuator endpoints.', 'Codecentric''s Spring Boot Admin (Server)', 'Ops', '[2.0.0.RELEASE,2.6.0.M1)', 'https://codecentric.github.io/spring-boot-admin/current/#getting-started', NULL);
INSERT INTO "public"."dependencies" VALUES ('datadog', 'Publish Micrometer metrics to Datadog, a dimensional time-series SaaS with built-in dashboarding and alerting.', 'Datadog', 'Observability', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/html/production-ready-features.html#production-ready-metrics-export-datadog', NULL);
INSERT INTO "public"."dependencies" VALUES ('influx', 'Publish Micrometer metrics to InfluxDB, a dimensional time-series server that support real-time stream processing of data.', 'Influx', 'Observability', NULL, 'https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/html/production-ready-features.html#production-ready-metrics-export-influx', NULL);
INSERT INTO "public"."dependencies" VALUES ('azure-cosmos-db', 'Fully managed NoSQL database service for modern app development, including Spring Data support.', 'Azure Cosmos DB', 'Microsoft Azure', '[2.2.11.RELEASE,2.6.0.M1)', 'https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-cosmos-db', NULL);
INSERT INTO "public"."dependencies" VALUES ('azure-keyvault-secrets', 'Manage application secrets.', 'Azure Key Vault', 'Microsoft Azure', '[2.2.11.RELEASE,2.6.0.M1)', 'https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/spring/azure-spring-boot-starter-keyvault-secrets', NULL);
INSERT INTO "public"."dependencies" VALUES ('azure-storage', 'Azure Storage service integration.', 'Azure Storage', 'Microsoft Azure', '[2.2.11.RELEASE,2.6.0.M1)', 'https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/spring/azure-spring-boot-starter-storage', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-gateway', 'Provides a simple, yet effective way to route to APIs and provide cross cutting concerns to them such as security, monitoring/metrics, and resiliency.', 'Gateway', 'Spring Cloud Routing', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-feign', 'Declarative REST Client. OpenFeign creates a dynamic implementation of an interface decorated with JAX-RS or Spring MVC annotations.', 'OpenFeign', 'Spring Cloud Routing', NULL, 'https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-loadbalancer', 'Client-side load-balancing with Spring Cloud LoadBalancer.', 'Cloud LoadBalancer', 'Spring Cloud Routing', NULL, 'https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-resilience4j', 'Spring Cloud Circuit breaker with Resilience4j as the underlying implementation.', 'Resilience4J', 'Spring Cloud Circuit Breaker', NULL, 'https://cloud.spring.io/spring-cloud-static/spring-cloud-circuitbreaker/current/reference/html', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-gcp', 'Contains auto-configuration support for every Spring Cloud GCP integration. Most of the auto-configuration code is only enabled if other dependencies are added to the classpath.', 'GCP Support', 'Google Cloud Platform', '[2.0.0.RELEASE,2.6.0.M1)', 'https://cloud.spring.io/spring-cloud-gcp/reference/html/', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-gcp-pubsub', 'Adds the GCP Support entry and all the required dependencies so that the Google Cloud Pub/Sub integration work out of the box.', 'GCP Messaging', 'Google Cloud Platform', '[2.0.0.RELEASE,2.6.0.M1)', 'https://cloud.spring.io/spring-cloud-gcp/reference/html/#spring-integration', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-gcp-storage', 'Adds the GCP Support entry and all the required dependencies so that the Google Cloud Storage integration work out of the box.', 'GCP Storage', 'Google Cloud Platform', '[2.0.0.RELEASE,2.6.0.M1)', 'https://cloud.spring.io/spring-cloud-gcp/reference/html/#spring-resources', NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-bus', 'Links nodes of a distributed system with a lightweight message broker which can used to broadcast state changes or other management instructions (requires a binder, e.g. Apache Kafka or RabbitMQ).', 'Cloud Bus', 'Spring Cloud Messaging', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('cloud-stream', 'Framework for building highly scalable event-driven microservices connected with shared messaging systems (requires a binder, e.g. Apache Kafka, RabbitMQ or Solace PubSub+).', 'Cloud Stream', 'Spring Cloud Messaging', NULL, NULL, NULL);
INSERT INTO "public"."dependencies" VALUES ('scs-config-client', 'Config client on VMware Tanzu Application Service.', 'Config Client (TAS)', 'VMware Tanzu Application Service', '[2.0.0.RELEASE,2.6.0.M1)', 'https://docs.pivotal.io/spring-cloud-services/', NULL);
INSERT INTO "public"."dependencies" VALUES ('scs-service-registry', 'Eureka service discovery client on VMware Tanzu Application Service.', 'Service Registry (TAS)', 'VMware Tanzu Application Service', '[2.0.0.RELEASE,2.6.0.M1)', 'https://docs.pivotal.io/spring-cloud-services/', NULL);
INSERT INTO "public"."dependencies" VALUES ('scs-circuit-breaker', 'Hystrix circuit breaker client on VMware Tanzu Application Service.', 'Circuit Breaker (TAS)', 'VMware Tanzu Application Service', '[2.0.0.RELEASE,2.5.0.M1)', 'https://docs.pivotal.io/spring-cloud-services/', NULL);
INSERT INTO "public"."dependencies" VALUES ('azure-support', 'Auto-configuration for Azure Services (Service Bus, Storage, Active Directory, Key Vault, and more).', 'Azure Support', 'Microsoft Azure', '[2.2.11.RELEASE,2.6.0.M1)', 'https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/spring', NULL);
INSERT INTO "public"."dependencies" VALUES ('azure-active-directory', 'Spring Security integration with Azure Active Directory for authentication.', 'Azure Active Directory', 'Microsoft Azure', '[2.2.11.RELEASE,2.6.0.M1)', 'https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/spring/azure-spring-boot-starter-active-directory', NULL);
COMMIT;

-- ----------------------------
-- Table structure for template_diy
-- ----------------------------
DROP TABLE IF EXISTS "public"."template_diy";
CREATE TABLE "public"."template_diy" (
  "template_id" int4 NOT NULL DEFAULT nextval('templatediyup'::regclass),
  "template_name" varchar(255) COLLATE "pg_catalog"."default",
  "template_type" varchar(255) COLLATE "pg_catalog"."default",
  "template_content" text COLLATE "pg_catalog"."default",
  "package_name" varchar(255) COLLATE "pg_catalog"."default",
  "path" varchar(255) COLLATE "pg_catalog"."default",
  "extension_name" varchar(255) COLLATE "pg_catalog"."default",
  "prefix_default" varchar(255) COLLATE "pg_catalog"."default",
  "create_time" varchar(255) COLLATE "pg_catalog"."default",
  "template_author" varchar(255) COLLATE "pg_catalog"."default",
  "belong" int2
)
;
ALTER TABLE "public"."template_diy" OWNER TO "postgres";

-- ----------------------------
-- Records of template_diy
-- ----------------------------
BEGIN;
INSERT INTO "public"."template_diy" VALUES (8, 'mybatis-mapper.java', 'java', 'package ${package}.web.mapper;
import ${package}.web.domain.*;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的持久层
 * @modified By：
 * @version: 1.0
 */
@Repository
public interface ${TableName}Mapper {
    List<${TableName}> list();
    void save();
    void update(${TableName} ${DataHandle.bigToLow(${TableName})});
    void del(int[] ids);
}
', '', '', 'java', 'web/mapper/', '2021/12/2', 'JiaGuo', 1);
INSERT INTO "public"."template_diy" VALUES (9, 'mybatisPlus-mapper.java', 'java', 'package ${package}.web.mapper;
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
', '', '', 'java', 'web/mapper/', '2021/12/2', 'JiaGuo', 2);
INSERT INTO "public"."template_diy" VALUES (4, 'mybatis-serviceImpl.java', 'java', 'package ${package}.web.service.impl;


import ${package}.web.domain.*;
import ${package}.web.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的业务层实现
 * @modified By：
 * @version: 1.0
 */
@Service
public class ${TableName}ServiceImpl implements ${TableName}Service {
    @Autowired
    private ${TableName}Mapper ${DataHandle.bigToLow(${TableName})}Mapper;
    public List<${TableName}> list() {
        return ${DataHandle.bigToLow(${TableName})}Mapper.list();
    }
    public void save() {
        ${DataHandle.bigToLow(${TableName})}Mapper.save()};
    }
    public void update(${TableName} ${DataHandle.bigToLow(${TableName})}) {
        ${DataHandle.bigToLow(${TableName})}Mapper.update(${DataHandle.bigToLow(${TableName})})};
    }
    public void del(int[] ids) {
        ${DataHandle.bigToLow(${TableName})}Mapper.del(ids)};
    }
}
', '', '', 'java', 'web/service/impl/', '2021/12/2', 'JiaGuo', 1);
INSERT INTO "public"."template_diy" VALUES (6, 'mybatis-domain.java', 'java', 'package ${package}.web.domain;
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
', '', '', 'java', 'web/domain/', '2021/12/2', 'JiaGuo', 6);
INSERT INTO "public"."template_diy" VALUES (2, 'mybatis-service.java', 'java', 'package ${package}.web.service;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的业务层接口
 * @modified By：
 * @version: 1.0
 */
public interface ${TableName}Service {
    public List<${TableName}> list() ;
    public void save() ;
    public void update(${TableName} ${DataHandle.bigToLow(${TableName})});
    public void del(int[] ids);
}
', '', '', 'java', 'web/service/', '2021/12/2', 'JiaGuo', 1);
INSERT INTO "public"."template_diy" VALUES (1, 'controller.java', 'java', 'package ${package}.controller;
import ${package}.web.domain.${TableName};
import ${package}.web.service.${TableName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/17 17:45
 * @description： 表现层
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/${DataHandle.bigToLow(${TableName})}")
public class ${TableName}Controller {
    @Autowired
    private ${TableName}Service ${DataHandle.bigToLow(${TableName})}Service;

    @RequestMapping("/list")
    public List<${TableName}> list() {
        return ${DataHandle.bigToLow(${TableName})}.list();
    }
    @RequestMapping("/save")
    public void save(@RequestBody ${TableName} ${DataHandle.bigToLow(${TableName})}) {
            ${DataHandle.bigToLow(${TableName})}Service.save();
    }
    @RequestMapping("/update")
    public void update(@RequestBody ${TableName} ${DataHandle.bigToLow(${TableName})}) {
            ${DataHandle.bigToLow(${TableName})}Service.update(${DataHandle.bigToLow(${TableName})});
    }
    @RequestMapping("/del")
    public void del(@RequestBody int[] ids) {
            ${DataHandle.bigToLow(${TableName})}Service.del(ids);
    }
}
', '', '', 'java', 'web/controller/', '2021/12/2', 'JiaGuo', 3);
INSERT INTO "public"."template_diy" VALUES (7, 'mybatisPlus-postgresql-domain.java', 'java', 'package ${package}.web.domain;
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
', '', '', 'java', 'web/domain/', '2021/12/2', 'JiaGuo', 4);
INSERT INTO "public"."template_diy" VALUES (3, 'mybatisPlus-service.java', 'java', 'package ${package}.web.service;
import ${package}.web.domain.*;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的业务层接口
 * @modified By：
 * @version: 1.0
 */
public interface ${TableName}Service extends IService<${TableName}Domain> {
}
', '', '', 'java', 'web/service/', '2021/12/2', 'JiaGuo', 2);
INSERT INTO "public"."template_diy" VALUES (10, 'mybatis-mapper.xml', 'xml', '<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${package}.web.mapper.${TableName}Mapper}">
    <select id="findAll" resultType="${package}.web.domain.${TableName}Domain">
        select *
        from ${underLineTableName}
    </select>
    <select id="findId" resultType="${package}.web.domain.${TableName}Domain">
        select *
        from ${underLineTableName}
            where   ${underLinePriKey} = #{${DataHandle.underlineToSmallHump(${underLinePriKey})}}
    </select>
    <delete id="delDataId">
        DELETE ${underLineTableName} WHEN ${underLinePriKey} = #{${DataHandle.underlineToSmallHump(${underLinePriKey})}}
    </delete>
    <insert id="insertData">
        INSERT
            INTO ${underLineTableName}
                SET
                #foreach($item in ${underLineTableAttribute.entrySet()})
                    #if(${item.value.get(2)} == "notPriKey")
                        ${item.key} = #{${DataHandle.underlineToSmallHump(${item.key})}}#if($foreach.hasNext),#end
            #end
                #end
    </insert>
    <update id="updateData">
        UPDATE ${underLineTableName}
            SET (
            #foreach($item in ${underLineTableAttribute.entrySet()})
                #if(${item.value.get(2)} == "notPriKey")
                    ${item.key} = #{${DataHandle.underlineToSmallHump(${item.key})}}#if($foreach.hasNext),#end
                #end
            #end)
        where   ${underLinePriKey} = #{${humpPriKey}}
    </update>
</mapper>

', '', '', 'xml', '/src/main/resources/mapper/', '2021/12/2', 'JiaGuo', 1);
INSERT INTO "public"."template_diy" VALUES (12, 'application.yml', 'yml', 'spring:
  datasource:
    url: ${url}
    username: ${username}
    password: ${password}
    driver-class-name: ${driver}
mybatis:
  mapper-locations: classpath:mapper/*.xml
  map-underscore-to-camel-case: true

', NULL, NULL, 'yml', '/src/main/resources/', '2021/12/2', 'JiaGuo', 3);
INSERT INTO "public"."template_diy" VALUES (13, 'mybatisPlus-mysql-domain.java', 'java', 'package ${package}.web.domain;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是${TableName}的实体类
 * @modified By：
 * @version: 1.0
 */
@Data
@TableName("${DataHandle.underscoreName(${TableName})}")
public class ${TableName}Domain {
 #foreach($item in ${tableAttribute.entrySet()})
     #if(${item.value.get(2)} == "isPriKey")
     @TableId(type = IdType.AUTO)
     #end
     private ${item.value.get(0)}  ${DataHandle.bigToLow(${item.key})};
 #end
}
', NULL, NULL, 'java', 'web/domain/', '2021/12/2', 'JiaGuo', 5);
INSERT INTO "public"."template_diy" VALUES (11, 'mybatisPlus-mapper.xml', 'xml', '<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${package}.web.mapper.${TableName}Mapper}">
</mapper>

', NULL, '', 'xml', '/src/main/resources/mapper/', '2021/12/2', 'JiaGuo', 2);
INSERT INTO "public"."template_diy" VALUES (5, 'mybatisPlus-serviceImpl.java', 'java', 'package ${package}.web.service.Impl;
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
', '', '', 'java', 'web/service/impl/', '2021/12/2', 'JiaGuo', 2);
COMMIT;

-- ----------------------------
-- Table structure for template_manage
-- ----------------------------
DROP TABLE IF EXISTS "public"."template_manage";
CREATE TABLE "public"."template_manage" (
  "package_name" varchar(255) COLLATE "pg_catalog"."default",
  "template_name" varchar(255) COLLATE "pg_catalog"."default",
  "template_content" varchar(255) COLLATE "pg_catalog"."default",
  "template_id" int4 NOT NULL DEFAULT nextval('templatemanageup'::regclass),
  "del_mark" bool,
  "create_time" varchar(255) COLLATE "pg_catalog"."default",
  "template_type" varchar(255) COLLATE "pg_catalog"."default",
  "template_author" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."template_manage" OWNER TO "postgres";

-- ----------------------------
-- Records of template_manage
-- ----------------------------
BEGIN;
INSERT INTO "public"."template_manage" VALUES (NULL, 'mybatis-curd', 'mybatis风格 service(impl).java，mapper.java，mapper.xml', 1, 'f', '2021/12/7', '默认', 'JiaGuo');
INSERT INTO "public"."template_manage" VALUES (NULL, 'general-module', 'Spring通用模块（controller.java,application.yml)', 3, 'f', '2021/12/7', '默认', 'JiaGuo');
INSERT INTO "public"."template_manage" VALUES (NULL, 'mybatis-domain', 'mybatis风格domain（pg和mysql通用）', 6, 'f', '2021/12/7', '默认', 'JiaGuo');
INSERT INTO "public"."template_manage" VALUES (NULL, 'mybatisplus-curd', 'mybatisPlus风格  service，mapper，mapper.xml', 2, 'f', '2021/12/7', '默认', 'JiaGuo');
INSERT INTO "public"."template_manage" VALUES (NULL, 'mybatisplus-mysql-domain', 'mybatisPlus-mysql风格domain', 5, 'f', '2021/12/7', '默认', 'JiaGuo');
INSERT INTO "public"."template_manage" VALUES (NULL, 'mybatisplus-postgresql-domain', 'mybatisPlus-postgresql风格domain', 4, 'f', '2021/12/7', '默认', 'JiaGuo');
COMMIT;

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."TemplateDiy_templateId_seq"
OWNED BY "public"."template_diy"."template_id";
SELECT setval('"public"."TemplateDiy_templateId_seq"', 5, false);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."TemplateManage_templateId_seq"
OWNED BY "public"."template_manage"."template_id";
SELECT setval('"public"."TemplateManage_templateId_seq"', 5, false);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"public"."templatediyup"', 14, true);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"public"."templatemanageup"', 23, true);

-- ----------------------------
-- Primary Key structure for table dependencies
-- ----------------------------
ALTER TABLE "public"."dependencies" ADD CONSTRAINT "dependencies_pk" PRIMARY KEY ("id");

-- ----------------------------
-- Indexes structure for table template_diy
-- ----------------------------
CREATE UNIQUE INDEX "templatediy_templateid_uindex" ON "public"."template_diy" USING btree (
  "template_id" "pg_catalog"."int4_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table template_diy
-- ----------------------------
ALTER TABLE "public"."template_diy" ADD CONSTRAINT "TemplateDiy_pkey" PRIMARY KEY ("template_id");

-- ----------------------------
-- Primary Key structure for table template_manage
-- ----------------------------
ALTER TABLE "public"."template_manage" ADD CONSTRAINT "TemplateManage_pkey" PRIMARY KEY ("template_id");
