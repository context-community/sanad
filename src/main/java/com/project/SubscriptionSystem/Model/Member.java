package com.project.SubscriptionSystem.Model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Member {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String fullName;
    private String phone;
    private String profession;

    @OneToMany(mappedBy = "member")
    private List<Subscription> subscription;


    public List<Subscription> getSubscription() {
        return subscription;
    }

    public Member(){

    }

    public Member(Integer id, String fullName, String phone, String profession) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.profession = profession;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public String getProfession() {
        return profession;
    }
}
