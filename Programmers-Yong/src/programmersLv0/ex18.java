package programmersLv0;

import java.util.Arrays;

public class ex18 {
    public static void main(String[] args) {
        int n = 10;
        // 배열을 반환할떈 String으로 타입 변환
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int size = (n + 1) / 2; // 홀수 개수를 위한 배열의 크기
        int[]answer = new int[size];
        int index = 0;
        for(int i = 1; i <= n; i += 2){ // 1부터 n까지 2씩 증가(홀수 찾기)
                answer[index] = i;
                index++;
        }
        return answer;
    }
}
