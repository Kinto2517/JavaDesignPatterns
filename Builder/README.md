Builder Design Pattern
=======================

## Intent
- Separate the construction of a complex object from its representation so that the same construction process can 
create different representations.

## Example in Java
- StringBuilder: [StringBuilder.java](StringBuilder.java)

StringBuilder Example:
```java
StringBuilder builder = new StringBuilder();
builder.append("This is an example ");
builder.append("of the builder pattern. ");
builder.append("It has methods to append ");
builder.append("almost anything we want to a String. ");
builder.append(42);
System.out.println(builder.toString());
```
Output:
```
This is an example of the builder pattern. It has methods to append almost anything we want to a String. 42
```

### Difference between Builder and Factory
* Builder pattern is used when there are many steps to create an object. Factory pattern is used when the factory can
easily create the entire object within one method call.
