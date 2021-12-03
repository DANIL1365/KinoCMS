package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepo extends CrudRepository<User, Long> {
     List<User> findByName(String name);

}
