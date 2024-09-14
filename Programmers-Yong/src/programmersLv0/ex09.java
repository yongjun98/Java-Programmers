package programmersLv0;

public class ex09 {
    public static void main(String[] args) {
        int angle = 70;
        System.out.println(solution(angle));
    }

    private static int solution(int angle) {
        int answer = 0;
        if(angle >= 180){
            answer = 4;
        }
        if(180 > angle){
            answer = 3;
        }
        if(angle == 90){
            answer = 2;
        }
        if (90>angle){
            answer = 1;
        }
        return answer;
    }
}
