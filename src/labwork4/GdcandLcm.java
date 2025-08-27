package labwork4;

public class GdcandLcm {
    public static void main(String[] args) {
        int num1 = 56, num2 = 98;

        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    
}
