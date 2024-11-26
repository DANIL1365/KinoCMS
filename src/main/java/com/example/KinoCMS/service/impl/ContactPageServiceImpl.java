package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.ContactPage;
import com.example.KinoCMS.repos.ContactPageRepo;
import com.example.KinoCMS.service.ContactPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
@Service
public class ContactPageServiceImpl implements ContactPageService {

    @Autowired
    ContactPageRepo contactPageRepo;

    @Override
    public void createContactPage(ContactPage contactPage) {
        contactPageRepo.save(contactPage);
    }

    @Override
    public void updateContactPage(ContactPage contactPage) {
        contactPageRepo.save(contactPage);
    }

    @Override
    public void deleteContactPageById(Long id) {
        contactPageRepo.deleteById(id);
    }

    @Override
    public Iterable<ContactPage> getAllContactPages() {
        return contactPageRepo.findAll();
    }

    @Override
    public ContactPage getContactPageById(Long id) {
        return contactPageRepo.findById(id).orElse(null);
    }

    @Override
    public Long getCountContactPage() {
        return contactPageRepo.getCountContactPage();
    }
}
