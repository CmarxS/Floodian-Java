# Floodian

## Integrantes:
- RM558640 - Caio Amarante  
- RM556325 - Felipe Camargo  
- RM555997 - Caio Marques  

---

## Descrição do Projeto

O Floodian é um sistema integrado de monitoramento e alerta de enchentes, desenvolvido para prever e comunicar riscos em áreas urbanas sujeitas a inundações. A solução engloba uma aplicação de back-end (Oracle SQL para a persistência de dados e Procedures/Functions em PL/SQL) e um aplicativo móvel (React Native) para uso por usuários finais e órgãos de defesa civil.

### Objetivo Geral
Permitir que dados de sensores IoT (nível de água, pluviômetros, pressão, etc.) sejam armazenados, analisados e exibidos em tempo real, de modo a antecipar enchentes e notificar usuários em regiões de risco.

---

## Links

- Link do deploy da API: (será adicionado depois)  
- Link dos vídeos de demonstração e pitch: (será adicionado depois)  

---

## Instruções para Acesso e Testes

### 1. Acesso à API Backend

- A API REST está implementada em Java Spring Boot, conectada ao banco Oracle com os scripts de criação das tabelas, procedures e funções em PL/SQL presentes no repositório.
- Utilize o Swagger UI para explorar os endpoints da API e realizar operações CRUD.
- Para testes, pode ser usado o Postman ou qualquer cliente HTTP para chamadas REST.

### 2. Banco de Dados

- O banco de dados Oracle deve estar configurado com os scripts fornecidos para criação das tabelas e procedimentos.
- As procedures são usadas para inserção, atualização, deleção e consultas complexas para o sistema.
- As funções PL/SQL retornam dados processados, como cálculo de risco médio ou total de ocorrências por região.

### 3. Como testar

- Configure o banco Oracle com os scripts SQL fornecidos.  
- Configure as variáveis de ambiente da aplicação Java para conexão ao banco.  
- Execute a aplicação backend Java.  
- Inicie o aplicativo móvel React Native e conecte ao endpoint da API.  
- Utilize o Swagger para testar endpoints ou o app para ações de usuário.  

---

## Observações

- O projeto segue boas práticas de arquitetura e programação conforme o conteúdo da disciplina Java Advanced.  
- O sistema é preparado para ser deployado em ambientes de produção com segurança e escalabilidade.  
- O projeto pode ser extendido para integração com dispositivos IoT reais via protocolos MQTT e dashboards em tempo real.

---

**Este README será atualizado após a publicação dos links de deploy e vídeos.**

---

*Obrigado por acessar o projeto Floodian!*
