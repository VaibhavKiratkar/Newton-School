package Array;

import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int testCases = scn.nextInt();

        for(int i = 0; i < testCases; i++){

            System.out.print("Enter the size of an array: ");
            int arraySize = scn.nextInt();
            
            int array[] = new int[arraySize];

            for (int j = 0; j < arraySize; j++){
                array[j] = scn.nextInt();
            }

        }
    }
}
