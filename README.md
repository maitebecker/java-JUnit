# Testes unitários com JUnit



Códigos realizados durante o bootcamp de java da plataforma [DIO](https://web.dio.me/#state=930583f7-5945-4b65-8316-88c87c06c0ae&session_state=b4686129-5ec2-4105-984d-646c2881f106&code=5389c338-6933-4914-92d3-ea717127f824.b4686129-5ec2-4105-984d-646c2881f106.a889d5a2-0d02-46df-83a5-28a1b4ac39ab). Utilizando Maven e JUnit

- O *Apache Maven* é uma ferramenta de automação e gerenciamento de projetos Java. Ela fornece às equipes de desenvolvimento uma forma padronizada de automação, construção e publicação de suas aplicações, agregando agilidade e qualidade ao produto final. Por ser extremamente flexível, permite que sejam adicionados plugins a si, para estender suas funcionalidades nativas.
- *JUnit* é um framework que facilita o desenvolvimento e execução de testes unitários em código Java.


## Configurando JUnit no Maven
Aicionar no ```pom.xml``` a dependência abaixo:
```xml
<dependency>  
 <groupId>org.junit.jupiter</groupId>  
 <artifactId>junit-jupiter-engine</artifactId>  
 <version>${junit.jupiter.version}</version>  
 <scope>test</scope>  
</dependency>
```
Referência: https://mvnrepository.com/search?q=junit

## Códigos realizados:
- [JUnit](JUnit)
