package programmersLv0;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n의 숫자를 입력하세요 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j <= i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
