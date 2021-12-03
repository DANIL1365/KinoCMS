package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.SoonFilms;
import com.example.KinoCMS.repos.SoonFilmsRepo;
import com.example.KinoCMS.service.SoonFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoonFilmsServiceImpl implements SoonFilmsService {

    @Autowired
    SoonFilmsRepo soonFilmsRepo;

    @Override
    public void createSoonFilm(SoonFilms soonFilms) {
        soonFilmsRepo.save(soonFilms);
    }

    @Override
    public void updateSoonFilm(SoonFilms soonFilms) {
        soonFilmsRepo.save(soonFilms);
    }

    @Override
    public void deleteSoonFilmById(Long id) {
        soonFilmsRepo.deleteById(id);
    }

    @Override
    public SoonFilms getSoonFilmById(Long id) {
        return soonFilmsRepo.findById(id).orElse(null);
    }

    @Override
    public Iterable<SoonFilms> getAllSoonFilms() {
        return soonFilmsRepo.findAll();
    }

    @Override
    public Long getCountSoonFilms() {
        return soonFilmsRepo.getCountSoonFilms();
    }

    @Override
    public List<SoonFilms> findByNameSoonCinema(String nameSoonCinema) {
        return soonFilmsRepo.findByNameSoonCinema(nameSoonCinema);
    }
}
