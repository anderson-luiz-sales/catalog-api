# Catalog

API responsável por agrupar informações de catálogo, como: Produtos e categorias.

### Pré-requisitos
O que você precisa instalar para rodar o projeto?

* [Maven](https://maven.apache.org/)
* [JDK-8](https://www.oracle.com/technetwork/pt/java/javase/downloadsjdk8-downloads-2133151.html)
* [JRE-8](https://www.oracle.com/technetwork/pt/java/javase/downloadsjre8-downloads-2133155.html)
* [MongoDB](https://www.mongodb.com/)

### Instalação

git clone https://github.com/anderson-luiz-sales/catalog-api.git

### Como rodar a API
```
mvn spring-boot:run
```

### Como rodar os teste?
```
mvn test
```

### Para validar se foi instalado corretamente:
```
http://localhost:8080/healthcheck
```
### Para acessar a documentação do Swagger:
```
http://localhost:8080/swagger-ui.html#/
```

## Tecnologias utilizadas

* [Maven](https://maven.apache.org/) - Gerenciamento de Dependência
* [Spring Boot Web Starter](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web) - Starter para construção de web, incluindo aplicativos RESTful, usando o Spring MVC. Usa o Tomcat como o contêiner incorporado padrão
* [Lombok](https://projectlombok.org/) - O Projeto Lombok é uma biblioteca java que se conecta automaticamente ao seu editor e cria ferramentas, apimentando seu java. Nunca escreva outro método getter ou equals novamente, com uma anotação sua classe tem um construtor com todos os recursos, Automatize suas variáveis ​​de registro e muito mais.
* [Spring Boot Test Starter](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test) - Starter para testar aplicativos Spring Boot com bibliotecas, incluindo JUnit, Hamcrest e Mockito.
* [Model Mapper](http://modelmapper.org/) - Os aplicativos geralmente consistem em modelos de objetos semelhantes, mas diferentes, em que os dados em dois modelos podem ser semelhantes, mas a estrutura e as preocupações dos modelos são diferentes. O mapeamento de objetos facilita a conversão de um modelo em outro, permitindo que modelos separados permaneçam segregados.
* [Spring Cloud Starter OpenFeign](https://cloud.spring.io/spring-cloud-openfeign/reference/html/) - Este projeto fornece integrações OpenFeign para aplicativos Spring Boot por meio de configuração automática e ligação ao Spring Environment e a outras expressões do modelo de programação Spring.
* [Swagger](https://swagger.io/) - Simplifique o desenvolvimento de API para usuários, equipes e empresas com o conjunto de ferramentas open source e profissional Swagger.
* [Spring Boot Actuator Starter](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator) - Iniciador para usar o Atuador do Spring Boot, que fornece recursos prontos para produção para ajudá-lo a monitorar e gerenciar seu aplicativo.
* [Power Mock](https://powermock.github.io/) - O PowerMock é uma estrutura que estende outras bibliotecas simuladas, como o EasyMock, com recursos mais poderosos. O PowerMock usa um carregador de classes personalizado e manipulação de bytecode para permitir a simulação de métodos estáticos, construtores, classes e métodos finais, métodos particulares, remoção de inicializadores estáticos e muito mais.



