Design pattern:
- typical solution to common/frequent problem

**3 categories of design patterns:**
1. creational
  - how we create objects in a flexible and reusable way
2. structural
  - build larger structures from our classes and objects in an efficient and flexible way
3. behavioral
  - how objects communicate with one anthoer
  - individual object responsibilities within a larger system


example of creating a new cat object:
`Cat garfield = new Cat(arg1, arg2, ..., arg_n);`

what data type is `garfield`?
A: Cat


Composition:
- objects can be comprised/composed of other objects


problem: nheritance can lead to combinatorial explosion
- in car and truck example:
  - car, truck
  - manual, autopilot
  - gas, electric

2*2*2 = 8 possibilities


instead of three variables each with two values, we have 20 variables each with 6 values
6**20



constructor:
- creates new objects from the class
  - example of creating a new object `Cat garfield = new Cat("Garfield", 18.2, "lasagna");`

`new` keyword:
- calls the constructor method in the class to create a new object from that class


when concrete classes implement an interface, they must provide implementations (the code) for all methods in the interface
  - in the interface: `methodName(arg1, arg2, ..., arg_n);`
  - in the child class that implements the interface:
        methodName(ar1, arg2, ..., arg_n) {
          // some implementation code
          int numberOfEmployees;
          double totalSalary = numberOfEmployees * arg1;
          // ...
        }




Factory Method pattern:

goal: add new products easily without disrupting existing ones (without breaking existing code)

1. product interface
2. concrete product classes
3. abstract creator class
4. concrete creator classes
  - produce objects of concrete product type (#2)
5. client class
  - will only interact with the concrete creator classes

advantage: easy to extend
  - suppose we wanted to create eight more concrete types
    - create eight concrete product classes
    - create eight concrete creator classes
    - won't affect our existing code
    - plug and play the new products without rewriting our existing classes (interface, abstract creator, concrete creator, concrete products)



Singleton pattern:

goal: create exactly one object of a specific type and make that object globally accessible

key parts:
- private constructor
- static getInstance method that will call the private constructor only if an object does not yet exist
- lazy object creation:
  - that object creation method is only called when it's necessary, not before
  - in other words, singleton object is initialized only when it’s requested for the first time

examples where a singleton is needed:
- one shared database that globally accessible and globally shared
- a printer driver
- preferences menu


static:
- do not need to create an object

static method:
- don't need to create an object to call the method
- call the method `ClassName.methodName(args...)`
  - `Math.pow(base, exponent)`
