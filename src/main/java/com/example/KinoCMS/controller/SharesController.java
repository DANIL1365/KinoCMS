package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.Shares;
import com.example.KinoCMS.repos.SharesRepo;
import com.example.KinoCMS.service.SharesService;
import lombok.AllArgsConstructor;
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
//@RequestMapping("/shares")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SharesController {

    @Autowired
    private SharesService sharesService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/shares")
    public String shares(@RequestParam(required = false, defaultValue = "")String filter, Model model){
        Iterable<Shares> shares = sharesService.getAllShares();

        model.addAttribute("shares", shares);

        return "shares";
    }

    @GetMapping("/deleteShares/{id}")
    public String deleteShares(@PathVariable("id") Long id){
        sharesService.deleteSharesById(id);

        return "redirect:/shares";
    }

    @GetMapping("/sharesAdd")
    public String sharesAdd(){

        return "sharesAdd";
    }

    @PostMapping("/sharesAdd")
    public String addNewShares(
            @Valid Shares shares,
            BindingResult bindingResult,
            Model model,
            @RequestParam("mainPicture") MultipartFile mainPicture,
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
            model.addAttribute("shares", shares);

            return "sharesAdd";
        } else {

            if (mainPicture != null && !mainPicture.getOriginalFilename().isEmpty()) {
                File uploadDirmainSharesPicture = new File(uploadPath);
                if (!uploadDirmainSharesPicture.exists()) {
                    uploadDirmainSharesPicture.mkdir();
                }

                String uuidFilemainSharesPicture = UUID.randomUUID().toString();
                String resultFilenamemainSharesPicture = uuidFilemainSharesPicture + "." + mainPicture.getOriginalFilename();

                mainPicture.transferTo(new File(uploadPath + "/" + resultFilenamemainSharesPicture));

                shares.setMainSharesPicture(resultFilenamemainSharesPicture);
            }
            if (galleryOne != null && !galleryOne.getOriginalFilename().isEmpty()) {
                File uploadDirSharesGalleryOne = new File(uploadPath);
                if (!uploadDirSharesGalleryOne.exists()) {
                    uploadDirSharesGalleryOne.mkdir();
                }

                String uuidFileSharesGalleryOne = UUID.randomUUID().toString();
                String resultFilenameSharesGalleryOne = uuidFileSharesGalleryOne + "." + galleryOne.getOriginalFilename();

                galleryOne.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryOne));

                shares.setPictureSharesGalleryOne(resultFilenameSharesGalleryOne);
            }
            if (galleryTwo != null && !galleryTwo.getOriginalFilename().isEmpty()) {
                File uploadDirSharesGalleryTwo = new File(uploadPath);
                if (!uploadDirSharesGalleryTwo.exists()) {
                    uploadDirSharesGalleryTwo.mkdir();
                }

                String uuidFileSharesGalleryTwo = UUID.randomUUID().toString();
                String resultFilenameSharesGalleryTwo = uuidFileSharesGalleryTwo + "." + galleryTwo.getOriginalFilename();

                galleryTwo.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryTwo));

                shares.setPictureSharesGalleryTwo(resultFilenameSharesGalleryTwo);
            }
            if (galleryThree != null && !galleryThree.getOriginalFilename().isEmpty()) {
                File uploadDirSharesGalleryThree = new File(uploadPath);
                if (!uploadDirSharesGalleryThree.exists()) {
                    uploadDirSharesGalleryThree.mkdir();
                }

                String uuidFileSharesGalleryThree = UUID.randomUUID().toString();
                String resultFilenameSharesGalleryThree = uuidFileSharesGalleryThree + "." + galleryThree.getOriginalFilename();

                galleryThree.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryThree));

                shares.setPictureSharesGalleryThree(resultFilenameSharesGalleryThree);
            }
            if (galleryFour != null && !galleryFour.getOriginalFilename().isEmpty()) {
                File uploadDirSharesGalleryFour = new File(uploadPath);
                if (!uploadDirSharesGalleryFour.exists()) {
                    uploadDirSharesGalleryFour.mkdir();
                }

                String uuidFileSharesGalleryFour = UUID.randomUUID().toString();
                String resultFilenameSharesGalleryFour = uuidFileSharesGalleryFour + "." + galleryFour.getOriginalFilename();

                galleryFour.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryFour));

                shares.setPictureSharesGalleryFour(resultFilenameSharesGalleryFour);
            }
            if (galleryFive != null && !galleryFive.getOriginalFilename().isEmpty()) {
                File uploadDirSharesGalleryFive = new File(uploadPath);
                if (!uploadDirSharesGalleryFive.exists()) {
                    uploadDirSharesGalleryFive.mkdir();
                }

                String uuidFileSharesGalleryFive = UUID.randomUUID().toString();
                String resultFilenameSharesGalleryFive = uuidFileSharesGalleryFive + "." + galleryFive.getOriginalFilename();

                galleryFive.transferTo(new File(uploadPath + "/" + resultFilenameSharesGalleryFive));

                shares.setPictureSharesGalleryFive(resultFilenameSharesGalleryFive);
            }
            model.addAttribute("shares", null);
            sharesService.createShares(shares);

        }

        Iterable<Shares> shares1 = sharesService.getAllShares();

        model.addAttribute("shares1", shares1);
        // model.put("filter","");

        return "redirect:/shares";
    }
}
