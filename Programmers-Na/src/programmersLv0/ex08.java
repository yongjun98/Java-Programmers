package programmersLv0;

import java.util.Arrays;

/**
 * 배열 두배 만들기
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809?language=java
 */


public class ex08 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(numbers))); // [2, 4, 6, 8, 10] 나오면 정답
    }

    private static int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length]; // numbers 길이 만큼 초기화

        // 배열은 0부터 시작해서 numbers.length-1 까지 인덱스 있음

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] *2;
        }

        return answer;
    }
}
