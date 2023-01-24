Housekeeping:
One break ~7:20-7:40


- I don't anticipate writing much (if any) code this block
  - we have too much to cover and not enough time to cover it all
    22 or 23 DPs
  - we won't get to all the design patterns in this block
  - could be a semester-long master's course in university

Have you seen UML before?
Unified Modeling Language


- This is a conceptual block
  - if you're feeling ambitious, I refer you to https://java.en.sdacademy.pro/exercises/design_pattern_and_good_practices/exercises/ for practice, and the Practical Project block four modules away from the current module


**Plan for Design Patterns and Good Practices**
- Day 1: Principles
- Day 2: Creational patterns
- Day 3: Behavioral patterns
- Day 4: Structural patterns


**The plan is for you to know:**
- what a design pattern is
- the three categories (CBS)
  - interviewers may/will ask this
- know the SOLID principles
  - some understanding of SOLID
    - know that Liskov has formal tests; don't need to memorize the formal tests at this stage; look them up when needed
- understand the general principles behind Clean Code
- have some exposure to/familiarity with design patterns but then you know where to look to dig deeper
- don't memorize DPs
- these are conceptual topics
- reference the pattern and example code in a reference book or online
- find a voice you understand then practice, reinforce the material from that voice


*4 main sources for the material:*
- SDA material
  - most sparse
  - not the most readable
- Design Patterns course from Univ. of Alberta, Coursera
  - slightly different terms
- refactoring.guru
- Dive Into Design Patterns
*always find more sources/voices for the material*
  - leads to the best understanding, fluency with the concepts

Honorable mention source:
- Derek Banas Design Patterns Tutorial on YT

- Great OOP concepts review videos:
  - https://www.youtube.com/watch?v=vNHpsC5ng_E
  - https://www.youtube.com/watch?v=yRJ1rRoMnIM


Types of Software tests:
- **unit** tests
  - test individual units of code: methods, classes
  - fairly cheap, quick to execute
  - automated
- **integration** tests
  - test the combination of individual units
  - usually automated
- **end-to-end** AKA system testing
  - beginning to end
  - expensive, time-intensive
  - mix of automated, manual

TDD = test-driven development
- write the tests first, then write the code that will make those tests pass
- instead of code first, test second, it's test first, write code second

"code cannot be trusted unless it has been tested"


8 primitive types in Java:
1. char
2. int
3. double
4. short
5. long
6. float
7. byte
8. boolean

reference data types:
- anything that isn't a primitive data type
- examples:
  - String
  - Cat (from Cat class)
  - Scanner

a class creates or defines a new type
- every time it creates an object, it creates objects of that type



method:
- "packaged" behavior that you call
  - e.g., `methodName()`, `methodNameNewer(arg1, arg2, ..., arg_n)`

A class consists of two things:
1. methods (behavior)
2. fields (data, state, attributes, properties, variables)

state:
- set of values of all variables at a point in time


Why smaller/simpler methods and classes would be better than larger/more complex ones:
1. easier to read
2. easier to debug
3. easier to use
4. easier to test
5. easier to extend


class member:
- method or a field in class


superclass:
- parent class
- base class

subclass:
- child class

abstract class:
- class that cannot be instantiated

abstract method:
- a method that doesn't have a method body

instantiate (verb)
- create an instance of a class

instance = object

method body:
- everything between the {}
      public void doMyTaxes() {
        // code goes here
      }


method body = method implementation

implement:
- to write code that does something



`extends` keyword:
- inheritance
  - superclass or an abstract class

`implements` keyword:
- for interfaces

interface:
- basically only contains methods
- `methodName(param1, param2, ..., param_n);`
  - method that is declared but not implemented
  - doesn't have a method body
- the implementing class is where the methods are defined (the method bodies are in the implementing class (child class))


*system design goals:*
- modular
  - Legos
- flexible
  - handle different requirements, different situations
- reusable









**Best practices**
- clean code
  - make your code easy to read for your future self as well as others
  - intuitive variable and method names
  - organized
- principles
  - DRY: don't repeat yourself
    - create methods and classes to make sure that all logic should be written in only one place
      - and of course, backed up with git
    - make the program do the repetitive work
  - YAGNI
    - "You ain't gonna need it"
    - don't write code for some future possible need; only write the code that you need right now
    - https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it
    - lazy creation (will see lazy in Singleton pattern)
      - only create that thing when it's needed, not before that
    - Premature Optimization is the Root of All Evil
      - MVP mindset
        - minimum viable product
        - "you should be embarrassed by your first iteration/product/prototype"
      - get a working prototype first, then optimize later
    - https://workat.tech/machine-coding/tutorial/software-design-principles-dry-yagni-eytrxfhz1fla
  - Manifesto for Software Craftsmanship
  - *SOLID*
    - *Single responsibility*
      - self-explanatory
    - *Open/Closed*
      - classes should open for extension (we can extend them using inheritance or interfaces) but should be closed for modification (once we finish developing a class, we should "freeze"/"lock" it)
      - goal: keep stable parts of a system separate from parts still under development (still changing)
      - once development of a class has finished and it has been tested, make it final
        - any future changes can done through inheritance by subclasses
    - *Liskov Substitution*
      - we want the child class (subclass) to be able to substitute in for the parent class (superclass) and not break the code
        - there are several technical ways to test this, but go look them up later if you need to
      - TERMS:
        - Invariants are conditions in which an object makes sense
        - base type = parent class
        - derived class = child class
    - *Interface Segregation*
      - instead of having one interface with all the methods the concrete classes must implement, have several interfaces and split up the methods across those interfaces, making each interface smaller
        - subclasses can implement and indefinite number of interfaces
      - a class should not be forced to depend on methods it does not use
      - bad: one interface with 20 methods, because a class that implements that interface must provide implementations (code) for all 20 methods, even if it only wants to use three of those 20 methods
      - better: for example, 10 interfaces each with two methods
        - the developer can choose to have a class implement several interfaces at a time, thereby selectively choosing which of the 20 methods it wants to implement and which of the 20 it wants to ignore
    - *Dependency Inversion*
      - suppose a given class wants to use certain dependent objects. This class should receive these dependencies "from the outside" and should not also have the job of creating these dependencies itself
      - initially: high-level classes depend on lower-level classes
        - instead, have a high-level class depend on an interface and make the low-level classes implement (depend on) that interface
