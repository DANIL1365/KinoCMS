package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);

    @Query(value = "SELECT COUNT(id) FROM user", nativeQuery = true)
    Long getCountUser();

    User findByActivationCode(String code);
}
