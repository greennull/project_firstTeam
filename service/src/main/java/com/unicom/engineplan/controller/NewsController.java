package com.unicom.engineplan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.unicom.engineplan.service.ManService;
import com.unicom.engineplan.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "news")
public class NewsController {
    @Autowired
    private NewsService newservice;
    @GetMapping(value = "newslist")
    public JSONObject getAllnews(){
        String jsonStr = "{\"code\":20000,\"data\":{\"items\":"+
                JSON.toJSONString(newservice.getAllnews())
                +"}}";
        JSONObject rs = JSONObject.parseObject(jsonStr);
        return  rs;
    }
    @DeleteMapping(value = "{delid}")

    public JSONObject delNews(@PathVariable(name = "delid") int id){
        int i = newservice.delNews(id);
        if(i>0){
            String jsonStr = "{\"code\":20000,\"data\":\"success\"}";
            return JSONObject.parseObject(jsonStr);
        }else{
            String jsonStr = "{\"code\":100,\"data\":\"delete fail\"}";
            return JSONObject.parseObject(jsonStr);
        }

    }
}
