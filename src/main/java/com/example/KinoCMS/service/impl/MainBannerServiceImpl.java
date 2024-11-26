package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.MainImageBanner;
import com.example.KinoCMS.repos.MainBannerRepo;
import com.example.KinoCMS.service.MainBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
@Service
public class MainBannerServiceImpl implements MainBannerService {

    @Autowired
    MainBannerRepo mainBannerRepo;

    @Override
    public void createBanner(MainImageBanner mainImageBanner) {
        mainBannerRepo.save(mainImageBanner);
    }

    @Override
    public void deleteMainBannerById(Long id) {
        mainBannerRepo.deleteById(id);
    }

    @Override
    public Iterable<MainImageBanner> getAllBanners() {
        return mainBannerRepo.findAll();
    }

    @Override
    public Long getCountMainBanner() {
        return mainBannerRepo.getCountMainBanner();
    }
}
