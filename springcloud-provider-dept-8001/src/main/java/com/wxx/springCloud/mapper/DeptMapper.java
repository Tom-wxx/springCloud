package com.wxx.springCloud.mapper;

import com.wxx.springCloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface DeptMapper {
    public boolean addDept(Dept dept);
    public  Dept queryById(Long id);
    public List<Dept> queryAll();
}
