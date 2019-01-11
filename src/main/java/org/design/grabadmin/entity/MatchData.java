package org.design.grabadmin.entity;

import javax.persistence.*;

@Table(name = "match_data")
@Entity
public class MatchData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String data;

    @Column(nullable = false)
    private Integer grabRuleId;

//    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
//    @JoinColumn(name="grab_rule_id")
//    private GrabRule grabRule;

    public MatchData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getGrabRuleId() {
        return grabRuleId;
    }

    public void setGrabRuleId(Integer grabRuleId) {
        this.grabRuleId = grabRuleId;
    }

    //    public GrabRule getGrabRule() {
//        return grabRule;
//    }
//
//    public void setGrabRule(GrabRule grabRule) {
//        this.grabRule = grabRule;
//    }
}
