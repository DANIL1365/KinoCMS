package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.MainImageBanner;
import com.example.KinoCMS.domain.News;

public interface MainBannerService {

    void createBanner(MainImageBanner mainImageBanner);

    void deleteMainBannerById(Long id);

    Iterable<MainImageBanner> getAllBanners();

    Long getCountMainBanner();
}
