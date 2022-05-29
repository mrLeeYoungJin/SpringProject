package com.lyjguy.kotlin.springkotlindatajpa.model.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="order_receivers")
class OrderReceiver(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var orderId: Long = 0,
    val name: String,
    val address1: String,
    val address2: String,
    val zipcode: String,
    val createAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime?,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonBackReference
    val order: Order
)