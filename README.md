# 🏦 Sistema Bancário em Java (MVC)

Este projeto é um **sistema bancário desenvolvido em Java**, utilizando a arquitetura **MVC (Model–View–Controller)**.  
O objetivo é simular operações bancárias básicas através de um menu interativo no console.

O projeto foi desenvolvido com foco em **boas práticas**, **organização em camadas** e **fundamentos sólidos de POO**.

---
## 🚀 Funcionalidades

### ✔ Contas Bancárias
- Criar conta  
- Consultar conta por número  
- Listagem de informações básicas  

### ✔ Operações Financeiras
- Depósito  
- Saque (com validação de saldo insuficiente)  
- Extrato com histórico de transações  

### ✔ Extras
- Menu interativo no console  
- Tratamento de erros  
- Histórico automático de operações  
- Arquitetura preparada para expansão

---
## 🏗 Arquitetura do Projeto

A arquitetura segue o padrão **MVC**, organizada da seguinte forma:

### 🔹 Model  
Contém as classes responsáveis pela estrutura dos dados e histórico.

### 🔹 Repository  
Simula um banco de dados usando `HashMap`.

### 🔹 Service  
Implementa as regras de negócio do sistema.

### 🔹 Controller  
É a ponte entre a entrada do usuário e os serviços.

### 🔹 App  
Menu interativo para interação com o usuário.

---

## 🛠 Tecnologias Utilizadas

- **Java 21**
- **Collections (HashMap, ArrayList)**
- **Arquitetura MVC**
- **Programação Orientada a Objetos**

---

