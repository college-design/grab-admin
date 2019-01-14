package org.design.grabadmin.web;

import com.alibaba.fastjson.JSON;
import org.design.grabadmin.entity.MatchData;
import org.design.grabadmin.service.IMatchDataService;
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
@RequestMapping("/matchData")
public class MatchDataController {
    private final static Logger logger = LoggerFactory.getLogger(GrabRuleController.class);

    @Autowired
    private IMatchDataService iMatchDataService;

    @RequestMapping("/")
    public String index(){
        return "views/match_data";
    }

    @ResponseBody
    @RequestMapping(value = "/listTable",method = RequestMethod.GET)
    public String queryMatchDataList(MatchData matchData, ModelMap map){
        logger.error("request:{}", JSON.toJSON(matchData));
        List<MatchData> list = iMatchDataService.getAllMatchDataList();
        String result = JSON.toJSONString(list);
        map.addAttribute("response:{}",result);
        return result;
    }
}
