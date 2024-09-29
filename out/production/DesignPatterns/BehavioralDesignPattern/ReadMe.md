# Behavioral Design Pattern
Behavioral Design Pattern are concerned with the algorithms and the assignment of responsibilities between objects.
BDP describe not just pattern of object/classes but also the patterns of communication between them.

## Types of Behavioral Design Pattern
1) Chain of Responsibility
2) Strategy Design Pattern
3) Observer Design Pattern 
4) Template Method Design Pattern
5) Iterator Design Pattern
6) State Design Pattern 
7) Command Design Pattern 
8) Mediator Design Pattern 
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
3) **Concrete Strategies** - Concrete Strategies are the various implementations of the Strategy Interface. Each concrete strategy provides a specific algorithm or behavior for performing the task defined by the Strategy Interface.
4) **Client** 

### **State Design Pattern**

State Design Pattern is a Behavioral Design Pattern which lets object change its behaviour when its internal state changes, allowing to extract each logic to a separate class and let the context delegate the behaviour to 
the corresponding state class.

This pattern is particularly useful when an object’s behavior depends on its state, and the state can change during the object’s lifecycle.

<img height="50%" src="https://raw.githubusercontent.com/shayan-mohd/DesignPatterns/refs/heads/main/src/img/state%20design%20component%20diagram.webp" width="60%"/>


### **Template Method Design Pattern**

The Template Method pattern is a behavioral design pattern that defines the skeleton of an algorithm or operations in a superclass (often abstract) and leaves the details to be implemented by the child classes.
It allows subclasses to customize specific parts of the algorithm without altering its overall structure.
TMP reduces code duplication.

The overall structure and sequence of the algorithm are preserved by the parent class.

TemplateMethod(): This is the method within the abstract class that defines the overall algorithm structure by calling various steps in a specific order. 
It’s often declared as final to prevent subclasses from changing the algorithm’s structure.

Abstract (or Hook) Methods: These are methods declared within the abstract class but not implemented.
Subclasses must provide concrete implementations for these methods to complete the algorithm.

<img height="50%" src="https://raw.githubusercontent.com/shayan-mohd/DesignPatterns/refs/heads/main/out/production/DesignPatterns/img/TemplateDesignComponent.png" width="60%"/>

### **Mediator Design Pattern**

The Mediator design pattern is a behavioral pattern that defines an object, the mediator, to centralize communication between various components or objects in a system.
This promotes loose coupling by preventing direct interactions between components, instead of having them communicate through the mediator, facilitating better maintainability and flexibility in the system architecture.


Component of Mediator

1) Mediator: The Mediator interface defines the communication contract, specifying methods that concrete mediators should implement to facilitate interactions among colleagues.
2) Colleague: Colleague classes are the components or objects that interact with each other. They communicate through the Mediator, and each colleague class is only aware of the mediator, not the other colleagues. 

<img height="50%" src="https://raw.githubusercontent.com/shayan-mohd/DesignPatterns/refs/heads/main/out/production/DesignPatterns/img/Mediator%20Design%20PAttern%20component.png" width="60%"/>


### **Command Design Pattern**

The Command Design Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all the information about the request. 
This allows you to parameterize objects with operations, delay execution of operations, queue operations, and support undoable operations.
It’s useful for decoupling the object that invokes the operation from the one that actually performs it.

Components of Command

1) Command Interface:  The Command interface declares a method, often named execute(). This method is meant to encapsulate a specific operation. 
2) Concrete Command Classes: These are the specific commands, like turning on a TV or adjusting the stereo volume.Each concrete command class provides a specific implementation of the execute() method,
    defining how a particular device operation (turning on, turning off, adjusting volume, changing channel) is executed.
3)  Invoker (Remote Control): The Invoker, often a remote control, is the one responsible for initiating command execution. It holds a reference to a command but doesn’t delve into the specifics of how each command works. It’s like a button that, when pressed, makes things happen. 
4) Receiver: The Receiver is the device that knows how to perform the actual operation associated with a command. It could be a TV, stereo, or any other device. 


### **Observer Design Pattern**
Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change.
The Observer Design Pattern is like a “subscribe and notify” system. Imagine you’re subscribing to news updates from different websites. 
Whenever there’s new news, each website sends you an update because you’re on their subscriber list.

In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.

The key idea is that the subject doesn’t need to know who all the observers are, and observers automatically get updates when something changes. This pattern decouples the subject from its observers, allowing for easy scalability and flexibility.