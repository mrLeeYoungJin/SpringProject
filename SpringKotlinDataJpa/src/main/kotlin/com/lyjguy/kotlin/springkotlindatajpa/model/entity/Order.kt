package com.lyjguy.kotlin.springkotlindatajpa.model.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="orders")
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,
    val status: String,
    val quantity: Int,
    val totalPrice: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null,
) {
    @OneToOne(mappedBy = "order", cascade = [CascadeType.PERSIST])
    //@OneToOne(mappedBy = "order")
    @JoinColumn(name = "orderId", insertable = false, updatable = false)
    var orderReceiver: OrderReceiver? = null
}