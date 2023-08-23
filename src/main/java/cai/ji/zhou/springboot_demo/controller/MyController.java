package cai.ji.zhou.springboot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping(value = "/my")
    String my() {
        return "Hell World!";
    }
}
