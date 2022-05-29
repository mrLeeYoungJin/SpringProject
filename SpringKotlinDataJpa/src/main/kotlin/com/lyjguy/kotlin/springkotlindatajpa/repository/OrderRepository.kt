package com.lyjguy.kotlin.springkotlindatajpa.repository

import com.lyjguy.kotlin.springkotlindatajpa.model.entity.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<Order, Long> {
}