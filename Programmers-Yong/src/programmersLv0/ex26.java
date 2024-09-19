package programmersLv0;

public class ex26 {
    public static void main(String[] args) {
        int hp = 23;
        System.out.println(solution(hp));
    }

    private static int solution(int hp) {
        int answer = 0;
        // 개미 종류별로 5,3,1의 데미지를 줌
        // 순차적으로 5로 나누고 남은 5보다 체력이 안남으면 아래로 토스 hp값을 순차적으로 넘김
        int ant1 = hp/5;
        hp = hp % 5;

        int ant2 = hp/3;
        hp = hp % 3;

        int ant3 = hp;

        answer = ant1 + ant2 + ant3;

        return answer;
    }
}
