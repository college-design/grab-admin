package org.design.grabadmin.service.impl;

import org.design.grabadmin.dao.GrabRuleDao;
import org.design.grabadmin.entity.GrabRule;
import org.design.grabadmin.service.IGrabRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrabRuleService implements IGrabRuleService {
    @Autowired
    private GrabRuleDao grabRuleDao;


    @Override
    public List<GrabRule> getAllGrabRuleList() {
        return grabRuleDao.findAll();
    }
}
