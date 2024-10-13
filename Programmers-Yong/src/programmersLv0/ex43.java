package programmersLv0;

import java.util.Arrays;

public class ex43 {
    public static void main(String[] args) {
        int[]num_list = {2,1,6};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        // 원래 배열 뒤에 값을 하나 추가해야 하기 떄문에 +1
        int[]answer = new int[num_list.length + 1];

        // num_list의 배열을 answer 배열로 복사
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        // 마지막 두원소를 비교하여 lastarray에 저장
        int lastarray = 0;
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            lastarray = num_list[num_list.length - 1]-num_list[num_list.length - 2];
        }
        else {
            lastarray = num_list[num_list.length - 1] * 2;
        }

        // num_list를 복사한 answer배열에 lastarray값 추가
        answer[answer.length -1] = lastarray;
        return answer;
    }
}
