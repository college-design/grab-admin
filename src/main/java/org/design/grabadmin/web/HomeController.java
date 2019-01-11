package org.design.grabadmin.web;

import org.design.grabadmin.entity.WebSite;
import org.design.grabadmin.service.IWebSiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private IWebSiteService iWebSiteService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap map){
        List<WebSite> list = iWebSiteService.getAllWebSiteList();
        logger.info("/home/index:{}",list.size());
        map.addAttribute("list",list.size());
        return "views/home";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(ModelMap map){
        return "views/test";
    }
}
