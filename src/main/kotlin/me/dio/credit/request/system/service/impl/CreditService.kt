package me.dio.credit.request.system.service.impl

import me.dio.credit.request.system.entity.Credit
import me.dio.credit.request.system.repository.CreditRepository
import me.dio.credit.request.system.service.ICreditService
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.util.*

@Service
class CreditService(
    // importa para ser utilizada dentro da classe
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService,
): ICreditService {
    override fun save(credit: Credit): Credit {
        // this.validDayFirstInstallment(credit.dayFirstInstallment)
        credit.apply {
            // verifica se existe no banco de dados
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }


    override fun findAllByCustomer(customerId: Long): List<Credit> =
        this.creditRepository.findAllByCustomerId(customerId)

    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.named-queries
    // segurança, verifica se o ID de quem está solicitando é igual ao ID que o crédito está vinculado
    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = (this.creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException("Creditcode $creditCode not found."))
        return if (credit.customer?.id == customerId) credit else throw RuntimeException("Contact admin.")
    }

    //private fun validDayFirstInstallment(dayFirstInstallment: LocalDate): Boolean {
    //    return if (dayFirstInstallment.isBefore(LocalDate.now().plusMonths(3))) true
    //    else throw BusinessException("Invalid Date")
    //}
}