package org.design.grabadmin.entity;

import javax.persistence.*;

@Table(name = "match_data")
@Entity
public class MatchData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private Integer webSiteId;
    @Column(nullable = false)
    private Integer grabRuleId;
    @Column(nullable = false)
    private String data;

    public MatchData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(Integer webSiteId) {
        this.webSiteId = webSiteId;
    }

    public Integer getGrabRuleId() {
        return grabRuleId;
    }

    public void setGrabRuleId(Integer grabRuleId) {
        this.grabRuleId = grabRuleId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
