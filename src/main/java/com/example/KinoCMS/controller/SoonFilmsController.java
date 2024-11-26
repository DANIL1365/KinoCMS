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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
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



    @GetMapping("/soonFilmAdd")
    public String soonFilmAdd(){

        return "soonFilmAdd";
    }

    @PostMapping("/soonFilmAdd")
    public String addNewSoonFilm(
            @Valid SoonFilms soonFilms,
            BindingResult bindingResult,
            Model model,
            @RequestParam("mainPicture") MultipartFile mainPicture,
            @RequestParam("galleryOne") MultipartFile galleryOne,
            @RequestParam("galleryTwo") MultipartFile galleryTwo,
            @RequestParam("galleryThree") MultipartFile galleryThree,
            @RequestParam("galleryFour") MultipartFile galleryFour,
            @RequestParam("galleryFive") MultipartFile galleryFive
    ) throws IOException {

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("soonFilms", soonFilms);

            return "soonFilmAdd";
        } else {


            if (mainPicture != null && !mainPicture.getOriginalFilename().isEmpty()) {
                File uploadDirMain = new File(uploadPath);
                if (!uploadDirMain.exists()) {
                    uploadDirMain.mkdir();
                }

                String uuidFileMain = UUID.randomUUID().toString();
                String resultFilenameMain = uuidFileMain + "." + mainPicture.getOriginalFilename();

                mainPicture.transferTo(new File(uploadPath + "/" + resultFilenameMain));

                soonFilms.setMainSoonPicture(resultFilenameMain);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryOne = new File(uploadPath);
                if (!uploadDirGalleryOne.exists()) {
                    uploadDirGalleryOne.mkdir();
                }

                String uuidFileGalleryOne = UUID.randomUUID().toString();
                String resultFilenameGalleryOne = uuidFileGalleryOne + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

                soonFilms.setPictureGalleryOne(resultFilenameGalleryOne);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryTwo = new File(uploadPath);
                if (!uploadDirGalleryTwo.exists()) {
                    uploadDirGalleryTwo.mkdir();
                }

                String uuidFileGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

                soonFilms.setPictureGalleryTwo(resultFilenameGalleryTwo);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryThree = new File(uploadPath);
                if (!uploadDirGalleryThree.exists()) {
                    uploadDirGalleryThree.mkdir();
                }

                String uuidFileGalleryThree = UUID.randomUUID().toString();
                String resultFilenameGalleryThree = uuidFileGalleryThree + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

                soonFilms.setPictureGalleryThree(resultFilenameGalleryThree);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFour = new File(uploadPath);
                if (!uploadDirGalleryFour.exists()) {
                    uploadDirGalleryFour.mkdir();
                }

                String uuidFileGalleryFour = UUID.randomUUID().toString();
                String resultFilenameGalleryFour = uuidFileGalleryFour + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

                soonFilms.setPictureGalleryFour(resultFilenameGalleryFour);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFive = new File(uploadPath);
                if (!uploadDirGalleryFive.exists()) {
                    uploadDirGalleryFive.mkdir();
                }

                String uuidFileGalleryFive = UUID.randomUUID().toString();
                String resultFilenameGalleryFive = uuidFileGalleryFive + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

                soonFilms.setPictureGalleryFive(resultFilenameGalleryFive);
            }

            model.addAttribute("soonFilms", null);
            soonFilmsService.createSoonFilm(soonFilms);

        }

        Iterable<SoonFilms> soon1 = soonFilmsService.getAllSoonFilms();

        model.addAttribute("soon1", soon1);


        return "redirect:/main";
    }
}
