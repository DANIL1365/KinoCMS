package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.Cinemas;
import com.example.KinoCMS.domain.News;

import java.util.List;

public interface CinemasService {
    void createCinemas(Cinemas cinemas);

    void updateCinemas(Cinemas cinemas);

    void deleteCinemasById(Long id);

    Cinemas getCinemasById(Long id);

    Iterable<Cinemas> getAllCinemas();

    Long getCountCinemas();

    List<Cinemas> findByNameCinema(String nameCinema);
}
