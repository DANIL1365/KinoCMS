package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.repos.BottomSliderRepo;
import com.example.KinoCMS.repos.TopSliderRepo;
import com.example.KinoCMS.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserPartController {

    @Autowired
    private FilmsService filmsService;

    @Autowired
    private SoonFilmsService soonFilmsService;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    TopSliderRepo topSliderRepo;

    @Autowired
    MainPageService mainPageService;

    @Autowired
    BottomSliderRepo bottomSliderRepo;

    @Autowired
    private SharesService sharesService;

    @Autowired
    private NewsService newsService;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    private CinemasService cinemasService;

    @Autowired
    ContactPageService contactPageService;



    @GetMapping("/userPartMain")
    public String userPartMain (Model model){
        Iterable<CurrentFilms> userFilms = filmsService.getAllCurrentFilms();

        model.addAttribute("userFilms", userFilms);

        Iterable<SoonFilms> soonFilmsUser = soonFilmsService.getAllSoonFilms();

        model.addAttribute("soonFilmsUser", soonFilmsUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<TopSlider> topSliders = topSliderRepo.findAll();

        model.addAttribute("topSliders", topSliders);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.addAttribute("bottomSliders", bottomSliders);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "userPartMain";
    }

    @GetMapping("/userPoster")
    public String userPoster (Model model){
        Iterable<CurrentFilms> posterFilms = filmsService.getAllCurrentFilms();

        model.addAttribute("posterFilms", posterFilms);

        Iterable<SoonFilms> soonFilmsPoster = soonFilmsService.getAllSoonFilms();

        model.addAttribute("soonFilmsPoster", soonFilmsPoster);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<TopSlider> topSliders = topSliderRepo.findAll();

        model.addAttribute("topSliders", topSliders);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.addAttribute("bottomSliders", bottomSliders);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "userPoster";
    }

    @GetMapping("/userPosterSoon")
    public String userPosterSoon (Model model){
//        Iterable<CurrentFilms> posterFilms = filmsService.getAllCurrentFilms();
//
//        model.addAttribute("posterFilms", posterFilms);

        Iterable<SoonFilms> soonFilmsPosterSoon = soonFilmsService.getAllSoonFilms();

        model.addAttribute("soonFilmsPosterSoon", soonFilmsPosterSoon);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<TopSlider> topSliders = topSliderRepo.findAll();

        model.addAttribute("topSliders", topSliders);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.addAttribute("bottomSliders", bottomSliders);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "userPosterSoon";
    }

    @GetMapping("/userTimeTable")
    public String userTimeTable (Model model){
        Iterable<CurrentFilms> timeTableFilms = filmsService.getAllCurrentFilms();

        model.addAttribute("timeTableFilms", timeTableFilms);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<TopSlider> topSliders = topSliderRepo.findAll();

        model.addAttribute("topSliders", topSliders);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.addAttribute("bottomSliders", bottomSliders);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "userTimeTable";
    }

    @GetMapping("/userCinemas")
    public String userCinemas (Model model){
        Iterable<Cinemas> cinemas = cinemasService.getAllCinemas();

        model.addAttribute("cinemas", cinemas);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<TopSlider> topSliders = topSliderRepo.findAll();

        model.addAttribute("topSliders", topSliders);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.addAttribute("bottomSliders", bottomSliders);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "userCinemas";
    }

    @GetMapping("/userShares")
    public String userShares (Model model){
        Iterable<Shares> shares = sharesService.getAllShares();

        model.addAttribute("shares", shares);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<TopSlider> topSliders = topSliderRepo.findAll();

        model.addAttribute("topSliders", topSliders);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.addAttribute("bottomSliders", bottomSliders);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "userShares";
    }

    @GetMapping("/userNews")
    public String userNews (Model model){
        Iterable<News> news = newsService.getAllNews();

        model.addAttribute("news", news);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<TopSlider> topSliders = topSliderRepo.findAll();

        model.addAttribute("topSliders", topSliders);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.addAttribute("bottomSliders", bottomSliders);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "userNews";
    }

    @GetMapping("/getContactPage")
    public String contactEdit(Model model) {

        Iterable<ContactPage> contactPageUser = contactPageService.getAllContactPages();

        model.addAttribute("contactPageUser", contactPageUser);

        Iterable<CurrentFilms> userFilms = filmsService.getAllCurrentFilms();

        model.addAttribute("userFilms", userFilms);

        Iterable<SoonFilms> soonFilmsUser = soonFilmsService.getAllSoonFilms();

        model.addAttribute("soonFilmsUser", soonFilmsUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "getContactPage";
    }
// new

}
