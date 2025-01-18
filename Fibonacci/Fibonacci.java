package Fibonacci;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the non negative number:");
        int numb = in.nextInt();
        int first =0,second=1;
        for (int i=0;i<=numb;i++){
            System.out.print(first+" ");
            int next = first+second;
            first=second;
            second=next;
        }
    }
}