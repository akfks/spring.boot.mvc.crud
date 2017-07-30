# spring.boot.mvc.crud
Basic CRUD operations with Spring Boot

* Spring Boot
* Spring Data (Hibernate & MySQL)
* Spring MVC (Tomcat)

# Usage (with eclipse):
* Clone the project
* Eclipse: File -> Import -> Maven -> Existing Maven Projects
* Run
* Navigate to localhost:8080/bookList

## Usage (with IntelliJ):
1. import this project into IntelliJ by select pom.xml or the folder that is containing pom.xml file.
1. `mvn package`
1. `java -jar target/start-1.0-SNAPSHOT.war`
1. Navigate to localhost:8080/bookList

## Database configuration 
Run book.store.sql on MySQL Workbench and add the credentials to `/resources/application.properties`.  
The default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/book.store
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```


