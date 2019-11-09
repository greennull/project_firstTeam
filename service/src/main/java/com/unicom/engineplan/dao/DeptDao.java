package com.unicom.engineplan.dao;
import java.util.List;

import com.unicom.engineplan.model.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DeptDao {
    @Select("select * from dept")
    List<Dept> getAllDept();

    /**
     * 删除操作
     */
    @Delete("delete from dept where id = #{id}")
    int delDept(int id);
    /**
     * 新增操作
     */
//    @Insert("insert into dept(peoples,deptName) " +
//            "values(#{pepo},#{deptname})")
//    int save(@Param("pepo") int pepo,@Param("deptname") String deptname);
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id") //是否使用自增主键列
    @Insert("insert into dept(peoples,deptName) " +
            "values(#{peoples},#{deptName})")
    int save(Dept dept);
    /**
     * 修改操作
     */
    @Update("UPDATE dept set peoples=#{peoples},deptName=#{deptName} WHERE id = #{id} ")
    int updateDept(Dept dept);
}
