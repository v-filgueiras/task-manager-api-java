# 🚀 Task Manager API

API REST desenvolvida com **Spring Boot** para gerenciamento de projetos, tarefas e membros.
Projetada utilizando princípios de arquitetura limpa, padrão DTO e inspirada em **Domain-Driven Design (DDD)**.

---

## 📌 Visão Geral

A Task Manager API é uma aplicação backend que fornece uma forma estruturada de gerenciar projetos, incluindo criação, atualização, remoção e consulta de dados.

O sistema foi desenvolvido com foco em escalabilidade e manutenibilidade, aplicando boas práticas como:

* Arquitetura em camadas
* Uso de DTO para transferência de dados
* Separação de responsabilidades
* Código limpo e de fácil leitura

---

## 🚀 Funcionalidades

### 📁 Projetos

* Criar um novo projeto
* Buscar projeto por ID
* Atualizar informações do projeto
* Deletar um projeto

### 📝 Tasks

* Criar tarefas vinculadas a um projeto
* Atualizar status da tarefa
* Listar tarefas por projeto

### 👥 Members

* Adicionar membros aos projetos
* Gerenciar participação em projetos
* Associar membros às tarefas

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot**
* **Spring Data JPA**
* **Lombok**
* **H2 Database**
* **Maven**

---

## 🧱 Arquitetura

A aplicação segue uma **arquitetura em camadas**:

* **Controller** → Responsável por lidar com requisições e respostas HTTP
* **Service** → Contém as regras de negócio
* **Repository** → Camada de acesso a dados
* **DTO** → Objetos de transferência de dados
* **Entity** → Modelos de domínio

---

## 🔄 Exemplo de API

### ➕ Criar Projeto

```json
{
  "name": "Task Manager API",
  "description": "Sistema backend para gerenciamento de tarefas e projetos",
  "finalDate": "2026-04-30"
}
```

---

## ▶️ Como Executar a Aplicação

```bash
# Clonar o repositório
git clone https://github.com/v-filgueiras/task-manager-api.git

# Acessar a pasta do projeto
cd task-manager-api

# Executar a aplicação
./mvnw spring-boot:run
```

---

## 🧪 Console do Banco H2

Acesse o banco de dados em memória:

```
http://localhost:8080/h2-console
```

---

## 📈 Melhorias Futuras

* Implementação completa do módulo de Tasks
* Implementação completa do módulo de Members
* Autenticação e autorização com JWT
* Testes unitários e de integração
* Documentação da API com Swagger
* Deploy em nuvem (AWS / Render)

---

## 

**Victor Filgueiras**

---

