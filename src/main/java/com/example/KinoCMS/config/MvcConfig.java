package com.example.KinoCMS.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Value("${upload.path}")
    private String uploadPath;

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/registration").setViewName("registration");
        registry.addViewController("/filmAdd").setViewName("filmAdd");
        registry.addViewController("/soonFilmAdd").setViewName("soonFilmAdd");
        registry.addViewController("/banners").setViewName("banners");
        registry.addViewController("/hallAdd").setViewName("hallAdd");
        registry.addViewController("/cinemas").setViewName("cinemas");
        registry.addViewController("/cinemasAdd").setViewName("cinemasAdd");
        registry.addViewController("/news").setViewName("news");
        registry.addViewController("/newsAdd").setViewName("newsAdd");
        registry.addViewController("/shares").setViewName("shares");
        registry.addViewController("/sharesAdd").setViewName("sharesAdd");
        registry.addViewController("/pagePages").setViewName("pagePages");
        registry.addViewController("/pageAdd").setViewName("pageAdd");
        registry.addViewController("/mainPageAdd").setViewName("mainPageAdd");
        registry.addViewController("/contactPageAdd").setViewName("contactPageAdd");
        //User part
        registry.addViewController("/userPartMain").setViewName("userPartMain");
        registry.addViewController("/userPoster").setViewName("userPoster");
        registry.addViewController("/userPosterSoon").setViewName("userPosterSoon");
        registry.addViewController("/userTimeTable").setViewName("userTimeTable");
        registry.addViewController("/userShares").setViewName("userShares");
        registry.addViewController("/userNews").setViewName("userNews");
        registry.addViewController("/getContactPage").setViewName("getContactPage");


    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations("file://" + uploadPath + "/");
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/build/**")
                .addResourceLocations("classpath:/build/");
        registry.addResourceHandler("/node_modules/**")
                .addResourceLocations("classpath:/node_modules/");
        registry.addResourceHandler("/pages/**")
                .addResourceLocations("classpath:/pages/");
        registry.addResourceHandler("/plugins/**")
                .addResourceLocations("classpath:/plugins/");
    }


}
