package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.ContactPage;
import com.example.KinoCMS.domain.MainPage;
import com.example.KinoCMS.service.ContactPageService;
import com.example.KinoCMS.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
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

        return "redirect:/contactPage";
    }

    @PostMapping("/contactPageAdd")
    public String createContactPage(

            @Valid ContactPage contactPage,
            BindingResult bindingResult,
            Model model,
            @RequestParam(defaultValue = "false") Boolean onOf,
            @RequestParam("file") MultipartFile file,
            @RequestParam("file2") MultipartFile file2
    ) throws IOException {
        contactPage.setOnOf(onOf);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("contactPage", contactPage);

            return "contactPageAdd";
        } else {

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
