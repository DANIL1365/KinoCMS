package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.SoonFilms;

import java.util.List;
//
public interface SoonFilmsService {

    void createSoonFilm(SoonFilms soonFilms);

    void updateSoonFilm(SoonFilms soonFilms);

    void deleteSoonFilmById(Long id);

    SoonFilms getSoonFilmById(Long id);

    Iterable<SoonFilms> getAllSoonFilms();

    Long getCountSoonFilms();

    List<SoonFilms> findByNameSoonCinema(String nameSoonCinema);
}
