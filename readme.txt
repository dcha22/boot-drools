Reference: 
https://www.javainuse.com/spring/spring-boot-drools-hello-world

There were runtime issues in creating beans so had to add these dependencies in the pom.xml file:

<!-- API, java.xml.bind module -->
<dependency>
    <groupId>jakarta.xml.bind</groupId>
    <artifactId>jakarta.xml.bind-api</artifactId>
    <version>2.3.2</version>
</dependency>

<!-- Runtime, com.sun.xml.bind module -->
<dependency>
    <groupId>org.glassfish.jaxb</groupId>
    <artifactId>jaxb-runtime</artifactId>
    <version>2.3.2</version>
</dependency>


To Test:
Start up the app as Spring Boot Application 

In Postman run this call:
	http://localhost:8080/getDiscount?type=gold
	
	
