package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.*;
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
@RequestMapping(value = "/shares")
public class UpdateSharesController {

    @Autowired
    private SharesService sharesService;

    @Autowired
    MainPageService mainPageService;

    @Autowired
    MainBannerService mainBannerService;

    @Autowired
    PagePagesService pagePagesService;

    @Autowired
    ContactPageService contactPageService;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("{shares}")
    public String updateShares(@PathVariable Shares shares) {
        sharesService.updateShares(shares);
        return "updateShares";
    }

    @GetMapping("/edit/{id}")
    public String sharesEdit(@PathVariable("id") Long id, Model model) {

        Shares sharesUser = sharesService.getSharesById(id);

        model.addAttribute("sharesUser", sharesUser);

        Iterable<MainImageBanner> mainImageBanners = mainBannerService.getAllBanners();

        model.addAttribute("mainImageBanners", mainImageBanners);

        Iterable<MainPage> mainPage = mainPageService.getAllMainPages();

        model.addAttribute("mainPage", mainPage);

        Iterable<PagePages> pagePages = pagePagesService.getAllPagePages();

        model.addAttribute("pagePages", pagePages);

        Iterable<ContactPage> contactPages = contactPageService.getAllContactPages();

        model.addAttribute("contactPages", contactPages);

        return "getShares";
    }

    @PostMapping
    public String updateShares(
            @RequestParam("sharesId") Long id,
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
        shares.setId(id);

        if (bindingResult.hasErrors()) {
            System.out.println("Errors:" + bindingResult.getAllErrors());
            Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);


            model.mergeAttributes(errorsMap);
            model.addAttribute("shares", shares);

            return "updateShares";
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
// new
        return "redirect:/shares";
    }
}
