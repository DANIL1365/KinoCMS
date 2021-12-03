package com.example.KinoCMS.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="news")
public class News {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "name_news")
    private String nameNews;
    @Column(name = "date_public")
    private LocalDate publicationDate;
    @Column(name = "description")
    private String description;
    @Column(name = "main_news_picture")
    private String mainNewsPicture;
    @Column(name = "picture_gallery_one")
    private String pictureNewsGalleryOne;
    @Column(name = "picture_gallery_two")
    private String pictureNewsGalleryTwo;
    @Column(name = "picture_gallery_three")
    private String pictureNewsGalleryThree;
    @Column(name = "picture_gallery_four")
    private String pictureNewsGalleryFour;
    @Column(name = "picture_gallery_five")
    private String pictureNewsGalleryFive;
    @Column(name = "video_link")
    private String videoLink;

    public News() {
    }

    public News(Long id, String nameNews, LocalDate publicationDate, String description, String videoLink) {
        this.id = id;
        this.nameNews = nameNews;
        this.publicationDate = publicationDate;
        this.description = description;
        this.videoLink = videoLink;
    }

    public News(String nameNews, LocalDate publicationDate, String description, String videoLink) {
        this.nameNews = nameNews;
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

    public String getNameNews() {
        return nameNews;
    }

    public void setNameNews(String nameNews) {
        this.nameNews = nameNews;
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

    public String getMainNewsPicture() {
        return mainNewsPicture;
    }

    public void setMainNewsPicture(String mainNewsPicture) {
        this.mainNewsPicture = mainNewsPicture;
    }

    public String getPictureNewsGalleryOne() {
        return pictureNewsGalleryOne;
    }

    public void setPictureNewsGalleryOne(String pictureNewsGalleryOne) {
        this.pictureNewsGalleryOne = pictureNewsGalleryOne;
    }

    public String getPictureNewsGalleryTwo() {
        return pictureNewsGalleryTwo;
    }

    public void setPictureNewsGalleryTwo(String pictureNewsGalleryTwo) {
        this.pictureNewsGalleryTwo = pictureNewsGalleryTwo;
    }

    public String getPictureNewsGalleryThree() {
        return pictureNewsGalleryThree;
    }

    public void setPictureNewsGalleryThree(String pictureNewsGalleryThree) {
        this.pictureNewsGalleryThree = pictureNewsGalleryThree;
    }

    public String getPictureNewsGalleryFour() {
        return pictureNewsGalleryFour;
    }

    public void setPictureNewsGalleryFour(String pictureNewsGalleryFour) {
        this.pictureNewsGalleryFour = pictureNewsGalleryFour;
    }

    public String getPictureNewsGalleryFive() {
        return pictureNewsGalleryFive;
    }

    public void setPictureNewsGalleryFive(String pictureNewsGalleryFive) {
        this.pictureNewsGalleryFive = pictureNewsGalleryFive;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
