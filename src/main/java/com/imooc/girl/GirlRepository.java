package com.imooc.girl;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer>{
//    通过年龄查询女生
    public List<Girl> findByAge(Integer age);
}
