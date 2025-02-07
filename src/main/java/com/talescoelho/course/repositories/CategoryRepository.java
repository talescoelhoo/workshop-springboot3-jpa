package com.talescoelho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talescoelho.course.entities.Category;
import com.talescoelho.course.entities.Order;
import com.talescoelho.course.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
