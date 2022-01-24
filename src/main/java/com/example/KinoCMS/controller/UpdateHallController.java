package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.repos.BottomSliderRepo;
import com.example.KinoCMS.repos.TopSliderRepo;
import com.example.KinoCMS.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "/hall")
public class UpdateHallController {

    @Autowired
    HallService hallService;

    @Value("${upload.path}")
    private String uploadPath;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    TopSliderRepo topSliderRepo;

    @Autowired
    MainPageService mainPageService;

    @Autowired
    BottomSliderRepo bottomSliderRepo;

    @Autowired
    private FilmsService filmsService;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    ContactPageService contactPageService;

    @GetMapping("{hall}")
    public String updateHall(@PathVariable Hall hall) {
        hallService.updateHall(hall);
        return "updateHall";
    }

    @GetMapping("/edit/{id}")
    public String hallEdit(@PathVariable("id") Long id, Model model) {

        Hall hallUser = hallService.getHallById(id);

        model.addAttribute("hallUser", hallUser);

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

        return "getHall";
    }

    @PostMapping
    public String addNewHall(
            @RequestParam("hallId") Long id,
            @RequestParam String hallNumber,
            @RequestParam String hallDescription,
            @RequestParam("hallLayout") MultipartFile hallLayout,
            @RequestParam("topBanner") MultipartFile topBanner,
            @RequestParam("pictureHallGalleryOne") MultipartFile pictureHallGalleryOne,
            @RequestParam("pictureHallGalleryTwo") MultipartFile pictureHallGalleryTwo,
            @RequestParam("pictureHallGalleryThree") MultipartFile pictureHallGalleryThree,
            @RequestParam("pictureHallGalleryFour") MultipartFile pictureHallGalleryFour,
            @RequestParam("pictureHallGalleryFive") MultipartFile pictureHallGalleryFive,
            @RequestParam("dateCreation")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateCreation,
            Map<String, Object> hallModel) throws IOException {
        Hall hall = new Hall(id, hallNumber, hallDescription, dateCreation);


        if (hallLayout != null  && !hallLayout.getOriginalFilename().isEmpty()) {
            File uploadDirHallLayout = new File(uploadPath);
            if (!uploadDirHallLayout.exists()) {
                uploadDirHallLayout.mkdir();
            }

            String uuidFileHallLayout = UUID.randomUUID().toString();
            String resultFilenameHallLayout = uuidFileHallLayout + "." + hallLayout.getOriginalFilename();

            hallLayout.transferTo(new File(uploadPath + "/" + resultFilenameHallLayout));

            hall.setHallLayout(resultFilenameHallLayout);
        }
        if (topBanner != null  && !topBanner.getOriginalFilename().isEmpty()) {
            File uploadDirtopBanner = new File(uploadPath);
            if (!uploadDirtopBanner.exists()) {
                uploadDirtopBanner.mkdir();
            }

            String uuidFiletopBanner = UUID.randomUUID().toString();
            String resultFilenametopBanner = uuidFiletopBanner + "." + topBanner.getOriginalFilename();

            topBanner.transferTo(new File(uploadPath + "/" + resultFilenametopBanner));

            hall.setTopBanner(resultFilenametopBanner);
        }
        if (pictureHallGalleryOne != null   && !pictureHallGalleryOne.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryOne = new File(uploadPath);
            if (!uploadDirGalleryOne.exists()) {
                uploadDirGalleryOne.mkdir();
            }

            String uuidFileGalleryOne = UUID.randomUUID().toString();
            String resultFilenameGalleryOne = uuidFileGalleryOne + "." + pictureHallGalleryOne.getOriginalFilename();

            pictureHallGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

            hall.setPictureHallGalleryOne(resultFilenameGalleryOne);
        }
        if (pictureHallGalleryTwo != null   && !pictureHallGalleryTwo.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryTwo = new File(uploadPath);
            if (!uploadDirGalleryTwo.exists()) {
                uploadDirGalleryTwo.mkdir();
            }

            String uuidFileGalleryTwo = UUID.randomUUID().toString();
            String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + pictureHallGalleryTwo.getOriginalFilename();

            pictureHallGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

            hall.setPictureHallGalleryTwo(resultFilenameGalleryTwo);
        }
        if (pictureHallGalleryThree != null   && !pictureHallGalleryThree.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryThree = new File(uploadPath);
            if (!uploadDirGalleryThree.exists()) {
                uploadDirGalleryThree.mkdir();
            }

            String uuidFileGalleryThree = UUID.randomUUID().toString();
            String resultFilenameGalleryThree = uuidFileGalleryThree + "." + pictureHallGalleryThree.getOriginalFilename();

            pictureHallGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

            hall.setPictureHallGalleryThree(resultFilenameGalleryThree);
        }
        if (pictureHallGalleryFour != null   && !pictureHallGalleryFour.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFour = new File(uploadPath);
            if (!uploadDirGalleryFour.exists()) {
                uploadDirGalleryFour.mkdir();
            }

            String uuidFileGalleryFour = UUID.randomUUID().toString();
            String resultFilenameGalleryFour = uuidFileGalleryFour + "." + pictureHallGalleryFour.getOriginalFilename();

            pictureHallGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

            hall.setPictureHallGalleryFour(resultFilenameGalleryFour);
        }
        if (pictureHallGalleryFive != null   && !pictureHallGalleryFive.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFive = new File(uploadPath);
            if (!uploadDirGalleryFive.exists()) {
                uploadDirGalleryFive.mkdir();
            }

            String uuidFileGalleryFive = UUID.randomUUID().toString();
            String resultFilenameGalleryFive = uuidFileGalleryFive + "." + pictureHallGalleryFive.getOriginalFilename();

            pictureHallGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

            hall.setPictureHallGalleryFive(resultFilenameGalleryFive);
        }

        hallService.createHall(hall);

        Iterable<Hall> halls = hallService.getAllHall();

        hallModel.put("halls", halls);
        // model.put("filter","");

        return "redirect:/hallList";
    }
}
