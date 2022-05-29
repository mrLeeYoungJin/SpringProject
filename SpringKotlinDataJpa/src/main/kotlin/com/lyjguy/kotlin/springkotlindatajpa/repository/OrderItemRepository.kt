package com.lyjguy.kotlin.springkotlindatajpa.repository

import com.lyjguy.kotlin.springkotlindatajpa.model.entity.OrderItem
import org.springframework.data.jpa.repository.JpaRepository

interface OrderItemRepository: JpaRepository<OrderItem, Long> {
}