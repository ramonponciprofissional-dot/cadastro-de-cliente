# API REST de Cadastro de Usuários

API REST em Java para gerenciar usuários (CRUD completo), desenvolvida para praticar back-end com Spring Boot.

## Funcionalidades

- Cadastrar usuário
- Buscar usuário por e-mail
- Atualizar dados do usuário
- Excluir usuário

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (em memória)
- Postman (testes dos endpoints)

## Endpoints

| Método | Rota | Descrição |
|--------|------|-----------|
| POST | `/usuario` | Cadastra um usuário |
| GET | `/usuario?email=exemplo@email.com` | Busca usuário por e-mail |
| PUT | `/usuario?id=1` | Atualiza um usuário |
| DELETE | `/usuario?email=exemplo@email.com` | Exclui um usuário |

> [CONFIRMAR] Ajuste as rotas e os parâmetros para os que estão no seu controller.

### Exemplo de corpo da requisição (POST)

```json
{
  "nome": "Maria Silva",
  "email": "maria@email.com"
}
```

> [CONFIRMAR] Ajuste os campos para os que a sua entidade realmente tem.

## Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ramonponciprofissional-dot/cadastro-de-cliente.git
   ```
2. Entre na pasta do projeto e execute (é preciso ter o Java 21 instalado):
   ```bash
   ./mvnw spring-boot:run
   ```
   > [CONFIRMAR] Se o projeto usa Gradle, o comando é `./gradlew bootRun`.
3. A API sobe em `http://localhost:8080`.

## Aprendizados

- Construção de uma API REST com Spring Boot
- Persistência de dados com Spring Data JPA
- Teste de endpoints com Postman

## Autor

Ramon Ponci de Oliveira, estudante de Análise e Desenvolvimento de Sistemas.
[LinkedIn](https://www.linkedin.com/in/ramon-ponci-634629218)
