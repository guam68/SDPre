public class Objective6Lab3 {
    public static void main(String[] args) {
        int counter = 1;
        String str;

        while (counter <= 20) {
            if (counter % 2 == 0)
                str = "even";
            else
                str = "odd";
            System.out.println(counter + " is " + str);
            counter++;
        }
    }
}