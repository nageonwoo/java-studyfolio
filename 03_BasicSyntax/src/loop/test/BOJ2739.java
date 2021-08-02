package loop.test;

import java.util.Scanner;

public class BOJ2739 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(N + " * " + i + " = " + ( N * i ));
        }
    }
}

//a = int(input())
//for i in range(1, 10):
//    print("%d * %d = %d" %(a, i, a*i))