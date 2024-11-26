package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.service.*;
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
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/pagePages")
public class UpdatePagesController {

    @Autowired
    MainPageService mainPageService;

    @Autowired
    ContactPageService contactPageService;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    private NewsService newsService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping
    public String pageList(Model model) {
        model.addAttribute("mainPage", mainPageService.getAllMainPages());
        model.addAttribute("contactPage", contactPageService.getAllContactPages());
        model.addAttribute("page", pagePagesService.getAllPagePages());

        return "pagePages";
    }

    @GetMapping("{pagePages}")
    public String updatePage(@PathVariable PagePages pagePages){
        pagePagesService.updatePagePages(pagePages);
        return "pageUpdate";
    }

    @GetMapping("/edit/{id}")
    public String pageEdit(@PathVariable("id") Long id, Model model) {

        PagePages pagePagesUser = pagePagesService.getPagePagesById(id);

        model.addAttribute("pagePagesUser", pagePagesUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        Iterable<News> newsUser = newsService.getAllNews();

        model.addAttribute("newsUser", newsUser);

        return "getPage";
    }


//    @GetMapping("/deletePage/{id}")
//    public String deletePage(@PathVariable("id") Long id){
//        pagePagesService.deletePagePagesById(id);
//
//        return "redirect:/pagePages";
//    }

    @PostMapping("/updatePage")
    public String updatePage(
            @RequestParam("pageId") Long id,
            @Valid PagePages pagePages,
            BindingResult bindingResult,
            Model model,
            @RequestParam(defaultValue = "false") Boolean onOf,
            @RequestPart("main") MultipartFile main,
            @RequestPart("galleryOne") MultipartFile galleryOne,
            @RequestPart("galleryTwo") MultipartFile galleryTwo,
            @RequestPart("galleryThree") MultipartFile galleryThree,
            @RequestPart("galleryFour") MultipartFile galleryFour,
            @RequestPart("galleryFive") MultipartFile galleryFive

//            Map<String, Object> model
    ) throws IOException {
        pagePages.setId(id);
        pagePages.setOnOf(onOf);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("pagePages", pagePages);

            return "pageUpdate";
        } else {
//        PagePages pagePages = new PagePages(namePage, description, dateCreation, onOf);
            if (main != null && !main.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + main.getOriginalFilename();

                main.transferTo(new File(uploadPath + "/" + resultFilename));


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
// new
        Iterable<PagePages> pages = pagePagesService.getAllPagePages();

        model.addAttribute("pages", pages);

        return "redirect:/pagePages";
    }


}
