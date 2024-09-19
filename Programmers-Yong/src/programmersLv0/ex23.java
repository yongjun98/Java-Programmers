package programmersLv0;

public class ex23 {
    public static void main(String[] args) {
        int n = 144;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        // n의 크기만큼 순회하면서 제곱값일땐 1을 리턴하고 break 제곱값이 아닐땐 2 출력
        for (int i = 1; i <= n; i++) {
            if(i * i == n){
                answer = 1;
                break;
            }
            else {
                answer = 2;
            }
        }
        return answer;
    }
}
