# springboot-resource-server-sample
Resource server implemented with spring boot
> Keycloak Admin Client is the Java Wrapper of the Keycloak Admin REST API
The Resource Server is a server that uses the Access Token issued by the Authorization Server in the OAuth 2.0 Protocol.
This project configures the Resource Server with Spring Boot

## Getting started
Configure the issuer-uri and jwk-set-uri endpoints of the authorization server to be used in application.yml

``` 
issuer-uri: { authorization server issuer-uri }
jwk-set-uri: { authorization server jwk-set-uri }
```

## Features

This project makes it easy to:
* You can delegate token validation to Authorization Server to focus on implementing business logic
* You can control multiple Resource Servers with one Authorization Server

## Reference

- [OAuth 2.0 Resource Server](https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/index.html)