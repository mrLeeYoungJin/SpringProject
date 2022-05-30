package com.lyjguy.kotlin.springkotlindatajpa.repository

import com.lyjguy.kotlin.springkotlindatajpa.model.entity.OrderReceiver
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface OrderReceiverRepository: JpaRepository<OrderReceiver, Long> {
    fun findByOrderId(id: Long): Optional<OrderReceiver>
}