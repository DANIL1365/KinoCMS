package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.PagePages;
//
public interface PagePagesService {

    boolean createPagePages(PagePages pagePages);

    void updatePagePages(PagePages pagePages);

    void deletePagePagesById(Long id);

    Iterable<PagePages> getAllPagePages();

    PagePages getPagePagesById(Long id);

    Long getCountPagePages();
}
