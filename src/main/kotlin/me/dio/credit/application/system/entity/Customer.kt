package me.dio.credit.application.system.entity

import jakarta.persistence.*
import java.math.BigDecimal

@Entity // essa classe será uma entidade (tabela) no banco de dados
//@Table(name = "Cliente") // renomear tabela
data class Customer(
  @Column(nullable = false) var firstName: String = "", // não pode ser null
  @Column(nullable = false) var lastName: String = "",
  @Column(nullable = false, unique = true) var cpf: String = "",
  @Column(nullable = false, unique = true) var email: String = "",
  @Column(nullable = false) var income: BigDecimal = BigDecimal.ZERO,
  @Column(nullable = false) var password: String = "",
  @Column(nullable = false) @Embedded var address: Address = Address(),
  @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY,
    cascade = arrayOf(CascadeType.REMOVE, CascadeType.PERSIST), // relaciona com o atributo "customer" da tabela Customer
    mappedBy = "customer")
  var credits: List<Credit> = mutableListOf(), // fetch é para só carregar a lista inteira se relizar essa solicitação específica; cascate para remover dados relacionados em cascata
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null // chave primária
)
