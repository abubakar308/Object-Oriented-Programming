package assignment1;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        //Q-3:Find the smallest number among three numbers.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
    
}
