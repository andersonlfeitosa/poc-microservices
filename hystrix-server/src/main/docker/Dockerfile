FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/microservicos
ADD maven/poc-openshift-hystrix.jar /opt/microservicos/poc-openshift-hystrix.jar
WORKDIR /opt/microservicos
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-hystrix.jar"]

