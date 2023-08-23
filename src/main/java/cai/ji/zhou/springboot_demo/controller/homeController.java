package cai.ji.zhou.springboot_demo.controller;

import cai.ji.zhou.springboot_demo.Query;
import cai.ji.zhou.springboot_demo.QueryImpl;
import cai.ji.zhou.springboot_demo.entity.InfoEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping("/my")
public class homeController {
    @Resource
    private QueryImpl qq;

    @GetMapping(value = "/home")
    String home() {
        List<InfoEntity> info = qq.query();
        return info.toString();
    }
}
