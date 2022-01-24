package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.PagePages;
import com.example.KinoCMS.domain.SoonFilms;
import com.example.KinoCMS.service.PagePagesService;
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
public class PageAddController {

    @Autowired
    PagePagesService pagePagesService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/pageAdd")
    public String pageAdd(){

        return "pageAdd";
    }

    @GetMapping("/deletePage/{id}")
    public String deletePage(@PathVariable("id") Long id){
        pagePagesService.deletePagePagesById(id);

        return "redirect:/pagePages";
    }

//    @PostMapping("/pagePages")
//    public String onOfPage(@RequestParam Boolean onOf, Model model){
//        PagePages pages = new PagePages(onOf);
//        if (onOf == true) {
//            pages = pagePagesService.getAllPagePages();
//        } else {
//            pages = pagePagesService.getAllCurrentFilms();
//        }
//        model.addAttribute("pages", pages);
//        model.addAttribute("onOf", onOf);
//
//        return "pagePages";
//    }

    @PostMapping("/pageAdd")
    public String createPage(
//            @RequestParam String namePage,
//            @RequestParam String description,
//            @RequestParam("dateCreation")
//            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateCreation,
//            @RequestParam(defaultValue = "false") Boolean onOf,
            @Valid PagePages pagePages,
            BindingResult bindingResult,
            Model model,
            @RequestParam("pagePicture") MultipartFile pagePicture,
            @RequestParam("pictureGalleryOne") MultipartFile pictureGalleryOne,
            @RequestParam("pictureGalleryTwo") MultipartFile pictureGalleryTwo,
            @RequestParam("pictureGalleryThree") MultipartFile pictureGalleryThree,
            @RequestParam("pictureGalleryFour") MultipartFile pictureGalleryFour,
            @RequestParam("pictureGalleryFive") MultipartFile pictureGalleryFive

//            Map<String, Object> model
    ) throws IOException {
        System.out.println("page:" + pagePages + " " + "picture:" + pagePicture);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);

            model.mergeAttributes(errorsMap);
            model.addAttribute("pagePages", pagePages);

            return "pageAdd";
        } else {

//        PagePages pagePages = new PagePages(namePage, description, dateCreation, onOf);

            if (pagePicture != null && !pagePicture.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + pagePicture.getOriginalFilename();

                pagePicture.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPagePicture(resultFilename);
            }
            if (pictureGalleryOne != null && !pictureGalleryOne.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + pictureGalleryOne.getOriginalFilename();

                pictureGalleryOne.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryOne(resultFilename);
            }
            if (pictureGalleryTwo != null && !pictureGalleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + pictureGalleryTwo.getOriginalFilename();

                pictureGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryTwo(resultFilename);
            }
            if (pictureGalleryThree != null && !pictureGalleryThree.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + pictureGalleryThree.getOriginalFilename();

                pictureGalleryThree.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryThree(resultFilename);
            }
            if (pictureGalleryFour != null && !pictureGalleryFour.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + pictureGalleryFour.getOriginalFilename();

                pictureGalleryFour.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryFour(resultFilename);
            }
            if (pictureGalleryFive != null && !pictureGalleryFive.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + pictureGalleryFive.getOriginalFilename();

                pictureGalleryFive.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryFive(resultFilename);
            }
            model.addAttribute("pagePages", null);
            pagePagesService.createPagePages(pagePages);

        }

        Iterable<PagePages> pages = pagePagesService.getAllPagePages();

        model.addAttribute("pages", pages);

        return "/pagePages";
    }

}
