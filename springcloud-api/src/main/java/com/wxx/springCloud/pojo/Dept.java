package com.wxx.springCloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.java.Log;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors( chain = true) //链式写法
public class Dept implements Serializable { //所有的实体类都要实现序列化
    private Long deptno;  //主键
    private String dname;
//这个数据库存在那个数据库字段~~微服务  一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname){
        this.dname=dname;
    }

    /*
    * 链式写法
    * Dept dept=new Dept
    * dept.setDeptNo(11);
    * dept.setDeptName(12);
    * 可以变为
    * dept.setDeptNo(11).setDeptName(12);
    * */














}
