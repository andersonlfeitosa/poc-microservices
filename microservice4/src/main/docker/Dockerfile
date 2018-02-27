FROM andersonlfeitosa/microservice-base
ADD maven/microservice4.jar /opt/microservices/microservice4.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "microservice4.jar"]
