package com.example.KinoCMS.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name ="contact_page")
public class ContactPage {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "name_cinema")
    @NotBlank(message = "Name cannot be empty")
    private String nameCinema;
    @Column(name = "address")
    @NotBlank(message = "Address cannot be empty")
    private String address;
    @Column(name = "date_creation")
    @NotNull(message = "Date may not be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateCreation;
    @Column(name = "map_coordinates")
    private String mapCoordinates;
    @Column(name = "contact_logo")
    private String contactLogo;
    @Column(name = "on_of")
    private Boolean onOf;

    public ContactPage() {
    }

    public ContactPage(String nameCinema, String address, LocalDate dateCreation, String mapCoordinates, Boolean onOf) {
        this.nameCinema = nameCinema;
        this.address = address;
        this.dateCreation = dateCreation;
        this.onOf = onOf;
    }

    public ContactPage(Long id, String nameCinema, String address, LocalDate dateCreation, String mapCoordinates, Boolean onOf) {
        this.id = id;
        this.nameCinema = nameCinema;
        this.address = address;
        this.dateCreation = dateCreation;
        this.onOf = onOf;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getMapCoordinates() {
        return mapCoordinates;
    }

    public void setMapCoordinates(String mapCoordinates) {
        this.mapCoordinates = mapCoordinates;
    }

    public String getContactLogo() {
        return contactLogo;
    }

    public void setContactLogo(String contactLogo) {
        this.contactLogo = contactLogo;
    }

    public Boolean getOnOf() {
        return onOf;
    }

    public void setOnOf(Boolean onOf) {
        this.onOf = onOf;
    }

    @Override
    public String toString() {
        return "ContactPage{" +
                "id=" + id +
                ", nameCinema='" + nameCinema + '\'' +
                ", address='" + address + '\'' +
                ", dateCreation=" + dateCreation +
                ", mapCoordinates='" + mapCoordinates + '\'' +
                ", contactLogo='" + contactLogo + '\'' +
                ", onOf=" + onOf +
                '}';
    }
}
