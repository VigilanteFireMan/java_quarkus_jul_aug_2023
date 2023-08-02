### Basic info on Java

* https://www.oracle.com/in/java/technologies/downloads/
* Java 20 is the latest version; Let's use Java 17
* JDK is required to work with Java
* JVM based languages like Java, Groovy, Scala, Kotlin(Android applications)
* Write Java code; Compile it using javac; Compilation gives you bytecodes(IL);Run it using JVM(CLR)

### HelloWorld in Text editor

* Create a .java file
* Compile using **javac**
* Execute using **java**
* java is referred to as JVM or Java Runtime Environment (JRE)

### IDE

* Eclipse, IntelliJ IDEA

### Basic constructs

* Data types; Primitive and Reference types
* Primitive types are stored on the stack; Reference types are stored on the heap
* Wrapper classes- Integer, Boolean, Double etc for boxing
* String and StringBuilder
* Strings are immutable; Use StringBuilder if you want to manipulate strings
* Use .equals for comparison of string values; multiline strings(""" """); formatted for concatenation
* Array syntax - square brackets positioned  after the datatype or variable  

### Interfaces

* Interfaces in Java can contain variables (implicitly public, static and final)
* Is used to define constants
* Interfaces contain abstract methods, **default** methods, static methods
* Use **implements** keyword to implement an interface
* Convention is to define an interface implementation class with the **impl** suffix

### Functional Interfaces

* An interface with just ONE abstract method; can have multiple default methods, static methods
* You can implement an interface in 3 ways
* Create a separate Impl class that implements the interface
* Create an Anonymous inner class that implements the interface - Compiler generates a **ParentClassName$1.class**, **ParentClassName$2.class** ...etc
* If you have a functional interface, implement it using a Lambda expression
* Syntax for lambda **arguments -> implementation**
* You can pass lambdas as arguments to other functions; similar to passing a block of code as argument
* Built-in functional interfaces; **java.util.function** package contains functional interfaces
* Predicate, Function, Supplier, Consumer


### Streams

* Stream is an abstraction to collections
* Introduced in Java 1.8
* Create a stream using **.stream()** method
* Streams cannot be reused
* Streams process items **sequentially** by default
* Streams are read only; You cannot modify the underlying collection using streams
* Streams are lazily evaluated. Evaluated only when the terminal condition is met. get(), forEach(), collect()
* filter, map, reduce, collect


```
####JAVASCRIPT

*****Inside filter JavaScript
*****Inside filter Java
*****Inside filter Scala
*****Inside filter Ruby
=====Inside map JavaScript
=====Inside map Java
JAVASCRIPT
JAVA



#### JAVA STREAMS


*****Inside filter JavaScript
=====Inside map JavaScript
JAVASCRIPT
*****Inside filter Java
=====Inside map Java
JAVA
*****Inside filter Scala
*****Inside filter Ruby

```

* Stream processes every item in a collection, passes it through all the stages till the terminal condition, then picks up the next item.
* **Optional** type introduced in Java 1.7 is like a box which may or may not have data. The caller needs to check if the value is present or is empty and **get()** the value


### Gradle

* Groovy script; manage dependencies
* run gradle build file by specifying different tasks like clean, compile, jar
* A java application can be packaged into a jar file. **java archive**. It's compatible with winzip format
* jar files can be run using (provided you specify a manifest and configure the Main class)

```
java -jar <jarFileName>
```

* Modern day applications(or services or api) are bundled as jars and containerized, and kubernetized and deployed in VMs on the cloud


### Concurrency

* **Thread** is the single line of execution
* Instantiate a Thread class and pass a Runnable instance. Runnable is a functional interface.
* Call **.start()** to start the thread
* java.util.concurrent package provides you with several entities to work with threads
* You can create thread pools using the Executor. fixed thread pool, growable thread pool, ForkJoinPool
* Create a thread pool and submit the activity(Runnable interfaces) to the thread pool
* Number of threads you create depends on number of cores, CPU/IO intensive operations
* **number of threads = number of cores / (1 - blockingfactor)**
* Parallel streams use forkjoin pool. and it uses **number of cores - 1** threads

### Jdbc

* **java.sql** package
* Load the driver, Create a connection, create a statement, execute the sql query, process resultsets.
* Handle exceptions


### Java Enterprise Edition

* Web applications, Messaging applications, Security, GraphQL
* JDK -> Java (Standard Edition) Development Kit
* JEE  SDK->  Jakarta Enterprise Edition Software Development Kit
* JEE is a specification; a set of rules that you need to follow
*  There are several implementations of JEE specification
* ORM -> Hibernate, MyBatis, Panache
* REST api -> Rest easy, Jersey, Spring MVC,

* **Spring Boot** is a framework that has several implementations of JEE specifications under its hood
* **Quarkus** is a framework that has several implementations of JEE specifications under its hood
* **Micronaut** is a framework that has several implementations of JEE specifications under its hood

### Quarkus

* It's compliant with the MicroProfile standard for building microservices
* Cloud native - provides facilities to seamlessly deploy the applications in k8s
* Quarkus applications are more performant than Spring boot; (Their boot-up time is faster than other Java applications); Why?
* **GraalVM** -> Converts your bytecodes to native executables; Starting time is faster than a traditional Java application that runs on a JVM
* Quarkus framework comes with built-in features to work on GraalVM seamlessly


* **quarkus-run.jar** is called a **fast** jar. You have to copy the entire **quarkus-app** and deploy wherever you want and run quarkus-run.jar file

#### Commands

```
./gradlew quarkusDev
```

































