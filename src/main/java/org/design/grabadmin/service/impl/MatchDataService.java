package org.design.grabadmin.service.impl;

import org.design.grabadmin.dao.MatchDataDao;
import org.design.grabadmin.entity.MatchData;
import org.design.grabadmin.service.IMatchDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchDataService implements IMatchDataService {

    @Autowired
    private MatchDataDao matchDataDao;

    @Override
    public List<MatchData> getAllMatchDataList() {
        return matchDataDao.findAll();
    }
}
