package labwork1;

public class Swapwiththirdvalue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c; // third variable to hold the value temporarily

        // Displaying original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping values using third variable
        c = a;
        a = b;
        b = c;

        // Displaying swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
