FROM andersonlfeitosa/microservice-base
ADD maven/poc-openshift-microservico2.jar /opt/microservices/poc-openshift-microservico2.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-microservico2.jar"]