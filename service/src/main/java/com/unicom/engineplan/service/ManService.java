package com.unicom.engineplan.service;

import com.unicom.engineplan.dao.MansDao;
import com.unicom.engineplan.model.Mans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManService {
    @Autowired
    private MansDao mansDao;
    public List<Mans> getAllMans(){
        return mansDao.getAllMans();
    }
}
