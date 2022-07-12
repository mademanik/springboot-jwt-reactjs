# Springboot JWT ReactJS Mysql

### Run Backend (springboot-jwt-backend)

* Open springboot-jwt-backend directory by running this code
```
cd springboot-jwt-backend
```
* Configure MYSQL database, username and password at inside src/main/resources/application.properties
```
spring.datasource.url= jdbc:mysql://localhost:3306/login_app?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username= root
spring.datasource.password= 
```
* Run Your Mysql Database (XAMPP/WAMPP)
* Run Springboot Application by using STS/VSCode/intellij IDEA
* Run SQL Script below in your database :

```
INSERT INTO role (id, name) VALUES (1, 'ROLE_USER'); 
INSERT INTO role (id, name) VALUES (2, 'ROLE_MODERATOR'); 
INSERT INTO role (id, name) VALUES (3, 'ROLE_ADMIN');
```
* Done, Backend successfully running

### Run Frontend (springboot-jwt-frontend)
* Open springboot-jwt-frontend directory by running this code
```
cd springboot-jwt-frontend
```

* Install Dependency
```
npm i
#or
yarn
```

* Start Application
```
npm start
#or
yarn start
```

* Done, Frontend successfully running
