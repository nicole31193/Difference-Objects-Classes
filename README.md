# Difference-Objects-Classes

## Objects vs. Classes (in my own words)
A **class** is a blueprint: it defines what data a thing has (fields) and what it can do (methods). A **class** itself doesn’t hold real, changing data; it’s a template that the JVM uses to manufacture actual things in memory. An **object** (instance) is one of those manufactured things. Objects carry real state at runtime—concrete values stored in fields—and they respond to method calls that may read or change that state.

Conceptually, the difference is like the difference between an architectural plan and a house. The plan (class) describes rooms, doors, and materials, but you can’t live in a plan. A house (object) is built from that plan, has paint on the walls, and can be locked or unlocked. Multiple houses can be built from the same plan; likewise, many objects can be created from one class, each with its own state.

In code, the difference shows up in **static** members (belong to the class as a whole) versus **instance** members (belong to each object). A static counter tracks how many objects have ever been created, while an instance field holds values for one particular object. Identity and equality also illustrate the gap: two different objects created from the same class are distinct in memory (`a == b` is false), even if they have similar data.

## Code
- `Car.java` – the **class** (blueprint) with instance fields and a class-level (static) counter.
- `Main.java` – creates multiple **objects**, prints their state, compares identity, and shows the static counter.

## How to run
```bash
javac Main.java Car.java
java Main
