FROM openjdk:17
COPY ./build/libs/UsuarioAPI-0.0.1-SNAPSHOT.jar UsuarioAPI-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","UsuarioAPI-0.0.1-SNAPSHOT.jar"]