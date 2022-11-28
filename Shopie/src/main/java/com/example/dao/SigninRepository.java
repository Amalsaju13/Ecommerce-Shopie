package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Lead;

@Repository
public interface SigninRepository extends JpaRepository<Lead,Integer>{

}
