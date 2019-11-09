package com.unicom.engineplan.dao;

import com.unicom.engineplan.model.Mans;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MansDao {
    @Select("select * from mans")
    List<Mans> getAllMans();
}
