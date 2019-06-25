public class Objective4Lab1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 15;


        if(num1 > num2) {
            int num3 = num2;
            num2 = num1;
            num1 = num3;
        }
        System.out.println(num2 + " is greater than " + num1);
    }
}