package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.ContactPage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ContactPageRepo extends CrudRepository<ContactPage, Long> {

    @Query(value = "SELECT COUNT(id) FROM contact_page", nativeQuery = true)
    Long getCountContactPage();
}
