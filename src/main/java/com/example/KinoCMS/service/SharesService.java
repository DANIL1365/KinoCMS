package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.Shares;
import org.springframework.stereotype.Service;

//
public interface SharesService {

    void createShares(Shares shares);

    void updateShares(Shares shares);

    void deleteSharesById(Long id);

    Shares getSharesById(Long id);

    Iterable<Shares> getAllShares();

    Long getCountShares();
}
