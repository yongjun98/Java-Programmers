package programmersLv0;

/**
 * 두수의 곱
 *
 */


public class ex03 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        System.out.println(solution(num1,num2)); //12

    }

    private static int solution(int num1, int num2) {
        int answer = 1;
        answer = num1 * num2;
        return answer;
    }
}
