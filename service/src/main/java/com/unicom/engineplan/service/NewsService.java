package com.unicom.engineplan.service;

import com.unicom.engineplan.dao.NewsDao;
import com.unicom.engineplan.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsDao newsDao;
    public List<News> getAllnews(){
        return  newsDao.getAllnews();
    }
    //删除操作
    public int delNews(int id){
        return newsDao.delNews(id);
    }
}
