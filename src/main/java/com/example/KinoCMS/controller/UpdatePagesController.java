package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.service.ContactPageService;
import com.example.KinoCMS.service.MainBannerService;
import com.example.KinoCMS.service.MainPageService;
import com.example.KinoCMS.service.PagePagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
            @RequestParam String namePage,
            @RequestParam String description,
            @RequestParam("dateCreation")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateCreation,
            @RequestParam(defaultValue = "false") Boolean onOf,
            @RequestParam("pagePicture") MultipartFile pagePicture,
            @RequestParam("pictureGalleryOne") MultipartFile pictureGalleryOne,
            @RequestParam("pictureGalleryTwo") MultipartFile pictureGalleryTwo,
            @RequestParam("pictureGalleryThree") MultipartFile pictureGalleryThree,
            @RequestParam("pictureGalleryFour") MultipartFile pictureGalleryFour,
            @RequestParam("pictureGalleryFive") MultipartFile pictureGalleryFive,
                             Map<String, Object> model) throws IOException {
        PagePages pagePages = new PagePages(id, namePage, description, dateCreation, onOf);

        if (pagePicture != null  && !pagePicture.getOriginalFilename().isEmpty()) {
            File uploadDirpagePicture = new File(uploadPath);
            if (!uploadDirpagePicture.exists()) {
                uploadDirpagePicture.mkdir();
            }

            String uuidFilepagePicture = UUID.randomUUID().toString();
            String resultFilenamepagePicture = uuidFilepagePicture + "." + pagePicture.getOriginalFilename();

            pagePicture.transferTo(new File(uploadPath + "/" + resultFilenamepagePicture));

            pagePages.setPagePicture(resultFilenamepagePicture);
        }
        if (pictureGalleryOne != null   && !pictureGalleryOne.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryOne = new File(uploadPath);
            if (!uploadDirGalleryOne.exists()) {
                uploadDirGalleryOne.mkdir();
            }

            String uuidFileGalleryOne = UUID.randomUUID().toString();
            String resultFilenameGalleryOne = uuidFileGalleryOne + "." + pictureGalleryOne.getOriginalFilename();

            pictureGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

            pagePages.setPictureGalleryOne(resultFilenameGalleryOne);
        }
        if (pictureGalleryTwo != null   && !pictureGalleryTwo.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryTwo = new File(uploadPath);
            if (!uploadDirGalleryTwo.exists()) {
                uploadDirGalleryTwo.mkdir();
            }

            String uuidFileGalleryTwo = UUID.randomUUID().toString();
            String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + pictureGalleryTwo.getOriginalFilename();

            pictureGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

            pagePages.setPictureGalleryTwo(resultFilenameGalleryTwo);
        }
        if (pictureGalleryThree != null   && !pictureGalleryThree.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryThree = new File(uploadPath);
            if (!uploadDirGalleryThree.exists()) {
                uploadDirGalleryThree.mkdir();
            }

            String uuidFileGalleryThree = UUID.randomUUID().toString();
            String resultFilenameGalleryThree = uuidFileGalleryThree + "." + pictureGalleryThree.getOriginalFilename();

            pictureGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

            pagePages.setPictureGalleryThree(resultFilenameGalleryThree);
        }
        if (pictureGalleryFour != null   && !pictureGalleryFour.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFour = new File(uploadPath);
            if (!uploadDirGalleryFour.exists()) {
                uploadDirGalleryFour.mkdir();
            }

            String uuidFileGalleryFour = UUID.randomUUID().toString();
            String resultFilenameGalleryFour = uuidFileGalleryFour + "." + pictureGalleryFour.getOriginalFilename();

            pictureGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

            pagePages.setPictureGalleryFour(resultFilenameGalleryFour);
        }
        if (pictureGalleryFive != null   && !pictureGalleryFive.getOriginalFilename().isEmpty()) {
            File uploadDirGalleryFive = new File(uploadPath);
            if (!uploadDirGalleryFive.exists()) {
                uploadDirGalleryFive.mkdir();
            }

            String uuidFileGalleryFive = UUID.randomUUID().toString();
            String resultFilenameGalleryFive = uuidFileGalleryFive + "." + pictureGalleryFive.getOriginalFilename();

            pictureGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

            pagePages.setPictureGalleryFive(resultFilenameGalleryFive);
        }

        pagePagesService.createPagePages(pagePages);

        Iterable<PagePages> pages = pagePagesService.getAllPagePages();

        model.put("pages", pages);

        return "redirect:/pagePages";
    }


}
