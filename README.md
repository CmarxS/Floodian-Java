# Floodian

**Integrantes:**
- RM558640 - Caio Amarante
- RM556325 - Felipe Camargo
- RM555997 - Caio Marques

## Descrição do Projeto

O Floodian é um sistema integrado de monitoramento e alerta de enchentes, desenvolvido para prever e comunicar riscos em áreas urbanas sujeitas a inundações. A solução engloba:
- **Back-end**: Java Spring Boot com Oracle SQL para persistência de dados e Procedures/Functions em PL/SQL.
- **Aplicativo móvel**: React Native para uso por usuários finais e órgãos de defesa civil.

## Objetivo Geral

Permitir que dados de sensores IoT (nível de água, pluviômetros, pressão, etc.) sejam armazenados, analisados e exibidos em tempo real, de modo a antecipar enchentes e notificar usuários em regiões de risco.

## Links

- **Deploy da API:** [https://floodian-java.onrender.com/Floodian]  
- **Swagger UI:** [https://floodian-java.onrender.com/Floodian/swagger-ui/swagger-ui/index.html]  
- **Pitch:** [https://youtu.be/Pg6Rxiwu_0o]  
- **Apresentação:** [https://youtu.be/ruLiMl8JKLo]  

## Instruções para Acesso e Testes

1. **Acesso à API Backend**
   - A API REST está implementada em Java Spring Boot, conectada ao banco Oracle com scripts de criação das tabelas, procedures e funções em PL/SQL.
   - Utilize o Swagger UI para explorar os endpoints da API e realizar operações CRUD.
   - Para testes, pode ser usado o Postman ou qualquer cliente HTTP.

2. **Banco de Dados**
   - Configure o banco Oracle com os scripts fornecidos para criação das tabelas e procedimentos.
   - As procedures incluem inserção, atualização, deleção e consultas complexas.
   - As funções PL/SQL retornam dados processados, como cálculo de risco médio ou total de ocorrências por região.

3. **Como testar**
   1. Configure o banco Oracle com os scripts SQL fornecidos.
   2. Ajuste as variáveis de ambiente da aplicação Java para conexão ao banco.
   3. Execute a aplicação backend Java.
   4. Inicie o aplicativo móvel React Native e conecte ao endpoint da API.
   5. Utilize o Swagger ou o aplicativo para testar as funcionalidades.

## Observações

- O projeto segue boas práticas de arquitetura e programação conforme o conteúdo da disciplina Java Advanced.
- Preparado para deployment em ambientes de produção com foco em segurança e escalabilidade.
- Pode ser estendido para integração com dispositivos IoT reais via MQTT e dashboards em tempo real.

## Configuração de Conexão com o Banco de Dados

```
spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
```

## Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.4.6  
- Spring Data JPA  
- Oracle Database (PL/SQL)  
- Swagger (documentação da API)  
- Maven  
- React Native  
