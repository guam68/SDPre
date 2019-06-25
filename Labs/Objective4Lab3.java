import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum;
        String output = "equal to 0";

        System.out.println("Please enter a number: ");
        userNum = scanner.nextInt();

        if (userNum > 0) {
            output = "positive";
        }
        else if (userNum < 0) {
            output = "negative";
        }

        System.out.println("The number is " + output);

        scanner.close();
    }
}