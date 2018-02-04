FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservices
ADD maven/poc-openshift-config-server.jar /opt/microservices/poc-openshift-config-server.jar
RUN adduser -D -u 1000 usrjava
RUN chown -R usrjava /opt/
WORKDIR /opt/microservices
EXPOSE 8080
USER usrjava
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-config-server.jar"]
