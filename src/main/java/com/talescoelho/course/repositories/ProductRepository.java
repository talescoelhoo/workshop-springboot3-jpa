package com.talescoelho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talescoelho.course.entities.Order;
import com.talescoelho.course.entities.Product;
import com.talescoelho.course.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
