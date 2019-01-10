package org.design.grabadmin;

import org.design.grabadmin.dao.WebSiteDao;
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

    @Test
    public void contextLoads() {
    }

    @Test
    public void testWebSiteDao(){
        WebSite webSite = new WebSite();
        webSite.setUrl("www.baidu.com");
        webSite.setDescription("百度");
        webSiteDao.save(webSite);

        List<WebSite> list = webSiteDao.findAll();
        logger.info("list:{}",list.size());
    }
}

