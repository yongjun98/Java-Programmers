package programmersLv0;

public class ex51 {
    public static void main(String[] args) {
        String[]s1 = {"a", "b", "c"};
        String[]s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1,s2));
    }

    private static int solution(String[] s1, String[] s2) {
        int answer = 0;
        // 이중 for문으로 s1과s2를 순회한 후 if문으로 배열내의 값이 일치하는지 확인
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                // 문자열 비교에는 == 불가 (메모리 위치를 가리키는 것이므로)
                // equals()를 통해 문자열 비교 가능
                if(s1[i].equals(s2[j])){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
