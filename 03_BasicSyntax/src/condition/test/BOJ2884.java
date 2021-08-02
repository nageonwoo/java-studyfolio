package condition.test;
import java.util.Scanner;

public class BOJ2884{

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
//        Scanner sc =new Scanner(System.in);
//        int H = sc.nextInt();
//        int M = sc.nextInt();
//        if (M-45<0) if (H-1<0)System.out.println(24+(H-1)+260+(M-45)); <-틀린거
//        else System.out.println(H-1,60+M-45); <-틀린거
//        else System.out.println(H,M-45);  <-틀린거 ' '',   nextInt=뛰어쓰기 정수 입력   H + '쉼표' + M   '
        if (M-45<0) {
            if (H - 1 < 0) {
                System.out.println(24 + (H - 1) + " " + (60 + (M - 45)));
            }
            else {
                System.out.println(H - 1 + " " + (60 + (M - 45)));
            }
        }
        else {
            System.out.println(H + " " + (M-45));
        }
    }

}
//H,M=map(int,input().split())
//        if M-45<0:
//        if H-1<0:  # H-1<0
//        print(24+(H-1),60+(M-45))  # 24+H-1
//        else:
//        print(H-1,60+M-45)
//        else:
//        print(H,M-45)