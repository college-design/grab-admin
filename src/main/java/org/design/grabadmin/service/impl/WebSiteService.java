package org.design.grabadmin.service.impl;

import org.design.grabadmin.dao.WebSiteDao;
import org.design.grabadmin.entity.WebSite;
import org.design.grabadmin.service.IWebSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSiteService implements IWebSiteService {

    @Autowired
    private WebSiteDao webSiteDao;

    @Override
    public List<WebSite> getAllWebSiteList() {
        return webSiteDao.findAll();
    }
}
