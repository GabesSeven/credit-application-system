// -------------------- CONTRUINDO (BANCO DE DADOS, CAMADA DE SERVIÇO, CAMADA DE PERSISTÊNCIA, CAMADA CONTROLLER E TRATAMENTO DE EXCEÇÕES) --------------------
// https://github.dev/cami-la/credit-application-system/tree/master/src/main
// https://gist.github.com/cami-la/560b455b901778391abd2c9edea81286

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

// https://javabahia.github.io/falando-sobre-dto/

// https://www.baeldung.com/java-validation

// -------------------- DOCUMENTANDO E TESTANDO --------------------
// https://www.baeldung.com/spring-rest-openapi-documentation
// https://springdoc.org/migrating-from-springfox.html

// teste unitários não sobe a aplicação Spring
// Deve ser configurado o application.yml para executar um banco de dados específico para teste, para não alterar os dados do banco em produção
// https://www.devmedia.com.br/tdd-fundamentos-do-desenvolvimento-orientado-a-testes/28151
// https://mockk.io/
// https://assertj.github.io/doc/
// https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions

// teste de integração sobe o Spring e testa a comunicação com terceiros
// testes de integração não precisa testar as funções do JPA, somente as funções criadas pelo usuário


package me.dio.credit.application.system

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CreditRequestSystemApplication

fun main(args: Array<String>) {
	runApplication<CreditRequestSystemApplication>(*args)
}
