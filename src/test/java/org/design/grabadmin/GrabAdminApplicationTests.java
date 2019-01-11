package org.design.grabadmin;

import org.design.grabadmin.dao.GrabRuleDao;
import org.design.grabadmin.dao.MatchDataDao;
import org.design.grabadmin.dao.WebSiteDao;
import org.design.grabadmin.entity.GrabRule;
import org.design.grabadmin.entity.MatchData;
import org.design.grabadmin.entity.WebSite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GrabAdminApplicationTests {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WebSiteDao webSiteDao;

    @Autowired
    private GrabRuleDao grabRuleDao;

    @Autowired
    private MatchDataDao matchDataDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testWebSiteDao(){
        WebSite webSite = new WebSite();
        webSite.setUrl("http://www.baidu.com");
        webSite.setDescription("baidu");
        webSite.setStatus(1);
        webSiteDao.save(webSite);
        List<WebSite> webList = webSiteDao.findAll();
        logger.error("webList:{}",webList.size());

        GrabRule grabRule = new GrabRule();
        grabRule.setRule("href=\"(http://.*?)\"");
        grabRule.setStatus(1);
        grabRule.setWebSite(webSite);
        grabRule.setDescription("rule test");
        grabRuleDao.save(grabRule);
        List<GrabRule> ruleList = grabRuleDao.findAll();
        logger.error("ruleList:{}",ruleList.size());
    }

    @Test
    public void testGrabRule(){
        GrabRule grabRule = new GrabRule();
        grabRule.setRule("href=\"(http://.*?)\"");
        grabRule.setStatus(1);
//        grabRule.setWebSite();

    }
}

