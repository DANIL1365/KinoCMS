package com.example.KinoCMS.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
//
@Entity
@Table(name ="shares")
public class Shares {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "name_shares")
    @NotBlank(message = "Name page cannot be empty")
    private String nameShares;
    @Column(name = "public_date")
    @NotNull(message = "Date may not be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publicationDate;
    @NotBlank(message = "Description cannot be empty")
    private String description;
    @Column(name = "main_shares_picture")
    private String mainSharesPicture;
    @Column(name = "picture_gallery_one")
    private String pictureSharesGalleryOne;
    @Column(name = "picture_gallery_two")
    private String pictureSharesGalleryTwo;
    @Column(name = "picture_gallery_three")
    private String pictureSharesGalleryThree;
    @Column(name = "picture_gallery_four")
    private String pictureSharesGalleryFour;
    @Column(name = "picture_gallery_five")
    private String pictureSharesGalleryFive;
    @Column(name = "video_link")
    @NotBlank(message = "Video cannot be empty")
    private String videoLink;

    public Shares() {
    }

    public Shares(String nameShares, LocalDate publicationDate, String description, String videoLink) {
        this.nameShares = nameShares;
        this.publicationDate = publicationDate;
        this.description = description;
        this.videoLink = videoLink;
    }

    public Shares(Long id, String nameShares, LocalDate publicationDate, String description, String videoLink) {
        this.id = id;
        this.nameShares = nameShares;
        this.publicationDate = publicationDate;
        this.description = description;
        this.videoLink = videoLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameShares() {
        return nameShares;
    }

    public void setNameShares(String nameShares) {
        this.nameShares = nameShares;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainSharesPicture() {
        return mainSharesPicture;
    }

    public void setMainSharesPicture(String mainSharesPicture) {
        this.mainSharesPicture = mainSharesPicture;
    }

    public String getPictureSharesGalleryOne() {
        return pictureSharesGalleryOne;
    }

    public void setPictureSharesGalleryOne(String pictureSharesGalleryOne) {
        this.pictureSharesGalleryOne = pictureSharesGalleryOne;
    }

    public String getPictureSharesGalleryTwo() {
        return pictureSharesGalleryTwo;
    }

    public void setPictureSharesGalleryTwo(String pictureSharesGalleryTwo) {
        this.pictureSharesGalleryTwo = pictureSharesGalleryTwo;
    }

    public String getPictureSharesGalleryThree() {
        return pictureSharesGalleryThree;
    }

    public void setPictureSharesGalleryThree(String pictureSharesGalleryThree) {
        this.pictureSharesGalleryThree = pictureSharesGalleryThree;
    }

    public String getPictureSharesGalleryFour() {
        return pictureSharesGalleryFour;
    }

    public void setPictureSharesGalleryFour(String pictureSharesGalleryFour) {
        this.pictureSharesGalleryFour = pictureSharesGalleryFour;
    }

    public String getPictureSharesGalleryFive() {
        return pictureSharesGalleryFive;
    }

    public void setPictureSharesGalleryFive(String pictureSharesGalleryFive) {
        this.pictureSharesGalleryFive = pictureSharesGalleryFive;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    @Override
    public String toString() {
        return "Shares{" +
                "id=" + id +
                ", nameShares='" + nameShares + '\'' +
                ", publicationDate=" + publicationDate +
                ", description='" + description + '\'' +
                ", mainSharesPicture='" + mainSharesPicture + '\'' +
                ", pictureSharesGalleryOne='" + pictureSharesGalleryOne + '\'' +
                ", pictureSharesGalleryTwo='" + pictureSharesGalleryTwo + '\'' +
                ", pictureSharesGalleryThree='" + pictureSharesGalleryThree + '\'' +
                ", pictureSharesGalleryFour='" + pictureSharesGalleryFour + '\'' +
                ", pictureSharesGalleryFive='" + pictureSharesGalleryFive + '\'' +
                ", videoLink='" + videoLink + '\'' +
                '}';
    }
}
