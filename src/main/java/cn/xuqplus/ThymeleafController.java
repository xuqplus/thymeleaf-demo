package cn.xuqplus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017-04-10.
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/{page}")
    public ModelAndView thymeleaf(@PathVariable String page) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(page.replace(".html", ""));
        return mav;
    }
}
