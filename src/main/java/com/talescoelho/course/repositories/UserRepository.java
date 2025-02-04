package com.talescoelho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talescoelho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
