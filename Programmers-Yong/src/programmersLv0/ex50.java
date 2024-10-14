package programmersLv0;

public class ex50 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        String sum = Integer.toString(n);
        for (int i = 0; i < sum.length(); i++) {
            answer += Integer.parseInt(sum.substring(i,i+1));
        }
        return answer;
    }
}
