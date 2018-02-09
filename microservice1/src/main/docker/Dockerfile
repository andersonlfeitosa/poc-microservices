FROM andersonlfeitosa/microservice-base
ADD maven/microservice1.jar /opt/microservices/microservice1.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "microservice1.jar"]
