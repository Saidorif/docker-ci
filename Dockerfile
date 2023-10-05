FROM ubuntu
RUN apt-get update && apt-get install -y openjdk-8-jdk
COPY src/main/java/Main.java .
RUN javac Main.java
CMD ["java", "Main"]