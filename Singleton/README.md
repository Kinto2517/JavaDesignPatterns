Singleton Pattern in Java

This simple example is using Scrabble letters as an example of a Singleton Pattern. The Singleton Pattern is used to 
ensure that only one instance of a class is created. This is useful when exactly one object is needed to coordinate 
actions across the system. The pattern involves a single class which is responsible to create an object while making 
sure that only single object gets created. 

The Singleton Pattern is one of the simplest design patterns. Sometimes we need to have only one instance of our class 
for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may
be costly. Similarly, there can be a single configuration manager or error manager in an application or a thread pool or
a cache or a window manager or a print spooler or a file system or a registry or an object factory or a web browser or 
a shell and so on.