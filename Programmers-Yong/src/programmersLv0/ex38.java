package programmersLv0;

import java.util.Arrays;

public class ex38 {
    public static void main(String[] args) {
        int[]numbers = {1, 2, -3, 4, -5};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        // 오름차순으로 배열 정렬 -5,-3,1,2,4
        Arrays.sort(numbers);

        // 배열에서 가장 큰 두 수를 곱함
        int n = numbers.length;
        int max1 = numbers[n - 1] * numbers[n - 2];
        int max2 = numbers[0] * numbers[1];

        // max1,2 중 제일 큰 값 선택
        if(max1 > max2){
            return max1;
        }else {
            return max2;
        }
    }
}
