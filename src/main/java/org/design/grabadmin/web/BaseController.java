package org.design.grabadmin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/")
    public String home(){
        return "redirect:/home/index";
    }
}
