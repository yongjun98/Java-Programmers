package programmersLv0;


/**
 *
 * 숫자 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120807
 *
 */

public class ex06 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(solution(num1,num2)); //-1

    }

    private static int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        }else{
            answer = -1;
        }

        return answer;
    }
}

