package programmersLv0;

import java.util.Arrays;

public class ex47 {
    public static void main(String[] args) {
        int[]num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        int[]answer = new int[num_list.length];
        // 역순으로 배열을 출력하기 위해 배열의 마지막부터 순차적으로 반복
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }
        return answer;
    }
}
