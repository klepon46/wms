package com.ggstudio.wms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/in")
public class ItemInController {

    @GetMapping("/index")
    public String index(){
        return "in/index";
    }


}
