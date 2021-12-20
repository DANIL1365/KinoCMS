package com.example.KinoCMS.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="mainPage")
public class MainPage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "number_one")
    private String numberOne;
    @Column(name = "number_two")
    private String numberTwo;
    @Column(name = "seo_text")
    private String seoText;
    @Column(name = "date_creation")
    private LocalDate dateMainCreation;

    public MainPage() {
    }

    public MainPage(Long id, String numberOne, String numberTwo, String seoText, LocalDate dateMainCreation) {
        this.id = id;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.seoText = seoText;
        this.dateMainCreation = dateMainCreation;
    }

    public MainPage(String numberOne, String numberTwo, String seoText, LocalDate dateMainCreation) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.seoText = seoText;
        this.dateMainCreation = dateMainCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(String numberOne) {
        this.numberOne = numberOne;
    }

    public String getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(String numberTwo) {
        this.numberTwo = numberTwo;
    }

    public String getSeoText() {
        return seoText;
    }

    public void setSeoText(String seoText) {
        this.seoText = seoText;
    }

    public LocalDate getDateMainCreation() {
        return dateMainCreation;
    }

    public void setDateMainCreation(LocalDate dateMainCreation) {
        this.dateMainCreation = dateMainCreation;
    }
}
