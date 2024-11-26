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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
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
            @Valid Hall hall,
            BindingResult bindingResult,
            Model model,
            @RequestParam("layout") MultipartFile layout,
            @RequestParam("top") MultipartFile top,
            @RequestParam("galleryOne") MultipartFile galleryOne,
            @RequestParam("galleryTwo") MultipartFile galleryTwo,
            @RequestParam("galleryThree") MultipartFile galleryThree,
            @RequestParam("galleryFour") MultipartFile galleryFour,
            @RequestParam("galleryFive") MultipartFile galleryFive

    ) throws IOException {
        hall.setId(id);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("hall", hall);

            return "updateHall";
        } else {


            if (layout != null && !layout.getOriginalFilename().isEmpty()) {
                File uploadDirHallLayout = new File(uploadPath);
                if (!uploadDirHallLayout.exists()) {
                    uploadDirHallLayout.mkdir();
                }

                String uuidFileHallLayout = UUID.randomUUID().toString();
                String resultFilenameHallLayout = uuidFileHallLayout + "." + layout.getOriginalFilename();

                layout.transferTo(new File(uploadPath + "/" + resultFilenameHallLayout));

                hall.setHallLayout(resultFilenameHallLayout);
            }
            if (top != null && !top.getOriginalFilename().isEmpty()) {
                File uploadDirtopBanner = new File(uploadPath);
                if (!uploadDirtopBanner.exists()) {
                    uploadDirtopBanner.mkdir();
                }

                String uuidFiletopBanner = UUID.randomUUID().toString();
                String resultFilenametopBanner = uuidFiletopBanner + "." + top.getOriginalFilename();

                top.transferTo(new File(uploadPath + "/" + resultFilenametopBanner));

                hall.setTopBanner(resultFilenametopBanner);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryOne = new File(uploadPath);
                if (!uploadDirGalleryOne.exists()) {
                    uploadDirGalleryOne.mkdir();
                }

                String uuidFileGalleryOne = UUID.randomUUID().toString();
                String resultFilenameGalleryOne = uuidFileGalleryOne + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

                hall.setPictureHallGalleryOne(resultFilenameGalleryOne);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryTwo = new File(uploadPath);
                if (!uploadDirGalleryTwo.exists()) {
                    uploadDirGalleryTwo.mkdir();
                }

                String uuidFileGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

                hall.setPictureHallGalleryTwo(resultFilenameGalleryTwo);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryThree = new File(uploadPath);
                if (!uploadDirGalleryThree.exists()) {
                    uploadDirGalleryThree.mkdir();
                }

                String uuidFileGalleryThree = UUID.randomUUID().toString();
                String resultFilenameGalleryThree = uuidFileGalleryThree + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

                hall.setPictureHallGalleryThree(resultFilenameGalleryThree);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFour = new File(uploadPath);
                if (!uploadDirGalleryFour.exists()) {
                    uploadDirGalleryFour.mkdir();
                }

                String uuidFileGalleryFour = UUID.randomUUID().toString();
                String resultFilenameGalleryFour = uuidFileGalleryFour + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

                hall.setPictureHallGalleryFour(resultFilenameGalleryFour);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFive = new File(uploadPath);
                if (!uploadDirGalleryFive.exists()) {
                    uploadDirGalleryFive.mkdir();
                }

                String uuidFileGalleryFive = UUID.randomUUID().toString();
                String resultFilenameGalleryFive = uuidFileGalleryFive + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

                hall.setPictureHallGalleryFive(resultFilenameGalleryFive);
            }
            model.addAttribute("hall", null);
            hallService.createHall(hall);

        }

        Iterable<Hall> halls = hallService.getAllHall();

        model.addAttribute("halls", halls);


        return "redirect:/hallList";
    }
}
