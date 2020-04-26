package com.adembulut.springkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author adem.bulut  on  26.04.2020
 * @project springkey
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping(value = {"", "/", "/index", "/index/"})
    public String getIndex(ModelMap map) {
        map.addAttribute("pageInfo","This page is User Role Page");
        return "user/index";
    }
}
