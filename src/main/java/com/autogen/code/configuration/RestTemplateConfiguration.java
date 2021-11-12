package com.autogen.code.configuration;

import org.apache.http.client.HttpClient;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/2 14:23
 */
@Configuration
public class RestTemplateConfiguration {

    /**
     * 实例化RestTeamplate对象 ---> 设置其为HttpClient模式 --->
     */
    @Bean
    public RestTemplate restTemplate() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(clientHttpRequestFactory());
        restTemplate.setErrorHandler(new DefaultResponseErrorHandler());
        return restTemplate;
    }


    /**
     * 连接池 连接工厂
     *
     * @return
     */
    @Bean
    public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        // https协议
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
            @Override
            public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                return true;
            }
        }).build();

        httpClientBuilder.setSSLContext(sslContext);
        HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
        // 注册http和https请求
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create().register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", sslConnectionSocketFactory).build();
        // 开始设置连接池
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        // 最大连接数200
        poolingHttpClientConnectionManager.setMaxTotal(200);
        // 同路由并发数20
        poolingHttpClientConnectionManager.setDefaultMaxPerRoute(20);
        httpClientBuilder.setConnectionManager(poolingHttpClientConnectionManager);
        // 重试次数
        httpClientBuilder.setRetryHandler(new DefaultHttpRequestRetryHandler(2, true));
        HttpClient httpClient = httpClientBuilder.build();
        // httpClient连接配置
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        // 连接超时
        clientHttpRequestFactory.setConnectTimeout(20000);
        // 数据读取超时时间
        clientHttpRequestFactory.setReadTimeout(20000);
        // 连接不够用的等待时间
        clientHttpRequestFactory.setConnectionRequestTimeout(200);
        return clientHttpRequestFactory;
    }
}
