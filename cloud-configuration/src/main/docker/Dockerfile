FROM andersonlfeitosa/microservice-base
ADD maven/cloud-configuration.jar /opt/microservices/cloud-configuration.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "cloud-configuration.jar"]
