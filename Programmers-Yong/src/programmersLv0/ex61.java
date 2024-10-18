package programmersLv0;

public class ex61 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        // 피자는 한판당 6조각
        int slicePizza = 6;

        for (answer = 1; answer <= n; answer++) {
            if((slicePizza * answer) % n == 0){
                return answer;
            }
        }
        return answer;
    }
}
