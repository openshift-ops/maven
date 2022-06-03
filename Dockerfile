FROM openjdk:8-jdk-alpine
ADD hello-jenkins-maven/target/hello-jenkins-maven.jar hello-maven-jenkins.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","hello-maven-jenkins.jar"]