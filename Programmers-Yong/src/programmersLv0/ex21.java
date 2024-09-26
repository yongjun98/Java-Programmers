package programmersLv0;

public class ex21 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        // 피자나눠먹기
        if(n % 7 == 0){
            answer = n / 7;
        }
        else {
            answer = (n / 7) + 1;
        }
        return answer;
    }
}
