package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
            @RequestParam String nameNews,
            @RequestParam("publicationDate")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate publicationDate,
            @RequestParam String description,
            @RequestParam("mainNewsPicture") MultipartFile mainNewsPicture,
            @RequestParam("pictureNewsGalleryOne") MultipartFile pictureNewsGalleryOne,
            @RequestParam("pictureNewsGalleryTwo") MultipartFile pictureNewsGalleryTwo,
            @RequestParam("pictureNewsGalleryThree") MultipartFile pictureNewsGalleryThree,
            @RequestParam("pictureNewsGalleryFour") MultipartFile pictureNewsGalleryFour,
            @RequestParam("pictureNewsGalleryFive") MultipartFile pictureNewsGalleryFive,
            @RequestParam String videoLink,
            Map<String, Object> model) throws IOException {
        News newsAdd = new News(id, nameNews,publicationDate, description, videoLink);



        if (mainNewsPicture != null  && !mainNewsPicture.getOriginalFilename().isEmpty()) {
            File uploadDirmainNewsPicture = new File(uploadPath);
            if (!uploadDirmainNewsPicture.exists()) {
                uploadDirmainNewsPicture.mkdir();
            }

            String uuidFilemainNewsPicture = UUID.randomUUID().toString();
            String resultFilenamemainNewsPicture = uuidFilemainNewsPicture + "." + mainNewsPicture.getOriginalFilename();

            mainNewsPicture.transferTo(new File(uploadPath + "/" + resultFilenamemainNewsPicture));

            newsAdd.setMainNewsPicture(resultFilenamemainNewsPicture);
        }
        if (pictureNewsGalleryOne != null   && !pictureNewsGalleryOne.getOriginalFilename().isEmpty()) {
            File uploadDirNewsGalleryOne = new File(uploadPath);
            if (!uploadDirNewsGalleryOne.exists()) {
                uploadDirNewsGalleryOne.mkdir();
            }

            String uuidFileNewsGalleryOne = UUID.randomUUID().toString();
            String resultFilenameNewsGalleryOne = uuidFileNewsGalleryOne + "." + pictureNewsGalleryOne.getOriginalFilename();

            pictureNewsGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryOne));

            newsAdd.setPictureNewsGalleryOne(resultFilenameNewsGalleryOne);
        }
        if (pictureNewsGalleryTwo != null   && !pictureNewsGalleryTwo.getOriginalFilename().isEmpty()) {
            File uploadDirNewsGalleryTwo = new File(uploadPath);
            if (!uploadDirNewsGalleryTwo.exists()) {
                uploadDirNewsGalleryTwo.mkdir();
            }

            String uuidFileNewsGalleryTwo = UUID.randomUUID().toString();
            String resultFilenameNewsGalleryTwo = uuidFileNewsGalleryTwo + "." + pictureNewsGalleryTwo.getOriginalFilename();

            pictureNewsGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryTwo));

            newsAdd.setPictureNewsGalleryTwo(resultFilenameNewsGalleryTwo);
        }
        if (pictureNewsGalleryThree != null   && !pictureNewsGalleryThree.getOriginalFilename().isEmpty()) {
            File uploadDirNewsGalleryThree = new File(uploadPath);
            if (!uploadDirNewsGalleryThree.exists()) {
                uploadDirNewsGalleryThree.mkdir();
            }

            String uuidFileNewsGalleryThree = UUID.randomUUID().toString();
            String resultFilenameNewsGalleryThree = uuidFileNewsGalleryThree + "." + pictureNewsGalleryThree.getOriginalFilename();

            pictureNewsGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryThree));

            newsAdd.setPictureNewsGalleryThree(resultFilenameNewsGalleryThree);
        }
        if (pictureNewsGalleryFour != null   && !pictureNewsGalleryFour.getOriginalFilename().isEmpty()) {
            File uploadDirNewsGalleryFour = new File(uploadPath);
            if (!uploadDirNewsGalleryFour.exists()) {
                uploadDirNewsGalleryFour.mkdir();
            }

            String uuidFileNewsGalleryFour = UUID.randomUUID().toString();
            String resultFilenameNewsGalleryFour = uuidFileNewsGalleryFour + "." + pictureNewsGalleryFour.getOriginalFilename();

            pictureNewsGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryFour));

            newsAdd.setPictureNewsGalleryFour(resultFilenameNewsGalleryFour);
        }
        if (pictureNewsGalleryFive != null   && !pictureNewsGalleryFive.getOriginalFilename().isEmpty()) {
            File uploadDirNewsGalleryFive = new File(uploadPath);
            if (!uploadDirNewsGalleryFive.exists()) {
                uploadDirNewsGalleryFive.mkdir();
            }

            String uuidFileNewsGalleryFive = UUID.randomUUID().toString();
            String resultFilenameNewsGalleryFive = uuidFileNewsGalleryFive + "." + pictureNewsGalleryFive.getOriginalFilename();

            pictureNewsGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameNewsGalleryFive));

            newsAdd.setPictureNewsGalleryFive(resultFilenameNewsGalleryFive);
        }

        newsService.createNews(newsAdd);

        Iterable<News> news1 = newsService.getAllNews();

        model.put("news1", news1);
        // model.put("filter","");

        return "redirect:/news";
    }
}
