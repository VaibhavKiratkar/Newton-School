package Array;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the length of an Array: ");
        int tests = scn.nextInt();

        int number[];
        number = new int[tests];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            number[i] = scn.nextInt();
        }

        System.out.print("Array you have entered: [");
        for (int i = 0; i < tests; i++) {
            if (i == tests - 1) {
                System.out.print(number[i]);
            } else {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("]");
    }

}
