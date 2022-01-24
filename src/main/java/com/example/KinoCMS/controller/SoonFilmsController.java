package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.SoonFilms;
import com.example.KinoCMS.domain.User;
import com.example.KinoCMS.repos.SoonFilmsRepo;
import com.example.KinoCMS.service.SoonFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
//@RequestMapping("/soon_films")
public class SoonFilmsController {

    @Autowired
    private SoonFilmsService soonFilmsService;

    @Value("${upload.path}")
    private String uploadPath;


//    @GetMapping("/mainSoon")
//    public String mainSoon(@RequestParam(required = false, defaultValue = "") String filterSoon,  Model model){
//        Iterable<SoonFilms> soonFilms = soonFilmsRepo.findAll();
//
//        if (filterSoon != null && !filterSoon.isEmpty()) {
//            soonFilms = soonFilmsRepo.findByNameSoonCinema(filterSoon);
//        } else {
//            soonFilms = soonFilmsRepo.findAll();
//        }
//        model.addAttribute("soonFilms", soonFilms);
//        model.addAttribute("filterSoon", filterSoon);
//
//        return "mainSoon";
//    }

    @GetMapping("/soonFilmAdd")
    public String soonFilmAdd(){

        return "soonFilmAdd";
    }

    @PostMapping("/soonFilmAdd")
    public String addNewSoonFilm(
            @AuthenticationPrincipal User user,
            @RequestParam String nameSoonCinema,
            @RequestParam String description,
            @RequestParam("mainSoonPicture") MultipartFile mainSoonPicture,
            @RequestParam("pictureGalleryOne") MultipartFile pictureGalleryOne,
            @RequestParam("pictureGalleryTwo") MultipartFile pictureGalleryTwo,
            @RequestParam("pictureGalleryThree") MultipartFile pictureGalleryThree,
            @RequestParam("pictureGalleryFour") MultipartFile pictureGalleryFour,
            @RequestParam("pictureGalleryFive") MultipartFile pictureGalleryFive,
            @RequestParam String trailerLink,
            @RequestParam String typeCinema, Map<String, Object> model) throws IOException {
       SoonFilms soonFilm = new SoonFilms(nameSoonCinema, description, trailerLink, typeCinema, user);

       if (mainSoonPicture != null  && !mainSoonPicture.getOriginalFilename().isEmpty()) {
           File uploadDirMain = new File(uploadPath);
           if (!uploadDirMain.exists()) {
               uploadDirMain.mkdir();
           }

           String uuidFileMain = UUID.randomUUID().toString();
           String resultFilenameMain = uuidFileMain + "." + mainSoonPicture.getOriginalFilename();

           mainSoonPicture.transferTo(new File(uploadPath + "/" + resultFilenameMain));

           soonFilm.setMainSoonPicture(resultFilenameMain);
       }
        if (pictureGalleryOne != null   && !pictureGalleryOne.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryOne = new File(uploadPath);
            if (!uploadDirGalleryOne.exists()) {
                uploadDirGalleryOne.mkdir();
            }

            String uuidFileGalleryOne = UUID.randomUUID().toString();
            String resultFilenameGalleryOne = uuidFileGalleryOne + "." + pictureGalleryOne.getOriginalFilename();

            pictureGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

            soonFilm.setPictureGalleryOne(resultFilenameGalleryOne);
        }
        if (pictureGalleryTwo != null   && !pictureGalleryTwo.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryTwo = new File(uploadPath);
            if (!uploadDirGalleryTwo.exists()) {
                uploadDirGalleryTwo.mkdir();
            }

            String uuidFileGalleryTwo = UUID.randomUUID().toString();
            String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + pictureGalleryTwo.getOriginalFilename();

            pictureGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

            soonFilm.setPictureGalleryTwo(resultFilenameGalleryTwo);
        }
        if (pictureGalleryThree != null   && !pictureGalleryThree.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryThree = new File(uploadPath);
            if (!uploadDirGalleryThree.exists()) {
                uploadDirGalleryThree.mkdir();
            }

            String uuidFileGalleryThree = UUID.randomUUID().toString();
            String resultFilenameGalleryThree = uuidFileGalleryThree + "." + pictureGalleryThree.getOriginalFilename();

            pictureGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

            soonFilm.setPictureGalleryThree(resultFilenameGalleryThree);
        }
        if (pictureGalleryFour != null   && !pictureGalleryFour.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFour = new File(uploadPath);
            if (!uploadDirGalleryFour.exists()) {
                uploadDirGalleryFour.mkdir();
            }

            String uuidFileGalleryFour = UUID.randomUUID().toString();
            String resultFilenameGalleryFour = uuidFileGalleryFour + "." + pictureGalleryFour.getOriginalFilename();

            pictureGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

            soonFilm.setPictureGalleryFour(resultFilenameGalleryFour);
        }
        if (pictureGalleryFive != null   && !pictureGalleryFive.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFive = new File(uploadPath);
            if (!uploadDirGalleryFive.exists()) {
                uploadDirGalleryFive.mkdir();
            }

            String uuidFileGalleryFive = UUID.randomUUID().toString();
            String resultFilenameGalleryFive = uuidFileGalleryFive + "." + pictureGalleryFive.getOriginalFilename();

            pictureGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

            soonFilm.setPictureGalleryFive(resultFilenameGalleryFive);
        }

       soonFilmsService.createSoonFilm(soonFilm);

        Iterable<SoonFilms> soon1 = soonFilmsService.getAllSoonFilms();

        model.put("soon1", soon1);
       // model.put("filter","");

        return "redirect:/main";
    }
}
