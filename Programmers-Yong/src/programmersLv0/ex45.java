package programmersLv0;

public class ex45 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        System.out.println(solution(a,b));
    }

    private static int solution(int a, int b) {
        // a+b 계산 (문자열로 합친 후 정수로 변환)
        int ab = Integer.parseInt("" + a + b);

        // 2 * a * b 계산
        int ab2 = 2 * a * b;

        if(ab >= ab2){
            return ab;
        }
        else {
            return ab2;
        }
    }
}
