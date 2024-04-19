# Operators and Expressions

### In this section, we looked at different operators in Java.

## Arithmetic operators the most common can be used on most data types except boolean. We also looked at increment operators and relational operators. 
## For Arithmetic operators, there is something called precedence for the operators as some operators take more factors than others. 
## Increment on the other hand is just the increasing of number by 1 whenever the operator is used. 
## Bitwise operators help us work with individual bits of numbers, while bitmasking allows us to manipulate those bits to achieve specific tasks in programming.

# - **String** and **Class** 
## Printing Folder Java has an inbuilt class called system and it comes with the **out** object that is static. 
## The most famous print method is **print** and **println**. The difference between both terms is the **"ln"** which prints and then moves the cursor to the next line. 
## The print methods can be used for different data types. We also practised printing strings and the use of operators with them.

# - **Conditional Statements**
 ## Conditional statements in programming allow for decision-making based on certain conditions. They execute specific blocks of code if the condition is true, otherwise, they can execute alternative blocks or do nothing. 
 ## They are pivotal for creating dynamic and responsive programs, enabling actions to be taken based on varying inputs or states. Common forms include if-else statements and switch-case statements, offering flexibility and control flow in code execution.

# - **Loops** 
## Loops in programming are structures that repeat a block of code multiple times until a certain condition is met. They are essential for automating repetitive tasks and iterating over collections of data. 
## Common types include **for** loops, which iterate a fixed number of times, and **while** loops, which continue until a condition is no longer true and other loopslike **do while** loop, and **for each** loops also known as enhanced **for** loop.  
## Loops enhance the efficiency and scalability of programs, allowing for streamlined execution and reduced redundancy.

# - **Arrays**
## Arrays in programming are data structures that store a collection of elements of the same type under a single name. 
## They provide a way to organize and access data sequentially using indices. Arrays offer efficient storage and retrieval of data, making them fundamental for managing large datasets and performing operations on groups of related values. 
## They support various operations such as insertion, deletion, and searching, facilitating diverse computational tasks.

# - **Methods** 
## Methods are blocks of code that are defined to perform a specific task or operation.Methods help make your code modular, reusable, and easier to maintain. Instead of writing the same code repeatedly whenever you need to perform a specific task, you can define a method once and then call it whenever you need to execute that task. 
## This promotes code organization, readability, and efficiency in software development. To write a code; We start by saying we're making a method by using the word public, which means anyone can use it. Then we use static to say it's part of the whole program, not just one piece of it. 
## After that, we say what kind of information the method will give back (if it's  nothing, so say void). Then we give the method a name (greet), and if it needs any information to do its job, we put that in brackets (String name). Inside the method, we write what we want it to do. 
## In this case, it prints out a greeting message using the name we gave it. To use the method, we just say its name and give it the information it needs (in this case, a name to greet). When we do that, Java runs the code inside the method, printing out the greeting.

# - **Object-oriented programming (OOP)**  
## OOP is a term used to define the concept of objects. How the interact with each other to perform tasks and solve problems. 
## - Objects: Objects are instances of classes, which are essentially blueprints for creating objects. An object contains both data (attributes or properties) and behavior (methods or functions). 
## - Classes: A class is a template or blueprint for creating objects. It defines the properties and behaviors that objects of that type will have. 
##  - Abstraction:Abstraction is like using a remote control without needing to know how it works internally. In programming, it means hiding the complex details of how something works and only showing the essential parts. 
## - Encapsulation: Encapsulation refers to the bundling of data (attributes) and methods (behaviors) that operate on that data within a single unit, i.e., an object. This helps in hiding the internal implementation details of an object and only exposing the necessary interfaces to interact with it. 
## - Inheritance: Inheritance is a mechanism where a new class (subclass or derived class) is created from an existing class (superclass or base class), inheriting its properties and behaviors. This promotes code reuse and allows for the creation of hierarchical relationships between classes. For example, you might have a SavingsAccount class that inherits from the BankAccount class. 
##  - Polymorphism: Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables flexibility and extensibility in code by allowing methods to behave differently based on the object they are called on.