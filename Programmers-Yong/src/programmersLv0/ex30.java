package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;

public class ex30 {
    public static void main(String[] args) {
        int n = 3;
        int[]numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(n, numlist)));
    }

    private static int[] solution(int n, int[] numlist) {
        // 배열의 크기를 구할 변수 선언
        int array = 0;
        // 배열의 크기를 먼저 구함
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0){
                array++;
            }
        }
        // 정해진 배열의 크기를 answer에 담고 배수를 배열에 담는다
        int[]answer = new int[array];
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0){
                answer[index] = numlist[i];
                index++;
            }
        }
        return answer;
    }
}
