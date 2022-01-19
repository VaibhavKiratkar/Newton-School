package Array;

import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        int numbers[] = {1, 10, 58,9, 65, 2, 48, 5};
        
        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }else if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
        } 
        System.out.println("Minimum Number: " + minNumber);
        System.out.println("Maximum Number: " + maxNumber);        
    }   
}
