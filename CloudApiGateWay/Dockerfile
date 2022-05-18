FROM openjdk:11-jre-slim
WORKDIR usr/src
EXPOSE 9000
ADD ./target/GateWayDemo-0.0.1-SNAPSHOT.jar /usr/src/GateWayDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","GateWayDemo-0.0.1-SNAPSHOT.jar"]