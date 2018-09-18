FROM anapsix/alpine-java
MAINTAINER Jerome Loisel
EXPOSE 2225
COPY target /maven/

CMD ["java","-jar","/maven/zuul-server.jar"]