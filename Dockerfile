FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
RUN mkdir /home/.sonar
RUN chmod 777 /home/.sonar
ENV SONAR_USER_HOME=/home/.sonar