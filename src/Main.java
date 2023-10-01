import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;


        System.out.println("Number 1?");
        if (scan.hasNextInt());
        num1 = scan.nextInt();
        System.out.println("Number 2?");
        if (scan.hasNextInt());
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
    }
}