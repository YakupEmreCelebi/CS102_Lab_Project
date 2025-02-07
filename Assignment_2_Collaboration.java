import java.util.Random;

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

    public static void main(String[] args) {
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
    }
}
