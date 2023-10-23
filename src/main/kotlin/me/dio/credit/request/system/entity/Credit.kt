package me.dio.credit.request.system.entity

import jakarta.persistence.*
import me.dio.credit.request.system.enumerations.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID


@Entity
@Table(name = "Credit")
class Credit (
        @Column(nullable = false, unique = true) val creditCode: UUID = UUID.randomUUID(),
        @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO,
        @Column(nullable = false) val dayFirstInstallment: LocalDate,
        @Column(nullable = false) val numberOfInstallments: Int = 0,
        @Enumerated val status: Status = Status.IN_PROGRESS, // declara como Enum
        @ManyToOne var customer: Customer? = null, // relacionamento inverso ao da tabela "Customer"
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null // chave primária
)
