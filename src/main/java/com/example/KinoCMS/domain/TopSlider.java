package com.example.KinoCMS.domain;

import javax.persistence.*;
//
@Entity
@Table(name ="top_slider")
public class TopSlider {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "first_image")
    private String firstTopImage;
    @Column(name = "second_image")
    private String secondTopImage;
    @Column(name = "third_image")
    private String thirdTopImage;
    @Column(name = "fourth_image")
    private String fourthTopImage;
    @Column(name = "fifth_image")
    private String fifthTopImage;

    public TopSlider() {
    }

    public TopSlider(String firstTopImage, String secondTopImage, String thirdTopImage, String fourthTopImage, String fifthTopImage) {
        this.firstTopImage = firstTopImage;
        this.secondTopImage = secondTopImage;
        this.thirdTopImage = thirdTopImage;
        this.fourthTopImage = fourthTopImage;
        this.fifthTopImage = fifthTopImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstTopImage() {
        return firstTopImage;
    }

    public void setFirstTopImage(String firstTopImage) {
        this.firstTopImage = firstTopImage;
    }

    public String getSecondTopImage() {
        return secondTopImage;
    }

    public void setSecondTopImage(String secondTopImage) {
        this.secondTopImage = secondTopImage;
    }

    public String getThirdTopImage() {
        return thirdTopImage;
    }

    public void setThirdTopImage(String thirdTopImage) {
        this.thirdTopImage = thirdTopImage;
    }

    public String getFourthTopImage() {
        return fourthTopImage;
    }

    public void setFourthTopImage(String fourthTopImage) {
        this.fourthTopImage = fourthTopImage;
    }

    public String getFifthTopImage() {
        return fifthTopImage;
    }

    public void setFifthTopImage(String fifthTopImage) {
        this.fifthTopImage = fifthTopImage;
    }
}
