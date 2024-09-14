package programmersLv0;

import java.util.Arrays;

public class ex18 {
    public static void main(String[] args) {
        int n = 10;
        // 배열을 반환할떈 String으로 타입 변환
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int size = n / 2;
        int[]answer = new int[size];
        int index = 0;
        for(int i = 0; i < n; i++){
            if(n % 2 != 0){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
