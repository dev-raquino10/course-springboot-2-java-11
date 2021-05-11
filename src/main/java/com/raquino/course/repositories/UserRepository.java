package com.raquino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raquino.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
