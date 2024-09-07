# Creational Design Pattern

Creational Design Pattern abstract the object instantiation process. They help make a system independent of how its object are created, composed and represented.

## Types of Creational Design Pattern
1) Singleton Design Pattern
2) Factory Design Pattern 
3) Abstract Factory Design Pattern
4) Builder Design Pattern
5) Prototype Design Pattern

## Prototype Design Pattern
Prototype Design pattern is a creational design pattern which lets us copy existing objects without making your code dependent on classes. This pattern is particularly used
when creating objects from scratch is time-consuming or the configuration of object is complex.

Let's create an object traditionally and see. First we will create a new object of the class, and go through all the fields of 
original object and copy their values. There might be possibility that few fields of the class are private hence cant be accessed outside the class.
Also since you have to know the object class to create a new object, your code becomes class dependent. Also in some cases we only know the interface the object follows not their concrete class.

For PDP, to copy a object it is mandatory for the object class to have copy feature. This can be done by implementing/defining clone method.

***In Java, this is typically done by implementing the Cloneable interface and overriding the clone() method.***

**Why do we need to override clone method ?**

Because by default, clone() creates shallow copy of the objects. This means the objects itself is duplicated, but any objects(lists, arrays etc.) referenced by it are not.
if Deep copy is needed where all referenced objects are also cloned, we have to manually implement this behaviour in clone() method.

Example can be found in the Prototype source code.

## Builder Design Pattern

Builder Design Pattern is a Creational Design Pattern that helps in constructing complex objects step by step.
The pattern allows you to produce different types and representation of an object using the same construction code.

This pattern is useful when an object has many fields, some of them are optional, making it cumbersome to create instances using the constructor with many parameters.

How we can implement builder design pattern in java

1) First of all we need to create a nested static class and then copy all the arguments from the outer class to the builder class.
2) Builder class should have public setters for all the parameters for chaining and should return this object. 
3) The Final Step is to provide build() method in builder class, that will return the main object.
```java
public class Car {

    private int id;
    private String color;
    private String model;
    private boolean isSunroof;

    private Car(int id, String color, String model, boolean isSunroof) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.isSunroof = isSunroof;
    }

    public static class CarBuilder {
        private int id;
        private String color;
        private String model = null;
        private boolean isSunroof;

        CarBuilder() {}

        public CarBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            isSunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(id, color, model, isSunroof);
        }
    }
}
```

**Builder Class Usage**
```java
 public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car.CarBuilder builder = new Car.CarBuilder();
        Car car1 = builder.setId(123)
                .setColor("yellow")
                .setModel("Xi41")
                .setSunroof(true)
                .build();

        System.out.println(car1.toString());

        Car car2 = new Car.CarBuilder()
                .setId(234)
                .setColor("Red")
                .build();
        System.out.println(car2.toString());

    }
}
```

1.	**Chaining Method Calls:** By returning this in setter methods (setColor(), setSunroof()), we enable method chaining, making the code more readable.
2.	**Encapsulation:** The Car class has a private constructor, forcing the client to use the CarBuilder to create instances.
3.	**Flexible Object Creation:** The CarBuilder can handle both required and optional parameters, allowing flexibility in the object creation process.


## Factory Design Pattern
The Factory Pattern is a design pattern that simplifies object creation (abstract the object creation logic). Instead of creating objects directly in your code, the pattern lets you use a factory (a special class or method) to handle the creation.
Rather than instantiating objects directly in your code, the responsibility for object creation is delegated to a specialized “factory” class.
This way, you don’t need to know the specific details of how the object is made—just ask the factory for the object, and it will give you the right one.

Example can be found in source package.

**Primary Components**
1. Product: This is an interface or abstract class **(BURGER)** that defines the type of objects to be created.
2. Concrete Product: These are the classes that implement the Product interface or extend the Product abstract class. They represent the actual objects **(VegBurger/NonVegBurger)** created by the factory.
3. Factory: This is an interface or abstract class **(RestaurantFactory)** responsible for declaring the factory method, which creates objects of the Product type.
4. Concrete Factory: These are the classes that implement the Factory interface or extend the Factory abstract class.**(VegBurgerRestraunt/NonVegBurgerRestraunt)** They override the factory method to produce specific instances of Product.

![](src/img/UML Factory Pattern.png)


