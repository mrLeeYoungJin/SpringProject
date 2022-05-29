package com.lyjguy.kotlin.springkotlindatajpa.controller

import com.lyjguy.kotlin.springkotlindatajpa.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController @Autowired constructor(
    val orderRepository: OrderRepository
) {

    @GetMapping("/orders")
    fun getOrder() {
        orderRepository.findById(1)
    }
}