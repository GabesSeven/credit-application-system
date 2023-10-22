package me.dio.credit.request.system.repository

import me.dio.credit.request.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository // significa que será um Bean gerenciado pelo Spring
interface CreditRepository: JpaRepository<Credit, Long> { // <Credit, Long> = <tipo_da_classe, id>
}