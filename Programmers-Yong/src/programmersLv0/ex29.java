package programmersLv0;

import java.util.Arrays;

public class ex29 {
    public static void main(String[] args) {
        int[]array = {1, 8, 3};
        System.out.println(Arrays.toString(solution(array)));
    }

    private static int[] solution(int[] array) {
        // 조건에 맞는 크기의 배열 선언
        int[]answer = new int[2];
        // 배열안에 들어갈 값을 위한 변수 선언
        int left = 0;
        int right = 0;
        // 조건에 맞게 배열을 순회하면서 최대값과 그 수의 인덱스 값을 구함
        for (int i = 0; i < array.length; i++) {
            if(array[i] > left){
                left = array[i];
                right = i;
            }
        }
        // 조건에 맞게 배열에 값 삽입
        answer[0] = left;
        answer[1] = right;
        return answer;
    }
}
