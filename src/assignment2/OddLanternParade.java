package assignment2;

public class OddLanternParade {
    public static void main(String[] args) {
       int sum = 0;
        System.out.print("The odd numbers are :");
        for(int i = 1; i <= 29; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("The Sum of odd Natural Number :" + sum);
    }
    
}
