package me.dio.credit.application.system.controller

import jakarta.validation.Valid
import me.dio.credit.application.system.dto.request.CustomerDto
import me.dio.credit.application.system.dto.request.CustomerUpdateDto
import me.dio.credit.application.system.dto.response.CustomerView
import me.dio.credit.application.system.entity.Customer
import me.dio.credit.application.system.service.impl.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController // representa para o String que trata-se de um controlador
@RequestMapping("/api/customers") // define URL
class CustomerResource(
    private val customerService: CustomerService
) {

    @PostMapping // método POST
    fun saveCustomer(@RequestBody @Valid customerDto: CustomerDto): ResponseEntity<CustomerView> { // pega variável "customerDto" do JSON através de @RequestBody
        val savedCustomer: Customer = this.customerService.save(customerDto.toEntity())
        // classe original do Spring feita para manipular a resposta da aplicação
        return ResponseEntity.status(HttpStatus.CREATED).body(CustomerView(savedCustomer))
    }

    @GetMapping("/{id}") // método GET
    fun findById(@PathVariable id: Long): ResponseEntity<CustomerView> { // pega variável "id" dos parâmetros da URL através de @PathVariable
        val customer: Customer = this.customerService.findById(id)
        return ResponseEntity.status(HttpStatus.OK).body(CustomerView(customer))
    }

    @DeleteMapping("/{id}") // método DELETE
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomer(@PathVariable id: Long) = this.customerService.delete(id)

    @PatchMapping // método PATCH
    fun upadateCustomer(
        @RequestParam(value = "customerId") id: Long, // pega variável chave-valor "customerId" dos parâmetros da URL através de @RequestParam
        @RequestBody @Valid customerUpdateDto: CustomerUpdateDto
    ): ResponseEntity<CustomerView> {
        val customer: Customer = this.customerService.findById(id)
        val cutomerToUpdate: Customer = customerUpdateDto.toEntity(customer)
        val customerUpdated: Customer = this.customerService.save(cutomerToUpdate)
        return ResponseEntity.status(HttpStatus.OK).body(CustomerView(customerUpdated))
    }
}