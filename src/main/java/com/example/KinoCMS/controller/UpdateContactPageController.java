package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
import com.example.KinoCMS.repos.BottomSliderRepo;
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

    @Autowired
    private SoonFilmsService soonFilmsService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("{contactPage}")
    public String updateContact(@PathVariable ContactPage contactPage){
        contactPageService.updateContactPage(contactPage);
        return "contactPageUpdate";
    }

    @GetMapping
    public String contactList(Model model) {
        model.addAttribute("contacts", contactPageService.getAllContactPages());

        return "contactList";
    }

//    @GetMapping("/getContactPage")
//    public String contactEdit(Model model) {
//
//        Iterable<ContactPage> contactPageUser = contactPageService.getAllContactPages();
//
//        model.addAttribute("contactPageUser", contactPageUser);
//
//        Iterable<CurrentFilms> userFilms = filmsService.getAllCurrentFilms();
//
//        model.addAttribute("userFilms", userFilms);
//
//        Iterable<SoonFilms> soonFilmsUser = soonFilmsService.getAllSoonFilms();
//
//        model.addAttribute("soonFilmsUser", soonFilmsUser);
//
//        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();
//
//        model.addAttribute("mainImageBanners", mainImageBanners);
//
//        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();
//
//        model.addAttribute("mainPage", mainPage);
//
//        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();
//
//        model.addAttribute("pagePages", pagePages);
//
//
//        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();
//
//        model.addAttribute("contactPages", contactPages);
//
//        return "getContactPage";

//    }

    @PostMapping
    public String updateContactPage(
            @RequestParam("contactPageId") Long id,
            @Valid ContactPage contactPage,
            BindingResult bindingResult,
            Model model,
            @RequestParam(defaultValue = "false") Boolean onOf,
            @RequestParam("file") MultipartFile file,
            @RequestParam("file2") MultipartFile file2
    ) throws IOException {
        contactPage.setId(id);
        contactPage.setOnOf(onOf);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("contactPage", contactPage);

            return "contactPageUpdate";
        } else {
//        ContactPage contactPage = new ContactPage(id, nameCinema, address, dateCreation, mapCoordinates, onOf);

            if (file != null && !file.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);

                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + file.getOriginalFilename();

                file.transferTo(new File(uploadPath + "/" + resultFilename));

                contactPage.setContactLogo(resultFilename);
            }
            if (file2 != null && !file2.getOriginalFilename().isEmpty()) {
                File uploadDir = new File(uploadPath);

                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }

                String uuidFile = UUID.randomUUID().toString();
                String resultFilename = uuidFile + "." + file2.getOriginalFilename();

                file2.transferTo(new File(uploadPath + "/" + resultFilename));

                contactPage.setMapCoordinates(resultFilename);
            }

            model.addAttribute("contactPage", null);

            contactPageService.createContactPage(contactPage);

        }

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "redirect:/contactPage";
    }
}
// new