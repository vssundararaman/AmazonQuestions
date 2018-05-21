Reflection in Java
Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.

The required classes for reflection are provided under java.lang.reflect package.
Reflection gives us information about the class to which an object belongs and also the methods of that class which can be executed by using the object.
Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.
reflection
Reflection can be used to get information about –

Class The getClass() method is used to get the name of the class to which an object belongs.
Constructors The getConstructors() method is used to get the public constructors of the class to which an object belongs.
Methods The getMethods() method is used to get the public methods of the class to which an objects belongs.

Output :

The name of class is Test
The name of constructor is Test
The public methods of class are : 
method2
method1
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll
The number is 19
The string is JAVA
Private method invoked
Important observations :

We can invoke an method through reflection if we know its name and parameter types. We use below two methods for this purpose
getDeclaredMethod() : To create an object of method to be invoked. The syntax for this method is
Class.getDeclaredMethod(name, parametertype)
name- the name of method whose object is to be created
parametertype - parameter is an array of Class objects
invoke() : To invoke a method of the class at runtime we use following method–



Method.invoke(Object, parameter)
If the method of the class doesn’t accepts any 
parameter then null is passed as argument.
Through reflection we can access the private variables and methods of a class with the help of its class object and invoke the method by using the object as discussed above. We use below two methods for this purpose.
Class.getDeclaredField(FieldName) : Used to get the private field. Returns an object of type Field for specified field name.
Field.setAccessible(true) : Allows to access the field irrespective of the access modifier used with the field.

 

Advantages of Using Reflection:

Extensibility Features: An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names.
Debugging and testing tools: Debuggers use the property of reflection to examine private members on classes.
 

Drawbacks:

Performance Overhead: Reflective operations have slower performance than their non-reflective counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
Exposure of Internals: Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.