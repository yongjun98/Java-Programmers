package programmersLv0;

import java.util.Arrays;

/**
 * 중앙값 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */


public class ex10 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,7,10,11};
        System.out.println(solution(array));
//        System.out.println(Arrays.toString(array)); //[1, 2, 7, 10, 11]
//        System.out.println(array.length/2);
    }

    private static int solution(int[] array) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(array); // [1, 2, 7, 10, 11]
        // 2로 나눠주면 몫이 가운데만 나옴
        answer = array[array.length/2];

        return answer;
    }


}
