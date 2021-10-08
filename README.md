# Jakarta EE 9 example

## build and run 

Needs Maven and Docker installed

```
mvn clean install
docker run -it --rm -p 8080:8080 -v `pwd`/target/hello-jakarta-ee9-0.0.1-SNAPSHOT.war:/usr/local/tomee/webapps/hello-jakarta-ee9.war tomee:11-jre-9.0.0-M7-webprofile
```

Browse: http://localhost:8080/hello-jakarta-ee9/
