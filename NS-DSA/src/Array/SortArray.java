package Array;

import java.util.*;

public class SortArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = scn.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter element number " + (i + 1) + " : ");
            numbers[i] = scn.nextInt();
        }

        System.out.print("Array you have entered: ");
        System.out.print("[");
        for (int i = 0; i < size; i++){
            if (i == size - 1){
                System.out.print(numbers[i]);
            }else{
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("]");

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++){
            if (i == numbers.length - 1){
                System.out.print(numbers[i]);
            }else{
                System.out.print(numbers[i] + ", ");
            }
            
        }
        System.out.print("]");
    }
    
}