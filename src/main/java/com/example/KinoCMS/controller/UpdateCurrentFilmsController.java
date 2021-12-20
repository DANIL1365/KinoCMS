package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.Shares;
import com.example.KinoCMS.domain.User;
import com.example.KinoCMS.service.FilmsService;
import com.example.KinoCMS.service.SoonFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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


    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("{currentFilms}")
    public String updateCurrentFilm(@PathVariable CurrentFilms currentFilms) {
        filmsService.updateCurrentFilm(currentFilms);
        return "updateCurrentFilms";
    }

    @PostMapping
    public String UpdateCurrentFilms(
            @AuthenticationPrincipal User user,
            @RequestParam("currentId") Long id,
            @RequestParam String nameCinema,
            @RequestParam String description,
            @RequestParam("mainPicture") MultipartFile mainPicture,
            @RequestParam("pictureGalleryOne") MultipartFile pictureGalleryOne,
            @RequestParam("pictureGalleryTwo") MultipartFile pictureGalleryTwo,
            @RequestParam("pictureGalleryThree") MultipartFile pictureGalleryThree,
            @RequestParam("pictureGalleryFour") MultipartFile pictureGalleryFour,
            @RequestParam("pictureGalleryFive") MultipartFile pictureGalleryFive,
            @RequestParam String trailerLink,
            @RequestParam String typeCinema, Map<String, Object> model) throws IOException {
        CurrentFilms currentFilms = new CurrentFilms(id, nameCinema, description, trailerLink, typeCinema, user);

        if (mainPicture != null  && !mainPicture.getOriginalFilename().isEmpty()) {
            File uploadDirMain = new File(uploadPath);
            if (!uploadDirMain.exists()) {
                uploadDirMain.mkdir();
            }

            String uuidFileMain = UUID.randomUUID().toString();
            String resultFilenameMain = uuidFileMain + "." + mainPicture.getOriginalFilename();

            mainPicture.transferTo(new File(uploadPath + "/" + resultFilenameMain));

            currentFilms.setMainPicture(resultFilenameMain);
        }
        if (pictureGalleryOne != null   && !pictureGalleryOne.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryOne = new File(uploadPath);
            if (!uploadDirGalleryOne.exists()) {
                uploadDirGalleryOne.mkdir();
            }

            String uuidFileGalleryOne = UUID.randomUUID().toString();
            String resultFilenameGalleryOne = uuidFileGalleryOne + "." + pictureGalleryOne.getOriginalFilename();

            pictureGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

            currentFilms.setPictureGalleryOne(resultFilenameGalleryOne);
        }
        if (pictureGalleryTwo != null   && !pictureGalleryTwo.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryTwo = new File(uploadPath);
            if (!uploadDirGalleryTwo.exists()) {
                uploadDirGalleryTwo.mkdir();
            }

            String uuidFileGalleryTwo = UUID.randomUUID().toString();
            String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + pictureGalleryTwo.getOriginalFilename();

            pictureGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

            currentFilms.setPictureGalleryTwo(resultFilenameGalleryTwo);
        }
        if (pictureGalleryThree != null   && !pictureGalleryThree.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryThree = new File(uploadPath);
            if (!uploadDirGalleryThree.exists()) {
                uploadDirGalleryThree.mkdir();
            }

            String uuidFileGalleryThree = UUID.randomUUID().toString();
            String resultFilenameGalleryThree = uuidFileGalleryThree + "." + pictureGalleryThree.getOriginalFilename();

            pictureGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

            currentFilms.setPictureGalleryThree(resultFilenameGalleryThree);
        }
        if (pictureGalleryFour != null   && !pictureGalleryFour.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFour = new File(uploadPath);
            if (!uploadDirGalleryFour.exists()) {
                uploadDirGalleryFour.mkdir();
            }

            String uuidFileGalleryFour = UUID.randomUUID().toString();
            String resultFilenameGalleryFour = uuidFileGalleryFour + "." + pictureGalleryFour.getOriginalFilename();

            pictureGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

            currentFilms.setPictureGalleryFour(resultFilenameGalleryFour);
        }
        if (pictureGalleryFive != null   && !pictureGalleryFive.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFive = new File(uploadPath);
            if (!uploadDirGalleryFive.exists()) {
                uploadDirGalleryFive.mkdir();
            }

            String uuidFileGalleryFive = UUID.randomUUID().toString();
            String resultFilenameGalleryFive = uuidFileGalleryFive + "." + pictureGalleryFive.getOriginalFilename();

            pictureGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

            currentFilms.setPictureGalleryFive(resultFilenameGalleryFive);
        }

        filmsService.createCurrentFilm(currentFilms);

        Iterable<CurrentFilms> films = filmsService.getAllCurrentFilms();

        model.put("films", films);
        // model.put("filter","");

        return "redirect:/main";
    }
}
