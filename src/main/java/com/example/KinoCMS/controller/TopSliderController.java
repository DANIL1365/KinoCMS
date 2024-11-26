package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.CurrentFilms;
import com.example.KinoCMS.domain.TopSlider;
import com.example.KinoCMS.repos.TopSliderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Controller
public class TopSliderController {

    @Autowired
    TopSliderRepo topSliderRepo;

    @Value("${upload.path}")
    private String uploadPath;


    @GetMapping("/bannersTop")
    public String sliderAdd(){
//        Iterable<CurrentFilms> films = filmsRepo.findAll();
//
//        model.addAttribute("films", films);

        return "banners";
    }

    @PostMapping("/bannersTop")
    public String addNewTopSlider(
            @RequestParam("firstTopImage") MultipartFile firstTopImage,
            @RequestParam("secondTopImage") MultipartFile secondTopImage,
            @RequestParam("thirdTopImage") MultipartFile thirdTopImage,
            @RequestParam("fourthTopImage") MultipartFile fourthTopImage,
            @RequestParam("fifthTopImage") MultipartFile fifthTopImage, Map<String, Object> model) throws IOException {
        TopSlider topSlider = new TopSlider();

        if (firstTopImage != null   && !firstTopImage.getOriginalFilename().isEmpty()) {
            File uploadDirfirstImage = new File(uploadPath);
            if (!uploadDirfirstImage.exists()) {
                uploadDirfirstImage.mkdir();
            }

            String uuidFilefirstImage = UUID.randomUUID().toString();
            String resultFilenamefirstImage = uuidFilefirstImage + "." + firstTopImage.getOriginalFilename();

            firstTopImage.transferTo(new File(uploadPath + "/" + resultFilenamefirstImage));

            topSlider.setFirstTopImage(resultFilenamefirstImage);
        }
        if (secondTopImage != null   && !secondTopImage.getOriginalFilename().isEmpty()) {
            File uploadDirsecondImage = new File(uploadPath);
            if (!uploadDirsecondImage.exists()) {
                uploadDirsecondImage.mkdir();
            }

            String uuidFilesecondImage = UUID.randomUUID().toString();
            String resultFilenamesecondImage = uuidFilesecondImage + "." + secondTopImage.getOriginalFilename();

            secondTopImage.transferTo(new File(uploadPath + "/" + resultFilenamesecondImage));

            topSlider.setSecondTopImage(resultFilenamesecondImage);
        }
        if (thirdTopImage != null   && !thirdTopImage.getOriginalFilename().isEmpty()) {
            File uploadDirthirdImage = new File(uploadPath);
            if (!uploadDirthirdImage.exists()) {
                uploadDirthirdImage.mkdir();
            }

            String uuidFilethirdImage = UUID.randomUUID().toString();
            String resultFilenamethirdImage = uuidFilethirdImage + "." + thirdTopImage.getOriginalFilename();

            thirdTopImage.transferTo(new File(uploadPath + "/" + resultFilenamethirdImage));

            topSlider.setThirdTopImage(resultFilenamethirdImage);
        }
        if (fourthTopImage != null   && !fourthTopImage.getOriginalFilename().isEmpty()) {
            File uploadDirfourthImage = new File(uploadPath);
            if (!uploadDirfourthImage.exists()) {
                uploadDirfourthImage.mkdir();
            }

            String uuidFilefourthImage = UUID.randomUUID().toString();
            String resultFilenamefourthImage = uuidFilefourthImage + "." + fourthTopImage.getOriginalFilename();

            fourthTopImage.transferTo(new File(uploadPath + "/" + resultFilenamefourthImage));

            topSlider.setFourthTopImage(resultFilenamefourthImage);
        }
        if (fifthTopImage != null   && !fifthTopImage.getOriginalFilename().isEmpty()) {
            File uploadDirfifthImage = new File(uploadPath);
            if (!uploadDirfifthImage.exists()) {
                uploadDirfifthImage.mkdir();
            }

            String uuidFilefifthImage = UUID.randomUUID().toString();
            String resultFilenamefifthImage = uuidFilefifthImage + "." + fifthTopImage.getOriginalFilename();

            fifthTopImage.transferTo(new File(uploadPath + "/" + resultFilenamefifthImage));

            topSlider.setFifthTopImage(resultFilenamefifthImage);
        }

        topSliderRepo.save(topSlider);

        Iterable<TopSlider> sliders = topSliderRepo.findAll();

        model.put("sliders", sliders);


        return "redirect:/banners";
    }
}
