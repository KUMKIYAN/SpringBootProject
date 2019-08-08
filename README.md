# SpringBootProject


Micro Services:

Single code base with mulitple modules -> only one WAR/Jar file

Single application as small services (Stateless - new request) - We will have multiple WAR files.


IAAS  - infrastucture
PAAS  - application
SAAS  - Software


application
data
runtime
middleware
o/s
virtualization
Servers
Storage
Networking




--------------------------------------------------------------------
in IAAS   - We take rent and go.

application
data
runtime
middleware
o/s

we are responsible for above and below are responsible from vendor

virtualization
Servers
Storage
Networking


--------------------------------------------------------------------


In PAAS

application
data

we are responsible for above and below are responsible from vendor

runtime
middleware
o/s
virtualization
Servers
Storage
Networking



--------------------------------------------------------------------


in SAAS

All are responsible from vendor

application
data
runtime
middleware
o/s
virtualization
Servers
Storage
Networking


__________________________

RestController


/resources or endpoint.

getmapping
postmapping
deletemapping
putmapping
patchmapping -> not relavent

@requestparam
@pathvariable ( which expose to outer world becuase it expect in the url)
spring rest / jerrsey/ jackson

/swagger-ui.html#


@SpringBootApplication: Entry Point
@EnableAutoConfiguration: Automatically configures dependencies
@ComponentScan: scans all the beans and package declarations when the application initializes



spring-boot-starter-actuator -> monitor and manage
spring-boot-starter-security -> Spring Security
spring-boot-starter-web
spring-boot-starter-thymeleaf
spring-boot-starter-test -> to write test cases


If you added @SpringBootApplication annotation to the class, you do not need to add the @EnableAutoConfiguration, @ComponentScan and @SpringBootConfiguration annotation.
The @SpringBootApplication annotation includes all other annotations.

To write Rest Endpoint:  @RestController add at the class level and @RequestMapping add at the method level.


mvn clean install
goto target folder
java –jar


Remember that when you upgrade the Spring Boot version, dependencies also will upgrade automatically.


com
+-tutorialpoint
	+-myProject
		+-Application.java
		|
		+-model
		|+-Product.java
		+-dao
		|+-ProductRepository.java
		+-controller
		|+ProductController.java
		+-service
		|+-ProductService.java



application.properties
   server.port = 9090
   spring.application.name = demoservice

inorder to run on port given in application.properties use the below command.
	java -jar -Dspring.config.location=/Users/kikumar/Downloads/demo2/src/main/resources/application.properties demo-0.0.1-SNAPSHOT.jar


inorder to log add "debug = true" in application.properties
inorder to add log into a file add "/Users/kikumar/Downloads/demo2/mylog.log"