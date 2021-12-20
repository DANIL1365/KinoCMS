package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.MainImageBanner;
import com.example.KinoCMS.domain.SoonFilms;
import com.example.KinoCMS.service.FilmsService;
import com.example.KinoCMS.service.MainBannerService;
import com.example.KinoCMS.service.SoonFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserPartController {

    @Autowired
    private FilmsService filmsService;

    @Autowired
    private SoonFilmsService soonFilmsService;

    @Autowired
    MainBannerService mainBannerService;


//    @GetMapping("/userPart")
//    public String userPart (Model model){
//
//        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();
//
//        model.addAttribute("mainImageBanners", mainImageBanners);
//
//        return "userPartMain";
//    }

    @GetMapping("/userPartMain")
    public String userPartMain (Model model){
        Iterable<CurrentFilms> userFilms = filmsService.getAllCurrentFilms();

        model.addAttribute("userFilms", userFilms);

        Iterable<SoonFilms> soonFilmsUser = soonFilmsService.getAllSoonFilms();

        model.addAttribute("soonFilmsUser", soonFilmsUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        return "userPartMain";
    }
}
