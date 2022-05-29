package com.lyjguy.kotlin.springkotlindatajpa.repository

import com.lyjguy.kotlin.springkotlindatajpa.model.entity.Order
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.TestConstructor

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class OrderRepositoryTest(
    val orderRepository: OrderRepository
) {

    @Test
    fun test() {
        val order = Order(
            name = "test",
            status = "ORDER",
            quantity = 1,
            totalPrice = 1000,
        )

        orderRepository.save(order)
        orderRepository.findById(1)
    }
}