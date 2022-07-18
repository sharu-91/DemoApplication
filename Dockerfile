FROM openjdk:11-jdk
ARG JAR_FILE=target/*.jar
USER sharus91:sharus91
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]