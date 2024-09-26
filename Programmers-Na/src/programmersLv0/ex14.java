package programmersLv0;


/**
 * 피자 나눠먹기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/120815
 *
 *
 */
public class ex14 {

    public static void main(String[] args) {
        int n = 10; // 피자 나눠 먹을 사람의 수
        System.out.println(solution(n)); //1
    }


    //
    // 최소공배수


    private static int solution(int n) {
        int answer = 0; // 피자의 개수

        // 피자의 개수 % 6 == 0
        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }



        return answer;
    }
}
