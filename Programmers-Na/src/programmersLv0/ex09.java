package programmersLv0;

/**
 * 나머지 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120810
 */


public class ex09 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1,num2));
    }

    private static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }

}
