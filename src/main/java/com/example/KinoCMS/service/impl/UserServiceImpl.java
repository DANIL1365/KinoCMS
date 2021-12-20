package com.example.KinoCMS.service.impl;


import com.example.KinoCMS.domain.Role;
import com.example.KinoCMS.domain.User;
import com.example.KinoCMS.repos.UserRepo;
import com.example.KinoCMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;


import java.util.Collections;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepo userRepo;

//    @Autowired
//    private JavaMailSender mailSender;



    @Override
    public boolean createUser(User user) {

        User userFromDb = userRepo.findUserByName(user.getName());
        if (userFromDb != null) {
            return false;
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        user.setActivationCode(UUID.randomUUID().toString());

        userRepo.save(user);

//        if (!ObjectUtils.isEmpty(user.getEmail())) {
//            String message = String.format(
//                    "Hello, %s! \n" +
//                            "Welcome to Sweater. Please, visit next link: http://localhost:8080/activate/%s",
//                    user.getName(),
//                    user.getActivationCode()
//            );
//
//            mailSender.send(user.getEmail(), "Activation code", message);
//        }
//
        return true;
    }

    @Override
    public void updateUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public Long getCountUser() {
        return userRepo.getCountUser();
    }

    @Override
    public boolean activateUser(String code) {
        User user = userRepo.findByActivationCode(code);

        return false;
    }


    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        return userRepo.findUserByName(name);
    }
}
