package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.MainPage;
import com.example.KinoCMS.repos.MainPageRepo;
import com.example.KinoCMS.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainPageServiceImpl implements MainPageService {

    @Autowired
    MainPageRepo mainPageRepo;

    @Override
    public void createMainPage(MainPage mainPage) {
        mainPageRepo.save(mainPage);
    }

    @Override
    public void updateMainPage(MainPage mainPage) {
        mainPageRepo.save(mainPage);
    }

    @Override
    public void deleteMainPageById(Long id) {
        mainPageRepo.deleteById(id);
    }

    @Override
    public Iterable<MainPage> getAllMainPages() {
        return mainPageRepo.findAll();
    }

    @Override
    public MainPage getMainPageById(Long id) {
        return mainPageRepo.findById(id).orElse(null);
    }

    @Override
    public Long getCountMainPage() {
        return mainPageRepo.getCountMainPage();
    }
}
