package com.talescoelho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talescoelho.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
