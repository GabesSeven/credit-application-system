// https://github.dev/cami-la/credit-application-system/tree/master/src/main

// https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html
// https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/
// https://medium.com/cwi-software/versionar-sua-base-de-dados-com-spring-boot-e-flyway-be4081ddc7e5

// S.O.L.I.D.: Princípio de Segregação de Interface, divide as funcionalidades em interfaces posteriormente implementa em uma classe completa
// https://www.campuscode.com.br/conteudos/s-o-l-i-d-principio-de-segregacao-de-interface

// service: regras de negócio
// repository: conexão com banco de dados
// entity: estrutura (tabelas) do banco de dados

// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.named-queries
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query

package me.dio.credit.request.system

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CreditRequestSystemApplication

fun main(args: Array<String>) {
	runApplication<CreditRequestSystemApplication>(*args)
}
