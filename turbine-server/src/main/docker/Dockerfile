FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservices
ADD maven/poc-openshift-turbine.jar /opt/microservices/poc-openshift-turbine.jar
RUN chown -R usrjava /opt/
WORKDIR /opt/microservices
EXPOSE 8080
USER usrjava
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-turbine.jar"]