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
        Map map = new HashMap();
        /**
         * 变量 for basic.demo_01.index
         */
        map.put("id_01", "007");
        map.put("name_01", "许小群");
        map.put("pwd_01", "123");
        /**
         * 变量 for basic.demo_02.index
         */
        map.put("id_02", "hello,");
        map.put("name_02", "it's me,");
        map.put("pwd_02", "I was wondering if after these years you'd like to meet");
        return map;
    }
}
