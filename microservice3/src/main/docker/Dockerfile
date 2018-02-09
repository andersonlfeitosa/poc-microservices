FROM andersonlfeitosa/microservice-base
ADD maven/poc-openshift-microservico3.jar /opt/microservices/poc-openshift-microservico3.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-microservico3.jar"]
