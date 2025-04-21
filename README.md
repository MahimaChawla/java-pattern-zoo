# 🦒 Java Pattern Zoo

A collection of essential design patterns implemented in Java (JDK 22).  
This project is meant to help engineers learn, revisit, or explain design patterns through minimal and focused examples.

---

## Technologies

- Java 22
- Maven (build tool)
- No frameworks (pure Java to focus on the patterns)

---

## Project Structure

Each design pattern lives in its own package under `com.devtools.patternzoo.<pattern>` and includes:

- Interface(s)
- Concrete implementation(s)
- An optional decorator/factory/context where applicable
- A `*Demo.java` class with a `main()` method to run the example

Example:
src/main/java/com/devtools/patternzoo/strategy/StrategyDemo.java

---

## Getting Started

### 1. Install Java 22
Make sure `java -version` shows version 22.

### 2. Install Maven
If you’re on macOS, check if you have mvn installed by running:
```bash
mvn -v
```
If this succesully shows a version, skip the  rest of this step.

```bash
brew install maven
```

### 3. Clone this repo 

```
git clone https://github.com/MahimaChawla/java-pattern-zoo.git
cd java-pattern-zoo
```
### 4. Compile this project
```bash
mvn compile
```

### 5. Run a demo class
```bash
mvn exec:java -Dexec.mainClass="com.devtools.patternzoo.strategy.StrategyService"
```

### Patterns Implemented So Far

- Factory	->	FactoryDemo
- Decorator -> DecoratorDemo
- Builder	-> BuilderDemo
- Decorator	-> DecoratorDemo

Each demo is runnable directly from the command line via mvn exec:java.

### Why This Project?

As a backend engineer, understanding these patterns helps with:

- Writing cleaner, more maintainable code
- Reviewing pull requests more effectively
- Designing systems with flexibility and testability in mind

### To Do

- Add Observer, Singleton, and Adapter next
- Include Spring-based versions in a future spring-pattern-zoo project
- Optionally visualize relationships between classes using UML

### Author

Written by Mahima Chawla
Feel free to fork, clone, or contribute! 