package org.design.grabadmin.web;

import com.alibaba.fastjson.JSON;
import org.design.grabadmin.entity.WebSite;
import org.design.grabadmin.service.impl.WebSiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/webSite")
public class WebSiteController {
    private final static Logger logger = LoggerFactory.getLogger(WebSiteController.class);

    @Autowired
    private WebSiteService webSiteService;

    @RequestMapping("/list")
    public String queryWebSiteList(){
        List<WebSite> list = webSiteService.getAllWebSiteList();
        return JSON.toJSONString(list);
    }
}
