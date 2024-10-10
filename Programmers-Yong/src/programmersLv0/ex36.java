package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex36 {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        List<Integer> numList = new ArrayList<>();
        // List에 약수 담기
        for (int i = 1; i <=n; i++) {
            if(n % i == 0){
                numList.add(i);
            }
        }
        // 배열에 List 만큼의 크기를 줌
        int[]answer = new int[numList.size()];
        // List에 약수를 배열에 담음
        for (int i = 0; i <numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}
