package com.lyjguy.kotlin.springkotlindatajpa.repository

import com.lyjguy.kotlin.springkotlindatajpa.model.entity.OrderReceiver
import org.springframework.data.jpa.repository.JpaRepository

interface OrderReceiverRepository: JpaRepository<OrderReceiver, Long>