package com.whudm.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whudm.springboot.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
