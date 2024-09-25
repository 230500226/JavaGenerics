
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
        IntegerPrinter printer = IntegerPrinter(23);
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

