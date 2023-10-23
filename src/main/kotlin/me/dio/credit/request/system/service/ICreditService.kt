package me.dio.credit.request.system.service

import me.dio.credit.request.system.entity.Credit
import java.util.UUID

interface ICreditService {
    fun save(credit: Credit): Credit
    // retorna uma lista de créditos referenciados pela primary key
    fun findAllByCustomer(customerId: Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit
}