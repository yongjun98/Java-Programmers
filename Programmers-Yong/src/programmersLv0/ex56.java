package programmersLv0;

import java.util.Arrays;

public class ex56 {
    public static void main(String[] args) {
        int[]numbers = {1,2,3};
        String direction = "right";
        System.out.println(Arrays.toString(solution(numbers, direction)));
    }

    private static int[] solution(int[] numbers, String direction) {
        int[]answer = new int[numbers.length];
        // equals를 통해 right,left 판별
        if(direction.equals("right")){
            // 0번째 배열에 마지막 배열원소 이동
            answer[0] = numbers[numbers.length - 1];
            // 0번째 배열에 마지막 원소가 있기 떄문에 1부터 배열 길이만큼 순회
            for (int i = 1; i < numbers.length; i++) {
                // 나머지 배열을 왼쪽으로 왼쪽으로 이동
                answer[i] = numbers[i - 1];
            }
        } else if (direction.equals("left")) {
            // 마지막 원소를 0번쨰 배열로 이동
            answer[numbers.length - 1] = numbers[0];
            // 마지막 원소가 0번쨰로 갔기 때문에 기존에 0부터 numbers.length의 -1까지만 순회 =
            for (int i = 0; i < numbers.length - 1; i++) {
                // 나머지 배열을 오른쪽으로 이동
                answer[i] = numbers[i + 1];
            }
        }
        return answer;
    }
}
