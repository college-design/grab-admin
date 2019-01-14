package org.design.grabadmin.web;

import org.design.grabadmin.entity.WebSite;
import org.design.grabadmin.service.impl.WebSiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/webSite")
public class WebSiteController {
    private final static Logger logger = LoggerFactory.getLogger(WebSiteController.class);

    @Autowired
    private WebSiteService webSiteService;

    @RequestMapping("/list")
    public String queryWebSiteList(ModelMap map){
        List<WebSite> list = webSiteService.getAllWebSiteList();
        map.addAttribute("webSiteList",list);
        return "views/web_site_list";
    }
}
