package me.dio.credit.application.system.configuration

import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration // para o Spring tratar como uma classe de configuração
class Swagger3Config {
    @Bean
    fun publicApi(): GroupedOpenApi? {
        return GroupedOpenApi.builder()
            .group("springcreditapplicationsystem-public") // nome do grupo
            .pathsToMatch("/api/customers/**", "/api/credits/**") // quais URLs serão reconhecidas para colocar na documentação
            .build()
    }
}