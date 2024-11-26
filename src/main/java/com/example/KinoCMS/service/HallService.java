package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.Hall;
import com.example.KinoCMS.domain.News;

import java.util.List;
//
public interface HallService {

    void createHall(Hall hall);

    void updateHall(Hall hall);

    void deleteHallById(Long id);

    Hall getHallById(Long id);

    Iterable<Hall> getAllHall();

    Long getCountHall();

    List<Hall> findByHallNumber(String hallNumber);
}
