package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.News;

import com.example.KinoCMS.domain.PagePages;
import com.example.KinoCMS.domain.Shares;
import com.example.KinoCMS.repos.NewsRepo;
import com.example.KinoCMS.service.NewsService;
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
//            @RequestParam String nameNews,
//            @RequestParam("publicationDate")
//            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate publicationDate,
//            @RequestParam String description,
            @Valid News news,
            BindingResult bindingResult,
            Model model,
            @RequestParam("mainPicture") MultipartFile mainPicture,
            @RequestParam("galleryOne") MultipartFile galleryOne,
            @RequestParam("galleryTwo") MultipartFile galleryTwo,
            @RequestParam("galleryThree") MultipartFile galleryThree,
            @RequestParam("galleryFour") MultipartFile galleryFour,
            @RequestParam("galleryFive") MultipartFile galleryFive
//            @RequestParam String videoLink,
//            Map<String, Object> model
    ) throws IOException {

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("news", news);

            return "newsAdd";
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
