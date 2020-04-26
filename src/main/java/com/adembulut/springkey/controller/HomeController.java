package com.adembulut.springkey.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author adem.bulut  on  26.04.2020
 * @project springkey
 */
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String getIndex(ModelMap map) {
        map.addAttribute("home","This is HomePage");
        return "shared/index";
    }
}
