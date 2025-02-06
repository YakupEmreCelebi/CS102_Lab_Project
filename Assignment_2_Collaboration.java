import java.util.Random;

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
