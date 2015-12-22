Spring Cloud Bus Demo
===================================
Use spring cloud bus to refresh application configuration


### how to use

1. please start RabbitMQ with docker compose
2. Create a local git repository and start the config server
3. Start cloud bus server
4. Start user service application
5. Change git configuration
6. curl -d "" http://localhost:7654/bus/refresh to refresh configuration


### reference:

* spring cloud: http://projects.spring.io/spring-cloud/spring-cloud.html#_spring_cloud_bus