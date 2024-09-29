# Structural Design Pattern
Structural Design Patterns are design patterns that deal with how objects and classes are composed to form larger structures.
Structural patterns focus on class and object composition, ensuring that if one part of a system changes, the rest of the system isn’t drastically affected.

## Types of Structural Design Pattern
1) Adapter Pattern
2) Bridge Pattern
3) Composite Pattern
4) Bridge Pattern
5) Decorator Pattern
6) Facade Pattern
7) Flyweight Pattern
8) Proxy Pattern

### **Adapter Pattern**

The Adapter Design Pattern allows objects with incompatible interfaces to collaborate. 
It acts as a bridge between two incompatible interfaces by converting the interface of one class into another interface that clients expect.
This pattern is particularly useful when integrating new features or components into existing systems without modifying their source code.

The Adapter Design Pattern addresses several common issues in software development:

1) How can classes with incompatible interfaces work together?
2) How can an alternative interface be provided for a class?
3) How can a class be reused if it does not have an interface that a client requires?

The Adapter Design Pattern solves this problem by defining a separate adapter class that converts the incompatible interface of a class (called the “adaptee”) 
into another interface (called the “target”) that clients require.

a) Target: This represents the interface or class that the client code expects to work with. It defines the operations that the client can use.

b) Adaptee: This refers to the existing class or interface that needs to be adapted. It has a different interface that is incompatible with the client’s expectations.

c) Adapter: This is the class that bridges the gap between the Target and Adaptee. It implements the Target interface and internally uses an instance of the Adaptee to perform the desired operations.

### **Decorator Pattern**

Decorator pattern allows us to add a new functionality to existing objects without changing its structure at all.
Simply, it allows to do runtime modifications to the objects.


### **Facade Pattern**
Imagine a building, the facade is the outer wall that people see, but behind it is a complex network of wires, pipes, and other systems that make the building function.
The facade pattern is like that outer wall. It hides the complexity of the underlying system and provides a simple interface that clients can use to interact with the system.

Facade Method Design Pattern provides a unified interface to a set of interfaces in a subsystem.
Facade defines a high-level interface that makes the subsystem easier to use. 

The Facade pattern is beneficial in scenarios where:

1) There is a need to layer your subsystems.
2) An entry point is needed for each subsystem.
3) A system is very complex or difficult to understand.

### **Composite Pattern**
The Composite Design Pattern is a structural design pattern that lets you compose objects into tree-like structures to represent part-whole hierarchies.
It allows clients to treat individual objects and compositions of objects uniformly.
In other words, whether dealing with a single object or a group of objects (composite), clients can use them interchangeably.

The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them. 


