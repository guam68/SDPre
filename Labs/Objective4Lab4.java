import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String result = "odd";

        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        if(num % 2 == 0) {
            if(num != 0) {
                result = "even";
            }
            else{
                result = "zero";
            }
        }

        System.out.println("The number is " + result);
    }
}