package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.Cinemas;
import com.example.KinoCMS.repos.CinemasRepo;
import com.example.KinoCMS.service.CinemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemasServiceImpl implements CinemasService {

    @Autowired
    CinemasRepo cinemasRepo;


    @Override
    public void createCinemas(Cinemas cinemas) {
        cinemasRepo.save(cinemas);
    }

    @Override
    public void updateCinemas(Cinemas cinemas) {
        cinemasRepo.save(cinemas);
    }

    @Override
    public void deleteCinemasById(Long id) {
        cinemasRepo.deleteById(id);
    }

    @Override
    public Cinemas getCinemasById(Long id) {
        return cinemasRepo.findById(id).orElse(null);
    }

    @Override
    public Iterable<Cinemas> getAllCinemas() {
        return cinemasRepo.findAll();
    }

    @Override
    public Long getCountCinemas() {
        return cinemasRepo.getCountCinemas();
    }

    @Override
    public List<Cinemas> findByNameCinema(String nameCinema) {
        return cinemasRepo.findByNameCinema(nameCinema);
    }
}
