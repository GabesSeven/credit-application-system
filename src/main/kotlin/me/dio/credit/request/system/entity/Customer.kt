package me.dio.credit.request.system.entity

import jakarta.persistence.*


@Entity // essa classe será uma entidade (tabela) no banco de dados
@Table(name = "Cliente") // renomear tabela
data class Customer (
    @Column(nullable = false) var firstName: String = "", // não pode ser null
    @Column(nullable = false) var lastName: String = "",
    @Column(nullable = false, unique = true) var cpf: String = "",
    @Column(nullable = false, unique = true) var email: String = "",
    @Column(nullable = false) var password: String = "",
    @Column(nullable = false) var address: Address = Address(),
    @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY,
        cascade = arrayOf(CascadeType.REMOVE),
        mappedBy = "customer" // relaciona com o atributo "customer" da tabela Customer
        )
    var credits: List<Credit> = mutableListOf(), // fetch é para só carregar a lista inteira se relizar essa solicitação específica; cascate para remover dados relacionados em cascata
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null // chave primária
)