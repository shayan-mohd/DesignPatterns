# SOLID Principles

## S - Single Responsibility Principle
## O - Open/Closed Principle
## L - Liskov Substitution Principle
## I - Interface Segregation Principle
## D - Dependency Inversion


SOLID principles provide blueprint to write code that is easy to understand, maintain
and extend overtime.

**1. Single Responsibility Principle (SRP)**

A class should have ***one and only one reason*** to change meaning it should have 
only one job/responsibility.

if a class has multiple responsibilities it becomes harder to understand, maintain
modify and increase the chances of bugs because change to one responsibility 
could affect others. 

For Example:

```java
class User {
    private String name;
    private String email;
    // constructors, setters, and getters
}

class UserRepository {
    public void saveUser();
}

class EmailService {
    public void sendEmail();
}
```

Here _User_ class has only one responsibility to hold user Data, _UserRepository_ to interact with DB
and _EmailService_ to send emails. Each class has only one responsibility, which makes code easier to understand
and maintain.


**2) Open/Closed Principle (OCP)**

Software Entities(Classes, Functions, Modules etc) should be ***open for extension but closed for modification***.

Design of software entities should be such that you can introduce new fuctionality or behaviour without modifying existing code since modifying existing code might 
introduce new bugs.

```java

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle extends Shape {
    private double height;
    private double width;

     Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    @Override
    double area() {
        return height * width;
    }
}
```

Here _Shape_ is an abstract class with an area method. _Circle_ and _Rectangle_ class extend  _Shape_ class and provide specific implementation for **area** method. 
If we want to add another Shape, say triangle, create a new class _Triangle_ that extends _Shape_ without modifying the existing code.

**3) Liskov Substitution Principle**

Objects of Superclass should be replaceable with objects of subclass without affecting the correctness of program.

LSP violating Example:

```java
public interface Bird {
    public void fly();
    public void walk();
}

class Sparrow implements Bird {
    @Override
    public void fly() {
        //implementation
    }
    @Override
    public void walk() {
        //implmentation
    }
}

class Ostrich implements Bird {
    @Override
    public void walk() {
        //implementation
    }
    
    @Override
    public void fly() {
        //ostrich cant fly, violates LSP.
    }
}
```
The Ostrich class violates the Liskov Substitution Principle because it cannot replace its superclass (Bird) without breaking the functionality.

LSP fix Example:

```java
public interface Bird {
}

public interface WalkingBird extends Bird {
    public void walk();
}

public interface FlyingBird extends Bird {
    public void fly();
}

class Sparrow implements WalkingBird, FlyingBird {
    @Override
    public void fly() {
        //implementation
    }
    @Override
    public void walk() {
        //implementation
    }
}

class Ostrich implements WalkingBird {
    @Override
    public void walk() {
        //implementation
    }
}
```

**4) Interface Segregation Principle**

Clients should not be forced to depend on methods they do not use. Instead of large interface, use smaller multiple interfaces.

Example:

```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {
    @Override
    public void print() {
        //implementation
    }
}

class MultifunctionPrinter implements Printer, Scanner {
    @Override
    public void print() {
        //implementation
    }
    
    @Override
    public void scan() {
        //implementation
    }
}
```
Here Printer and Scanner are two separate interfaces. BasicPrinter only implements Printer, while MultifunctionPrinter implements Printer and Scanner both.
This ensures that basicPrinter is not forced to implement scan method it does not need, adhering to ISP.

**5) Dependency Inversion Principle (DIP)**

High-level modules should not depend on low-level modules. Both should depend on abstractions(Interface or abstract class).

High-Level Modules: Focus on “what” the application should do, representing the core functionality or business logic.

Low-Level Modules: Focus on “how” the application achieves its goals, implementing the necessary details.

In traditional approach without DIP, high level modules directly depends upon low level modules. This creates tight coupling between the two making the system rigid and 
difficult to change.

Example:
```java
class PaypalService {
    public void makePayment() {
        //implementation
    }
}

class PaymentProcessor {
    private PaypalService paypalService = new PaypalService();
    
    void processPayment() {
        paypalService.makePayment();
    }
}
```
Here, PaymentProcessor(high level module) depends directly on PaypalService(low level module), leading to tight coupling.


**DIP Approach -**
```java
interface PaymentService {
    void makePayment();
}

class PaypalService implements PaymentService {
    @Override
    public void makePayment() {
        //Paypal payment logic
    }
}

class PaymentProcessor {
    private PaymentService paymentService;

    PaymentProcessor(paymentService PaymentService) {
        this.paymentService = paymentService;
    }
    
    void processPayment() {
        paymentService.makePayment();
    }
}
```

In the above example,  PaymentProcessor (high-level module) depends on the PaymentService interface,
not on a specific implementation. The PayPalService (low-level module) implements this interface. This setup allows you to easily swap out PayPalService for another payment service without changing the PaymentProcessor class.






 







