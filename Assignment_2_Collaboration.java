import java.util.Random;
import java.util.Scanner;

public class Assignment_2_Collaboration {
     public static int findMinimumOfArray(int [] intArray){
        int minimum = intArray[0];
        for(int i=0; i< intArray.length; i++)
        {
            if(intArray[i] <= minimum)
            {
                minimum = intArray[i];
            }
        }
        return minimum;
    }

    public static int findMaximumOfArray(int [] intArray){
        int maximum = intArray[0];
        for(int i=0; i< intArray.length; i++)
        {
            if(intArray[i] >= maximum)
            {
                maximum = intArray[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array_size = 100;
        int[] numbers = new int[array_size];

        //Randomizer
        Random r = new Random();
        int low = 0;
        int high = 100;

        //create random numbers array
        for (int i=0 ; i<array_size ;i++) {
            int result = r.nextInt(high - low) + low;
            numbers[i] = result;
        }

        do {
            System.out.println();
            System.out.println(
                    "    Choose the operation number! \n \n1. Find the minimum and maximum values in array. \n2. Display how each element of the array differs from the average. \n3. Find the sum of elements with odd- and even- numberede indexes. \n0. Exit.");
            System.out.print("Enter a number: ");
            int operationNumber = scanner.nextInt();
            System.out.println();
            if (operationNumber == 1) {
                System.out.println("Maximum value in the array is " + findMaximumOfArray(numbers));
                System.out.println("Minimum value in the array is " + findMinimumOfArray(numbers));
            } else if (operationNumber == 2) {
                printDifferenceOfAvg(numbers);
            } else if (operationNumber == 3) {
                // System.out.println("Sum of odd numbers: "+ findTheSumOfOddNumbers(numbers));
                // System.out.println("Sum of even numbers: "+ findTheSumOfEvenNumbers(numbers));
            } else if (operationNumber == 0) {
                scanner.close();
                break;
            }
        } while (true);
    }
}
