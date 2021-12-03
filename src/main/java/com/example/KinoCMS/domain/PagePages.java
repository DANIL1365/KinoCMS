package com.example.KinoCMS.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="page_pages")
public class PagePages {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "name_page")
    private String namePage;
    private String description;
    @Column(name = "date_creation")
    private LocalDate dateCreation;
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

    public PagePages(String namePage, String description, LocalDate dateCreation, String pagePicture, String pictureGalleryOne, String pictureGalleryTwo, String pictureGalleryThree, String pictureGalleryFour, String pictureGalleryFive) {
        this.namePage = namePage;
        this.description = description;
        this.dateCreation = dateCreation;
        this.pagePicture = pagePicture;
        this.pictureGalleryOne = pictureGalleryOne;
        this.pictureGalleryTwo = pictureGalleryTwo;
        this.pictureGalleryThree = pictureGalleryThree;
        this.pictureGalleryFour = pictureGalleryFour;
        this.pictureGalleryFive = pictureGalleryFive;
    }

    public PagePages(String namePage, String description, LocalDate dateCreation) {
        this.namePage = namePage;
        this.description = description;
        this.dateCreation = dateCreation;
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
}
