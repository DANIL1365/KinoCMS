package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.repos.BottomSliderRepo;
import com.example.KinoCMS.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
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
            @Valid Cinemas cinemas,
            BindingResult bindingResult,
            Model model,
            @RequestParam("logoPicture") MultipartFile logoPicture,
            @RequestParam("top") MultipartFile top,
            @RequestParam("galleryOne") MultipartFile galleryOne,
            @RequestParam("galleryTwo") MultipartFile galleryTwo,
            @RequestParam("galleryThree") MultipartFile galleryThree,
            @RequestParam("galleryFour") MultipartFile galleryFour,
            @RequestParam("galleryFive") MultipartFile galleryFive
    ) throws IOException {
        cinemas.setId(id);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("cinemas", cinemas);

            return "cinemasUpdate";
        } else {

            if (logoPicture != null && !logoPicture.getOriginalFilename().isEmpty()) {
                File uploadDirlogo = new File(uploadPath);
                if (!uploadDirlogo.exists()) {
                    uploadDirlogo.mkdir();
                }

                String uuidFilelogo = UUID.randomUUID().toString();
                String resultFilenamelogo = uuidFilelogo + "." + logoPicture.getOriginalFilename();

                logoPicture.transferTo(new File(uploadPath + "/" + resultFilenamelogo));

                cinemas.setLogo(resultFilenamelogo);
            }
            if (top != null && !top.getOriginalFilename().isEmpty()) {
                File uploadDirtopBanner = new File(uploadPath);
                if (!uploadDirtopBanner.exists()) {
                    uploadDirtopBanner.mkdir();
                }

                String uuidFiletopBanner = UUID.randomUUID().toString();
                String resultFilenametopBanner = uuidFiletopBanner + "." + top.getOriginalFilename();

                top.transferTo(new File(uploadPath + "/" + resultFilenametopBanner));

                cinemas.setTopBanner(resultFilenametopBanner);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryOne = new File(uploadPath);
                if (!uploadDirGalleryOne.exists()) {
                    uploadDirGalleryOne.mkdir();
                }

                String uuidFileGalleryOne = UUID.randomUUID().toString();
                String resultFilenameGalleryOne = uuidFileGalleryOne + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

                cinemas.setPictureGalleryOne(resultFilenameGalleryOne);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryTwo = new File(uploadPath);
                if (!uploadDirGalleryTwo.exists()) {
                    uploadDirGalleryTwo.mkdir();
                }

                String uuidFileGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

                cinemas.setPictureGalleryTwo(resultFilenameGalleryTwo);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryThree = new File(uploadPath);
                if (!uploadDirGalleryThree.exists()) {
                    uploadDirGalleryThree.mkdir();
                }

                String uuidFileGalleryThree = UUID.randomUUID().toString();
                String resultFilenameGalleryThree = uuidFileGalleryThree + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

                cinemas.setPictureGalleryThree(resultFilenameGalleryThree);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFour = new File(uploadPath);
                if (!uploadDirGalleryFour.exists()) {
                    uploadDirGalleryFour.mkdir();
                }

                String uuidFileGalleryFour = UUID.randomUUID().toString();
                String resultFilenameGalleryFour = uuidFileGalleryFour + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

                cinemas.setPictureGalleryFour(resultFilenameGalleryFour);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFive = new File(uploadPath);
                if (!uploadDirGalleryFive.exists()) {
                    uploadDirGalleryFive.mkdir();
                }

                String uuidFileGalleryFive = UUID.randomUUID().toString();
                String resultFilenameGalleryFive = uuidFileGalleryFive + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

                cinemas.setPictureGalleryFive(resultFilenameGalleryFive);
            }

            model.addAttribute("cinemas", null);
            cinemasService.createCinemas(cinemas);

        }

        Iterable<Cinemas> cinemas1 = cinemasService.getAllCinemas();

        model.addAttribute("cinemas1", cinemas1);
        // model.put("filter","");

        return "redirect:/cinemas";
    }
}
