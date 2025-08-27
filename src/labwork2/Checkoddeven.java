package labwork2;

public class Checkoddeven {
    public static void main(String[] args) {
        int number = 29; // You can change this value to test with different numbers

        // Check if the number is even or odd using the modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
    
}
