package assignment2;

import java.util.Scanner;

public class StarStepsDisplay {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;

        while(i <= num) {
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
