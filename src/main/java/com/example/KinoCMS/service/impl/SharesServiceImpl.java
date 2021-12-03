package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.Shares;
import com.example.KinoCMS.repos.SharesRepo;
import com.example.KinoCMS.service.SharesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SharesServiceImpl implements SharesService {

    @Autowired
    private SharesRepo sharesRepo;

    @Override
    public void createShares(Shares shares) {
        sharesRepo.save(shares);
    }

    @Override
    public void updateShares(Shares shares) {
        sharesRepo.save(shares);
    }

    @Override
    public void deleteSharesById(Long id) {
        sharesRepo.deleteById(id);
    }

    @Override
    public Shares getSharesById(Long id) {
        return sharesRepo.findById(id).orElse(null);
    }

    @Override
    public Iterable<Shares> getAllShares() {
        return sharesRepo.findAll();
    }


    @Override
    public Long getCountShares() {
        return sharesRepo.getCountShares();
    }
}
