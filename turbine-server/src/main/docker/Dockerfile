FROM andersonlfeitosa/microservice-base
ADD maven/poc-openshift-turbine.jar /opt/microservices/poc-openshift-turbine.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-turbine.jar"]