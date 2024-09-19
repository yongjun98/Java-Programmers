package programmersLv0;


import java.util.Arrays;

/**
 * 최빈값 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 * 틀림
 */
public class ex11 {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 0, 0, 2};
        System.out.println(solution(array)); // 0
    }

    private static int solution(int[] array) {

        int answer = 0;
        Arrays.sort(array); // 정렬
        int max = array[array.length - 1]; // Array 배열에서 가장 큰 숫자만큼 배열 구하기
        int count[] = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int maxCount = count[0]; // 첫번째 숫자가 비교기준 비교를 첫번째 숫자 vs 다음숫자 이래서
        // 그래서 i = 1 부터 시작 이미 0은 기준으로 삼아서 비교할 필요 x
        for (int i = 1; i < count.length; i++) {
            if (maxCount < count[i]) {
                maxCount = count[i]; // 더 큰 값 나오면 갱신
                answer = i; // 최빈값
            } else if (maxCount == count[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}
