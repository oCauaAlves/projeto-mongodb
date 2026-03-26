# 🍃 Projeto MongoDB com Spring Boot

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-blue" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3-green" />
  <img src="https://img.shields.io/badge/MongoDB-NoSQL-brightgreen" />
  <img src="https://img.shields.io/badge/Status-Concluído-success" />
</p>

---

## 📌 Sobre o projeto

Este projeto consiste em uma **API RESTful desenvolvida com Java, Spring Boot e MongoDB**, com foco em manipulação de dados utilizando banco NoSQL.

A aplicação permite realizar operações CRUD e trabalhar com documentos, explorando as diferenças entre bancos relacionais e não relacionais.

O MongoDB é amplamente utilizado em aplicações modernas por sua flexibilidade baseada em documentos e alta escalabilidade. ([MongoDB][1])

---

## 🎯 Objetivo

O objetivo deste projeto é consolidar conhecimentos em:

* Integração com banco de dados NoSQL (MongoDB)
* Criação de APIs REST com Spring Boot
* Manipulação de documentos
* Modelagem de dados não relacional
* Desenvolvimento backend moderno

---

## 🛠️ Tecnologias utilizadas

* **Java 17+**
* **Spring Boot**
* **Spring Data MongoDB**
* **MongoDB**
* **Maven**
* **Postman (testes de API)**

---

## 🧠 Conceitos aplicados

* API RESTful
* CRUD com banco NoSQL
* Modelagem baseada em documentos
* Referências entre documentos
* Injeção de dependência
* Separação em camadas (Controller, Service, Repository)

---

## ⚙️ Como executar o projeto

### 🔧 Pré-requisitos

* Java 17+
* Maven
* MongoDB instalado ou MongoDB Atlas

---

### ▶️ Passo a passo

```bash
# Clonar o repositório
git clone https://github.com/oCauaAlves/projeto-mongodb.git

# Entrar na pasta
cd projeto-mongodb

# Executar o projeto
./mvnw spring-boot:run
```

---

## 🌐 Configuração do banco de dados

Certifique-se de configurar a conexão com o MongoDB no arquivo:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
```

Caso utilize MongoDB Atlas, substitua pela sua connection string.

---

## 🔗 Endpoints principais (exemplo)

| Método | Endpoint    | Descrição          |
| ------ | ----------- | ------------------ |
| GET    | /users      | Listar dados       |
| GET    | /users/{id} | Buscar por ID      |
| POST   | /users      | Criar registro     |
| PUT    | /users/{id} | Atualizar registro |
| DELETE | /users/{id} | Deletar registro   |

---

## 🗄️ Estrutura do projeto

```
src
 ├── entities        # Documentos (coleções MongoDB)
 ├── repositories    # Interfaces MongoRepository
 ├── services        # Regras de negócio
 ├── resources       # Controllers (API REST)
 └── config          # Configurações
```

---

## 🧪 Testes da API

Você pode testar utilizando:

* Postman
* Insomnia

💡 Dica: crie uma collection com todos os endpoints para demonstrar o funcionamento.

---

## 📸 Demonstração (adicione prints aqui)

```markdown
![Exemplo](./assets/mongodb.png)
```

💡 Print do Postman ou JSON retornado pela API chama MUITA atenção.

---

## 🚀 Possíveis melhorias

* 🔐 Implementar autenticação (Spring Security + JWT)
* 📄 Documentação com Swagger/OpenAPI
* ☁️ Deploy com MongoDB Atlas + Render
* 🧪 Testes automatizados
* 📊 Paginação e filtros avançados

---

## 📈 Diferenciais deste projeto

✔ Uso de banco NoSQL (MongoDB)
✔ Estrutura pronta para aplicações modernas
✔ Integração com Spring Boot
✔ Demonstra conhecimento além de bancos relacionais

---

## 👨‍💻 Autor

**Cauã Alves**

* 💼 GitHub: https://github.com/oCauaAlves
* 🔗 LinkedIn: https://www.linkedin.com/in/caua-alves-2b634a276/

---

## ⭐ Considerações finais

Este projeto demonstra a utilização do MongoDB em aplicações backend modernas, destacando a flexibilidade do modelo NoSQL e sua aplicação prática com Spring Boot.

Pro

[1]: https://www.mongodb.com/pt-br/developer/tutorials/?utm_source=chatgpt.com "Tutoriais | MongoDB"
