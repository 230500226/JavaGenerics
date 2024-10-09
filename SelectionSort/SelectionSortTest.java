import java.util.Arrays;

public class SelectionSortTest {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {64, 25, 12, 22, 11};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        SelectionSort.selectionSort(intArray);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

        // Float array
        Float[] floatArray = {64.1f, 25.3f, 12.5f, 22.4f, 11.2f};
        System.out.println("\nOriginal Float array: " + Arrays.toString(floatArray));
        SelectionSort.selectionSort(floatArray);
        System.out.println("Sorted Float array: " + Arrays.toString(floatArray));
    }
}