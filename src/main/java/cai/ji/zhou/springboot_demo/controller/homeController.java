package cai.ji.zhou.springboot_demo.controller;

import cai.ji.zhou.springboot_demo.impl.QueryImpl;
import cai.ji.zhou.springboot_demo.entity.InfoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.annotation.Resource;

@Controller
public class homeController {
    @Resource
    private QueryImpl qq;

    @GetMapping(value = "/homo")
    public String homo(Model model) {
        List<InfoEntity> info = qq.queryAll();
        model.addAttribute("data", info.toString());
        return "Homo";
    }
}
