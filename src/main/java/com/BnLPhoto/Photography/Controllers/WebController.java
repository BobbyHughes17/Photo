package com.BnLPhoto.Photography.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class WebController {

// add @autowire, after dao

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("title","B&L Home");
        return "photo/index";
    }
}
