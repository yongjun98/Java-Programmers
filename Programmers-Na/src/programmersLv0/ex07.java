package programmersLv0;

import java.util.Arrays;

/**
 *
 * 분수의 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 *
 */



public class ex07 {

    public static void main(String[] args) {
        int denum1 = 1; // 첫 번째 분수의 분자
        int num1 = 2; // 첫 번째 분수의 분모
        int denum2 = 3; // 두 번째 분수의 분자
        int num2 = 4; // 두 번째 분수의 분모
        System.out.println(Arrays.toString(solution(denum1, num1, denum2, num2)));
    }

    private static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        // 두 분수의 합을 계산
        int denum3 = denum1 * num2 + denum2 * num1; // 결과 분수의 분자
        int num3 = num1 * num2; // 결과 분수의 분모
        int max = 1;

        // 최대 공약수(GCD) 구하기
        for(int i = 1; i <= num3 && i <= denum3; i++) {
            if(denum3 % i == 0 && num3 % i == 0) {
                max = i;
            }
        }

        // 약분하기
        answer[0] = denum3 / max;
        answer[1] = num3 / max;

        return answer;
    }




}
