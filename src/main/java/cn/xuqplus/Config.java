package cn.xuqplus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-04-10.
 */
@Configuration
public class Config {
    @Bean(name = "map")
    public Map map() {
        Map<String, Map> map = new HashMap();
        /**
         * 变量 for basic.demo-01.index
         */
        Map<String, String> basicDemo01Index = new HashMap();
        basicDemo01Index.put("id", "007");
        basicDemo01Index.put("name", "许小群");
        basicDemo01Index.put("pwd", "123");
        map.put("basic.demo-01.index", basicDemo01Index);
        /**
         * 变量 for basic.demo-02.index
         */
        Map<String, String> basicDemo02Index = new HashMap();
        basicDemo01Index.put("id", "hello,");
        basicDemo01Index.put("name", "it's me,");
        basicDemo01Index.put("pwd", "I was wondering if after these years you'd like to meet");
        map.put("basic.demo-02.index", basicDemo02Index);
        return map;
    }
}
