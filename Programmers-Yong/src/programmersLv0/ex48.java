package programmersLv0;

public class ex48 {
    public static void main(String[] args) {
        int[]dot = {2,4};
        System.out.println(solution(dot));
    }

    private static int solution(int[] dot) {
        int answer = 0;
        // 조건별로 사분면 구현
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }
}
