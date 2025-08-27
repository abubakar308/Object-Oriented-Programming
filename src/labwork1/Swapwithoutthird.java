package labwork1;

public class Swapwithoutthird {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Displaying original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping values without using third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Displaying swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
