package com.example.Lost_Found.repository;

import com.example.Lost_Found.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<User, Long> {

}
