package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.MainImageBanner;
import com.example.KinoCMS.domain.Shares;
import com.example.KinoCMS.domain.TopSlider;
import com.example.KinoCMS.repos.MainBannerRepo;
import com.example.KinoCMS.service.MainBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class MainBannerController {

    @Autowired
    MainBannerService mainBannerService;

    @Value("${upload.path}")
    private String uploadPath;

//    @GetMapping("/banners")
//    public String banners(@RequestParam(required = false, defaultValue = "")Model model) {
//        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();
//
//        model.addAttribute("mainImageBanners", mainImageBanners);
//
//
//        return "banners";
//    }

    @GetMapping("/bannersMain")
    public String bannerAdd(){

        return "banners";
    }

    @GetMapping("/deleteBanner/{id}")
    public String deleteBanner(@PathVariable("id") Long id){
        mainBannerService.deleteMainBannerById(id);

        return "redirect:/banners";
    }

    @PostMapping("/bannersMain")
    public String addNewBanner(
            @RequestParam("pictureBanner") MultipartFile pictureBanner, Map<String, Object> model) throws IOException {
        MainImageBanner mainImageBanner = new MainImageBanner();

        if (pictureBanner != null   && !pictureBanner.getOriginalFilename().isEmpty()) {
            File uploadDirpictureBanner = new File(uploadPath);
            if (!uploadDirpictureBanner.exists()) {
                uploadDirpictureBanner.mkdir();
            }

            String uuidFilepictureBanner = UUID.randomUUID().toString();
            String resultFilenamepictureBanner = uuidFilepictureBanner + "." + pictureBanner.getOriginalFilename();

            pictureBanner.transferTo(new File(uploadPath + "/" + resultFilenamepictureBanner));

            mainImageBanner.setPictureBanner(resultFilenamepictureBanner);
        }
        mainBannerService.createBanner(mainImageBanner);

        Iterable<MainImageBanner> banners = mainBannerService.getAllBanners();

        model.put("banners", banners);


        return "redirect:/banners";
    }
}
