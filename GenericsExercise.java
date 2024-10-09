import java.util.*;
import java.util.stream.Collectors;

public class GenericArrayOperations<T extends Number & Comparable<T>> {

    private List<T> array;

    public GenericArrayOperations(List<T> array) {
        this.array = array;
    }

    public void displayArray() {
        System.out.println("Array: " + array);
    }

    public void sortArray() {
        Collections.sort(array);
        System.out.println("Sorted Array: " + array);
    }

    public void removeDuplicates() {
        List<T> uniqueArray = array.stream().distinct().collect(Collectors.toList());
        System.out.println("Array without duplicates: " + uniqueArray);
    }

    public void calculateSumAndAverage() {
        double sum = array.stream().mapToDouble(Number::doubleValue).sum();
        double average = sum / array.size();
        System.out.println("Sum: " + sum + ", Average: " + average);
    }

    public void countOccurrences() {
        Map<T, Long> occurrences = array.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Occurrences: " + occurrences);
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomIntegers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomIntegers.add(10 + random.nextInt(21));
        }

        GenericArrayOperations<Integer> operations = new GenericArrayOperations<>(randomIntegers);

        // Step 2: Display the generated array
        operations.displayArray();

        // Step 3: Sort the array and display it
        operations.sortArray();

        // Step 4: Remove duplicates and display the result
        operations.removeDuplicates();

        // Step 5: Determine the sum and average of the array elements and print
        operations.calculateSumAndAverage();

        // Step 6: Count the occurrences of each element in the original array and display
        operations.countOccurrences();
    }
}