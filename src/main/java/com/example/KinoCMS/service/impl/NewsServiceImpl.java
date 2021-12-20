package com.example.KinoCMS.service.impl;


import com.example.KinoCMS.domain.News;
import com.example.KinoCMS.repos.NewsRepo;
import com.example.KinoCMS.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepo newsRepo;

    @Override
    public void createNews(News news) {
        newsRepo.save(news);
    }

    @Override
    public void updateNews(News news) {
        newsRepo.save(news);
    }

    @Override
    public void deleteNewsById(Long id) {
        newsRepo.deleteById(id);
    }

    @Override
    public News getNewsById(Long id) {

        return newsRepo.findById(id).orElse(null);
    }

    @Override
    public Long getCountNews() {
        return newsRepo.getCountNews();
    }


    @Override
    public Iterable<News> getAllNews() {
        return newsRepo.findAll();
    }


    @Override
    public List<News> findByNameNews(String nameNews) {
        return newsRepo.findByNameNews(nameNews);
    }
}
