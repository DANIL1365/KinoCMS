package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.ContactPage;


public interface ContactPageService {

    void createContactPage(ContactPage contactPage);

    void updateContactPage(ContactPage contactPage);

    void deleteContactPageById(Long id);

    Iterable<ContactPage> getAllContactPages();

    ContactPage getContactPageById(Long id);

    Long getCountContactPage();
}
