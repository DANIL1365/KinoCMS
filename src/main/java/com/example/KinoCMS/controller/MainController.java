package com.example.KinoCMS.controller;


import com.example.KinoCMS.domain.CurrentFilms;


import com.example.KinoCMS.repos.FilmsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private FilmsRepo filmsRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        Iterable<CurrentFilms> films = filmsRepo.findAll();
        model.put("films", films);
        return "main";
    }
    @PostMapping("/main")
    public String addNewFilm(@RequestParam String nameCinema, @RequestParam String description, @RequestParam byte mainPicture,
                             @RequestParam byte pictureGallery, @RequestParam String trailerLink, @RequestParam String typeCinema, Map<String, Object> model){
       CurrentFilms film = new CurrentFilms(nameCinema, description, mainPicture, pictureGallery, trailerLink, typeCinema);

       filmsRepo.save(film);

        Iterable<CurrentFilms> films = filmsRepo.findAll();
        model.put("films", films);
       return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<CurrentFilms> films;
        if (filter != null && !filter.isEmpty()) {
            films = filmsRepo.findByNameCinema(filter);
        } else {
            films = filmsRepo.findAll();
        }
        model.put("films", films);
        return "main";
    }

}
