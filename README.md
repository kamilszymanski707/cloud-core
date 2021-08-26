# cloud-core

A project containing common components for microservices in Spring Cloud.
Includes: Cloud Config, Api Gateway, Eureka Server, Cloud Loadbalancer, Resilience4J CircruitBreaker, ELK and Keycloak Authorization.
In order to use it with your API you need to create a file "git-config.properties" in which the property is given: "git-root-search-path" which specifies the git url to the properties of a particular system, and a logback-spring.xml file which is needed for ELK support.
Then copy the files to "/config/src/main/resources/".
In the gateway properties, add the "route-prefix" property which specifies the base URL path to our microservices system. Change the "spring.cloud.config.server.git.uri" property in "config/src/main/resources/application.yml" to the git URL of our choice.