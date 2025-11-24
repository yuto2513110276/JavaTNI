import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();

        System.out.println("Summation = " + (n1 + n2));
        System.out.println("Subtraction = " + (n1 - n2));
        System.out.println("Multiplication = " + (n1 * n2));
        System.out.println("Division = " + ((double) n1 / n2));
        System.out.println("Modulus = " + (n1 % n2));
    }
}
