package com.unicom.engineplan.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import  com.unicom.engineplan.model.Dept;
import com.unicom.engineplan.model.JSONResult;
import com.unicom.engineplan.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //说明这是一个控制器，给前端提供JSON数据
@RequestMapping(value = "dept") //用来进行请求映射  http://xxxx/dept
public class DeptController {
    @Autowired
    private DeptService deptService;
    /**
     *生成模拟的部门列表数据
     * @return
     */
    public List deptList(){
        List list = new ArrayList();//创建一个集合的变量名list，类型是ArrayList
        Dept d1 = new Dept(1,20,"人事部");
        Dept d2 = new Dept(2,30,"信息化部");
        Dept d3 = new Dept(3,40,"网发部");
        Dept d4 = new Dept(4,50,"客服部");
        Dept d5 = new Dept(5,29,"办公室");
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        return list;
    }

    @RequestMapping(value = "list") //http://xxx/dept/list  表示指名到list这个
    public JSONResult getAll(){

        JSONResult rs = new JSONResult(20000,deptList());
        return  rs;
    }

    /**
     *
     */
    @RequestMapping(value = "list1")
    public JSONObject getList(){
//        JSONObject rs = new JSONObject();
        String jsonStr = "{\"code\":20000,\"data\":{\"items\":"+
                JSON.toJSONString(deptList())
                +"}}";
        JSONObject rs = JSONObject.parseObject(jsonStr);
        return  rs;
    }

    @RequestMapping(value = "list2")
    public JSONObject getDataList(){
//        JSONObject rs = new JSONObject();
        String jsonStr = "{\"code\":20000,\"data\":{\"items\":"+
                JSON.toJSONString(deptService.getAllDept())
                +"}}";
        JSONObject rs = JSONObject.parseObject(jsonStr);
        return  rs;
    }
    //删除
    @DeleteMapping(value = "{delid}")
    public JSONObject delDept(@PathVariable(name = "delid") int id){

        int i = deptService.delDept(id);
        System.out.println(i);
        if(i>0){
              String jsonStr = "{\"code\":20000,\"data\":\"success\"}";
              return JSONObject.parseObject(jsonStr);
        }else{
            String jsonStr = "{\"code\":100,\"data\":\"delete fail\"}";
            return JSONObject.parseObject(jsonStr);
        }
    }
    @PostMapping(value = "create")
    //新增
    //参数存在于请求体当中—JSON对象字符串/数组
    public JSONObject saveDept(@RequestBody Dept dept){
        int i = deptService.saveDept(dept);
        if(i>0){
            String jsonStr = "{\"code\":20000,\"data\":"+dept.getId()+"}";
            return JSONObject.parseObject(jsonStr);
        }else{
            String jsonStr = "{\"code\":100,\"data\":\"delete fail\"}";
            return JSONObject.parseObject(jsonStr);
        }
    }
    //修改
    @PostMapping(value = "update")
    public JSONObject upDateDept(@RequestBody Dept dept){
        int i = deptService.updateDept(dept);
        System.out.println(dept);
        if(i>0){
            String jsonStr = "{\"code\":20000,\"data\":\"success\"}";
            return JSONObject.parseObject(jsonStr);
        }else{
            String jsonStr = "{\"code\":100,\"data\":\"delete fail\"}";
            return JSONObject.parseObject(jsonStr);
        }
    }
}
