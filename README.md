# cloud-core

A project containing common components for projects used in my repository.
Includes: Cloud Config, Cloud Api Gateway, Eureka Server (Service Discovery), Loadbalancer, Resilience4J CircruitBreaker, ELK, and Keycloak.
To use it in the project, copy the configuration files available at url: https://github.com/kamilszymanski707/e-shop-api/tree/main/scripts/spring-resources.
The file "gateway-allowed-routes.properties" contains paths to services that can be called: Map id (service name) -> method (available HTTP method). It has to be copied to the folder: "/gateway/src/main/resources/".
The file "git-config.properties" contains the path to the system-wide configuration files that are available in the repository: https://github.com/kamilszymanski707/git-config. It should be copied into the folder: "/config/src/main/resources/".
The last file is the ELK configuration file "logback-spring.xml" should be copied to the "resources" folder in each project.
