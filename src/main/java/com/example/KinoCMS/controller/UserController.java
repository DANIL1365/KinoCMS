package com.example.KinoCMS.controller;

import com.example.KinoCMS.domain.Role;
import com.example.KinoCMS.domain.User;
import com.example.KinoCMS.repos.UserRepo;
import com.example.KinoCMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/user")
@PreAuthorize("hasAuthority('ADMIN')")
public class UserController implements WebMvcConfigurer {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;


    @GetMapping
    public String userList(Model model) {
        model.addAttribute("users", userRepo.findAll());

        return "userList";
    }

    @GetMapping("{user}")
    public String userEditForm(@PathVariable User user, Model model){
        model.addAttribute("user", user);
        model.addAttribute("roles", Role.values());
        return "userEdit";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteUserById(id);

        return "redirect:/user";
    }

    @PostMapping
    public String userSave(
            @RequestParam String username,
            @RequestParam String surname,
            @RequestParam String alias,
            @RequestParam String email,
            @RequestParam String address,
            @RequestParam String password,
            @RequestParam Integer numberPhone,
            @RequestParam("dateBirth")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateBirth,
            @RequestParam Map<String, String> form,
            @RequestParam("userId") User user
    ){


        user.setUsername(username);
        user.setSurname(surname);
        user.setAlias(alias);
        user.setEmail(email);
        user.setAddress(address);
        user.setPassword(password);
        user.setNumberPhone(numberPhone);
        user.setDateBirth(dateBirth);

        Set<String> roles = Arrays.stream(Role.values())
                .map(Role::name)
                .collect(Collectors.toSet());

        user.getRoles().clear();

        for (String key : form.keySet()) {
            if (roles.contains(key)) {
                user.getRoles().add(Role.valueOf(key));
            }
        }
        userService.createUser(user);
        return "redirect:/user";
    }

}
