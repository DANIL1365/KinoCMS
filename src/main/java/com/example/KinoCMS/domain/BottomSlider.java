package com.example.KinoCMS.domain;

import javax.persistence.*;

@Entity
@Table(name ="bottom_slider")
public class BottomSlider {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "first_image")
    private String firstImage;
    @Column(name = "second_image")
    private String secondImage;
    @Column(name = "third_image")
    private String thirdImage;
    @Column(name = "fourth_image")
    private String fourthImage;
    @Column(name = "fifth_image")
    private String fifthImage;

    public BottomSlider() {
    }

    public BottomSlider(String firstImage, String secondImage, String thirdImage, String fourthImage, String fifthImage) {
        this.firstImage = firstImage;
        this.secondImage = secondImage;
        this.thirdImage = thirdImage;
        this.fourthImage = fourthImage;
        this.fifthImage = fifthImage;
    }
//
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public String getSecondImage() {
        return secondImage;
    }

    public void setSecondImage(String secondImage) {
        this.secondImage = secondImage;
    }

    public String getThirdImage() {
        return thirdImage;
    }

    public void setThirdImage(String thirdImage) {
        this.thirdImage = thirdImage;
    }

    public String getFourthImage() {
        return fourthImage;
    }

    public void setFourthImage(String fourthImage) {
        this.fourthImage = fourthImage;
    }

    public String getFifthImage() {
        return fifthImage;
    }

    public void setFifthImage(String fifthImage) {
        this.fifthImage = fifthImage;
    }
}
