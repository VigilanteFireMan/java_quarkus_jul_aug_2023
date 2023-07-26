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











