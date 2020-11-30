package cn.helx.mybatis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("")
    public ModelAndView getIndex(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello","Hello World!");
        mv.setViewName("index/index");
        return mv;
    }

    @RequestMapping("/getHelloStr")
    @ResponseBody
    public String showHello(){

        String str = "Hello World!2";
        return str;
    }

}
