package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.repos.FilmsRepo;
import com.example.KinoCMS.service.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    @Autowired
    FilmsRepo filmsRepo;

    @Override
    public void createCurrentFilm(CurrentFilms currentFilms) {
        filmsRepo.save(currentFilms);
    }

    @Override
    public void updateCurrentFilm(CurrentFilms currentFilms) {
        filmsRepo.save(currentFilms);
    }

    @Override
    public void deleteCurrentFilmById(Long id) {
        filmsRepo.deleteById(id);
    }

    @Override
    public CurrentFilms getCurrentFilmById(Long id) {
        return filmsRepo.findById(id).orElse(null);
    }

    @Override
    public Iterable<CurrentFilms> getAllCurrentFilms() {
        return filmsRepo.findAll();
    }

    @Override
    public Long getCountCurrentFilms() {
        return filmsRepo.getCountCurrentFilms();
    }

    @Override
    public List<CurrentFilms> findByNameCinema(String nameCinema) {
        return filmsRepo.findByNameCinema(nameCinema);
    }
}
