package com.example.KinoCMS.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name ="hall")
public class Hall {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotBlank(message = " Hall number cannot be empty")
    @Column(name = "hall_number")
    private String hallNumber;
    @NotBlank(message = " Description cannot be empty")
    @Column(name = "hall_description")
    private String hallDescription;
    @Column(name = "hall_layout")
    private String hallLayout;
    @Column(name = "top_banner")
    private String topBanner;
    @Column(name = "picture_Hallgallery_one")
    private String pictureHallGalleryOne;
    @Column(name = "picture_Hallgallery_two")
    private String pictureHallGalleryTwo;
    @Column(name = "picture_Hallgallery_three")
    private String pictureHallGalleryThree;
    @Column(name = "picture_Hallgallery_four")
    private String pictureHallGalleryFour;
    @Column(name = "picture_Hallgallery_five")
    private String pictureHallGalleryFive;
    @NotNull(message = "Date may not be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_creation")
    private LocalDate dateCreation;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "cinemas_id")
//    private Cinemas cinemasHalls;

    public Hall() {
    }

    public Hall(Long id, String hallNumber, String hallDescription, LocalDate dateCreation) {
        this.id = id;
        this.hallNumber = hallNumber;
        this.hallDescription = hallDescription;
        this.dateCreation = dateCreation;
    }

    public Hall(String hallNumber, String hallDescription, LocalDate dateCreation) {
        this.hallNumber = hallNumber;
        this.hallDescription = hallDescription;
        this.dateCreation = dateCreation;
//        this.cinemasHalls = cinemas;
    }

//    public String getCinemasName() {
//        return cinemasHalls != null ? cinemasHalls.getNameCinema() : "<none>";
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(String hallNumber) {
        this.hallNumber = hallNumber;
    }

    public String getHallDescription() {
        return hallDescription;
    }

    public void setHallDescription(String hallDescription) {
        this.hallDescription = hallDescription;
    }

    public String getHallLayout() {
        return hallLayout;
    }

    public void setHallLayout(String hallLayout) {
        this.hallLayout = hallLayout;
    }

    public String getTopBanner() {
        return topBanner;
    }

    public void setTopBanner(String topBanner) {
        this.topBanner = topBanner;
    }

    public String getPictureHallGalleryOne() {
        return pictureHallGalleryOne;
    }

    public void setPictureHallGalleryOne(String pictureHallGalleryOne) {
        this.pictureHallGalleryOne = pictureHallGalleryOne;
    }

    public String getPictureHallGalleryTwo() {
        return pictureHallGalleryTwo;
    }

    public void setPictureHallGalleryTwo(String pictureHallGalleryTwo) {
        this.pictureHallGalleryTwo = pictureHallGalleryTwo;
    }

    public String getPictureHallGalleryThree() {
        return pictureHallGalleryThree;
    }

    public void setPictureHallGalleryThree(String pictureHallGalleryThree) {
        this.pictureHallGalleryThree = pictureHallGalleryThree;
    }

    public String getPictureHallGalleryFour() {
        return pictureHallGalleryFour;
    }

    public void setPictureHallGalleryFour(String pictureHallGalleryFour) {
        this.pictureHallGalleryFour = pictureHallGalleryFour;
    }

    public String getPictureHallGalleryFive() {
        return pictureHallGalleryFive;
    }

    public void setPictureHallGalleryFive(String pictureHallGalleryFive) {
        this.pictureHallGalleryFive = pictureHallGalleryFive;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

//    public Cinemas getCinemasHalls() {
//        return cinemasHalls;
//    }
//
//    public void setCinemasHalls(Cinemas cinemasHalls) {
//        this.cinemasHalls = cinemasHalls;
//    }
}
