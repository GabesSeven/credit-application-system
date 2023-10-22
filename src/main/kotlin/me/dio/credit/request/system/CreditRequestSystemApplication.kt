// https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html
// https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/
// https://medium.com/cwi-software/versionar-sua-base-de-dados-com-spring-boot-e-flyway-be4081ddc7e5

package me.dio.credit.request.system

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CreditRequestSystemApplication

fun main(args: Array<String>) {
	runApplication<CreditRequestSystemApplication>(*args)
}
