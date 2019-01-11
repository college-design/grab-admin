package org.design.grabadmin.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "grap_rule")
@Entity
public class GrabRule {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String rule;

    @Column
    private String description;

    @Column(nullable = false)
    private Integer status;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @JoinColumn(name="web_site_id")
    private WebSite webSite;

//    @OneToMany(mappedBy = "grapRule",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//    private List<MatchData> matchData;

    public GrabRule() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public WebSite getWebSite() {
        return webSite;
    }

    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
    }

//    public List<MatchData> getMatchData() {
//        return matchData;
//    }
//
//    public void setMatchData(List<MatchData> matchData) {
//        this.matchData = matchData;
//    }
}
