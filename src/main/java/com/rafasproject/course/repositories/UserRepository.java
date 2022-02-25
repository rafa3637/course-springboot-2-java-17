package com.rafasproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafasproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
