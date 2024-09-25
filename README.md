
# Generics in Java 
### Source: https://www.youtube.com/watch?v=K1iu1kXkVoA
### Coding with John

### Generic classes
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

#### Bounded generic - extends keyword (data type filtering)
```java
public class Printer <T extends Animal>
// The type can now only accept animals and not anything else
// Also any method defined in the Animal class is available for use in the Printer class
// For example if the Animal class holds a method called eat then you can call it using variableName.eat()

// Use '&' for multiple bounds
public class Printer <T extends Animal & Serializable>
// ALways have one class first and the interfaces after
```
- Also works with interfaces such as serializable

### Generic methods
#### Example with one generic parameter
```java
private static <T> void shout (T thingToShout){
    System.out.println(ThingToShout + "!!!!");
}
```
```java
public static void main (String[] args){
    // Call the method with any type of data, it automatically detects the data type now
    shout("John");
    shout(54.3);
    shout(new Block());
}
#### Example with two generic parameters
```java 
private static <T, V> void shout (T thingToShout, V thingToQuestion){ // void can be replaced with a generic type T to return that data type
    System.out.println(ThingToShout + "!!!!");
    System.out.println( thingToQuestion + "????");

}
```

### Wildcards <?>

```java
public static void main(String[] args){
    List<Integer> intList = new ArrayList<>()
    intList.add(3);
    printList(intList);

    List<Triangle> trianlgeList = new ArrayList<>();
    triangleList.add(new Triangle());
    printList(triangleList);
}
private static void printList(List<?> mylist) { // the <?> indicates the data type can be anything (eg. Integer, Object...)
                                                // can also be bounded with extends (eg.<? extends Animal>)    
    System.out.print();
}

