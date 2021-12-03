package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.SoonFilms;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SoonFilmsRepo extends CrudRepository<SoonFilms, Long> {
    List<SoonFilms> findByNameSoonCinema(String nameSoonCinema);

    @Query(value = "SELECT COUNT(id) FROM soon_films", nativeQuery = true)
    Long getCountSoonFilms();

}
