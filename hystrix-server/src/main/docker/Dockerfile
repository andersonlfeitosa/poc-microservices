FROM andersonlfeitosa/microservice-base
ADD maven/poc-openshift-hystrix.jar /opt/microservices/poc-openshift-hystrix.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-hystrix.jar"]