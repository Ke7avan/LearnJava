import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};

        // Length
        System.out.println("Length: " + numbers.length);

        // Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Searching
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // Copying
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Filling
        Arrays.fill(copiedArray, 7);
        System.out.println("Filled Array: " + Arrays.toString(copiedArray));

        // Equality Check
        boolean isEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are arrays equal? " + isEqual);
    }
}
