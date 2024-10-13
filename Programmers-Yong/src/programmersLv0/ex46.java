package programmersLv0;

public class ex46 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        System.out.println(solution(a,b));
    }

    private static int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int ab2 = Integer.parseInt("" + b + a);

        if(ab >= ab2){
            return ab;
        }
        else {
            return ab2;
        }
    }
}
