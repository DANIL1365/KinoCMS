package com.example.KinoCMS.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="soon_films")
public class SoonFilms implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "name_cinema")
    private String nameSoonCinema;
    private String description;
    @Column(name = "main_soon_picture")
    private String mainSoonPicture;
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
    @Column(name = "trailer_link")
    private String trailerLink;
    @Column(name = "type_cinema")
    private String typeCinema;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id")
//    private User soonAuthor;

    public SoonFilms() {
    }

    public SoonFilms(String nameSoonCinema, String description, String trailerLink, String typeCinema, User user) {
        this.nameSoonCinema = nameSoonCinema;
        this.description = description;
        this.trailerLink = trailerLink;
        this.typeCinema = typeCinema;
//        this.soonAuthor = user;
    }

    public SoonFilms(Long id, String nameSoonCinema, String description, String trailerLink, String typeCinema, User user) {
        this.id = id;
        this.nameSoonCinema = nameSoonCinema;
        this.description = description;
        this.trailerLink = trailerLink;
        this.typeCinema = typeCinema;
    }

    //    public String getAuthorName() {
//        return soonAuthor != null ? soonAuthor.getUsername() : "<none>";
//    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSoonCinema() {
        return nameSoonCinema;
    }

    public void setNameSoonCinema(String nameSoonCinema) {
        this.nameSoonCinema = nameSoonCinema;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainSoonPicture() {
        return mainSoonPicture;
    }

    public void setMainSoonPicture(String mainSoonPicture) {
        this.mainSoonPicture = mainSoonPicture;
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

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getTypeCinema() {
        return typeCinema;
    }

    public void setTypeCinema(String typeCinema) {
        this.typeCinema = typeCinema;
    }

//    public User getSoonAuthor() {
//        return soonAuthor;
//    }
//
//    public void setSoonAuthor(User soonAuthor) {
//        this.soonAuthor = soonAuthor;
//    }

}
