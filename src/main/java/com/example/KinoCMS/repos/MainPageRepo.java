package com.example.KinoCMS.repos;


import com.example.KinoCMS.domain.MainPage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//
public interface MainPageRepo extends CrudRepository<MainPage, Long> {

    @Query(value = "SELECT COUNT(id) FROM main_page", nativeQuery = true)
    Long getCountMainPage();
}
