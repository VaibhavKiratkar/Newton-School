package Array;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int arrayOne[] = { 4, 3, 2, 9 };
        int arrayTwo[] = { 6, 2, 3 };

        int maxLength = Math.max(arrayOne.length, arrayTwo.length);

        int arrayResult[] = new int[maxLength + 1];

        int i = arrayOne.length - 1;
        int j = arrayTwo.length - 1;
        int k = arrayResult.length - 1;
        int carry = 0;

        while (k >= 0) {

            int sum = 0;

            if (i >= 0) {
                sum += arrayOne[i];
                i--;
            }
            if (j >= 0) {
                sum += arrayTwo[j];
                j--;
            }

            if (carry > 0) {
                sum += carry;
                carry = 0;
            }

            if (sum >= 10) {
                carry = sum / 10;
                sum = sum % 10;
            }

            arrayResult[k] = sum;
            k--;
        }

        for (int v = 0; v < arrayResult.length; v++) {
            System.out.print(arrayResult[v] + " ");
        }
    }

}