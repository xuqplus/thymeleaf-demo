package cn.xuqplus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.context.Context;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2017-04-10.
 */
@RestController
public class ThymeleafController {
    @Qualifier(value = "map")
    @Autowired
    private Map map;

    @RequestMapping("/{page}")
    public ModelAndView thymeleaf(@PathVariable String page) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(page.replaceAll("\\.", "/"));
        mav.addAllObjects(map);
        mav.addObject("msg.a", "hello");
        return mav;
    }

    @RequestMapping("/")
    public ModelAndView thymeleaf(ModelAndView mav) throws IOException {
        /**
         * 返回值直接写在参数列表
         */
        //ModelAndView mav = new ModelAndView();
        /**
         * 变量表达式:
         * --> th:text="${user.id}"
         * ----> 相当于(Context).get("user").get("id")
         */
        Context song = new Context();
        song.setVariable("a", "hello");
        song.setVariable("b", "it's me");
        song.setVariable("c", "I was wondering if after all these years you'd like to meet.");
        Context context = new Context();
        context.setVariable("id", "007");
        context.setVariable("name", "许小群");
        context.setVariable("pwd", "123");
        mav.addObject("user", context);
        mav.setViewName("basic/index");
        context.setVariable("song", song);//set的时机没有影响
        /**
         * ModelAndView重定向方式
         */
        //mav.setViewName("redirect:/index.html");
        return mav;
    }
}
