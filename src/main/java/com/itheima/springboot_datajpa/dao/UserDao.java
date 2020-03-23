package com.itheima.springboot_datajpa.dao;

import com.itheima.springboot_datajpa.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
