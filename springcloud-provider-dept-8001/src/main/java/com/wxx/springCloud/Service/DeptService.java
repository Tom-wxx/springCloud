package com.wxx.springCloud.Service;

import com.wxx.springCloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);
    public  Dept queryById(Long id);
    public List<Dept> queryAll();
}
