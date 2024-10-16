package programmersLv0;

import java.util.Arrays;

public class ex54 {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(solution(numbers, num1, num2)));
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        // num1에서 num2까지의 값들을 저장하기 위해 배열할당
        int[]answer = new int[num2 - num1 + 1];
        int index = 0;
        for (int i = num1; i <= num2; i++) {
            answer[index] = numbers[i];
            // 배열의 다음 위치 이동 ++
            index++;
        }
        return answer;
    }
}
