package Array;

import java.util.*;

public class IsElementRepeated {

    public static void main(String[] args) {

        int numbers[] = {1, 10, 58,9, 65, 2, 48, 5, 2};
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number you need to check: ");
        int digit = scn.nextInt();

        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == digit){
                count += 1;
            }
        }

        if(count >= 2){
            System.out.println(digit + " is repeated " + count + " times.");
        }else if (count == 0){
            System.out.println(digit + " is not there in the array.");
        }else{
            System.out.println(digit + " is not repeated.");
        }

    }
    
}
