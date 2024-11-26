package com.example.KinoCMS.domain;

import javax.persistence.*;
//
@Entity
@Table(name ="main_banner")
public class MainImageBanner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "picture_banner")
    private String pictureBanner;

    public MainImageBanner() {
    }

    public MainImageBanner(String pictureBanner) {
        this.pictureBanner = pictureBanner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPictureBanner() {
        return pictureBanner;
    }

    public void setPictureBanner(String pictureBanner) {
        this.pictureBanner = pictureBanner;
    }
}
