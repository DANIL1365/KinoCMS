package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.repos.BottomSliderRepo;
import com.example.KinoCMS.repos.TopSliderRepo;
import com.example.KinoCMS.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Currency;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "/currentFilms")
public class UpdateCurrentFilmsController {

    @Autowired
    private FilmsService filmsService;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    TopSliderRepo topSliderRepo;

    @Autowired
    MainPageService mainPageService;

    @Autowired
    BottomSliderRepo bottomSliderRepo;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    ContactPageService contactPageService;


    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/edit/{id}")
    public String currentFilmEdit(@PathVariable("id") Long id, Model model) {

        CurrentFilms currentFilmsUser = filmsService.getCurrentFilmById(id);

        model.addAttribute("currentFilmsUser", currentFilmsUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "getCurrentFilms";
    }

    @GetMapping("/editBuy/{id}")
    public String currentFilmEditBuy(@PathVariable("id") Long id, Model model) {

        CurrentFilms currentFilmsUser = filmsService.getCurrentFilmById(id);

        model.addAttribute("currentFilmsUser", currentFilmsUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        return "getCurrentFilmsBuy";
    }


    @GetMapping("{currentFilms}")
    public String updateCurrentFilm(@PathVariable CurrentFilms currentFilms) {
        filmsService.updateCurrentFilm(currentFilms);
        return "updateCurrentFilms";
    }

    @PostMapping
    public String UpdateCurrentFilms(
            @RequestParam("currentId") Long id,
            @Valid CurrentFilms currentFilms,
            BindingResult bindingResult,
            Model model,
            @RequestParam("main") MultipartFile main,
            @RequestParam("galleryOne") MultipartFile galleryOne,
            @RequestParam("galleryTwo") MultipartFile galleryTwo,
            @RequestParam("galleryThree") MultipartFile galleryThree,
            @RequestParam("galleryFour") MultipartFile galleryFour,
            @RequestParam("galleryFive") MultipartFile galleryFive
    ) throws IOException {
        currentFilms.setId(id);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("currentFilms", currentFilms);

            return "updateCurrentFilms";
        } else {

            if (main != null && !main.getOriginalFilename().isEmpty()) {
                File uploadDirMain = new File(uploadPath);
                if (!uploadDirMain.exists()) {
                    uploadDirMain.mkdir();
                }

                String uuidFileMain = UUID.randomUUID().toString();
                String resultFilenameMain = uuidFileMain + "." + main.getOriginalFilename();

                main.transferTo(new File(uploadPath + "/" + resultFilenameMain));

                currentFilms.setMainPicture(resultFilenameMain);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryOne = new File(uploadPath);
                if (!uploadDirGalleryOne.exists()) {
                    uploadDirGalleryOne.mkdir();
                }

                String uuidFileGalleryOne = UUID.randomUUID().toString();
                String resultFilenameGalleryOne = uuidFileGalleryOne + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

                currentFilms.setPictureGalleryOne(resultFilenameGalleryOne);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryTwo = new File(uploadPath);
                if (!uploadDirGalleryTwo.exists()) {
                    uploadDirGalleryTwo.mkdir();
                }

                String uuidFileGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

                currentFilms.setPictureGalleryTwo(resultFilenameGalleryTwo);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryThree = new File(uploadPath);
                if (!uploadDirGalleryThree.exists()) {
                    uploadDirGalleryThree.mkdir();
                }

                String uuidFileGalleryThree = UUID.randomUUID().toString();
                String resultFilenameGalleryThree = uuidFileGalleryThree + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

                currentFilms.setPictureGalleryThree(resultFilenameGalleryThree);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFour = new File(uploadPath);
                if (!uploadDirGalleryFour.exists()) {
                    uploadDirGalleryFour.mkdir();
                }

                String uuidFileGalleryFour = UUID.randomUUID().toString();
                String resultFilenameGalleryFour = uuidFileGalleryFour + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

                currentFilms.setPictureGalleryFour(resultFilenameGalleryFour);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFive = new File(uploadPath);
                if (!uploadDirGalleryFive.exists()) {
                    uploadDirGalleryFive.mkdir();
                }

                String uuidFileGalleryFive = UUID.randomUUID().toString();
                String resultFilenameGalleryFive = uuidFileGalleryFive + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

                currentFilms.setPictureGalleryFive(resultFilenameGalleryFive);
            }

            model.addAttribute("currentFilms", null);
            filmsService.createCurrentFilm(currentFilms);

        }

        Iterable<CurrentFilms> films = filmsService.getAllCurrentFilms();

        model.addAttribute("films", films);


        return "redirect:/main";
    }
}
