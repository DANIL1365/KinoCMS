package com.example.KinoCMS.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
//
@Entity
@Table(name ="soon_films")
public class SoonFilms implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotBlank(message = " Name cinema cannot be empty")
    @Column(name = "name_cinema")
    private String nameSoonCinema;
    @NotBlank(message = " Description cannot be empty")
    @Length(max = 800, message = "Text too long")
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
    @NotBlank(message = "Video cannot be empty")
    private String trailerLink;
    @Column(name = "type_cinema")
    @NotBlank(message = "Type cannot be empty")
    private String typeCinema;

    public SoonFilms() {
    }

    public SoonFilms(String nameSoonCinema, String description, String trailerLink, String typeCinema) {
        this.nameSoonCinema = nameSoonCinema;
        this.description = description;
        this.trailerLink = trailerLink;
        this.typeCinema = typeCinema;
    }

    public SoonFilms(Long id, String nameSoonCinema, String description, String trailerLink, String typeCinema) {
        this.id = id;
        this.nameSoonCinema = nameSoonCinema;
        this.description = description;
        this.trailerLink = trailerLink;
        this.typeCinema = typeCinema;
    }


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


}
