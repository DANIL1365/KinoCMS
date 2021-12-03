package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.BottomSlider;
import com.example.KinoCMS.domain.TopSlider;
import com.example.KinoCMS.repos.BottomSliderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class BottomSliderController {

    @Autowired
    BottomSliderRepo bottomSliderRepo;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/bannersBottom")
    public String bottomAdd() {

        return "banners";
    }

    @PostMapping("/bannersBottom")
    public String addNewBottomSlider(
            @RequestParam("firstImage") MultipartFile firstImage,
            @RequestParam("secondImage") MultipartFile secondImage,
            @RequestParam("thirdImage") MultipartFile thirdImage,
            @RequestParam("fourthImage") MultipartFile fourthImage,
            @RequestParam("fifthImage") MultipartFile fifthImage, Map<String, Object> model) throws IOException {
        BottomSlider bottomSlider = new BottomSlider();

        if (firstImage != null   && !firstImage.getOriginalFilename().isEmpty()) {
            File uploadDirfirstImage = new File(uploadPath);
            if (!uploadDirfirstImage.exists()) {
                uploadDirfirstImage.mkdir();
            }

            String uuidFilefirstImage = UUID.randomUUID().toString();
            String resultFilenamefirstImage = uuidFilefirstImage + "." + firstImage.getOriginalFilename();

            firstImage.transferTo(new File(uploadPath + "/" + resultFilenamefirstImage));

            bottomSlider.setFirstImage(resultFilenamefirstImage);
        }
        if (secondImage != null   && !secondImage.getOriginalFilename().isEmpty()) {
            File uploadDirsecondImage = new File(uploadPath);
            if (!uploadDirsecondImage.exists()) {
                uploadDirsecondImage.mkdir();
            }

            String uuidFilesecondImage = UUID.randomUUID().toString();
            String resultFilenamesecondImage = uuidFilesecondImage + "." + secondImage.getOriginalFilename();

            secondImage.transferTo(new File(uploadPath + "/" + resultFilenamesecondImage));

            bottomSlider.setSecondImage(resultFilenamesecondImage);
        }
        if (thirdImage != null   && !thirdImage.getOriginalFilename().isEmpty()) {
            File uploadDirthirdImage = new File(uploadPath);
            if (!uploadDirthirdImage.exists()) {
                uploadDirthirdImage.mkdir();
            }

            String uuidFilethirdImage = UUID.randomUUID().toString();
            String resultFilenamethirdImage = uuidFilethirdImage + "." + thirdImage.getOriginalFilename();

            thirdImage.transferTo(new File(uploadPath + "/" + resultFilenamethirdImage));

            bottomSlider.setThirdImage(resultFilenamethirdImage);
        }
        if (fourthImage != null   && !fourthImage.getOriginalFilename().isEmpty()) {
            File uploadDirfourthImage = new File(uploadPath);
            if (!uploadDirfourthImage.exists()) {
                uploadDirfourthImage.mkdir();
            }

            String uuidFilefourthImage = UUID.randomUUID().toString();
            String resultFilenamefourthImage = uuidFilefourthImage + "." + fourthImage.getOriginalFilename();

            fourthImage.transferTo(new File(uploadPath + "/" + resultFilenamefourthImage));

            bottomSlider.setFourthImage(resultFilenamefourthImage);
        }
        if (fifthImage != null   && !fifthImage.getOriginalFilename().isEmpty()) {
            File uploadDirfifthImage = new File(uploadPath);
            if (!uploadDirfifthImage.exists()) {
                uploadDirfifthImage.mkdir();
            }

            String uuidFilefifthImage = UUID.randomUUID().toString();
            String resultFilenamefifthImage = uuidFilefifthImage + "." + fifthImage.getOriginalFilename();

            fifthImage.transferTo(new File(uploadPath + "/" + resultFilenamefifthImage));

            bottomSlider.setFifthImage(resultFilenamefifthImage);
        }

        bottomSliderRepo.save(bottomSlider);

        Iterable<BottomSlider> bottomSliders = bottomSliderRepo.findAll();

        model.put("slidersBottom", bottomSliders);
        // model.put("filter","");

        return "redirect:/banners";
    }
}
