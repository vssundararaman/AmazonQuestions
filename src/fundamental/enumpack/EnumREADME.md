**ENUM - Java**

In Java, Enum is a powerful data type. There are a lot of places you can use Enum to take advantage of it, like in a Static Factory method. There, it's a wise decision to pass the Enum type rather than passing a String. 
Below, I mention some situations where using Enum is advantageous.

**Enum Advantages**
    
    1.In a Static Factory method, passing Enum as an argument makes the method typesafe. Method users can’t pass an arbitrary value to this method.
    2.Instead of using bit fields, using Enum and EnumSet makes the code cleaner and easy to maintain.
    3.Using Enum can achieve a Singleton pattern, which is inherently Thread Safe.
    4.You can also use them to get rid of If/Switch statements.

Although Enum has several advantages, it has one major disadvantage. We cannot extend Enum.
Yes we can emulate the extensibility in Enum, but we have to do it in a strategic way.

We know that Enum can’t be extended, 
but we know the fact that an Interface can be implemented and Enum can implement the Interface. 
So, combining these two statements, we can achieve extensibility. 
Where Enum can’t be extended, 
if we use the “Coding to an Interface” Strategy, we can easily replace BaseType Enum with our Extended Enum. 

**Steps For Achieving Extensibility**

Let’s take a use case where we have an Enum called Direction in an API. 
It has entries for NORTH, SOUTH, EAST, and WEST. In most cases, API users use these basic directions, but when it is about to show the shortest path between the source and the destination, API users need some advanced direction, like NORTH-EAST, NORTH-WEST, etc.

How can we judiciously implement the API so users can have the option to extend the Basic Direction Enum?

**Steps**

    1. Create an Interface called Direction and declare a method called showDirection().
    2. Create a BasicDirection Enum by implementing Direction.
    3. Put entries for NORTH, SOUTH, EAST, and WEST.
    4. Please note that as it implements the Direction interface, each Enum has to override the showDirection method.
    5. Create an AdvanceDirection Enum with NORTH-EAST, NORTH-WEST, etc. entries
    6. Use this Custom Enum/Basic Enum anywhere interchangeably.
