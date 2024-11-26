package com.example.KinoCMS.repos;


import com.example.KinoCMS.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//
@Repository
public interface NewsRepo extends CrudRepository<News, Long> {
    List<News> findByNameNews(String nameNews);

    @Query(value = "SELECT COUNT(id) FROM news", nativeQuery = true)
    Long getCountNews();
}
