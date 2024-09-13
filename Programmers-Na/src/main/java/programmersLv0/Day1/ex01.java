package programmersLv0.Day1;
/**
 *
 * Programmers 코딩테스트 입문
 * https://school.programmers.co.kr/learn/challenges/beginner?order=acceptance_desc
 * Day1 - 사칙연산
 * 두 수의 합
 */

public class ex01 {
    public static void main(String[] args) {

        int result = solution(3,5); // 테스트 코드
        System.out.println(result);


    }
    // 프로그래머스 안에 코드
    public static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }


}


