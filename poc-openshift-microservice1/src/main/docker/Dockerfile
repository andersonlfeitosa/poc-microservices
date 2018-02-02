FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservicos
ADD maven/poc-openshift-microservico1.jar /opt/microservicos/poc-openshift-microservico1.jar
WORKDIR /opt/microservicos
EXPOSE 8080
USER anderson
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx128m", "-jar", "poc-openshift-microservico1.jar"]

