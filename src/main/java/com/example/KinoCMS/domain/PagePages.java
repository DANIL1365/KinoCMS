package com.example.KinoCMS.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
//
@Entity
@Table(name ="page_pages")
public class PagePages {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "name_page")
    @NotBlank(message = "Name page cannot be empty")
    private String namePage;
    @NotBlank(message = "Description cannot be empty")
    private String description;
    @Column(name = "date_creation")
    @NotNull(message = "Date may not be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateCreation;
    @Column(name = "on_of")
    private Boolean onOf;

    @Column(name = "page_picture")
    private String pagePicture;
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

    public PagePages() {
    }


    public PagePages(String namePage, String description, LocalDate dateCreation, Boolean onOf) {
        this.namePage = namePage;
        this.description = description;
        this.dateCreation = dateCreation;
        this.onOf = onOf;
    }

    public PagePages(Long id, String namePage, String description, LocalDate dateCreation, Boolean onOf) {
        this.id = id;
        this.namePage = namePage;
        this.description = description;
        this.dateCreation = dateCreation;
        this.onOf = onOf;
    }


    public PagePages(Long id, String namePage, String description, LocalDate dateCreation) {
        this.id = id;
        this.namePage = namePage;
        this.description = description;
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePage() {
        return namePage;
    }

    public void setNamePage(String namePage) {
        this.namePage = namePage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getPagePicture() {
        return pagePicture;
    }

    public void setPagePicture(String pagePicture) {
        this.pagePicture = pagePicture;
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

    public Boolean getOnOf() {
        return onOf;
    }

    public void setOnOf(Boolean onOf) {
        this.onOf = onOf;
    }

    @Override
    public String toString() {
        return "PagePages{" +
                "id=" + id +
                ", namePage='" + namePage + '\'' +
                ", description='" + description + '\'' +
                ", dateCreation=" + dateCreation +
                ", pagePicture='" + pagePicture + '\'' +
                ", pictureGalleryOne='" + pictureGalleryOne + '\'' +
                ", pictureGalleryTwo='" + pictureGalleryTwo + '\'' +
                ", pictureGalleryThree='" + pictureGalleryThree + '\'' +
                ", pictureGalleryFour='" + pictureGalleryFour + '\'' +
                ", pictureGalleryFive='" + pictureGalleryFive + '\'' +
                ", onOf=" + onOf +
                '}';
    }
}
