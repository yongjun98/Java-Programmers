package programmersLv0;


/**
 * 피자 나눠먹기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/120814
 *
 *
 */
public class ex13 {

    public static void main(String[] args) {
        int n = 14; // 피자 나눠 먹을 사람의 수
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        // n을 7로 나눈 몫 ? 아님
        // n 이 7 * 1 보다 작으면 결과는 1
        // n 이 7 * 2 보다 작고 7 * 1 보다 크면 2



        if( n % 7 == 0){
            answer = n /7;
        }else{
            answer = n /7 +1;
        }



        return answer;
    }
}
