package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.MainImageBanner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//
public interface MainBannerRepo extends CrudRepository<MainImageBanner, Long> {

    @Query(value = "SELECT COUNT(id) FROM main_banner", nativeQuery = true)
    Long getCountMainBanner();
}
