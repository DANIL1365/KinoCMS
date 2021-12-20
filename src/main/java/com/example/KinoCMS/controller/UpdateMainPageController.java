package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.MainPage;
import com.example.KinoCMS.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
@Controller
@RequestMapping("/mainPage")
public class UpdateMainPageController {

    @Autowired
    MainPageService mainPageService;


    @GetMapping("{mainPage}")
    public String updateMain(@PathVariable MainPage mainPage){
        mainPageService.updateMainPage(mainPage);
        return "mainPageUpdate";
    }

    @PostMapping
    public String updateMainPage(
            @RequestParam("mainPageId") Long id,
            @RequestParam String numberOne,
            @RequestParam String numberTwo,
            @RequestParam String seoText,
            @RequestParam("dateCreationMain")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateMainCreation,
            Map<String, Object> model) throws IOException {
        MainPage mainPages = new MainPage(id, numberOne, numberTwo, seoText, dateMainCreation);


        mainPageService.createMainPage(mainPages);

        Iterable<MainPage> mainPageIterable = mainPageService.getAllMainPages();

        model.put("mainPages", mainPageIterable);

        return "redirect:/pagePages";
    }



}
