package com.unicom.engineplan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.unicom.engineplan.model.JSONResult;
import com.unicom.engineplan.model.Mans;
import com.unicom.engineplan.service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "man")
public class ManController {
    @Autowired
    private ManService manservice;
    @RequestMapping(value = "list")
    public JSONResult getManlist(){
        List manlist = new ArrayList();
        Mans m1 = new Mans(1,"lizzy","lizzy@163.com","女");
        Mans m2 = new Mans(2,"sue","sue@qq.com","女");
        Mans m3 = new Mans(3,"jemmy","jemmy@139.com","男");
        Mans m4 = new Mans(4,"Shirley","Shirley@139.com","男");
        manlist.add(m1);
        manlist.add(m2);
        manlist.add(m3);
        manlist.add(m4);
        JSONResult results = new JSONResult(20000,manlist);
        return results;
    }
//    manlist 拦截
    @RequestMapping(value = "manlist")
    public JSONObject getAllManlist(){
        String jsonStr = "{\"code\":20000,\"data\":{\"items\":"+
                JSON.toJSONString(manservice.getAllMans())
                +"}}";
        JSONObject rs = JSONObject.parseObject(jsonStr);
        return  rs;
    }
}
