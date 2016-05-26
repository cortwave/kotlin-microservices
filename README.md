# kotlin-microservices
Pet app writed on Kotlin using microservices architecture based on Spring Cloud + Netflix stack (Zuul, Eureka, Hystrix, Fleign) 

## Instruction to run

Build spring boot jars and docker images:

```sh
gradle build dockerBuild
```

At first run config and eureka servers using docker-compose:

```sh
docker-compose up -d config-server eureka-server
```

Ensure that eureka started successfully on `localhost:8761` (it can takes 20-30 sec)

After it you can run others services:

```sh
docker-compose scale zuul-gateway=1 agregator=1 data-service=2
```

Check that services were registered with eureka on `localhost:8761` (it can takes some minutes)
