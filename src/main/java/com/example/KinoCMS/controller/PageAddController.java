package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.PagePages;
import com.example.KinoCMS.service.ContactPageService;
import com.example.KinoCMS.service.MainPageService;
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
import java.util.Objects;
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


    @PostMapping("/pageAdd")
    public String createPage(
            @Valid PagePages pagePages,
            BindingResult bindingResult,
            Model model,
            @RequestParam(defaultValue = "false") Boolean onOf,
            @RequestPart("file") MultipartFile file,
            @RequestPart("galleryOne") MultipartFile galleryOne,
            @RequestPart("galleryTwo") MultipartFile galleryTwo,
            @RequestPart("galleryThree") MultipartFile galleryThree,
            @RequestPart("galleryFour") MultipartFile galleryFour,
            @RequestPart("galleryFive") MultipartFile galleryFive

    ) throws IOException {
        pagePages.setOnOf(onOf);


        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("pagePages", pagePages);

            return "pageAdd";
        } else {

            if (file != null && !file.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + file.getOriginalFilename();

                file.transferTo(new File(uploadPath + "/" + resultFilename));


                pagePages.setPagePicture(resultFilename);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryOne(resultFilename);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryTwo(resultFilename);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryThree(resultFilename);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryFour(resultFilename);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilename));

                pagePages.setPictureGalleryFive(resultFilename);
            }
            model.addAttribute("pagePages", null);

            pagePagesService.createPagePages(pagePages);

        }

        Iterable<PagePages> pages = pagePagesService.getAllPagePages();

        model.addAttribute("pages", pages);

        return "redirect:/pagePages";
    }


}
