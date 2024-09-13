package programmersLv0.Day2;
/**
 *
 * Programmers 코딩테스트 입문
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 * Day2 - 사칙연산,조건문,배열
 * 두 수의 나눗셈
 * 주제 : 자료형,타입변화 관련 문제
 * 틀림
 * 참고한 블로그 링크
 * https://velog.io/@blwasc/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Java-%EB%91%90-%EC%88%98%EC%9D%98-%EB%82%98%EB%88%97%EC%85%88Lv.0
 */


public class ex05 {
    public static void main(String[] args) {

        int result = solution(3,5); // 테스트 코드
        System.out.println(result);


    }
    // 프로그래머스 안에 코드
    public static int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int) answer;
    }



}


