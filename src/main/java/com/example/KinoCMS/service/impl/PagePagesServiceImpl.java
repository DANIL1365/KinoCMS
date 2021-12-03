package com.example.KinoCMS.service.impl;

import com.example.KinoCMS.domain.PagePages;
import com.example.KinoCMS.repos.PagePagesRepo;
import com.example.KinoCMS.service.PagePagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagePagesServiceImpl implements PagePagesService {

    @Autowired
    PagePagesRepo pagePagesRepo;

    @Override
    public boolean createPagePages(PagePages pagePages) {
        pagePagesRepo.save(pagePages);
        return false;
    }

    @Override
    public void updatePagePages(PagePages pagePages) {
        pagePagesRepo.save(pagePages);
    }

    @Override
    public void deletePagePagesById(Long id) {
        pagePagesRepo.deleteById(id);
    }

    @Override
    public Iterable<PagePages> getAllPagePages() {
        return pagePagesRepo.findAll();
    }

    @Override
    public PagePages getPagePagesById(Long id) {
        return pagePagesRepo.findById(id).orElse(null);
    }

    @Override
    public Long getCountPagePages() {
        return pagePagesRepo.getCountPagePages();
    }
}
