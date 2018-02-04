FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservices
ADD maven/poc-openshift-microservico1.jar /opt/microservices/poc-openshift-microservico1.jar
RUN chown -R usrjava /opt/
WORKDIR /opt/microservices
EXPOSE 8080
USER usrjava
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-microservico1.jar"]
