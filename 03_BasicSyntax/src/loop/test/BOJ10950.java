package loop.test;

import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int _ = 0; _ < T; _++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    sc.close();
    }
}

//T=int(input())
//for _ in range(T):
//    A,B=map(int,input().split())
//    print(A+B)