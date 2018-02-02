FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservicos
ADD maven/poc-openshift-registry.jar /opt/microservicos/poc-openshift-registry.jar
WORKDIR /opt/microservicos
EXPOSE 8080
USER anderson
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-registry.jar"]

