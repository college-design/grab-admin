package org.design.grabadmin.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "web_site")
@Entity
public class WebSite {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "webSite",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<GrabRule> grabRuleList;

    @Column(nullable = false)
    private Integer status;

    public WebSite() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<GrabRule> getGrabRuleList() {
        return grabRuleList;
    }

    public void setGrabRuleList(List<GrabRule> grabRuleList) {
        this.grabRuleList = grabRuleList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
