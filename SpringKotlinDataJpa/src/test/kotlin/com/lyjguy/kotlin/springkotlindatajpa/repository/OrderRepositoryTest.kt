package com.lyjguy.kotlin.springkotlindatajpa.repository

import com.lyjguy.kotlin.springkotlindatajpa.model.entity.Order
import com.lyjguy.kotlin.springkotlindatajpa.model.entity.OrderReceiver
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.TestConstructor
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class OrderRepositoryTest(
    val orderRepository: OrderRepository,
    val orderReceiverRepository: OrderReceiverRepository,
) {

    @Test
    @Transactional
    fun test() {
        val order = Order(
            name = "test",
            status = "ORDER",
            quantity = 1,
            totalPrice = 1000,
        ).also {
            it.orderReceiver = OrderReceiver(
                name = "test",
                address1 = "address1",
                address2 = "address2",
                zipcode = "12345",
            )
        }

        orderRepository.save(order).also {
            //orderReceiverRepository.save(it.orderReceiver!!)
            test2(it)
        }
//        val orderEntity = orderRepository.findById(1).get()
//        println("order : ${orderEntity.id} ${orderEntity.name}")
//        println("orderReceiver : ${orderEntity.orderReceiver?.id} ${orderEntity.orderReceiver?.name}")
        //orderReceiverRepository.findByOrderId(requireNotNull(orderEntity.id)).get()
    }

    @Transactional(propagation=Propagation.REQUIRES_NEW)
    fun test2(order: Order) {
        order.let {
            println(">>>>>>>>>>>>")
            //order.orderReceiver?.orderId = it.id!!
            //orderReceiverRepository.save(it.orderReceiver!!)
        }
    }
}