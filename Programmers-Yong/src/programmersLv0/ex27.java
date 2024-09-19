package programmersLv0;

public class ex27 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        int answer = 0;
        // 조건에 맞게 문자열 내에서 숫자만 찾음 아스키코드를 이용해 숫자만 추출하고 answer에 += 로 더함
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9'){
                answer += c - '0';
            }
        }
        return answer;
    }
}
