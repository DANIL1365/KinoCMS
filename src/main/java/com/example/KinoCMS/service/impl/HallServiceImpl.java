package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.Hall;
import com.example.KinoCMS.repos.HallRepo;
import com.example.KinoCMS.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//
@Service
public class HallServiceImpl implements HallService {

    @Autowired
    HallRepo hallRepo;

    @Override
    public void createHall(Hall hall) {
        hallRepo.save(hall);
    }

    @Override
    public void updateHall(Hall hall) {
        hallRepo.save(hall);

    }

    @Override
    public void deleteHallById(Long id) {
        hallRepo.deleteById(id);

    }

    @Override
    public Hall getHallById(Long id) {
        return hallRepo.findById(id).orElse(null);
    }

    @Override
    public Iterable<Hall> getAllHall() {
        return hallRepo.findAll();
    }

    @Override
    public Long getCountHall() {
        return hallRepo.getCountHall();
    }

    @Override
    public List<Hall> findByHallNumber(String hallNumber) {
        return hallRepo.findByHallNumber(hallNumber);
    }
}
