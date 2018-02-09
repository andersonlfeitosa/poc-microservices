FROM andersonlfeitosa/microservice-base
ADD maven/service-registry.jar /opt/microservices/service-registry.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "service-registry.jar"]