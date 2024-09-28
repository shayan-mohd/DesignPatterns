# Behavioral Design Pattern
Behavioral Design Pattern are concerned with the algorithms and the assignment of responsibilities between objects.
BDP describe not just pattern of object/classes but also the patterns of communication between them.

## Types of Behavioral Design Pattern
1) Chain of Responsibility
2) Strategy Design Pattern
3) Observer Design Pattern *
4) Template Method Design Pattern **
5) Iterator Design Pattern
6) State Design Pattern * 
7) Command Design Pattern 
8) Mediator Design Pattern *
9) Momento Design Pattern
10) Visitor Design Pattern
11) Interpretor Design Pattern

### **Chain of Responsibility**

Chain of Responsibility is a Behavioral Design Pattern which allows an object to pass a request along a chain of handlers(stand-alone objects).
Upon receiving a request, each handler decides whether to process the request or to pass them to the next handler in the chain.
This pattern helps in decoupling the sender of the request from the object that actually handles it.

Use this pattern whenever you encounter the need to execute several handlers in particular order.

COR pattern allows you to remove, reorder, or insert handlers dynamically.

The client may trigger any handler in the chain in any order, not just the first one. The chain runs until some handler rejects to handle or the chain reaches to the end.

Example can be found in the source folder.

### **Strategy Design Pattern**

Strategy Design Pattern is a Behavioral Design Pattern which defines a family of algorithms puts each one of them in a separate class, make their objects
interchangeable, allowing clients to switch algorithms dynamically without altering the code structure.

Components of Strategy Design Pattern

1) **Context** - A context is a class which holds a reference to a strategy objects and delegates the task to it. It acts as an interface between the client and the strategy, providing a unified way to execute the task
without knowing the details of how it's done.
2) **Strategy Interface** - It's an interface/abstract class that defines set of methods that all concrete strategies implement.
3) **Concrete Strategies** - 
4) **Client** - 
5) 

### **State Design Pattern**

State Design Pattern is a Behavioral Design Pattern which lets object change its behaviour when its internal state changes, allowing to extract each logic to a separate class and let the context delegate the behaviour to 
the corresponding state class.

This pattern is particularly useful when an object’s behavior depends on its state, and the state can change during the object’s lifecycle.
<img height="50%" src="https://raw.githubusercontent.com/shayan-mohd/DesignPatterns/main/src/img/UML%20Factory%20Pattern.png" width="60%"/>