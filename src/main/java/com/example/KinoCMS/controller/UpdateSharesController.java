package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.News;
import com.example.KinoCMS.domain.Shares;
import com.example.KinoCMS.service.SharesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "/shares")
public class UpdateSharesController {

    @Autowired
    private SharesService sharesService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("{shares}")
    public String updateShares(@PathVariable Shares shares) {
        sharesService.updateShares(shares);
        return "updateShares";
    }

    @PostMapping
    public String updateShares(
            @RequestParam("sharesId") Long id,
            @RequestParam String nameShares,
            @RequestParam("publicationDate")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate publicationDate,
            @RequestParam String description,
            @RequestParam("mainSharesPicture") MultipartFile mainSharesPicture,
            @RequestParam("pictureSharesGalleryOne") MultipartFile pictureSharesGalleryOne,
            @RequestParam("pictureSharesGalleryTwo") MultipartFile pictureSharesGalleryTwo,
            @RequestParam("pictureSharesGalleryThree") MultipartFile pictureSharesGalleryThree,
            @RequestParam("pictureSharesGalleryFour") MultipartFile pictureSharesGalleryFour,
            @RequestParam("pictureSharesGalleryFive") MultipartFile pictureSharesGalleryFive,
            @RequestParam String videoLink,
            Map<String, Object> model) throws IOException {
        Shares shares = new Shares(id, nameShares,publicationDate, description, videoLink);

        if (mainSharesPicture != null  && !mainSharesPicture.getOriginalFilename().isEmpty()) {
            File uploadDirmainSharesPicture = new File(uploadPath);
            if (!uploadDirmainSharesPicture.exists()) {
                uploadDirmainSharesPicture.mkdir();
            }

            String uuidFilemainSharesPicture = UUID.randomUUID().toString();
            String resultFilenamemainSharesPicture = uuidFilemainSharesPicture + "." + mainSharesPicture.getOriginalFilename();

            mainSharesPicture.transferTo(new File(uploadPath + "/" + resultFilenamemainSharesPicture));

            shares.setMainSharesPicture(resultFilenamemainSharesPicture);
        }
        if (pictureSharesGalleryOne != null   && !pictureSharesGalleryOne.getOriginalFilename().isEmpty()) {
            File uploadDirSharesGalleryOne = new File(uploadPath);
            if (!uploadDirSharesGalleryOne.exists()) {
                uploadDirSharesGalleryOne.mkdir();
            }

            String uuidFileSharesGalleryOne = UUID.randomUUID().toString();
            String resultFilenameSharesGalleryOne = uuidFileSharesGalleryOne + "." + pictureSharesGalleryOne.getOriginalFilename();

            pictureSharesGalleryOne.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryOne));

            shares.setPictureSharesGalleryOne(resultFilenameSharesGalleryOne);
        }
        if (pictureSharesGalleryTwo != null   && !pictureSharesGalleryTwo.getOriginalFilename().isEmpty()) {
            File uploadDirSharesGalleryTwo = new File(uploadPath);
            if (!uploadDirSharesGalleryTwo.exists()) {
                uploadDirSharesGalleryTwo.mkdir();
            }

            String uuidFileSharesGalleryTwo = UUID.randomUUID().toString();
            String resultFilenameSharesGalleryTwo = uuidFileSharesGalleryTwo + "." + pictureSharesGalleryTwo.getOriginalFilename();

            pictureSharesGalleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryTwo));

            shares.setPictureSharesGalleryTwo(resultFilenameSharesGalleryTwo);
        }
        if (pictureSharesGalleryThree != null   && !pictureSharesGalleryThree.getOriginalFilename().isEmpty()) {
            File uploadDirSharesGalleryThree = new File(uploadPath);
            if (!uploadDirSharesGalleryThree.exists()) {
                uploadDirSharesGalleryThree.mkdir();
            }

            String uuidFileSharesGalleryThree = UUID.randomUUID().toString();
            String resultFilenameSharesGalleryThree = uuidFileSharesGalleryThree + "." + pictureSharesGalleryThree.getOriginalFilename();

            pictureSharesGalleryThree.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryThree));

            shares.setPictureSharesGalleryThree(resultFilenameSharesGalleryThree);
        }
        if (pictureSharesGalleryFour != null   && !pictureSharesGalleryFour.getOriginalFilename().isEmpty()) {
            File uploadDirSharesGalleryFour = new File(uploadPath);
            if (!uploadDirSharesGalleryFour.exists()) {
                uploadDirSharesGalleryFour.mkdir();
            }

            String uuidFileSharesGalleryFour = UUID.randomUUID().toString();
            String resultFilenameSharesGalleryFour = uuidFileSharesGalleryFour + "." + pictureSharesGalleryFour.getOriginalFilename();

            pictureSharesGalleryFour.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryFour));

            shares.setPictureSharesGalleryFour(resultFilenameSharesGalleryFour);
        }
        if (pictureSharesGalleryFive != null   && !pictureSharesGalleryFive.getOriginalFilename().isEmpty()) {
            File uploadDirSharesGalleryFive = new File(uploadPath);
            if (!uploadDirSharesGalleryFive.exists()) {
                uploadDirSharesGalleryFive.mkdir();
            }

            String uuidFileSharesGalleryFive = UUID.randomUUID().toString();
            String resultFilenameSharesGalleryFive = uuidFileSharesGalleryFive + "." + pictureSharesGalleryFive.getOriginalFilename();

            pictureSharesGalleryFive.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryFive));

            shares.setPictureSharesGalleryFive(resultFilenameSharesGalleryFive);
        }

        sharesService.createShares(shares);

        Iterable<Shares> shares1 = sharesService.getAllShares();

        model.put("shares1", shares1);
        // model.put("filter","");

        return "redirect:/shares";
    }
}
