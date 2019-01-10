package org.design.grabadmin.dao;

import org.design.grabadmin.entity.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSiteDao extends JpaRepository<WebSite,Integer> {
}
