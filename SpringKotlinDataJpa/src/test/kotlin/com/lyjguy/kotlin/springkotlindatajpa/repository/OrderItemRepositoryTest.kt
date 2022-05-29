package com.lyjguy.kotlin.springkotlindatajpa.repository

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.TestConstructor

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class OrderItemRepositoryTest(
    val orderItemRepository: OrderItemRepository
) {

    @Test
    fun test() {
        orderItemRepository.findById(1)
    }
}