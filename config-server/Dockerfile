FROM java:8-jre
MAINTAINER Dmitry Pranchuk <d.pranchuk@gmail.com>

ADD ./build/libs/config-server.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


EXPOSE 8181