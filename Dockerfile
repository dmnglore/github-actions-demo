FROM openjdk:17
EXPOSE 9091
ADD target/springboot-githubaction-new.jar springboot-githubaction-new.jar
ENTRYPOINT ["java","-jar","/springboot-githubaction-new.jar"]