package com.project.SubscriptionSystem.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private BigDecimal amount;
    private Date paymentDate;
    private int durationMonths;

    private String imageName;
    private String imageType;

    @Lob
    private byte [] imageData;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "memeber_id")
    private Member member;

    public Subscription() {

    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Integer getId() {
        return id;
    }



    public BigDecimal getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public Member getMember() {
        return member;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }




}
