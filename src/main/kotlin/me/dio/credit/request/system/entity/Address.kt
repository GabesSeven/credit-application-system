package me.dio.credit.request.system.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable // para aninhar a tabela "Address" em "Customer"
data class Address (
    @Column(nullable = false)  var zipCode: String = "",
    @Column(nullable = false)  var street: String = ""
)
