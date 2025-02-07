import java.util.Random;
import java.util.Scanner;

public class Assignment_2_Collaboration {

     public static int findMinimumOfArray(int [] intArray){
        int minimum = intArray[0];
         for (int j : intArray) {
             if (j <= minimum) {
                 minimum = j;
             }
         }
        return minimum;
    }

    public static int findMaximumOfArray(int [] intArray){
        int maximum = intArray[0];
        for (int j : intArray) {
            if (j >= maximum) {
                maximum = j;
            }
        }
        return maximum;
    }

    //print out the difference between each element and average in an array
    public static void printDifferenceOfAvg (int[] arr) {
         int length = arr.length;
         int sum = 0, avg;

         for (int element : arr) {
             sum += element;
         }

         avg = sum / length;

        System.out.print("{");
        for (int i = 0; i < length; i++) {
            int diff = arr[i] - avg;
            if (i != length - 1) {
                System.out.print(diff + ", ");
            } else {
                System.out.println(diff + "}");
            }
        }
    }
    public static int findTheSumOfEvenNumbers (int [] anArray){
        int sumOfEvenNumbers = 0;
        for(int i = 0 ; i < anArray.length ; i = i+2){
            sumOfEvenNumbers += anArray[i];
        }
        return sumOfEvenNumbers;
    }
    
    public static int findTheSumOfOddNumbers (int [] anArray){
        int sumOfOddNumbers = 0;
        for(int i = 1 ; i < anArray.length ; i = i+2){
            sumOfOddNumbers += anArray[i];
        }
        return sumOfOddNumbers;
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
            System.out.println("\n    Choose the operation number! \n \n1. Find the minimum and maximum values in array. \n2. Display how each element of the array differs from the average. \n3. Find the sum of elements with odd- and even- numberede indexes. \n0. Exit.");
            System.out.print("Enter a number: ");

            int operationNumber = scanner.nextInt();

            if (operationNumber == 1) {
                System.out.println("\nMaximum value in the array is " + findMaximumOfArray(numbers));
                System.out.println("Minimum value in the array is " + findMinimumOfArray(numbers));
            } else if (operationNumber == 2) {
                printDifferenceOfAvg(numbers);
            } else if (operationNumber == 3) {
                System.out.println("Sum of odd numbers: "+ findTheSumOfOddNumbers(numbers));
                System.out.println("Sum of even numbers: "+ findTheSumOfEvenNumbers(numbers));
            } else if (operationNumber == 0) {
                scanner.close();
                break;
            }
        } while (true);
    }
}
