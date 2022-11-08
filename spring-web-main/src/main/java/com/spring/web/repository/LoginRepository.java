package com.spring.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}

