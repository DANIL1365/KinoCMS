package com.example.KinoCMS.domain;

import javax.persistence.*;

@Entity
@Table(name ="contact_page")
public class ContactPage {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "name_cinema")
    private String nameCinema;
    @Column(name = "address")
    private String address;
    @Column(name = "date_creation")
    private String dateCreation;
    @Column(name = "map_coordinates")
    private String mapCoordinates;
    @Column(name = "contact_logo")
    private String contactLogo;

    public ContactPage() {
    }

    public ContactPage(Long id, String nameCinema, String address, String dateCreation, String mapCoordinates, String contactLogo) {
        this.id = id;
        this.nameCinema = nameCinema;
        this.address = address;
        this.dateCreation = dateCreation;
        this.mapCoordinates = mapCoordinates;
        this.contactLogo = contactLogo;
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

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
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
}
