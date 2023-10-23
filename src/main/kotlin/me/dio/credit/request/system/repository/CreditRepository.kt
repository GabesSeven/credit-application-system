package me.dio.credit.request.system.repository

import me.dio.credit.request.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository // significa que será um Bean gerenciado pelo Spring
interface CreditRepository: JpaRepository<Credit, Long> { // <Credit, Long> = <tipo_da_classe, id>

    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.named-queries
    fun findByCreditCode(creditCode: UUID) : Credit?

    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
    @Query(value = "SELECT * FROM CREDIT WHERE CUSTOMER_ID = ?1", nativeQuery = true)
    fun findAllByCustomerId(customerId: Long): List<Credit>
}