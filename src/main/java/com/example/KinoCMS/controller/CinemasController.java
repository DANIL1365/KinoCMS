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
//            @RequestParam String nameCinema,
//            @RequestParam String descriptionCinema,
//            @RequestParam String conditionsCinema,
            @Valid Cinemas cinema,
            BindingResult bindingResult,
            Model model,
            @RequestParam("logo") MultipartFile logo,
            @RequestParam("topBanner") MultipartFile topBanner,
            @RequestParam("pictureGalleryOne") MultipartFile pictureGalleryOne,
            @RequestParam("pictureGalleryTwo") MultipartFile pictureGalleryTwo,
            @RequestParam("pictureGalleryThree") MultipartFile pictureGalleryThree,
            @RequestParam("pictureGalleryFour") MultipartFile pictureGalleryFour,
            @RequestParam("pictureGalleryFive") MultipartFile pictureGalleryFive
//            Map<String, Object> model
    ) throws IOException {
//        Cinemas cinema = new Cinemas(nameCinema, descriptionCinema, conditionsCinema);
    System.out.println("cinema:" + cinema);
        if (bindingResult.hasErrors()) {
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);
            System.out.println("error");

            model.mergeAttributes(errorsMap);
            model.addAttribute("cinema", cinema);

            return "cinemasAdd";
        } else {
            System.out.println("OK");
            if (logo != null && !logo.getOriginalFilename().isEmpty()) {
                File uploadDirlogo = new File(uploadPath);
                if (!uploadDirlogo.exists()) {
                    uploadDirlogo.mkdir();
                }

                String uuidFilelogo = UUID.randomUUID().toString();
                String resultFilenamelogo = uuidFilelogo + "." + logo.getOriginalFilename();

                logo.transferTo(new File(uploadPath + "/" + resultFilenamelogo));

                cinema.setLogo(resultFilenamelogo);
            }
            if (topBanner != null && !topBanner.getOriginalFilename().isEmpty()) {
                File uploadDirtopBanner = new File(uploadPath);
                if (!uploadDirtopBanner.exists()) {
                    uploadDirtopBanner.mkdir();
                }

                String uuidFiletopBanner = UUID.randomUUID().toString();
                String resultFilenametopBanner = uuidFiletopBanner + "." + logo.getOriginalFilename();

                logo.transferTo(new File(uploadPath + "/" + resultFilenametopBanner));

                cinema.setTopBanner(resultFilenametopBanner);
            }
            if (pictureGalleryOne != null && !pictureGalleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryOne = new File(uploadPath);
                if (!uploadDirGalleryOne.exists()) {
                    uploadDirGalleryOne.mkdir();
                }

                String uuidFileGalleryOne = UUID.randomUUID().toString();
                String resultFilenameGalleryOne = uuidFileGalleryOne + "." + pictureGalleryOne.getOriginalFilename();

                pictureGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameGalleryOne));

                cinema.setPictureGalleryOne(resultFilenameGalleryOne);
            }
            if (pictureGalleryTwo != null && !pictureGalleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryTwo = new File(uploadPath);
                if (!uploadDirGalleryTwo.exists()) {
                    uploadDirGalleryTwo.mkdir();
                }

                String uuidFileGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameGalleryTwo = uuidFileGalleryTwo + "." + pictureGalleryTwo.getOriginalFilename();

                pictureGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameGalleryTwo));

                cinema.setPictureGalleryTwo(resultFilenameGalleryTwo);
            }
            if (pictureGalleryThree != null && !pictureGalleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryThree = new File(uploadPath);
                if (!uploadDirGalleryThree.exists()) {
                    uploadDirGalleryThree.mkdir();
                }

                String uuidFileGalleryThree = UUID.randomUUID().toString();
                String resultFilenameGalleryThree = uuidFileGalleryThree + "." + pictureGalleryThree.getOriginalFilename();

                pictureGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameGalleryThree));

                cinema.setPictureGalleryThree(resultFilenameGalleryThree);
            }
            if (pictureGalleryFour != null && !pictureGalleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFour = new File(uploadPath);
                if (!uploadDirGalleryFour.exists()) {
                    uploadDirGalleryFour.mkdir();
                }

                String uuidFileGalleryFour = UUID.randomUUID().toString();
                String resultFilenameGalleryFour = uuidFileGalleryFour + "." + pictureGalleryFour.getOriginalFilename();

                pictureGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFour));

                cinema.setPictureGalleryFour(resultFilenameGalleryFour);
            }
            if (pictureGalleryFive != null && !pictureGalleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirGalleryFive = new File(uploadPath);
                if (!uploadDirGalleryFive.exists()) {
                    uploadDirGalleryFive.mkdir();
                }

                String uuidFileGalleryFive = UUID.randomUUID().toString();
                String resultFilenameGalleryFive = uuidFileGalleryFive + "." + pictureGalleryFive.getOriginalFilename();

                pictureGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameGalleryFive));

                cinema.setPictureGalleryFive(resultFilenameGalleryFive);
            }

            model.addAttribute("cinema", null);

            cinemasService.createCinemas(cinema);

        }

        Iterable<Cinemas> cinemas1 = cinemasService.getAllCinemas();

        model.addAttribute("cinemas1", cinemas1);
        // model.put("filter","");

        return "redirect:/cinemas";
    }
}
