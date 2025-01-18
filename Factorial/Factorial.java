package Factorial;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the non-negative number:");
        int a = in.nextInt();
        if (a < 0) {
            System.out.println("factorial not found negative number..");
        } else {
            long factorial = 1;
            int i = a;
            while (i > 1) {
                factorial = factorial * i;
                i--;
            }
            System.out.println("the factorial of given non negative number:" + factorial);
        }
    }
}