package com.example.KinoCMS.controller;



import com.example.KinoCMS.domain.Cinemas;
import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.Hall;
import com.example.KinoCMS.repos.HallRepo;
import com.example.KinoCMS.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.UUID;

@Controller

public class HallController {

    @Autowired
    HallService hallService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/hallList")
    public String hallList(Model model) {
        model.addAttribute("halls", hallService.getAllHall());

        return "hallList";
    }


    @GetMapping("/deleteHall/{id}")
    public String deleteHall(@PathVariable("id") Long id){
        hallService.deleteHallById(id);

        return "redirect:/hallList";
    }
//
    @GetMapping("/hallAdd")
    public String hallAdd(){
        return "hallAdd";
    }

    @PostMapping("/hallAdd")
    public String addNewHall(
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

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("hall", hall);

            return "hallAdd";
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
