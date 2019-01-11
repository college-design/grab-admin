package org.design.grabadmin.dao;

import org.design.grabadmin.entity.MatchData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchDataDao extends JpaRepository<MatchData,Integer> {
}
