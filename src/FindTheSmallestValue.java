import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        int n;
        int numbers;
        int min = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            numbers = input.nextInt();
            if (numbers < min){
                min = numbers;
            }
        }

        System.out.println("The smallest number is " + min);
    }
}
