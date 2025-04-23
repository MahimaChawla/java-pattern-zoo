# Factory Pattern

The Factory Pattern uses composition to separate object creation logic into a dedicated factory class, which decides
which concrete implementation to return based on input parameters or context.

## Key Concepts

- Composition: The calling class delegates object creation to the factory instead of instantiating objects directly (
  `new SomeImpl()`).
- Encapsulation of creation logic: The factory hides the details of which subclass is created.
- Polymorphism-friendly: The caller interacts only with the interface or superclass.
- Flexible and extensible: To add a new type, you update only the factory — not the consuming code.

## Why Use a Factory?

Using a factory avoids doing this:

```java
AppConfig config = new DevConfigBean(); // tightly coupled
```

Instead, you can do:

```java
AppConfig config = SpringFactory.getBean(env);
```

This keeps your code loosely coupled and open for extension, closed for modification — following the Open/Closed
Principle from SOLID.