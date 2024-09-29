package programmersLv0;

public class ex33 {
    public static void main(String[] args) {
        String rsp = "2";
        System.out.println(solution(rsp));
    }

    private static String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            char move = rsp.charAt(i);
            if(move == '2'){
                answer += '0';
            } else if (move == '0') {
                answer += '5';
            } else if (move == '5') {
                answer += '2';
            }
        }
        return answer;
    }
}
