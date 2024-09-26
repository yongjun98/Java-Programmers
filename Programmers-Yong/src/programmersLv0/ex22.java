package programmersLv0;

import java.util.Arrays;

public class ex22 {
    public static void main(String[] args) {
        int[]num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        int[]answer = new int[2];
        int left = 0;
        int right = 0;
        // 조건에 맞게 num_list 배열을 순회하면서 짝수와 홀수를 구분하여 출력할 배열에 카운트
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                left++;
            }
            else {
                right++;
            }
        }
        answer[0] = left;
        answer[1] = right;
        return answer;
    }
}
