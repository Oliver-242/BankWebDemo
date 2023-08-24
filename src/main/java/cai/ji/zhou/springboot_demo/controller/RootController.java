package cai.ji.zhou.springboot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

/**
 * @author caijizhou
 * @date 2023/08/24 10:30
 */
@Controller
public class RootController {
    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String userName,
                       @RequestParam("password") String passWord, Model model) {
        if(!StringUtils.isEmpty(userName)&& "123123".equals(passWord)){
            return "redirect:/homo";
        }else{
            model.addAttribute("msg","用户名或者密码错误!");
            return "RootTmp";
        }
    }

//    @GetMapping(value = "/login")
//    public String showLoginPage() {
//        return "RootTmp";
//    }

    @GetMapping(value = "/")
    public String root() {
        return "RootTmp";
    }
}
