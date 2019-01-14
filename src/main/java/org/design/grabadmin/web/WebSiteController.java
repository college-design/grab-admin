package org.design.grabadmin.web;

import com.alibaba.fastjson.JSON;
import org.design.grabadmin.entity.WebSite;
import org.design.grabadmin.service.impl.WebSiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/webSite")
public class WebSiteController {
    private final static Logger logger = LoggerFactory.getLogger(WebSiteController.class);

    @Autowired
    private WebSiteService webSiteService;

    @RequestMapping("/")
    public String index(){
        return "views/web_site_list";
    }

    @ResponseBody
    @RequestMapping(value = "/listTable",method = RequestMethod.GET)
    public String queryWebSiteList(WebSite webSite,ModelMap map){
        logger.error("request:{}",JSON.toJSON(webSite));
        List<WebSite> list = webSiteService.getAllWebSiteList();
        String result = JSON.toJSONString(list);
        map.addAttribute("response:{}",result);
        return result;
    }
}
