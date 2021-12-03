package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.News;

import java.util.List;

public interface FilmsService {

    void createCurrentFilm(CurrentFilms currentFilms);

    void updateCurrentFilm(CurrentFilms currentFilms);

    void deleteCurrentFilmById(Long id);

    CurrentFilms getCurrentFilmById(Long id);

    Iterable<CurrentFilms> getAllCurrentFilms();

    Long getCountCurrentFilms();

    List<CurrentFilms> findByNameCinema(String nameCinema);
}
