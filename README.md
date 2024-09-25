
# Generics in Java 
### Source: https://www.youtube.com/watch?v=K1iu1kXkVoA
### Coding with John

#### Integer printer (without generics)
``` java
public class IntegerPrinter{ // Class named integer printer
    Integer thingToPrint; // Var of type Integer to hold the integer value to print

    public IntegerPrinter(Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
```
``` java
public class GenericsExample{
    public static void main(Stringp[ args]) {
        IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();
    }
}
```

But what if we want to use a double instead of an integer
- could just copy the IntegerPrinter class file and change the type to double 
- but the problem is to create a new class each time.

Generics are flexable for many types to solve this

#### Integer printer (with generics)
``` java
public class Printer <T>{ // The T stands for Type. Ex. Integer, Double, String...

    T thingToPrint; // All Integer keywords to specify the data type is replaced with T, Now the data type is variable
    
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }

}
```
``` java
public class GenericsExample{
    public static void main(Stringp[ args]) {
        Printer<Integer> printer = new Printer<>(23); //<Integer> is specifying the data type to be used in the Printer class
                                                        // the <> is just an extra step for the same reason
        printer.print();
    }
}
```

#### Primitaves don't work, only the wrapper classes
- instead of int use Integer

#### extends keyword (data type filtering)
```java
public class Printer <T extends Animal>
// The type can now only accept animals and not anything else
// Also any method defined in the Animal class is available for use in the Printer class
// For example if the Animal class holds a method called eat then you can call it using variableName.eat()