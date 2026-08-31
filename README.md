# Library Manager API

API REST para gestão de biblioteca, desenvolvida como projeto de estudo e portfólio, aplicando arquitetura em camadas com Spring Boot e PostgreSQL.

## 🛠️ Tecnologias

- Java 21
- Spring Boot 4
- Spring Data JPA
- PostgreSQL
- Maven

## 🏗️ Arquitetura

O projeto segue a separação em camadas:
Controller → Service → Repository → Entity → Banco de Dados

- **Controller**: expõe os endpoints REST
- **Service**: contém as regras de negócio
- **Repository**: acesso aos dados via Spring Data JPA
- **Entity**: mapeamento objeto-relacional das tabelas

## 📚 Endpoints

| Método | Rota          | Descrição              |
|--------|---------------|-------------------------|
| GET    | /livros       | Lista todos os livros   |
| GET    | /livros/{id}  | Busca um livro por id   |
| POST   | /livros       | Cadastra um novo livro  |
| DELETE | /livros/{id}  | Remove um livro por id  |

## ▶️ Como rodar localmente

### Pré-requisitos
- Java 21+
- PostgreSQL rodando localmente
- Maven (ou use o wrapper `./mvnw`)

### Passos

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/library-manager-api.git
```

2. Crie o banco de dados no PostgreSQL
```sql
CREATE DATABASE library_db;
```

3. Configure o `application.properties` com suas credenciais do Postgres

4. Rode a aplicação
```bash
./mvnw spring-boot:run
```

5. A API estará disponível em `http://localhost:8080`

## 🚧 Próximos passos

- [ ] Relacionamento com entidade Autor
- [ ] Sistema de empréstimos
- [ ] Documentação com Swagger
- [ ] Testes automatizados
- [ ] Docker Compose****