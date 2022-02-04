package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.Cinemas;
import com.example.KinoCMS.domain.Hall;
import com.example.KinoCMS.repos.CinemasRepo;
import com.example.KinoCMS.repos.HallRepo;
import com.example.KinoCMS.service.CinemasService;
import com.example.KinoCMS.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

//import javax.validation.Valid;
//import javax.validation.Valid;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class CinemasController {

    @Autowired
    private CinemasService cinemasService;

    @Autowired
    HallService hallService;

    @Value("${upload.path}")
    private String uploadPath;


    @GetMapping("/cinemas")
    public String cinemas(@RequestParam(required = false, defaultValue = "")String filter, Model model){
        Iterable<Cinemas> cinemas = cinemasService.getAllCinemas();

        if (filter != null && !filter.isEmpty()) {
            cinemas = cinemasService.findByNameCinema(filter);
        } else {
            cinemas = cinemasService.getAllCinemas();
        }
        model.addAttribute("cinemas", cinemas);
        model.addAttribute("filter", filter);

        return "cinemas";
    }


    @GetMapping("/cinemasAdd")
    public String cinemasAdd(){

        return "cinemasAdd";
    }


    @GetMapping("/deleteCinema/{id}")
    public String deleteCinema(@PathVariable("id") Long id){
        cinemasService.deleteCinemasById(id);

        return "redirect:/cinemas";
    }

    @PostMapping("/cinemasAdd")
    public String addNewCinemas(
            @Valid Cinemas cinemas,
            BindingResult bindingResult,
            Model model,
            @RequestParam("logoPicture") MultipartFile logoPicture,
            @RequestParam("top") MultipartFile top,
            @RequestParam("galleryOne") MultipartFile galleryOne,
            @RequestParam("galleryTwo") MultipartFile galleryTwo,
            @RequestParam("galleryThree") MultipartFile galleryThree,
            @RequestParam("galleryFour") MultipartFile galleryFour,
            @RequestParam("galleryFive") MultipartFile galleryFive
    ) throws IOException {

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("cinemas", cinemas);

            return "cinemasAdd";
        } else {

            if (logoPicture != null && !logoPicture.getOriginalFilename().isEmpty()) {
                File uploadDirlogo = new File(uploadPath);
                if (!uploadDirlogo.exists()) {
                    uploadDirlogo.mkdir();
                }

                String uuidFilelogo = UUID.randomUUID().toString();
                String resultFilenamelogo = uuidFilelogo + "." + logoPicture.getOriginalFilename();

                logoPicture.transferTo(new File(uploadPath + "/" + resultFilenamelogo));

                cinemas.setLogo(resultFilenamelogo);
            }
            if (top != null && !top.getOriginalFilename().isEmpty()) {
                File uploadDirtopBanner = new File(uploadPath);
                if (!uploadDirtopBanner.exists()) {
                    uploadDirtopBanner.mkdir();
                }

                String uuidFiletopBanner = UUID.randomUUID().toString();
                String resultFilenametopBanner = uuidFiletopBanner + "." + top.getOriginalFilename();

                top.transferTo(new File(uploadPath + "/" + resultFilenametopBanner));

                cinemas.setTopBanner(resultFilenametopBanner);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryOne = new File(uploadPath);
                if (!uploadDirGalleryOne.exists()) {
                    uploadDirGalleryOne.mkdir();
                }

                String uuidFileGalleryOne = UUID.randomUUID().toString();
                String resultFilenameGalleryOne = uuidFileGalleryOne + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

                cinemas.setPictureGalleryOne(resultFilenameGalleryOne);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryTwo = new File(uploadPath);
                if (!uploadDirGalleryTwo.exists()) {
                    uploadDirGalleryTwo.mkdir();
                }

                String uuidFileGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

                cinemas.setPictureGalleryTwo(resultFilenameGalleryTwo);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryThree = new File(uploadPath);
                if (!uploadDirGalleryThree.exists()) {
                    uploadDirGalleryThree.mkdir();
                }

                String uuidFileGalleryThree = UUID.randomUUID().toString();
                String resultFilenameGalleryThree = uuidFileGalleryThree + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

                cinemas.setPictureGalleryThree(resultFilenameGalleryThree);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFour = new File(uploadPath);
                if (!uploadDirGalleryFour.exists()) {
                    uploadDirGalleryFour.mkdir();
                }

                String uuidFileGalleryFour = UUID.randomUUID().toString();
                String resultFilenameGalleryFour = uuidFileGalleryFour + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

                cinemas.setPictureGalleryFour(resultFilenameGalleryFour);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFive = new File(uploadPath);
                if (!uploadDirGalleryFive.exists()) {
                    uploadDirGalleryFive.mkdir();
                }

                String uuidFileGalleryFive = UUID.randomUUID().toString();
                String resultFilenameGalleryFive = uuidFileGalleryFive + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

                cinemas.setPictureGalleryFive(resultFilenameGalleryFive);
            }

            model.addAttribute("cinemas", null);
            cinemasService.createCinemas(cinemas);

        }


        Iterable<Cinemas> cinemas1 = cinemasService.getAllCinemas();

        model.addAttribute("cinemas1", cinemas1);
        // model.put("filter","");

        return "redirect:/cinemas";
    }
}
