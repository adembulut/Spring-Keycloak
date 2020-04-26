package com.adembulut.springkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author adem.bulut  on  26.04.2020
 * @project springkey
 */
@RequestMapping("/")
@Controller
public class HomeController {

    @GetMapping(value = {"/","","/index","/index/"})
    public String getIndex(ModelMap map) {
        map.addAttribute("home", "This is HomePage");
        return "shared/index";
    }

    @GetMapping("/adem")
    public String getIndex1(ModelMap map) {
        map.addAttribute("home", "This is HomePage");
        return "shared/index";
    }
    @GetMapping("/login")
    public String getLogin(ModelMap map) {
        map.addAttribute("home", "This is loginPage");
        return "login";
    }


}
