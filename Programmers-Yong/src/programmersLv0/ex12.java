package programmersLv0;

public class ex12 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(solution(n,k));
    }

    private static int solution(int n, int k) {
        int answer = 0;
        int total = 0;
        int service = 0;
        total = 12000 * n + 2000 * k;
        service = (n / 10) * 2000;
        answer = total - service;
        return answer;
    }
}
