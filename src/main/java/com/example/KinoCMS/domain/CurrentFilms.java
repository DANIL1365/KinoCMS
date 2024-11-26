package com.example.KinoCMS.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
//
@Entity
@Table(name ="current_films")

public class CurrentFilms implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotBlank(message = " Name cinema cannot be empty")
    @Column(name = "name_cinema")
    private String nameCinema;
    @NotBlank(message = " Description cannot be empty")
    @Length(max = 800, message = "Text too long")
    private String description;
    @Column(name = "main_picture")
    private String mainPicture;
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


    public CurrentFilms() {
    }

    public CurrentFilms(String nameCinema, String description, String trailerLink, String typeCinema) {
        this.nameCinema = nameCinema;
        this.description = description;
        this.trailerLink = trailerLink;
        this.typeCinema = typeCinema;
    }

    public CurrentFilms(Long id, String nameCinema, String description, String trailerLink, String typeCinema) {
        this.id = id;
        this.nameCinema = nameCinema;
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

    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
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


    @Override
    public String toString() {
        return "CurrentFilms{" +
                "id=" + id +
                ", nameCinema='" + nameCinema + '\'' +
                ", description='" + description + '\'' +
                ", mainPicture='" + mainPicture + '\'' +
                ", pictureGalleryOne='" + pictureGalleryOne + '\'' +
                ", pictureGalleryTwo='" + pictureGalleryTwo + '\'' +
                ", pictureGalleryThree='" + pictureGalleryThree + '\'' +
                ", pictureGalleryFour='" + pictureGalleryFour + '\'' +
                ", pictureGalleryFive='" + pictureGalleryFive + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", typeCinema='" + typeCinema + '\'' +
                '}';
    }
}
