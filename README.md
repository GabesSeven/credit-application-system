# API para Sistema de Avaliação de Créditos
<br>
<p><strong>API REST Spring Boot</strong> e <strong>Kotlin</strong> que simula um sistema de análise de solicitação de crédito. O objetivo é a empresa fornecer aos seus clientes.</p>

<br>
<hr>
<br>

## Introdução 📜
<br>
<figure>
<p align="center">
  <img src="https://i.imgur.com/1Ea5PH3.png" height="350" width="600" alt="Arquitetura em 3 camadas Projeto Spring Boot"/><br>
  Arquitetura em 3 camadas Projeto Spring Boot
</p>
</figure>

<br>
<hr>
<br>

## Execução 🏃‍♀️
<br>
<p>
  No Terminal/Console:
<ol>
	<li>Faça um clone do projeto na sua máquina: <code>git clone git@github.com:GabesSeven/credit-application-system.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd <nome-pasta-raiz></code></li> 
	<li>Execute o comando: <code>./gradlew bootrun</code></li>
</ol>
</p>

<br>
<hr>
<br>

## Funcionalidades 🛠️
<br>

### Cliente (Customer):

<br>
  <ul>
    <li><strong>Cadastrar:</strong>
         <ul>
            <li><strong>Request: </strong><em>firstName, lastName, cpf, income, email, password, zipCode e street</em></li>
            <li><strong>Response: </strong><em>String</em></li>
        </ul>
    </li>
    <li><strong>Editar cadastro:</strong>
      <ul>
        <li><strong>Request: </strong><em>id, firstName, lastName, income, zipCode, street</em></li>
        <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
      </ul>
    </li>  
    <li><strong>Visualizar perfil:</strong>
      <ul>
        <li><strong>Request: </strong> <em>id</em></li>
        <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
      </ul> 
    </li>
    <li><strong>Deletar cadastro:</strong>
      <ul>
        <li><strong>Request: </strong><em>id</em></li>
        <li><strong>Response: </strong><em>sem retorno</em></li>
      </ul>
    </li>
  </ul>
<br>
  
### Solicitação de Empréstimo (Credit):

<br>
  <ul>
    <li><strong>Cadastrar:</strong>
       <ul>
          <li><strong>Request: </strong><em>creditValue, dayFirstOfInstallment, numberOfInstallments e customerId</em></li>
          <li><strong>Response: </strong><em>String</em></li>
      </ul>
    </li>
    <li><strong>Listar todas as solicitações de emprestimo de um cliente:</strong>
      <ul>
        <li><strong>Request: </strong><em>customerId</em></li>
        <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment</em></li>
      </ul> 
    </li>
    <li><strong>Visualizar um emprestimo:</strong>
      <ul>
        <li><strong>Request: </strong><em>customerId e creditCode</em></li>
        <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer</em></li>
      </ul> 
    </li>

<br>
<br>

<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="450" width="650" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>

<br>
<hr>
<br>

## Links Úteis 🔗
<br>
<ul>
  <li>https://start.spring.io/#!type=gradle-project&language=kotlin&platformVersion=3.0.3&packaging=jar&jvmVersion=17&groupId=me.dio&artifactId=credit-application-system&name=credit-application-system&description=Credit%20Application%20System%20with%20Spring%20Boot%20and%20Kotlin&packageName=me.dio.credit-application-system&dependencies=web,validation,data-jpa,flyway,h2</li>
  <li>https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html</li>
  <li>https://medium.com/cwi-software/versionar-sua-base-de-dados-com-spring-boot-e-flyway-be4081ddc7e5</li>
  <li>https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/</li>
  <li>https://pt.wikipedia.org/wiki/Objeto_de_Transfer%C3%AAncia_de_Dados</li>
  <li>https://pt.wikipedia.org/wiki/CRUD</li>
  <li>https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords</li>
  <li>https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query</li>
  <li>https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#glossary</li>  
</ul>

<br>
<hr>
<br>

## Tecnologias utilizadas 💾
<br>

![GIT](https://img.shields.io/badge/Java-F05032?logo=git&logoColor=white&style=for-the-badge) &nbsp;

![GITHUB](https://img.shields.io/badge/github-181717?logo=git&logoColor=white&style=for-the-badge) &nbsp;

![KOTLIN](https://img.shields.io/badge/kotlin-7F52FF?logo=kotlin&logoColor=white&style=for-the-badge) &nbsp;

![JAVA](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=white&style=for-the-badge) &nbsp;

![GRADLE](https://img.shields.io/badge/gradle-02303A?logo=gradle&logoColor=white&style=for-the-badge) &nbsp;

![SPRING](https://img.shields.io/badge/spring-6DB33F?logo=spring&logoColor=white&style=for-the-badge) &nbsp;

![SPRING BOOT](https://img.shields.io/badge/springboot-6DB33F?logo=springboot&logoColor=white&style=for-the-badge) &nbsp;

![SWAGGER](https://img.shields.io/badge/swagger-85EA2D?logo=swagger&logoColor=white&style=for-the-badge) &nbsp;

![H2 DATABASE](https://img.shields.io/badge/databricks-FF3621?logo=databricks&logoColor=white&style=for-the-badge) &nbsp;

![HIBERNATE](https://img.shields.io/badge/hibernate-59666C?logo=hibernate&logoColor=white&style=for-the-badge) &nbsp;

![FLYWAY](https://img.shields.io/badge/flyway-CC0200?logo=flyway&logoColor=white&style=for-the-badge) &nbsp;


<br>
<hr>
<br>

## Developer 🧑‍💻 

| [<img src="https://avatars.githubusercontent.com/u/37443722?v=4" width=115><br><sub>Gabriel Ferreira</sub>](https://github.com/GabesSeven)
| :---: 
