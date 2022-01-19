import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
    }

    public static void isArmstrong(int input) {

        int temp = input;
        int sum = 0;
        int digit = 0;

        while (temp != 0) {
            digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == input) {
            System.out.println(input + " is a Armstrong number as the sum is " + sum);
        } else {
            System.out.println(input + " is not a Armstrong number as the sum is " + sum);
        }
    }
}