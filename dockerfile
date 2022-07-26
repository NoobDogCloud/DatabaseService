FROM openjdk:19-jdk-alpine3.16
COPY ./target/#{f} /home/app/
WORKDIR /home/app
ENTRYPOINT ["java", "-Dfile.encoding=utf-8", "-jar", "#{f}"]