package programmersLv0;


/**
 * 두 수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/120802
 */

public class ex01 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(solution(num1,num2));
    }

    private static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }
}
