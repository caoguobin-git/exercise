/***********************************************
 * File Name: IndexController
 * @author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 11 2019 上午 10:15
 ***********************************************/

package com.wallhell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @GetMapping(value = "/index")
    public String testIndex(){
        return "pages/index";
    }

    @GetMapping(value = "/admin")
    public String adminPage(){
        return "sys-pages/index";
    }
}
