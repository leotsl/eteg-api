# eteg-api
API proposta no desafio.  

É importante executar os passos abaixo para que a aplicação execute sem problemas.  

1 - A aplicação utiliza o MySQL como base de dados, certifique-se que você o possui instalado.  
2 - Crie um database chamado eteg (CREATE DATABASE eteg).  
3 - Localize o arquivo applications.properties em src/main/resources e altere a linha  
    spring.datasource.username = root para o nome de usuário de seu banco de dados e a linha   
    spring.datasource.password = admin para a sua respectiva senha.  
4 - Execute o seguinte comando mvn:spring-boot:run na raíz da aplicação e pronto, a aplicação  
    já está disponível para testes.  
