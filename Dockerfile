FROM openjdk:17-oracle
MAINTAINER artatech.com
COPY target/student-app.jar student-app.jar
ENTRYPOINT ["java", "-jar", "student-app.jar", "$ARGS"]
EXPOSE 8087