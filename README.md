# Repositório utilizado no curso de FullStack (Angular e Spring) da AlgaWorks

## Modelo de dados do projeto
![Modelo](https://user-images.githubusercontent.com/35452578/117072696-3de92d00-ad07-11eb-8a6c-3bbe127f010b.png)

## Requisitos
1. MySql (https://www.mysql.com/)
2. Flyway (https://flywaydb.org/)
3. Apache Commons Lang (https://commons.apache.org/proper/commons-lang/)

## Endpoints

Categoria:
- ```Listar Categorias...............: (GET)    http://localhost:8080/categorias```
- ```Recuperar Categoria pelo Código.: (GET)    http://localhost:8080/categorias/{codigo}```
- ```Criar Categoria.................: (POST)   http://localhost:8080/categorias```
- ```Atualizar Categoria.............: (PUT)    http://localhost:8080/categorias/{codigo}```
- ```Apagar Categoria................: (DELETE) http://localhost:8080/categorias/{codigo}```

Pessoa:
- ```Listar Pessoas..................: (GET)    http://localhost:8080/pessoas```
- ```Recuperar Pessoa pelo Código....: (GET)    http://localhost:8080/pessoas/{codigo}```
- ```Criar Pessoa....................: (POST)   http://localhost:8080/pessoas```
- ```Atualizar Pessoa................: (PUT)    http://localhost:8080/pessoas/{codigo}```
- ```Atualizar Propriedade Ativo.....: (PUT)    http://localhost:8080/pessoas/{codigo}/ativo```
- ```Apagar Pessoa...................: (DELETE) http://localhost:8080/pessoas/{codigo}```

Lançamento:
- ```Listar Lançamento...............: (GET)    http://localhost:8080/lancamentos```
- ```Recuperar Lançamento pelo Código: (GET)    http://localhost:8080/lancamentos/{codigo}```
- ```Recuperar Lançamento pela Descr.: (GET)    http://localhost:8080/lancamentos?descricao={descricao}```
- ```Recuperar Lançamento pelo Vencto: (GET)    http://localhost:8080/lancamentos?dataVencimentoDe={yyyy-mm-dd}&dataVencimentoAte={yyyy-mm-dd}```
- ```Criar Lançamento................: (POST)   http://localhost:8080/lancamentos```

## Status Codes
- 200: Ok
- 201: Created
- 204: No Content
- 400: Bad Request
- 404: Not Found
