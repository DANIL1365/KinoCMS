package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.ContactPage;
import com.example.KinoCMS.domain.MainPage;
import com.example.KinoCMS.service.ContactPageService;
import com.example.KinoCMS.service.MainPageService;
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
public class ContactPageAddController {

    @Autowired
    ContactPageService contactPageService;

    @Value("${upload.path}")
    private String uploadPath;


    @GetMapping("/contactPageAdd")
    public String contactPageAdd(){

        return "contactPageAdd";
    }

    @GetMapping("/deleteContactPage/{id}")
    public String deleteContactPage(@PathVariable("id") Long id){
        contactPageService.deleteContactPageById(id);

        return "redirect:/pagePages";
    }

    @PostMapping("/contactPageAdd")
    public String createContactPage(
            @RequestParam String nameCinema,
            @RequestParam String address,
            @RequestParam("dateCreation")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateCreation,
            @RequestParam String mapCoordinates,
            @RequestParam("contactLogo") MultipartFile contactLogo,
            Map<String, Object> model) throws IOException {
        ContactPage contactPage = new ContactPage(nameCinema, address, dateCreation, mapCoordinates);

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
