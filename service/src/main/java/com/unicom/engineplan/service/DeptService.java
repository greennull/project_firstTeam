package com.unicom.engineplan.service;

import com.unicom.engineplan.dao.DeptDao;
import com.unicom.engineplan.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptDao deptDao;
    public List<Dept> getAllDept(){
        return deptDao.getAllDept();
    }
    //删除操作
    public int delDept(int id){
        return deptDao.delDept(id);
    }
    //新增操作
    public int saveDept(Dept dept){
        return deptDao.save(dept);
    }
    //修改操作
    public int updateDept(Dept dept){
        return deptDao.updateDept(dept);
    }
}
