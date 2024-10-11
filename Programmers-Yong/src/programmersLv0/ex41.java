package programmersLv0;

import java.util.Arrays;

public class ex41 {
    public static void main(String[] args) {
        int[]numbers = {1, 2, 3, 4, 5};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int n = numbers.length;
        // 정수이기 때문에 오름차순 했을떄 끝자리 2개만 곱하면 됨
        answer = numbers[n - 1] * numbers[n - 2];
        return answer;
    }
}
