package programmersLv0;

public class ex11 {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        System.out.println(solution(n,t));
    }

    private static int solution(int n, int t) {
        int answer = n;
        for(int i = 0; i < t; i++){
            answer *= 2;
        }
        return answer;
    }
}
