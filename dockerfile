FROM openjdk:latest
COPY ./target/#{f} /home/app/
WORKDIR /home/app
ENTRYPOINT ["java", "-Dfile.encoding=utf-8", "-jar", "#{f}"]