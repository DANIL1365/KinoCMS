package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.PagePages;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PagePagesRepo extends CrudRepository <PagePages, Long> {

    @Query(value = "SELECT COUNT(id) FROM page_pages", nativeQuery = true)
    Long getCountPagePages();
}
