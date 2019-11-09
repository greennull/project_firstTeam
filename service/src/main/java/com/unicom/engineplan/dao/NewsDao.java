package com.unicom.engineplan.dao;

import com.unicom.engineplan.model.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NewsDao {
    @Select("select * from news")
    List<News> getAllnews();
    /**
     * 删除操作
     */
    @Delete("delete from news where id = #{id}")
    int delNews(int id);
}
