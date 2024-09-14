package programmersLv0;

import java.util.Arrays;

public class ex15 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(numbers)));
    }

    private static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // numbers와 동일한 길이의 배열 길이로 초기화
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
