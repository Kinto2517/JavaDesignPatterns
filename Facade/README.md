It is a design pattern designed to make it easier to use by abstracting the classes that make up the parts of a 
subsystem from the client. Architecturally, it is a structure that organizes a complex and detailed system and 
presents it as a whole to clients. As you can understand, if we assume this system, which we describe as complex 
and detailed, as a subsystem, we use the Facade Design Pattern if we want to provide a simpler interface to the 
clients who will use this system, and if we want to include subsystems in this interface in an organized way and 
to function in accordance with the algorithm of the work under this interface for these subsystems to work properly.

What you need to know here is that the classes in the subsystem are independent of each other. They can also work 
independently of the Facade class.

Facade has to contain our classes and it needs to use their functionalities while operating.

The following Bank, Credit and Central Bank classes together are a system that looks at the customer information 
from different angles and as a result decides whether the customer can use credit or not.

The following scenario is a simple scenario written to see the facade design pattern, in real scenarios the system 
classes used by the facade mostly come from libraries.