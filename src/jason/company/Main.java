package jason.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 4, 5 };
        reverse(myArr);
    }

    private static void reverse(int[] array) {
        // start with empty array
        int[] reversedArray = new int[array.length];
        // get index for each iteration since we are looping backwards in our array
        // this number will be the index at which to place our values in our reversedArray
        int index = 0;
        
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[i] = array[index];
            // add 1 to the index
            index++;
        }

        System.out.println("The original array was " + Arrays.toString(array));
        System.out.println("The reversed array is " + Arrays.toString(reversedArray));
    }
}
