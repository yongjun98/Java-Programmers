package programmersLv0;

public class ex58 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        System.out.println(solution(num,k));
    }

    private static int solution(int num, int k) {
        int answer = 0;
        String numStr = Integer.toString(num);
        String kStr = Integer.toString(k);
        // numStr에서 인덱스의 위치를 찾기위해 indexOf 사용
        // 주의할 점 indexOf는 0부터 시작하므로 +1 을 해줘야 함
        if(numStr.contains(kStr)){
            answer = numStr.indexOf(kStr) + 1;
        }
        else {
            answer = -1;
        }
        return answer;
    }
}
