package assignment2;
import java.util.Scanner;

public class PermutationVault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vault key: ");
        int key = sc.nextInt();
        long factorial = 1;

        for(int i = 1; i <= key; i++) {
            factorial *= i;
        }

        System.out.println("The museum vault key " + key + " unlocks in " + factorial + " ways.");
    }
}
