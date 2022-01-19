package Array;

import java.util.*;

public class AlternateSum {

    public static void main(String[] args) {
        int numbers[] = {1, 10, 58,9, 65, 2, 48, 5};

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                evenSum += numbers[i];
            }else{
                oddSum += numbers[i];
            }
        }

        System.out.println("Addition of even indexes: " + evenSum);
        System.out.println("Addition of odd indexes: " + oddSum);
    }
    
}
