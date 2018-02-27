FROM andersonlfeitosa/microservice-base
ADD maven/microservice3.jar /opt/microservices/microservice3.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "microservice3.jar"]
