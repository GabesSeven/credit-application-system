package me.dio.credit.request.system.service

import me.dio.credit.request.system.entity.Customer
import java.util.*

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    // retorna void
    fun delete(id: Long)
}