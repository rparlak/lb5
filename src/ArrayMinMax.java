import java.util.Random;

public class ArrayMinMax {
    public static void main(String[] args) {
        // Creating a one-dimensional array with 10 elements
        int[] numbers = new int[10];
        Random random = new Random();

        // Filling the array with random numbers from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // Random number from 1 to 100
        }

        // Finding the smallest and largest elements in the array
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Printing the array elements
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Printing the smallest and largest elements
        System.out.println("\nSmallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
