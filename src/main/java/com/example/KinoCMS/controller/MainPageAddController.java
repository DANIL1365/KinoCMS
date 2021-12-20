package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.MainPage;
import com.example.KinoCMS.domain.PagePages;
import com.example.KinoCMS.service.MainPageService;
import com.example.KinoCMS.service.PagePagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

@Controller
public class MainPageAddController {

    @Autowired
    MainPageService mainPageService;


    @GetMapping("/mainPageAdd")
    public String mainPageAdd(){

        return "mainPageAdd";
    }

    @GetMapping("/deleteMainPage/{id}")
    public String deleteMainPage(@PathVariable("id") Long id){
        mainPageService.deleteMainPageById(id);

        return "redirect:/pagePages";
    }

    @PostMapping("/mainPageAdd")
    public String createMainPage(
            @RequestParam String numberOne,
            @RequestParam String numberTwo,
            @RequestParam String seoText,
            @RequestParam("dateCreationMain")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateMainCreation,
            Map<String, Object> model) throws IOException {
        MainPage mainPage = new MainPage(numberOne, numberTwo, seoText, dateMainCreation);


        mainPageService.createMainPage(mainPage);

        Iterable<MainPage> mainPages = mainPageService.getAllMainPages();

        model.put("mainPages", mainPages);

        return "redirect:/pagePages";
    }
}
