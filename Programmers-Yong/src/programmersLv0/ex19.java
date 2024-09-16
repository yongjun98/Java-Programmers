package programmersLv0;

public class ex19 {
    public static void main(String[] args) {
        int slice = 7;
        int n = 10;
        System.out.println(solution(slice,n));
    }

    private static int solution(int slice, int n) {
        int answer = 0;
        if(n % slice == 0){
            answer = n/slice;
        }
        else {
            answer = (n/slice) +1;
        }
        return answer;
    }
}
