package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.repos.BottomSliderRepo;
import com.example.KinoCMS.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/cinemas")
public class UpdateCinemasController {

    @Autowired
    private CinemasService cinemasService;

    @Autowired
    HallService hallService;

    @Autowired
    MainPageService mainPageService;

    @Autowired
    BottomSliderRepo bottomSliderRepo;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    private FilmsService filmsService;

    @Autowired
    ContactPageService contactPageService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("{cinemas}")
    public String updateCinemas(@PathVariable Cinemas cinemas) {
        cinemasService.updateCinemas(cinemas);
        return "cinemasUpdate";
    }

    @GetMapping("/edit/{id}")
    public String cinemasEdit(@PathVariable("id") Long id, Model model) {

        Cinemas cinemasUser = cinemasService.getCinemasById(id);

        model.addAttribute("cinemasUser", cinemasUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<Hall> halls = hallService.getAllHall();

        model.addAttribute("halls", halls);

        Iterable<CurrentFilms> timeTableFilms = filmsService.getAllCurrentFilms();

        model.addAttribute("timeTableFilms", timeTableFilms);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "getCinemas";
    }

    @PostMapping
    public String updateCinemas(
            @RequestParam("cinemasId") Long id,
            @RequestParam String nameCinema,
            @RequestParam String descriptionCinema,
            @RequestParam String conditionsCinema,
            @RequestParam("logo") MultipartFile logo,
            @RequestParam("topBanner") MultipartFile topBanner,
            @RequestParam("pictureGalleryOne") MultipartFile pictureGalleryOne,
            @RequestParam("pictureGalleryTwo") MultipartFile pictureGalleryTwo,
            @RequestParam("pictureGalleryThree") MultipartFile pictureGalleryThree,
            @RequestParam("pictureGalleryFour") MultipartFile pictureGalleryFour,
            @RequestParam("pictureGalleryFive") MultipartFile pictureGalleryFive,
            Map<String, Object> model) throws IOException {
        Cinemas cinema = new Cinemas(id, nameCinema, descriptionCinema, conditionsCinema);

        if (logo != null  && !logo.getOriginalFilename().isEmpty()) {
            File uploadDirlogo = new File(uploadPath);
            if (!uploadDirlogo.exists()) {
                uploadDirlogo.mkdir();
            }

            String uuidFilelogo = UUID.randomUUID().toString();
            String resultFilenamelogo = uuidFilelogo + "." + logo.getOriginalFilename();

            logo.transferTo(new File(uploadPath + "/" + resultFilenamelogo));

            cinema.setLogo(resultFilenamelogo);
        }
        if (topBanner != null  && !topBanner.getOriginalFilename().isEmpty()) {
            File uploadDirtopBanner = new File(uploadPath);
            if (!uploadDirtopBanner.exists()) {
                uploadDirtopBanner.mkdir();
            }

            String uuidFiletopBanner = UUID.randomUUID().toString();
            String resultFilenametopBanner = uuidFiletopBanner + "." + logo.getOriginalFilename();

            logo.transferTo(new File(uploadPath + "/" + resultFilenametopBanner));

            cinema.setTopBanner(resultFilenametopBanner);
        }
        if (pictureGalleryOne != null   && !pictureGalleryOne.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryOne = new File(uploadPath);
            if (!uploadDirGalleryOne.exists()) {
                uploadDirGalleryOne.mkdir();
            }

            String uuidFileGalleryOne = UUID.randomUUID().toString();
            String resultFilenameGalleryOne = uuidFileGalleryOne + "." + pictureGalleryOne.getOriginalFilename();

            pictureGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

            cinema.setPictureGalleryOne(resultFilenameGalleryOne);
        }
        if (pictureGalleryTwo != null   && !pictureGalleryTwo.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryTwo = new File(uploadPath);
            if (!uploadDirGalleryTwo.exists()) {
                uploadDirGalleryTwo.mkdir();
            }

            String uuidFileGalleryTwo = UUID.randomUUID().toString();
            String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + pictureGalleryTwo.getOriginalFilename();

            pictureGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

            cinema.setPictureGalleryTwo(resultFilenameGalleryTwo);
        }
        if (pictureGalleryThree != null   && !pictureGalleryThree.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryThree = new File(uploadPath);
            if (!uploadDirGalleryThree.exists()) {
                uploadDirGalleryThree.mkdir();
            }

            String uuidFileGalleryThree = UUID.randomUUID().toString();
            String resultFilenameGalleryThree = uuidFileGalleryThree + "." + pictureGalleryThree.getOriginalFilename();

            pictureGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

            cinema.setPictureGalleryThree(resultFilenameGalleryThree);
        }
        if (pictureGalleryFour != null   && !pictureGalleryFour.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFour = new File(uploadPath);
            if (!uploadDirGalleryFour.exists()) {
                uploadDirGalleryFour.mkdir();
            }

            String uuidFileGalleryFour = UUID.randomUUID().toString();
            String resultFilenameGalleryFour = uuidFileGalleryFour + "." + pictureGalleryFour.getOriginalFilename();

            pictureGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

            cinema.setPictureGalleryFour(resultFilenameGalleryFour);
        }
        if (pictureGalleryFive != null   && !pictureGalleryFive.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFive = new File(uploadPath);
            if (!uploadDirGalleryFive.exists()) {
                uploadDirGalleryFive.mkdir();
            }

            String uuidFileGalleryFive = UUID.randomUUID().toString();
            String resultFilenameGalleryFive = uuidFileGalleryFive + "." + pictureGalleryFive.getOriginalFilename();

            pictureGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

            cinema.setPictureGalleryFive(resultFilenameGalleryFive);
        }



        cinemasService.createCinemas(cinema);

        Iterable<Cinemas> cinemas1 = cinemasService.getAllCinemas();

        model.put("cinemas1", cinemas1);
        // model.put("filter","");

        return "redirect:/cinemas";
    }
}
