package org.design.grabadmin.dao;

import org.design.grabadmin.entity.GrabRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrabRuleDao extends JpaRepository<GrabRule,Integer> {
}
