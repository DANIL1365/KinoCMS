package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.CurrentFilms;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
//
public interface FilmsRepo extends CrudRepository<CurrentFilms, Long> {
     List<CurrentFilms> findByNameCinema(String nameCinema);

     @Query(value = "SELECT COUNT(id) FROM current_films", nativeQuery = true)
     Long getCountCurrentFilms();
}
