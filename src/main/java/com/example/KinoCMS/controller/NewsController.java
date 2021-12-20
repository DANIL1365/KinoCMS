package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.News;

import com.example.KinoCMS.domain.Shares;
import com.example.KinoCMS.repos.NewsRepo;
import com.example.KinoCMS.service.NewsService;
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
//@RequestMapping(value = "/news")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/news")
//    @GetMapping
    public String news(@RequestParam(required = false, defaultValue = "")String filter, Model model){
        Iterable<News> newsServiceAllNews = newsService.getAllNews();

        model.addAttribute("newsServiceAllNews", newsServiceAllNews);

        if (filter != null && !filter.isEmpty()) {
            newsServiceAllNews = newsService.findByNameNews(filter);
        } else {
            newsServiceAllNews = newsService.getAllNews();
        }
        model.addAttribute("newsServiceAllNews", newsServiceAllNews);
        model.addAttribute("filter", filter);

        return "news";
    }

    @GetMapping("/newsAdd")
    public String newsAdd(){

        return "newsAdd";
    }

//    @GetMapping("{news}")
//    public String newsEditForm(@PathVariable News news){
//        newsService.updateNews(news);
//
//        return "newsEdit";
//    }

    @GetMapping("/delete/{id}")
    public String deleteNews(@PathVariable("id") Long id){
        newsService.deleteNewsById(id);

        return "redirect:/news";
    }

    @PostMapping("/newsAdd")
    public String addNewNews(
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
        News newsAdd = new News(nameNews,publicationDate, description, videoLink);



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
