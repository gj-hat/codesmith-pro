package com.autogen.code.configuration;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.autogen.code.utils.RestTemplateUtils;
import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.service.Impl.DependenciesServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;


/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/14 00:57
 * @description：定时任务
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class TimingTask {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private int i;

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RestTemplateUtils restTemplateUtils;
    @Autowired
    private DependenciesServiceImpl dependenciesService;


    @Scheduled(cron = "0 0 23 * * ?")
//    @Scheduled(cron = "*/5 * * * * ?")
    public void execute() {
        logger.info("每天11点触发一次定时任务:第:{}次执行", ++i);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://start.spring.io/metadata/client", String.class);
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            JSONObject data = JSON.parseObject(responseEntity.getBody());
            JSONObject dependency = data.getJSONObject("dependencies");
            JSONArray jsonArray = dependency.getJSONArray("values");
            for (Object aaa : jsonArray) {
                String s1 = aaa.toString();
                JSONObject jsonObject = JSONObject.parseObject(new String(s1));
                JSONArray values = jsonObject.getJSONArray("values");
                for (Object bbb : values) {
                    String s2 = bbb.toString();
                    JSONObject sonObject = JSONObject.parseObject(new String(s2));
                    DependenciesDomain dependenciesDomain = new DependenciesDomain();
                    dependenciesDomain.setId(sonObject.getString("id"));
                    dependenciesDomain.setName(sonObject.getString("name"));
                    dependenciesDomain.setDescription(sonObject.getString("description"));
                    dependenciesDomain.setVersionRange(sonObject.getString("versionRange"));
                    dependenciesDomain.setGroup(jsonObject.getString("name"));
                    try {
                        JSONObject links = sonObject.getJSONObject("_links");
                        JSONObject sonSonObject = links.getJSONObject("reference");
                        dependenciesDomain.setReference(sonSonObject.getString("href"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    dependenciesService.saveOrUpdate(dependenciesDomain);
                }
            }

        }

    }

}
