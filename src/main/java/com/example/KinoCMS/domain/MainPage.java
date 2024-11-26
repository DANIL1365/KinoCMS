package com.example.KinoCMS.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
//
@Entity
@Table(name ="mainPage")
public class MainPage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "number_one")
    @NotBlank(message = "Number one cannot be empty")
    private String numberOne;
    @Column(name = "number_two")
    @NotBlank(message = "Number two cannot be empty")
    private String numberTwo;
    @Column(name = "seo_text")
    @NotBlank(message = "SEO text cannot be empty")
    private String seoText;
    @Column(name = "date_creation")
    @NotNull(message = "Date may not be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateMainCreation;
    @Column(name = "on_of")
    private Boolean onOf;

    public MainPage() {
    }

    public MainPage(String numberOne, String numberTwo, String seoText, LocalDate dateMainCreation) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.seoText = seoText;
        this.dateMainCreation = dateMainCreation;
    }

    public MainPage(Long id, String numberOne, String numberTwo, String seoText, LocalDate dateMainCreation, Boolean onOf) {
        this.id = id;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.seoText = seoText;
        this.dateMainCreation = dateMainCreation;
        this.onOf = onOf;
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

    public Boolean getOnOf() {
        return onOf;
    }

    public void setOnOf(Boolean onOf) {
        this.onOf = onOf;
    }

    @Override
    public String toString() {
        return "MainPage{" +
                "id=" + id +
                ", numberOne='" + numberOne + '\'' +
                ", numberTwo='" + numberTwo + '\'' +
                ", seoText='" + seoText + '\'' +
                ", dateMainCreation=" + dateMainCreation +
                ", onOf=" + onOf +
                '}';
    }
}
