package org.design.grabadmin.web;

import com.alibaba.fastjson.JSON;
import org.design.grabadmin.entity.GrabRule;
import org.design.grabadmin.service.IGrabRuleService;
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
@RequestMapping("/grabRule")
public class GrabRuleController {

    private final static Logger logger = LoggerFactory.getLogger(GrabRuleController.class);

    @Autowired
    private IGrabRuleService iGrabRuleService;

    @RequestMapping("/")
    public String index(){
        return "views/grab_rule";
    }

    @ResponseBody
    @RequestMapping(value = "/listTable",method = RequestMethod.GET)
    public String queryGrabRuleList(GrabRule grabRule, ModelMap map){
        logger.error("request:{}", JSON.toJSON(grabRule));
        List<GrabRule> list = iGrabRuleService.getAllGrabRuleList();
        String result = JSON.toJSONString(list);
        map.addAttribute("response:{}",result);
        return result;
    }
}
