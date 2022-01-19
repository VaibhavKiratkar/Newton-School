public class App {
    public static void main(String[] args) {
        int numbers[] = {11, 10, 58, 9, 65, 2, 48, 5, 2};

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}