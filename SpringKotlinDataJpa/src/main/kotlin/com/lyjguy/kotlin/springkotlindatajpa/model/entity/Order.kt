package com.lyjguy.kotlin.springkotlindatajpa.model.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="orders")
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,
    val status: String,
    val quantity: Int,
    val totalPrice: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null,

    @OneToOne(mappedBy = "order", fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    val orderReceiver: OrderReceiver? = null
)