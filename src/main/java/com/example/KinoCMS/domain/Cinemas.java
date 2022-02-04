package com.example.KinoCMS.domain;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name ="cinemas")
public class Cinemas {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank(message = " Name cinema cannot be empty")
    @Column(name = "name_cinema")
    private String nameCinema;
    @NotBlank(message = " Description cannot be empty")
    @Length(max = 400, message = "Text too long")
    @Column(name = "description")
    private String descriptionCinema;
    @NotBlank(message = " Conditions cannot be empty")
    @Length(max = 400, message = "Text too long")
    @Column(name = "conditions")
    private String conditionsCinema;
    @Column(name = "logo")
    private String logo;
    @Column(name = "top_banner")
    private String topBanner;
    @Column(name = "picture_gallery_one")
    private String pictureGalleryOne;
    @Column(name = "picture_gallery_two")
    private String pictureGalleryTwo;
    @Column(name = "picture_gallery_three")
    private String pictureGalleryThree;
    @Column(name = "picture_gallery_four")
    private String pictureGalleryFour;
    @Column(name = "picture_gallery_five")
    private String pictureGalleryFive;

    public Cinemas() {
    }

    public Cinemas(String nameCinema, String descriptionCinema, String conditionsCinema) {
        this.nameCinema = nameCinema;
        this.descriptionCinema = descriptionCinema;
        this.conditionsCinema = conditionsCinema;
    }

    public Cinemas(Long id, String nameCinema, String descriptionCinema, String conditionsCinema) {
        this.id = id;
        this.nameCinema = nameCinema;
        this.descriptionCinema = descriptionCinema;
        this.conditionsCinema = conditionsCinema;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    public String getDescriptionCinema() {
        return descriptionCinema;
    }

    public void setDescriptionCinema(String descriptionCinema) {
        this.descriptionCinema = descriptionCinema;
    }

    public String getConditionsCinema() {
        return conditionsCinema;
    }

    public void setConditionsCinema(String conditionsCinema) {
        this.conditionsCinema = conditionsCinema;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTopBanner() {
        return topBanner;
    }

    public void setTopBanner(String topBanner) {
        this.topBanner = topBanner;
    }

    public String getPictureGalleryOne() {
        return pictureGalleryOne;
    }

    public void setPictureGalleryOne(String pictureGalleryOne) {
        this.pictureGalleryOne = pictureGalleryOne;
    }

    public String getPictureGalleryTwo() {
        return pictureGalleryTwo;
    }

    public void setPictureGalleryTwo(String pictureGalleryTwo) {
        this.pictureGalleryTwo = pictureGalleryTwo;
    }

    public String getPictureGalleryThree() {
        return pictureGalleryThree;
    }

    public void setPictureGalleryThree(String pictureGalleryThree) {
        this.pictureGalleryThree = pictureGalleryThree;
    }

    public String getPictureGalleryFour() {
        return pictureGalleryFour;
    }

    public void setPictureGalleryFour(String pictureGalleryFour) {
        this.pictureGalleryFour = pictureGalleryFour;
    }

    public String getPictureGalleryFive() {
        return pictureGalleryFive;
    }

    public void setPictureGalleryFive(String pictureGalleryFive) {
        this.pictureGalleryFive = pictureGalleryFive;
    }

    @Override
    public String toString() {
        return "Cinemas{" +
                "id=" + id +
                ", nameCinema='" + nameCinema + '\'' +
                ", descriptionCinema='" + descriptionCinema + '\'' +
                ", conditionsCinema='" + conditionsCinema + '\'' +
                ", logo='" + logo + '\'' +
                ", topBanner='" + topBanner + '\'' +
                ", pictureGalleryOne='" + pictureGalleryOne + '\'' +
                ", pictureGalleryTwo='" + pictureGalleryTwo + '\'' +
                ", pictureGalleryThree='" + pictureGalleryThree + '\'' +
                ", pictureGalleryFour='" + pictureGalleryFour + '\'' +
                ", pictureGalleryFive='" + pictureGalleryFive + '\'' +
                '}';
    }
}
