#### Review Questions, Fri. 1/27/2023

Questions:
1. What does the `abstract` keyword mean?
  - cannot create an object from that class
  - cannot instantiate an abstract class
  - https://www.w3schools.com/java/ref_keyword_abstract.asp

2. What keyword do we use for an interface?
  - `implements`

3. What keyword do we use for inheritance?
  - `extends`

4. What does "base class" mean?
  - an interface or abstract class that must be extended or implemented

5. What does "concrete" mean in the context of design patterns?
  - a class that is not abstract; it isn't an interface or an abstract class

6. Explain the S in SOLID in your own words.
  - single job or responsibility for a class

7. Explain the O in SOLID in your own words.
  - when a class is working well, make it final; if we need to add more functionality later, have a child class extend it
  - open for extension but closed for modification (change)

8. Explain the L in SOLID in your own words.
  - If a child class is substituted in for the parent class, the program won't break

9. Explain the I in SOLID in your own words.
  - Don't make interfaces too fat; split methods up and give interfaces fewer responsibilities/less functionality
  - because Java allows implementating an uncapped number of interfaces, a class can implement as many interfaces as it needs
  - don't make classes implement a bunch of methods it doesn't need because they reside in bloated interfaces

10. Explain the D in SOLID in your own words.
  - instead of having high-level classes depend on interfaces, insert an interface between low-level classes and the high-level class so that the low-level are bound to implement that interface, and the high-level class will communicate with the interface instead of with the low-level classes

11. Explain DRY in your own words.
  - eliminate duplicate code through the combination of methods, inheritance and interfaces

12. Explain the YAGNI in your own words.
  - don't write functionality until you actually need it, not before

13. How do you define a method in an interface that isn't default?
  - `methodName(dataType1 param1, ..., dataType_n param_n);`

14. What does the `default` keyword mean?
  - a default method in an interface is one that has an implementation (i.e., a method body and actual code inside)
  - https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html

15. How do we perform the same task in abstract classes that the `default` keyword provides for interfaces?
  - an abstract method means that a child class must provide the implementation
  - not having the abstract keyword means that the abstract class provides the implementation, but the child class can still override the default method if needed

16. What is method overriding?
  - when a class inherits from a parent class, it is forced to use the parent class's methods. Overriding means that even though it has to use those methods from the parent, it provides its own implementation (it changes the parent class's methods and makes them its own)

17. What is a design pattern?
  - established (widely-accepted) solution to a common problem

18. What are the three categories of design patterns?
  - CBS
    - creational
    - behavioral
    - structural
