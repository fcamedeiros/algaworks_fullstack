# Repositório utilizado no curso de FullStack (Angular e Spring) da AlgaWorks

## Modelo de dados do projeto
![Modelo](https://user-images.githubusercontent.com/35452578/117072696-3de92d00-ad07-11eb-8a6c-3bbe127f010b.png)

## Requisitos
1. MySql (https://www.mysql.com/)
2. Flyway (https://flywaydb.org/)

## Endpoints

Categoria:
- ```Listar Categorias..............: (GET)    http://localhost:8080/categorias```
- ```Recuperar Categoria pelo Código: (GET)    http://localhost:8080/categorias/{codigo}```
- ```Salvar Categoria...............: (POST)   http://localhost:8080/categorias```
- ```Apagar Categoria...............: (DELETE) http://localhost:8080/categorias/{codigo}```

Pessoa:
- ```Listar Pessoas.................: (GET)    http://localhost:8080/pessoas```
- ```Recuperar Pessoa pelo Código...: (GET)    http://localhost:8080/pessoas/{codigo}```
- ```Salvar Pessoa..................: (POST)   http://localhost:8080/pessoas```
- ```Apagar Pessoa..................: (DELETE) http://localhost:8080/pessoas/{codigo}```

## Status Codes
- 200: Ok
- 201: Created
- 204: No Content
- 400: Bad Request
- 404: Not Found
