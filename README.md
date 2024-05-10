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

1. Instale uma IDE que suporte Java. (IDE utilizada Intelij):

https://www.jetbrains.com/pt-br/idea/download/?section=windows

2. Clone o repositório:
no terminal coloque na pasta que deseja receber a API e coloque.

git clone https://github.com/bRRAAz/api_JPD.git

3. Com o docker instalado na sua maquina entre no seu terminal e coloque o seguinte comando:


docker run -p PORTA_DE_SAIDA:5432 -e POSTGRES_PASSWORD=SENHA_DO_BANCO -v  DIRETORIO_DA_PASTA_DO_BANCO -d postgres


4. Abra sua IDE na pasta clonada e rode o arquivo ApiApplication.java


## Endpoints da API

- `GET /api/usuario`: Retorna uma lista de todos os usuários.
- `POST /api/usuario`: Cria um novo usuário.
- `POST /api/usuario/signin`: Logar com o usuário.
- `GET /api/setor`: Retorna uma lista de todos os setores.
- `POST /api/setor`: Cria um novo setor.
- `GET /api/presenca`: Retorna uma lista de todas as presenças.
- `POST /api/presenca`: Cria uma nova presença.
- `GET /api/acao`: Retorna uma lista de todas as ações.
- `POST /api/acao`: Cria uma nova ação.




# College API

This project is a REST API built with Java and Spring Boot, intended to serve as a backend.

## Technologies Used
 - **Java**: Programming language for API development.
 - **Spring Boot**: Framework used to facilitate the configuration and publication of the application.
 - **JPA** (Java Persistence API): Specification for data persistence in the database.
 - **Spring Security**: Framework that provides authentication and authorization.
 - **PostgreSQL**: Database management system.
 - **Docker**: Platform to package the application in containers, facilitating distribution and execution.

## Database Configuration

The PostgreSQL database is configured to run in a Docker container on port 5433.

## Running the Project

To run the project, follow the steps below:

1.Install an IDE that supports Java. (IDE used Intelij):

https://www.jetbrains.com/idea/download/?section=windows

2.Clone the repository: in the terminal put in the folder you want to receive the API and put.

git clone https://github.com/bRRAAz/api_JPD.git

3.With docker installed on your machine enter your terminal and put the following command:

docker run -p OUTPUT_PORT:5432 -e POSTGRES_PASSWORD=DATABASE_PASSWORD -v DATABASE_FOLDER_DIRECTORY -d postgres

4.Open your IDE in the cloned folder and run the ApiApplication.java file

## API Endpoints

- `GET /api/usuario`: Returns a list of all users.
- `POST /api/usuario`: Creates a new user.
- `POST /api/usuario/signin`: Log in with the user.
- `GET /api/setor`: Returns a list of all sectors.
- `POST /api/setor`: Creates a new sector.
- `GET /api/presenca`: Returns a list of all presences.
- `POST /api/presenca`: Creates a new presence.
- `GET /api/acao`: Returns a list of all actions.
- `POST /api/acao`: Creates a new action.
