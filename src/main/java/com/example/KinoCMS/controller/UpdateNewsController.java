package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
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
@RequestMapping(value = "/news")
public class UpdateNewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    MainPageService mainPageService;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    ContactPageService contactPageService;


    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("{news}")
    public String updateNews(@PathVariable News news){
        newsService.updateNews(news);
        return "updateNews";
    }

    @GetMapping("/edit/{id}")
    public String sharesEdit(@PathVariable("id") Long id, Model model) {

        News newsUser = newsService.getNewsById(id);

        model.addAttribute("newsUser", newsUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "getNews";
    }

    @PostMapping
    public String updateNewNews(
            @RequestParam("newsId") Long id,
            @Valid News news,
            BindingResult bindingResult,
            Model model,
            @RequestParam("mainPicture") MultipartFile mainPicture,
            @RequestParam("galleryOne") MultipartFile galleryOne,
            @RequestParam("galleryTwo") MultipartFile galleryTwo,
            @RequestParam("galleryThree") MultipartFile galleryThree,
            @RequestParam("galleryFour") MultipartFile galleryFour,
            @RequestParam("galleryFive") MultipartFile galleryFive
    ) throws IOException {
        news.setId(id);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("news", news);

            return "updateNews";
        } else {
//        News newsAdd = new News(nameNews,publicationDate, description, videoLink);


            if (mainPicture != null && !mainPicture.getOriginalFilename().isEmpty()) {
                File uploadDirmainNewsPicture = new File(uploadPath);
                if (!uploadDirmainNewsPicture.exists()) {
                    uploadDirmainNewsPicture.mkdir();
                }

                String uuidFilemainNewsPicture = UUID.randomUUID().toString();
                String resultFilenamemainNewsPicture = uuidFilemainNewsPicture + "." + mainPicture.getOriginalFilename();

                mainPicture.transferTo(new File(uploadPath + "/" + resultFilenamemainNewsPicture));

                news.setMainNewsPicture(resultFilenamemainNewsPicture);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirNewsGalleryOne = new File(uploadPath);
                if (!uploadDirNewsGalleryOne.exists()) {
                    uploadDirNewsGalleryOne.mkdir();
                }

                String uuidFileNewsGalleryOne = UUID.randomUUID().toString();
                String resultFilenameNewsGalleryOne = uuidFileNewsGalleryOne + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryOne));

                news.setPictureNewsGalleryOne(resultFilenameNewsGalleryOne);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirNewsGalleryTwo = new File(uploadPath);
                if (!uploadDirNewsGalleryTwo.exists()) {
                    uploadDirNewsGalleryTwo.mkdir();
                }

                String uuidFileNewsGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameNewsGalleryTwo = uuidFileNewsGalleryTwo + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryTwo));

                news.setPictureNewsGalleryTwo(resultFilenameNewsGalleryTwo);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirNewsGalleryThree = new File(uploadPath);
                if (!uploadDirNewsGalleryThree.exists()) {
                    uploadDirNewsGalleryThree.mkdir();
                }

                String uuidFileNewsGalleryThree = UUID.randomUUID().toString();
                String resultFilenameNewsGalleryThree = uuidFileNewsGalleryThree + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryThree));

                news.setPictureNewsGalleryThree(resultFilenameNewsGalleryThree);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirNewsGalleryFour = new File(uploadPath);
                if (!uploadDirNewsGalleryFour.exists()) {
                    uploadDirNewsGalleryFour.mkdir();
                }

                String uuidFileNewsGalleryFour = UUID.randomUUID().toString();
                String resultFilenameNewsGalleryFour = uuidFileNewsGalleryFour + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryFour));

                news.setPictureNewsGalleryFour(resultFilenameNewsGalleryFour);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirNewsGalleryFive = new File(uploadPath);
                if (!uploadDirNewsGalleryFive.exists()) {
                    uploadDirNewsGalleryFive.mkdir();
                }

                String uuidFileNewsGalleryFive = UUID.randomUUID().toString();
                String resultFilenameNewsGalleryFive = uuidFileNewsGalleryFive + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryFive));

                news.setPictureNewsGalleryFive(resultFilenameNewsGalleryFive);
            }
            model.addAttribute("news", null);
            newsService.createNews(news);

        }

        Iterable<News> news1 = newsService.getAllNews();

        model.addAttribute("news1", news1);
        // model.put("filter","");

        return "redirect:/news";
    }
}
