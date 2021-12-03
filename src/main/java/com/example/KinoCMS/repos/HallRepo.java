package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.Hall;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HallRepo extends CrudRepository<Hall, Long> {
    List<Hall> findByHallNumber(String hallNumber);
}
