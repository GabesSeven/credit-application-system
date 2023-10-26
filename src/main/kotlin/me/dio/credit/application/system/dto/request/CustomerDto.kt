package me.dio.credit.application.system.dto.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Address
import me.dio.credit.application.system.entity.Customer
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

// formulário / padrão de inserção de dados para Customer
data class CustomerDto(
    @field:NotEmpty(message = "Invalid input") val firstName: String, //@field:NotEmpty significa que não aceita vazio
    @field:NotEmpty(message = "Invalid input") val lastName: String,
    @field:NotEmpty(message = "Invalid input")
    @field:CPF(message = "This invalid CPF") val cpf: String,
    @field:NotNull(message = "Invalid input") val income: BigDecimal, //@field:NotNull significa que não aceita null
    @field:Email(message = "Invalid email")
    @field:NotEmpty(message = "Invalid input") val email: String,
    @field:NotEmpty(message = "Invalid input") val password: String,
    @field:NotEmpty(message = "Invalid input") val zipCode: String,
    @field:NotEmpty(message = "Invalid input") val street: String
) {
    // monta o objeto Customer para ser salvo no banco de dados
    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        email = this.email,
        password = this.password,
        address = Address( zipCode = this.zipCode, street = this.street)
    )
}
