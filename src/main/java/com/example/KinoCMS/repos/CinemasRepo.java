package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.Cinemas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CinemasRepo extends CrudRepository<Cinemas, Long> {
    List<Cinemas> findByNameCinema(String nameCinema);

    @Query(value = "SELECT COUNT(id) FROM cinemas", nativeQuery = true)
    Long getCountCinemas();
}
