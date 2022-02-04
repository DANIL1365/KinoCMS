package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.MainPage;
import com.example.KinoCMS.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
            @RequestParam(defaultValue = "false") Boolean onOf,
            @Valid MainPage mainPage,
            BindingResult bindingResult,
            Model model
    ) throws IOException {
        mainPage.setId(id);
        mainPage.setOnOf(onOf);

        if (bindingResult.hasErrors()) {
            Map<String, String> errors = ControllerUtils.getErrors(bindingResult);

            model.mergeAttributes(errors);
            model.addAttribute("mainPage", mainPage);

            return "mainPageUpdate";
        } else {

//            model.addAttribute("mainPage", null);
            mainPageService.createMainPage(mainPage);
        }


        Iterable<MainPage> mainPages= mainPageService.getAllMainPages();

        model.addAttribute("mainPages", mainPages);

        return "redirect:/pagePages";
    }




}
