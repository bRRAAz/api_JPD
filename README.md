# API da Faculdade

Este projeto é uma API REST construída com Java e Spring Boot, destinada a servir como backend.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação para o desenvolvimento da API.
- **Spring Boot**: Framework utilizado para facilitar a configuração e publicação da aplicação.
- **JPA (Java Persistence API)**: Especificação para persistência de dados no banco.
- **Spring Security**: Framework que fornece autenticação e autorização.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados.
- **Docker**: Plataforma para empacotar a aplicação em containers, facilitando a distribuição e execução.

## Configuração do Banco de Dados

O banco de dados PostgreSQL está configurado para rodar em um container Docker na porta `5433`.

## Executando o Projeto

Para executar o projeto, siga os passos abaixo:

1. Instale uma IDE que suporte Java. (IDE utilizada Intelij)
https://www.jetbrains.com/pt-br/idea/download/?section=windows

2. Clone o repositório:
no terminal coloque na pasta que deseja receber a API e coloque.
git clone https://github.com/bRRAAz/api_JPD.git

3. Com o docker instalado na sua maquina entre no seu terminal e coloque o seguinte comando
docker run -p PORTA_DE_SAIDA:5432 -e POSTGRES_PASSWORD=SENHA_DO_BANCO -v  DIRETORIO_DA_PASTA_DO_BANCO -d postgres

4. Abra sua IDE na pasta clonada e rode o arquivo ApiApplication.java


## Endpoints da API

- `GET /api/usuarioo`: Retorna uma lista de todos os usuários.
- `POST /api/usuario`: Cria um novo usuário.
- `POST /api/usuario/signin`: Logar com o usuário.
- `GET /api/setor`: Retorna uma lista de todos os setores.
- `POST /api/setor`: Cria um novo setor.
- `GET /api/presenca`: Retorna uma lista de todas as presenças.
- `POST /api/presenca`: Cria uma nova presença.
- `GET /api/acao`: Retorna uma lista de todas as ações.
- `POST /api/acao`: Cria uma nova ação.
