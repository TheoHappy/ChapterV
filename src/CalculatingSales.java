import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int productNumber = 1;
        int quantitySold;
        double totalRetailValue = 0;
        double price;

        while (productNumber != -1) {
            System.out.println("Enter product number [1..5] or other number for exit ");
            productNumber = input.nextInt();
            if (productNumber == -1)
                break;
            System.out.println("Enter the quantity sold");
            quantitySold = input.nextInt();
            switch (productNumber) {
                case 1:
                    price = 2.98;
                    totalRetailValue = totalRetailValue + (price * quantitySold);
                    break;
                case 2:
                    price = 4.50;
                    totalRetailValue = totalRetailValue + (price * quantitySold);
                    break;
                case 3:
                    price = 9.98;
                    totalRetailValue = totalRetailValue + (price * quantitySold);
                    break;
                case 4:
                    price = 4.49;
                    totalRetailValue = totalRetailValue + (price * quantitySold);
                    break;
                case 5:
                    price = 6.87;
                    totalRetailValue = totalRetailValue + (price * quantitySold);
                    break;
            }
        }
        System.out.printf("Total retail value is %.2f", totalRetailValue);
    }
}
