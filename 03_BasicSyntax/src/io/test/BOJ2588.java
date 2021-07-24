package io.test;

import java.util.Scanner;
public class BOJ2588{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        sc.close();

        System.out.println((B.charAt(2) - '0')*A);
        System.out.println((B.charAt(1) - '0')*A);
        System.out.println((B.charAt(0) - '0')*A);
        System.out.println(Integer.parseInt(B)*A);

//        System.out.println(B.charAt(2));
//        System.out.println('3' - '0'); // '3' -> 3
//        System.out.println((int) 'A');
    }

}