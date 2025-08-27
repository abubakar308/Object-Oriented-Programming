package labwork2;

public class BitwiseSwapingOperation {
    public static void main(String[] args) {
        int a = 10; // Binary: 1010
        int b = 20; // Binary: 10100

        // Displaying original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping values using bitwise XOR operation
        a = a ^ b; // Step 1: a now holds the XOR of a and b
        b = a ^ b; // Step 2: b is now original a
        a = a ^ b; // Step 3: a is now original b

        // Displaying swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
