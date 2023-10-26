package me.dio.credit.application.system.service.impl

import me.dio.credit.application.system.entity.Customer
import me.dio.credit.application.system.repository.CustomerRepository
import me.dio.credit.application.system.service.ICustomerService
import org.springframework.stereotype.Service
import java.util.UUID


@Service // para Spring reconhecer como uma classe de serviço
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {
    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)

    // retorna um option de um Cluster, caso não econtre
    override fun findById(id: Long): Customer = this.customerRepository.findById(id).orElseThrow{
            throw RuntimeException("Id $id not found.")
        }

    override fun delete(id: Long) {
        val customer: Customer = this.findById(id)
        this.customerRepository.delete(customer)
    }
}