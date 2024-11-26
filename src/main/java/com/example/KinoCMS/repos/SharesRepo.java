package com.example.KinoCMS.repos;

import com.example.KinoCMS.domain.Shares;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//
@Repository
public interface SharesRepo extends CrudRepository<Shares, Long> {

    @Query(value = "SELECT COUNT(id) FROM shares", nativeQuery = true)
    Long getCountShares();
}
