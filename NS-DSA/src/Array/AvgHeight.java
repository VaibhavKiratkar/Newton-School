package Array;

import java.util.Scanner;

public class AvgHeight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of trees: ");
        int noOfTrees = scn.nextInt();

        int trees[] = new int[noOfTrees];

        for (int i = 0; i < noOfTrees; i++){
            System.out.print("Enter the height of tree number " + (i + 1) + ": ");
            trees[i] = scn.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < noOfTrees; i++){
            sum += trees[i];
        }
        System.out.println(sum / noOfTrees);
    }
}
