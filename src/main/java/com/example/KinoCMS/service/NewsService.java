package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.News;

import java.util.List;


public interface NewsService {

    void createNews(News news);

    void updateNews(News news);

    void deleteNewsById(Long id);

    News getNewsById(Long id);

    Iterable<News> getAllNews();

    Long getCountNews();

    List<News> findByNameNews(String nameNews);



}
