# <em>Credit Application System</em>
<br><br>
<p style="text-align: justify;">
	<strong><em>Application Programming Interface</strong></em> (<strong><em>API</strong></em>) <strong><em>Full Representational State Transfer</strong></em> (<strong><em>RESTful</strong></em>) desenvolvida utilizando <strong><em>Spring Boot</em></strong>, <strong><em>Kotlin</em></strong> e <strong>Banco de Dados <em>H2</em></strong> que simula um </strong>sistema de análise e solicitação de crédito</strong>. O <strong>objetivo</strong> é a empresa <strong>fornecer gerenciamento simples</strong> de <strong>Crédito</strong> (<em><strong>Credit</strong></em>) para seus <strong>Clientes</strong> (<strong><em>Customers</em></strong>).
</p>

<br>
<hr>
<br>

## Execução 🏃‍♀️
<br><br>

<p>No Terminal/Console:</p>
<ol>
	<li>Faça um clone do projeto na sua máquina:<br><code>git clone git@github.com:GabesSeven/credit-application-system.git</code></li><br>
	<li>Entre na pasta raiz do projeto:<br><code>cd credit-application-system/</code></li><br>
	<li>Execute o comando:<br> <code>./gradlew bootrun</code></li><br>
	<li>Em um navegador, utilize a <em>Uniform Resource Locato</em> (<em>URL</em>) para ter acesso ao <strong>Banco de Dados <em>H2</em></strong>:<br><a href='http://localhost:8080/swagger-ui/index.html'>http://localhost:8080/swagger-ui/index.html</a><br><em>username</em>: <strong>gabes</strong><br><em>password</em>: <strong>gabes</strong></li><br>
	<li>Em um navegador, utilize a <em>URL</em> para ter acesso ao <strong>documentação</strong> e <strong>testes</strong> dos <strong><em>endpoints</em></strong> com <strong><em>Swagger</em></strong>:<br><a href='http://localhost:8080/h2-console/'>http://localhost:8080/h2-console/</a></li>
</ol>

<br>
<hr>
<br>

## Funcionalidades 🛠️
<br><br>

### Cliente (<em>Customer</em>):
<p style="text-align: justify;">
<br>
  <ul>
    <li><strong>Cadastrar</strong>:
         <ul>
            <li><strong><em>Request</em></strong>: <em>firstName</em>, <em>lastName</em>, <em>cpf</em>, <em>income</em>, <em>email</em>, <em>password</em>, <em>zipCode</em> e <em>street</em></li>
            <li><strong><em>Response</em></strong>: <em>String</em></li>
        </ul>
    </li>
    <li><strong>Editar cadastro</strong>:
      <ul>
        <li><strong><em>Request</em></strong>: <em>id</em>, <em>firstName</em>, <em>lastName</em>, <em>income</em>, <em>zipCode</em>, <em>street</em></li>
        <li><strong><em>Response</em></strong>: <em>firstName</em>, <em>lastName</em>, <em>income</em>, <em>cpf</em>, <em>email</em>, <em>income</em>, <em>zipCode</em>, <em>street</em></li>
      </ul>
    </li>  
    <li><strong>Visualizar perfil</strong>:
      <ul>
        <li><strong><em>Request</em></strong>: <em>id</em></li>
        <li><strong><em>Response</em></strong>: <em>firstName</em>, <em>lastName</em>, <em>income</em>, <em>cpf</em>, <em>email<em>, <em>income</em>, <em>zipCode</em>, street</em></li>
      </ul> 
    </li>
    <li><strong>Deletar cadastro</strong>:
      <ul>
        <li><strong><em>Request</em></strong>: <em>id</em></li>
        <li><strong><em>Response</em></strong>: <em>sem retorno</em></li>
      </ul>
    </li>
  </ul>
<br>
</p>
	
### Solicitação de Empréstimo (<em>Credit</em>):
<p style="text-align: justify;">
<br>
  <ul>
    <li><strong>Cadastrar:</strong>
       <ul>
          <li><strong><em>Request</em></strong>: <em>creditValue</em>, <em>dayFirstOfInstallment</em>, <em>numberOfInstallments</em> e <em>customerId</em></li>
          <li><strong><em>Response</em></strong>: <em>String</em></li>
      </ul>
    </li>
    <li><strong>Listar todas as solicitações de emprestimo de um cliente:</strong>
      <ul>
        <li><strong><em>Request</em></strong>: <em>customerId</em></li>
        <li><strong><em>Response</em></strong>: <em>creditCode</em>, <em>creditValue</em>, <em>numberOfInstallment</em></li>
      </ul> 
    </li>
    <li><strong>Visualizar um emprestimo:</strong>
      <ul>
        <li><strong><em>Request</em></strong>: <em>customerId</em> e <em>creditCode</em></li>
        <li><strong><em>Response</em></strong>: <em>creditCode</em>, <em>creditValue</em>, <em>numberOfInstallment</em>, <em>status</em>, <em>emailCustomer</em> e <em>incomeCustomer</em></li>
      </ul> 
    </li>
  </ul>
</p>

<br><br><br>

<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="450" width="650" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama <em>Unified Modeling Language (UML)</em> Simplificado de uma </em>API Credit Application System</em>
</p>
</figure>

<br>
<hr>
<br>

## Tecnologias utilizadas 💾
<br><br>

![GIT](https://img.shields.io/badge/git-F05032?logo=git&logoColor=white&style=for-the-badge) &nbsp;

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

## Conceitos sobre Tecnologias Utilizadas 📜
<br><br>

### Spring Framework
<br><br>

<p style="text-align: justify;">
Uma das <strong>principais características</strong> do <strong><em>Spring Framework</em></strong> é a <em><strong>Inversion of Control</em></strong> (<em><strong>IoC</em></strong>) que permite que o <em><strong>Spring Container</em></strong> gerencie a <strong>criação</strong> e <strong>injeção</strong> de <strong>dependências</strong> entre os componentes, <strong>reduz</strong> o <strong>acoplamento</strong> entre classes e torna o <strong>código flexível<strong> e <strong>fácil de manter</strong>. O <strong><em>Spring</em> “inverte o controle” das instâncias</strong> das mãos <strong>do programador</strong> através da palavra “new” <strong>para o agente externo</strong> a sua classe. 
<br>
<em><strong>Dependency Injection</em></strong> (<em><strong>DI</em></strong>), <strong>uma forma de <em>IoC</em></strong>, onde as <strong>dependências</strong> de um componente são <strong>fornecidas externamente</strong>, <strong>tornando</strong> o código <strong>modular</strong> e <strong>facilitando testes</strong>. 
<br>
A <em><strong>Interface ApplicationContext</em></strong> é responsável por <strong>gerenciar</strong> objetos <em><strong>Bean</em></strong>, isto é, uma <strong>classe</strong> que <strong>determina</strong> como <em><strong>Spring Container</em> gerenciará</strong> o <strong>ciclo de vida</strong> de suas <strong>instâncias</strong>, não necessitando realizá-las via código. <em><strong>Beans</em></strong> podem ser implantados de maneira <strong>personalizada</strong> ou em <strong>seis escopos</strong>: <em><strong>singleton</em></strong>, <em><strong>prototype</em></strong>, <em><strong>request</em></strong>, <em><strong>session</em></strong>, <em><strong>application</em></strong>, <em><strong>websocket</em></strong>.

<br><br>

### Apache
<br><br>

<em><strong>Apache Maven</strong></em> é uma ferramenta de <strong>automação</strong> e <strong>gerenciamento de projetos <em>Java</em></strong>. 

<br><br>

### Spring Boot, Spring Security, Swagger
<br><br>

<em><strong>Spring Boot</em> reduz</strong> a necessidade de <strong>configurações</strong> iniciais e possibilita a construção de aplicações funcionais de maneira <strong>rápida</strong> e <strong>robusta</strong>, o <em><strong>boilerplate</em></strong> das configurações (seções de código que devem ser incluídas em muitos lugares) se localizam nos <em><strong>Starters</em></strong> que são <strong>dependências</strong> que <strong>adicionamos aos projetos</strong>. 
<br>
De maneira quase análoga, o <em><strong>Spring Security</em></strong> fornece </strong>autenticação</strong>, <strong>autorização</strong> e <strong>outros recursos de segurança</strong> para aplicativos. 
<br>
<em><strong>Swagger</em></strong> é para muitos o “queridinho” substituindo o <em><strong>Postman</em></strong>. Além de gerar <strong>requisições</strong>, também gera <strong>documentação</strong> dos <em><strong>endpoints</em></strong>.

<br><br>

### Arquitetura de Três Camadas
<br><br>

<strong>Arquitetura de Três Camadas</strong> do </em></strong>Spring</em></strong> é segmentado entre as camadas: <em><strong>Controller</em> (</strong>Controle</strong>), <em><strong>Service</em> (<strong>Serviço</strong>), <em><strong>Persistence / Repository</strong></em> (<strong>Persistência / Repositório</strong>). Esta arquitetura promove <strong>modularização</strong>, melhor <strong>manutenção</strong> e <strong>escalabilidade</strong>. As <strong>boas práticas</strong> recomendam que a <strong>camada de Controle não deve conhecer particularidades de acesso a dados</strong>, <strong>responsabilidade delegada</strong> a <strong>outra camada separada</strong> e <strong>independente</strong>. Os </em><strong>softwares</em> executados</strong> em <strong>camadas distintas</strong> são <strong>substituídos</strong>, <strong>atualizados</strong> e <strong>corrigidos sem prejuízo</strong> para o <strong>sistema como todo</strong>. As <strong>camadas podem ser desenvolvidas</strong> em <strong>paralelo</strong>.

<br><br>

### Camada de Controle
<br><br>

A camada de <strong>Controle recebe</strong> e <strong>devolve</strong> as <strong>solicitações <em>Hypertext Transfer Protocol</strong> (<strong><em>HTTP</em></strong>) do <strong>cliente</strong>, deve ser <strong>extremamente leve</strong> e somente <strong>delegar serviços</strong> <strong>(entrada</strong> e <strong>saída</strong>). Conforme apropriado, a <strong>Controle</strong> é responsável pela <strong>visualização</strong>, pelo <strong>transporte</strong> e pelos <strong>protocolos</strong>. Isso <strong>pode ou não incluir</strong> o <strong>mapeamento de <em>Business Logic</em></strong> em <em><strong>JavaScript Object Notation</strong></em> (<strong><em>JSON</strong></em>), <em><strong>Extensible Markup Language</strong></em> (<strong><em>XML</strong></em>),  <em><strong>HyperText Markup Language</strong></em> (<strong><em>HTML</strong></em>), entre outros. Mas a principal <strong>camada responsável pelo mesmo</strong> é a <em><strong>Service</strong></em>. <strong>Intermediando</strong> a <strong>Controle</strong> e o <strong>cliente</strong> está o <strong></em>DTO</em></strong>.
<br>
<strong><em>DTO</em></strong> é um <strong>padrão</strong> de <strong>arquitetura</strong> de <strong>objetos</strong> que <strong>agrega</strong> e <strong>encapsula dados</strong> para <strong>transferência</strong>. <strong>Não possui</strong> qualquer tipo de <strong>comportamento</strong>, sua <strong>função</strong> é <strong>obter e armazenar dados</strong>. <strong><em>DTO</em> filtra</strong> quais <strong>dados</strong> serão transmitidos <strong>reduzindo</strong> a <strong>latência</strong>, também <strong>auxilia</strong> na <strong>não exposição</strong> de <strong>todos os dados</strong> presentes na <strong>Persistência</strong>.

<br><br>


### Camada de Serviço
<br><br>

A camada de <strong>Serviço</strong> realiza <strong>operações</strong> e <strong>se necessário requisita</strong> a camada de <strong>Persistência</strong> e <strong>retorna</strong> o <strong>resultado</strong> à <strong>Controle</strong>. Na <strong>Serviço</strong> estão presentes as <strong><em>Business Logic</em></strong>, ou seja, <strong>objetos que fazem o trabalho que o aplicativo precisa</strong> para o <strong>domínio</strong> o qual está <strong>associado</strong>. <strong>Envolve cálculos</strong> baseados em insumos e dados armazenados, <strong>validação</strong> de quaisquer dados provenientes da <strong>Controle</strong> e <strong>exatidão</strong> em <strong>quais dados</strong> da <strong>lógica de origem</strong> serão <strong>despachados</strong>. 
<br>
<strong>Serviços</strong> são <strong>implementados</strong> através de <em><strong>Beans</strong></em> (<em><strong>@Service</strong></em> ou <em><strong>@Component</strong></em>, exemplos de <strong>anotações</strong>) que são <strong>gerenciados pelo</strong> <em><strong>Spring</strong></em> através de <strong>anotações</strong>, sendo <strong>necessário injetar todas</strong> as <strong>dependências de serviços</strong> para o <strong>trabalho</strong> “<strong>pesado</strong>”. Os <strong>objetos</strong> em <strong><em>Service</em> podem ter</strong> o <strong>objeto <em>DAO</em></strong> como <strong>dependência, tudo é objeto</strong> em <em><strong>Java</strong></em>, referenciando-se em <em><strong>C++</strong></em>, a linguagem <em><strong>Java</strong></em> implementou a <strong>Programação Orientada a Objetos (POO)</strong>. 

<br><br>

### Camada de Persistência
<br><br>

A camada de <strong>Persistência</strong>, de <strong>Repositório</strong> ou de <strong>Posições</strong>, formada pela estrutura <strong><em>DAO</em></strong>, fornece uma <strong>camada dupla de segurança a acesso a dados</strong>, <strong>independente</strong> do <strong>protocolo utilizado</strong>. Em outras palavras, design que cria uma <strong>camada separada</strong> e <strong>encapsula a lógica</strong> relacionada ao <strong>banco de dados</strong>, por exemplo, <em><strong>Create</em></strong>, <em><strong>Read</em></strong>, <em><strong>Update</em></strong>, <em><strong>Delete (CRUD)</em></strong> ou <strong>mecanismo de armazenamento subjacente</strong>. <strong>Auxilia a não relacionar classes do aplicativo</strong> do lado do <strong>Cliente</strong> com <strong>possíveis mecanismos de persistência</strong> (<strong>acesso a banco de dados</strong> que resulta na “<strong>quebra</strong>” da <strong>tríade</strong> da <strong>Segurança da Informação</strong> - <strong>Confiabilidade</strong>, <strong>Integridade</strong> e <strong>Disponibilidade</strong>). Também <strong>abstrai</strong> a <strong>implementação de acesso a dados subjacente</strong> para <em><strong>objetos Services</em></strong> e permite o <strong>acesso transparente</strong> à <strong>fonte de dados</strong>.
<br>
<em><strong>DAO encapsula e gerencia</strong></em> a <strong>lógica</strong> para <strong>recuperar</strong>, <strong>salvar</strong>, <strong>atualizar</strong> e <strong>deletar</strong> dados em seu <strong>armazenamento persistente</strong> (<em><strong>DAO</em> encapsula e gerencia <em>Relational Database Management System</em></strong> (<strong><em>RDBMS</strong></em>), <em><strong>NoSQL</strong></em>, <strong>sistema de arquivos</strong>) ou <strong>serviço comercial acessado</strong> via <em><strong>Representational State Transfer</strong></em> (<strong><em>REST</strong></em>) / Full Representational State Transfer</strong></em> (<strong><em>RESTful</strong></em>) ou </em><strong>Simple Object Access Protocol</strong></em> (<strong><em>SOAP</strong></em>). 
<br>
Em uma pasta separada denominada “<strong><em>entity</em></strong>”, <strong>constrói-se as tabelas</strong> utilizando <strong>anotação</strong> <strong><em>@Entity</em></strong>. Normalmente na <strong>Persistência</strong>, usa-se a <strong>interface <em>JPA Repository</em></strong> que trabalha com <em><strong>JPA</em></strong> ou outra <strong></em>ORM</em></strong>. Essas <strong>tecnologias possuem padrões</strong> que permitem <strong>criar</strong> as <strong>classes de dados independentemente da fonte de dados</strong>: <strong>Banco de Dados Relacional, arquivo texto</strong> ou <em><strong>XML</strong></em>. Além de <strong>encapsular</strong> os<strong>mecanismos de acesso a dados</strong>, criando uma <strong>interface de cliente genérica</strong> e permitindo <strong>independência</strong> no software.

<br><br>

### Spring Data JPA, Hibernate, Flyway
<br><br>

<strong></em>Spring Data JPA</em></strong> é uma framework relacionada ao projeto <strong></em>Spring Data</em></strong> e possui como finalidade tornar a <strong>integração</strong> de aplicações <strong></em>Spring</em></strong> com a <strong></em>JPA</em></strong> cujo <strong>escopo envolve gerenciar a implementação</strong> do <strong></em>ORM</em></strong> a serem <strong>implementados</strong>, ou seja, <strong>camada intermediária</strong> ao <strong></em>JDBC</em></strong>, parte do contêiner <strong></em>Java EE</em></strong> que <strong>gerencia as conexões com o banco de dados</strong>. <strong></em>ORM</em></strong>, técnica para aproximar o paradigma de <strong>POO</strong> ao paradigma do <strong></em>RDBMS</em></strong>.

<strong><em>implementa</em></strong> a especificação <strong></em>JPA</em></strong> e <strong></em>Flyway</em></strong> é uma ferramenta responsável por <strong>versionar a base de dados</strong>. Permite <strong>sincronizar</strong> o <strong>banco de dados</strong> com a <strong>versão da aplicação</strong>, <strong>analisar registros de logs</strong> (<strong></em>scripts Structured Query Language</em></strong> - <strong></em>SQL</em></strong>) <strong>executados ou não</strong>, <strong>automatização</strong> com <strong></em>scripts</em></strong>, <strong>criar</strong> novo <strong>banco de dados</strong>, executar <strong></em>rollback</em></strong> de <strong>mudanças</strong> no <strong>banco de dados</strong>.
</p>

<br><br><br>

<figure>
<p align="center">
  <img src="https://i.imgur.com/1Ea5PH3.png" height="350" width="600" alt="Arquitetura em 3 camadas Projeto Spring Boot"/><br>
  Arquitetura em 3 camadas Projeto Spring Boot
</p>
</figure>

<br>
<hr>
<br>

## Developer 🧑‍💻 
<br><br>
| [<img src="https://avatars.githubusercontent.com/u/37443722?v=4" width=115><br><sub>Gabriel Ferreira</sub>](https://github.com/GabesSeven)
| :---: 
