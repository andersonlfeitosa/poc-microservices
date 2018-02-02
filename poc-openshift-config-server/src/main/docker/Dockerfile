FROM 10.102.1.2:5000/java-atomic:1.8.0-v2
RUN mkdir -p /opt/microsservicos
ADD maven/poc-openshift-config-server.jar /opt/microsservicos/poc-openshift-config-server.jar
RUN chown -R usrjava /opt/
WORKDIR /opt/microsservicos
EXPOSE 8888
USER usrjava
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "poc-openshift-config-server.jar"]
