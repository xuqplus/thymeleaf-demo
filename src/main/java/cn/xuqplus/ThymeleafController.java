package cn.xuqplus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
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
    public void thymeleaf(HttpServletResponse response) throws IOException {
        response.sendRedirect("index.html");
    }
}
