package programmersLv0;

public class ex52 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher,code));
    }

    private static String solution(String cipher, int code) {
        String answer = "";
        // 배열이 -부터 시작하기 때문에 4의 배수로 값을 찾으려면 -1을 해야한다.
        // i의 값을 코드의 값만큼 증가 시키기 위해 i+=code로 증가시킨다.
        for (int i = code-1; i < cipher.length(); i+=code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
