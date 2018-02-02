FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservicos
ADD maven/poc-openshift-microservico2.jar /opt/microservicos/poc-openshift-microservico2.jar
WORKDIR /opt/microservicos
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-microservico2.jar"]

