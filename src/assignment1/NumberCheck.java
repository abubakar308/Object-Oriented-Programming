package assignment1;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        //Q-2:Check whether a number is positive or negative.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    
}
