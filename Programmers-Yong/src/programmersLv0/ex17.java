package programmersLv0;

import java.util.Arrays;

public class ex17 {
    public static void main(String[] args) {
        int[] array = {1,2,7,10,11};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;
        int middleIndex = 0;
        Arrays.sort(array); // 오름차순 정렬
        // 증앙값 찾기
        middleIndex = array.length / 2;
        answer = array[middleIndex];
        return answer;
    }
}
