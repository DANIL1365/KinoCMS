package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.repos.BottomSliderRepo;
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
@RequestMapping("/contactPage")
public class UpdateContactPageController {

    @Autowired
    ContactPageService contactPageService;

    @Autowired
    private CinemasService cinemasService;

    @Autowired
    HallService hallService;

    @Autowired
    MainPageService mainPageService;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    private FilmsService filmsService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("{contactPage}")
    public String updateContact(@PathVariable ContactPage contactPage){
        contactPageService.updateContactPage(contactPage);
        return "contactPageUpdate";
    }

    @GetMapping("/edit/{id}")
    public String contactEdit(@PathVariable("id") Long id, Model model) {

        ContactPage contactPageUser = contactPageService.getContactPageById(id);

        model.addAttribute("contactPageUser", contactPageUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "getContactPage";

    }

    @PostMapping
    public String updateContactPage(
            @RequestParam("contactPageId") Long id,
            @RequestParam String nameCinema,
            @RequestParam String address,
            @RequestParam("dateCreation")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateCreation,
            @RequestParam String mapCoordinates,
            @RequestParam("contactLogo") MultipartFile contactLogo,
            Map<String, Object> model) throws IOException {
        ContactPage contactPage = new ContactPage(id, nameCinema, address, dateCreation, mapCoordinates);

        if (contactLogo != null  && !contactLogo.getOriginalFilename().isEmpty()) {
            File uploadDircontactLogo = new File(uploadPath);
            if (!uploadDircontactLogo.exists()) {
                uploadDircontactLogo.mkdir();
            }

            String uuidFileMain = UUID.randomUUID().toString();
            String resultFilenameMain = uuidFileMain + "." + contactLogo.getOriginalFilename();

            contactLogo.transferTo(new File(uploadPath + "/" + resultFilenameMain));

            contactPage.setContactLogo(resultFilenameMain);
        }


        contactPageService.createContactPage(contactPage);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.put("contactPages", contactPages);

        return "redirect:/pagePages";
    }
}
