The purpose of the decorator design pattern is to dynamically add properties to objects, and the object itself 
should be in a separate location, unaware of the added properties. In other words, if we want to give certain 
properties to objects in certain parts of the code and we want to do this in a way that is decoupled from the 
object's own class, we should use the decorator design pattern.

The most important features of the decorator design pattern

The actual object is not aware that it is being decorated.  In other words, the properties added with the decorator
are not actually properties that it contains in its own class.

The base object's class is no longer a big class containing all the necessary and unnecessary options.

All decorator classes are independent of each other.

Decorator classes can be combined and matched among themselves.


Main players of the decorator pattern

Component class : The class of the object to which properties and behaviors will be dynamically added.

Decorator class : The class to which the property and behavior are dynamically added.

IComponent : The interface from which Component and Decorator class derive.