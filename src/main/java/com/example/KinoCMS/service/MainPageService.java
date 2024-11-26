package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.MainPage;
//
public interface MainPageService {

    void createMainPage(MainPage mainPage);

    void updateMainPage(MainPage mainPage);

    void deleteMainPageById(Long id);

    Iterable<MainPage> getAllMainPages();

    MainPage getMainPageById(Long id);

    Long getCountMainPage();
}
