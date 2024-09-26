package programmersLv0;

import java.util.Arrays;

/**
 * 짝수는 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 *
 */



public class ex12 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; // 홀수로 크기 초기화 이거 안해줌
        int index = 0;
        for(int i = 1 ; i<=n; i +=2){
            answer[index++] = i;
        }
        return answer;
    }
}
